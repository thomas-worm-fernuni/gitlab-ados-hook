package de.fernuni.studium.thomasworm.gitlabadoshook;

import com.azure.dev.api.JSON;
import com.azure.dev.api.ApiClient;
import com.azure.dev.api.WorkItemsApi;
import com.azure.dev.api.ApiException;
import com.azure.dev.api.model.JsonPatchDocument;

import org.gitlab4j.api.webhook.EventCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AzureLinkCreater {

    private static final String apiVersion = "6.0"; 

    @Autowired
    private JSON json;

    @Autowired
    private PatchDocumentBuilder patchDocumentBuilder;

    @Autowired
    private AzureDevOpsApiClientFactory clientFactory;

    public void createCommitLink(AzureProjectInfo azureProject, Integer workItemId, EventCommit commit) {
        JsonPatchDocument patch = this.patchDocumentBuilder.fromGitLabEventCommit(commit);

        System.out.println("======== Create commit link =============================");
        System.out.println("Host: " + azureProject.getHost());
        System.out.println("Collection: " + azureProject.getCollection());
        System.out.println("Project: " + azureProject.getProject());
        System.out.println("PAT: " + azureProject.getPersonalAccessToken());
        System.out.println("WorkItem: " + workItemId);
        System.out.println(this.json.serialize(patch));

        try {
            ApiClient apiClient = clientFactory.get(azureProject.getHost(), azureProject.getPersonalAccessToken());
            WorkItemsApi api = new WorkItemsApi(apiClient);
            api.workItemsUpdate(azureProject.getCollection(), workItemId, azureProject.getProject(), apiVersion, patch, null, null, null, null);
        } catch (ApiException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }
    }

}