package de.fernuni.studium.thomasworm.gitlabadoshook;

import org.gitlab4j.api.webhook.WebHookListener;
import org.gitlab4j.api.webhook.WebHookManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GitlabAdosHookConfiguration {

    @Bean
    public WebHookListener getWebHookListener() {
        return new GitlabWebhookListener();
    }

    @Bean
    public WebHookManager getWebHookManager() {
        WebHookManager webHookManager = new WebHookManager();
        webHookManager.addListener(this.getWebHookListener());
        return webHookManager;
    }

}
