/*
 * WorkItemTracking
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.1-preview
 * Contact: nugetvss@microsoft.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.azure.dev.api;

import com.azure.dev.api.ApiCallback;
import com.azure.dev.api.ApiClient;
import com.azure.dev.api.ApiException;
import com.azure.dev.api.ApiResponse;
import com.azure.dev.api.Configuration;
import com.azure.dev.api.Pair;
import com.azure.dev.api.ProgressRequestBody;
import com.azure.dev.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.azure.dev.api.model.ProcessIdModel;
import com.azure.dev.api.model.ProcessMigrationResultModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectProcessMigrationApi {
    private ApiClient localVarApiClient;

    public ProjectProcessMigrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectProcessMigrationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for projectProcessMigrationMigrateProjectsProcess
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call projectProcessMigrationMigrateProjectsProcessCall(String organization, String project, String apiVersion, ProcessIdModel body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/projectprocessmigration"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call projectProcessMigrationMigrateProjectsProcessValidateBeforeCall(String organization, String project, String apiVersion, ProcessIdModel body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling projectProcessMigrationMigrateProjectsProcess(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling projectProcessMigrationMigrateProjectsProcess(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling projectProcessMigrationMigrateProjectsProcess(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling projectProcessMigrationMigrateProjectsProcess(Async)");
        }
        

        okhttp3.Call localVarCall = projectProcessMigrationMigrateProjectsProcessCall(organization, project, apiVersion, body, _callback);
        return localVarCall;

    }

    /**
     * 
     * Migrates a project to a different process within the same OOB type. For example, you can only migrate a project from agile/custom-agile to agile/custom-agile.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param body  (required)
     * @return ProcessMigrationResultModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ProcessMigrationResultModel projectProcessMigrationMigrateProjectsProcess(String organization, String project, String apiVersion, ProcessIdModel body) throws ApiException {
        ApiResponse<ProcessMigrationResultModel> localVarResp = projectProcessMigrationMigrateProjectsProcessWithHttpInfo(organization, project, apiVersion, body);
        return localVarResp.getData();
    }

    /**
     * 
     * Migrates a project to a different process within the same OOB type. For example, you can only migrate a project from agile/custom-agile to agile/custom-agile.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param body  (required)
     * @return ApiResponse&lt;ProcessMigrationResultModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProcessMigrationResultModel> projectProcessMigrationMigrateProjectsProcessWithHttpInfo(String organization, String project, String apiVersion, ProcessIdModel body) throws ApiException {
        okhttp3.Call localVarCall = projectProcessMigrationMigrateProjectsProcessValidateBeforeCall(organization, project, apiVersion, body, null);
        Type localVarReturnType = new TypeToken<ProcessMigrationResultModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Migrates a project to a different process within the same OOB type. For example, you can only migrate a project from agile/custom-agile to agile/custom-agile.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call projectProcessMigrationMigrateProjectsProcessAsync(String organization, String project, String apiVersion, ProcessIdModel body, final ApiCallback<ProcessMigrationResultModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = projectProcessMigrationMigrateProjectsProcessValidateBeforeCall(organization, project, apiVersion, body, _callback);
        Type localVarReturnType = new TypeToken<ProcessMigrationResultModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
