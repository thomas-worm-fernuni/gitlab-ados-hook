package de.fernuni.studium.thomasworm.gitlabadoshook;

public class AzureProjectInfo {

    private String host;

    private String collection;

    private String project;

    private String personalAccessToken;

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return this.host;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getCollection() {
        return this.collection;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return this.project;
    }

    public void setPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
    }

    public String getPersonalAccessToken() {
        return this.personalAccessToken;
    }

}