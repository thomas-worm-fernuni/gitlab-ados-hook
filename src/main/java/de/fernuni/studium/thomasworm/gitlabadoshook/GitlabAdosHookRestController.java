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
        return "Hello";
    }

    @PostMapping("/{host}/{collection}/event")
    public void newEvent(@PathVariable("host") String host,
                         @PathVariable("collection") String collection,
                         HttpServletRequest request)
        throws GitLabApiException {
        webHookManager.handleEvent(request);
    }

} 