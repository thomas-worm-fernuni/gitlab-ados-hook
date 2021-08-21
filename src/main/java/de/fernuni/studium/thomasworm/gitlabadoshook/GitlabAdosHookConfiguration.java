package de.fernuni.studium.thomasworm.gitlabadoshook;

import com.azure.dev.api.JSON;

import org.gitlab4j.api.webhook.WebHookListener;
import org.gitlab4j.api.webhook.WebHookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GitlabAdosHookConfiguration {

    @Autowired
    private GitlabWebhookListener gitlabWebhookListener;

    @Bean
    public JSON getJson() {
        return new JSON();
    }

    @Bean
    public WebHookManager getWebHookManager() {
        WebHookManager webHookManager = new WebHookManager();
        webHookManager.addListener(this.gitlabWebhookListener);
        return webHookManager;
    }

}
