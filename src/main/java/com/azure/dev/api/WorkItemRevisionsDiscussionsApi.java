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


import com.azure.dev.api.model.ReportingWorkItemRevisionsBatch;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkItemRevisionsDiscussionsApi {
    private ApiClient localVarApiClient;

    public WorkItemRevisionsDiscussionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkItemRevisionsDiscussionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for workItemRevisionsDiscussionsReadReportingDiscussions
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param continuationToken  (optional)
     * @param $maxPageSize  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workItemRevisionsDiscussionsReadReportingDiscussionsCall(String organization, String project, String apiVersion, String continuationToken, Integer $maxPageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/reporting/workItemRevisions/discussions"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (continuationToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continuationToken", continuationToken));
        }

        if ($maxPageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$maxPageSize", $maxPageSize));
        }

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workItemRevisionsDiscussionsReadReportingDiscussionsValidateBeforeCall(String organization, String project, String apiVersion, String continuationToken, Integer $maxPageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling workItemRevisionsDiscussionsReadReportingDiscussions(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling workItemRevisionsDiscussionsReadReportingDiscussions(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling workItemRevisionsDiscussionsReadReportingDiscussions(Async)");
        }
        

        okhttp3.Call localVarCall = workItemRevisionsDiscussionsReadReportingDiscussionsCall(organization, project, apiVersion, continuationToken, $maxPageSize, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param continuationToken  (optional)
     * @param $maxPageSize  (optional)
     * @return ReportingWorkItemRevisionsBatch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ReportingWorkItemRevisionsBatch workItemRevisionsDiscussionsReadReportingDiscussions(String organization, String project, String apiVersion, String continuationToken, Integer $maxPageSize) throws ApiException {
        ApiResponse<ReportingWorkItemRevisionsBatch> localVarResp = workItemRevisionsDiscussionsReadReportingDiscussionsWithHttpInfo(organization, project, apiVersion, continuationToken, $maxPageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param continuationToken  (optional)
     * @param $maxPageSize  (optional)
     * @return ApiResponse&lt;ReportingWorkItemRevisionsBatch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportingWorkItemRevisionsBatch> workItemRevisionsDiscussionsReadReportingDiscussionsWithHttpInfo(String organization, String project, String apiVersion, String continuationToken, Integer $maxPageSize) throws ApiException {
        okhttp3.Call localVarCall = workItemRevisionsDiscussionsReadReportingDiscussionsValidateBeforeCall(organization, project, apiVersion, continuationToken, $maxPageSize, null);
        Type localVarReturnType = new TypeToken<ReportingWorkItemRevisionsBatch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param continuationToken  (optional)
     * @param $maxPageSize  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workItemRevisionsDiscussionsReadReportingDiscussionsAsync(String organization, String project, String apiVersion, String continuationToken, Integer $maxPageSize, final ApiCallback<ReportingWorkItemRevisionsBatch> _callback) throws ApiException {

        okhttp3.Call localVarCall = workItemRevisionsDiscussionsReadReportingDiscussionsValidateBeforeCall(organization, project, apiVersion, continuationToken, $maxPageSize, _callback);
        Type localVarReturnType = new TypeToken<ReportingWorkItemRevisionsBatch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
