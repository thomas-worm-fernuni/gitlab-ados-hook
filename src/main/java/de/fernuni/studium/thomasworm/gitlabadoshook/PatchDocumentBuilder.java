package de.fernuni.studium.thomasworm.gitlabadoshook;

import com.azure.dev.api.model.JsonPatchDocument;
import com.azure.dev.api.model.JsonPatchOperation;
import com.azure.dev.api.model.Link;

import org.gitlab4j.api.webhook.EventCommit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatchDocumentBuilder {

    public JsonPatchDocument fromGitLabEventCommit(EventCommit commit) {
        Link link = new Link();
        link.setRel("Hyperlink");
        link.setUrl(commit.getUrl());
        link.putAttributesItem("comment", "GitLab Commit " + commit.getId());
        
        JsonPatchOperation operation = new JsonPatchOperation();
        operation.setOp(JsonPatchOperation.OpEnum.ADD);
        operation.setPath("/relations/-");
        operation.setValue(link);

        JsonPatchDocument document = new JsonPatchDocument();
        document.add(operation);

        return document;
    }

}