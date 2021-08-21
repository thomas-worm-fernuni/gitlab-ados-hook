package de.fernuni.studium.thomasworm.gitlabadoshook;

import com.azure.dev.api.ApiClient;

import org.springframework.stereotype.Service;

@Service
public class AzureDevOpsApiClientFactory {

    public ApiClient get(String host, String pat) {
        String baseUrl = "https://" + host;
        if (!host.equals("dev.azure.com")) {
            baseUrl = baseUrl + "/tfs";
        }

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(baseUrl);
        apiClient.setPassword(pat);
        return apiClient;
    }

}