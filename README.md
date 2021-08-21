# gitlab-ados-hook

WebHook for linking GitLab commits to Azure DevOps WorkItems

## Configuration

In the WebHook URL you have to configure the Azure DevOps Host, Collection and Project and Personal Access Token:  
``https://webhook.host/[ados-host]/[ados-collection]/[ados-project]/[ados-pat]/event```

## What does the hook?

Everytime you commit into your repository GitLab calls the webhook.  
If your commit message contains references to Azure Board workitems the webhook creates a link to the commit in the workitem. References have to be in the format ``AB#[id]``. For example, if you want to reference the workitem with ID 241, you write ``AB#241`` as part of your commit message. Multiple references are possible.
