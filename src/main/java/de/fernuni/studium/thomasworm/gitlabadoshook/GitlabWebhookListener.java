package de.fernuni.studium.thomasworm.gitlabadoshook;

import java.util.List;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.gitlab4j.api.webhook.WebHookListener;
import org.gitlab4j.api.webhook.PushEvent;
import org.gitlab4j.api.webhook.EventCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GitlabWebhookListener implements WebHookListener {

    @Autowired
    private CommitMessageParser commitMessageParser;

    @Autowired
    private AzureLinkCreater azureLinkCreater;

    public void onPushEvent(PushEvent pushEvent) {
        AzureProjectInfo azureProject = this.getAzureProjectInfoFromUrl(pushEvent.getRequestUrl());
        List<EventCommit> commits = pushEvent.getCommits();
        for (EventCommit commit : commits) {
            String message = commit.getMessage();
            List<Integer> ids = this.commitMessageParser.getReferencedAzureBoardIds(message);
            for (Integer id : ids) {
                this.azureLinkCreater.createCommitLink(azureProject, id, commit);
            }
        }
    }

    private AzureProjectInfo getAzureProjectInfoFromUrl(String Url) {
        try {
            URL url = new URL(Url);
            Path path = Paths.get(url.getPath());
            AzureProjectInfo azureProject = new AzureProjectInfo();
            azureProject.setHost(path.subpath(0, 1).toString());
            azureProject.setCollection(path.subpath(1, 2).toString());
            azureProject.setProject(path.subpath(2, 3).toString());
            azureProject.setPersonalAccessToken(path.subpath(3, 4).toString());
            return azureProject;
        } catch (Exception e) {
            return null;
        }
    }

}