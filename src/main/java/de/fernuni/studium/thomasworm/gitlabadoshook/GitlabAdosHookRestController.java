package de.fernuni.studium.thomasworm.gitlabadoshook;

import org.gitlab4j.api.webhook.WebHookManager;
import org.gitlab4j.api.GitLabApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GitlabAdosHookRestController {

    @Autowired
    private WebHookManager webHookManager;

    @GetMapping("/hello")
    public String hello() {
        com.azure.dev.api.model.Link link = new com.azure.dev.api.model.Link();
        link.setRel("Hyperlink");
        link.setUrl("https://gitlab.com/commits/344h3ewd3ehie");
        link.putAttributesItem("comment", "GitLab Commit 344h3ewd3ehie");

        com.azure.dev.api.model.JsonPatchOperation op = new com.azure.dev.api.model.JsonPatchOperation();
        op.setOp(com.azure.dev.api.model.JsonPatchOperation.OpEnum.ADD);
        op.setPath("/relations/-");
        op.setValue(link);

        com.azure.dev.api.model.JsonPatchDocument doc = new com.azure.dev.api.model.JsonPatchDocument();
        doc.add(op);
        
        com.azure.dev.api.JSON json = new com.azure.dev.api.JSON();
        String jsonString = json.serialize(doc);

        return "Hello <br /><pre>" + jsonString + "</pre>";
    }

    @PostMapping("/{host}/{collection}/{project}/{pat}/event")
    public void newEvent(@PathVariable("host") String host,
                         @PathVariable("collection") String collection,
                         @PathVariable("project") String project,
                         @PathVariable("pat") String personalAccessToken,
                         HttpServletRequest request)
        throws GitLabApiException {
        webHookManager.handleEvent(request);
    }

} 