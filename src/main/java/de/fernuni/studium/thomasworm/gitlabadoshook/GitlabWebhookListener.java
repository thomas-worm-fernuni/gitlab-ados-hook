package de.fernuni.studium.thomasworm.gitlabadoshook;

import java.util.List;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.gitlab4j.api.webhook.WebHookListener;
import org.gitlab4j.api.webhook.PushEvent;
import org.gitlab4j.api.webhook.EventCommit;

public class GitlabWebhookListener implements WebHookListener {

    public void onPushEvent(PushEvent pushEvent) {
        System.out.println(pushEvent.getRequestUrl());
        System.out.println(getHostFromUrl(pushEvent.getRequestUrl()));
        System.out.println(getCollectionFromUrl(pushEvent.getRequestUrl()));
        List<EventCommit> commits = pushEvent.getCommits();
        for (EventCommit commit : commits) {
            System.out.println("+ " + commit.getMessage());
        }
        System.out.println(pushEvent.toString());
    }

    private String getHostFromUrl(String Url) {
        try {
            URL url = new URL(Url);
            Path path = Paths.get(url.getPath());
            return path.subpath(0, 1).toString();
        } catch (Exception e) {
            return "";
        }
    }

    private String getCollectionFromUrl(String Url) {
        try {
            URL url = new URL(Url);
            Path path = Paths.get(url.getPath());
            return path.subpath(1, 2).toString();
        } catch (Exception e) {
            return "";
        }
    }

}