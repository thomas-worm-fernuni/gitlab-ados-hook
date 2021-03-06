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


import com.azure.dev.api.model.CommentVersion;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsVersionsApi {
    private ApiClient localVarApiClient;

    public CommentsVersionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommentsVersionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for commentsVersionsGet
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param version  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call commentsVersionsGetCall(String organization, String project, Integer workItemId, Integer commentId, Integer version, String apiVersion, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/workItems/{workItemId}/comments/{commentId}/versions/{version}"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()))
            .replaceAll("\\{" + "workItemId" + "\\}", localVarApiClient.escapeString(workItemId.toString()))
            .replaceAll("\\{" + "commentId" + "\\}", localVarApiClient.escapeString(commentId.toString()))
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call commentsVersionsGetValidateBeforeCall(String organization, String project, Integer workItemId, Integer commentId, Integer version, String apiVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling commentsVersionsGet(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling commentsVersionsGet(Async)");
        }
        
        // verify the required parameter 'workItemId' is set
        if (workItemId == null) {
            throw new ApiException("Missing the required parameter 'workItemId' when calling commentsVersionsGet(Async)");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling commentsVersionsGet(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling commentsVersionsGet(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling commentsVersionsGet(Async)");
        }
        

        okhttp3.Call localVarCall = commentsVersionsGetCall(organization, project, workItemId, commentId, version, apiVersion, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param version  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return CommentVersion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public CommentVersion commentsVersionsGet(String organization, String project, Integer workItemId, Integer commentId, Integer version, String apiVersion) throws ApiException {
        ApiResponse<CommentVersion> localVarResp = commentsVersionsGetWithHttpInfo(organization, project, workItemId, commentId, version, apiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param version  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return ApiResponse&lt;CommentVersion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommentVersion> commentsVersionsGetWithHttpInfo(String organization, String project, Integer workItemId, Integer commentId, Integer version, String apiVersion) throws ApiException {
        okhttp3.Call localVarCall = commentsVersionsGetValidateBeforeCall(organization, project, workItemId, commentId, version, apiVersion, null);
        Type localVarReturnType = new TypeToken<CommentVersion>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param version  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call commentsVersionsGetAsync(String organization, String project, Integer workItemId, Integer commentId, Integer version, String apiVersion, final ApiCallback<CommentVersion> _callback) throws ApiException {

        okhttp3.Call localVarCall = commentsVersionsGetValidateBeforeCall(organization, project, workItemId, commentId, version, apiVersion, _callback);
        Type localVarReturnType = new TypeToken<CommentVersion>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for commentsVersionsList
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call commentsVersionsListCall(String organization, String project, Integer workItemId, Integer commentId, String apiVersion, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/workItems/{workItemId}/comments/{commentId}/versions"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()))
            .replaceAll("\\{" + "workItemId" + "\\}", localVarApiClient.escapeString(workItemId.toString()))
            .replaceAll("\\{" + "commentId" + "\\}", localVarApiClient.escapeString(commentId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call commentsVersionsListValidateBeforeCall(String organization, String project, Integer workItemId, Integer commentId, String apiVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling commentsVersionsList(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling commentsVersionsList(Async)");
        }
        
        // verify the required parameter 'workItemId' is set
        if (workItemId == null) {
            throw new ApiException("Missing the required parameter 'workItemId' when calling commentsVersionsList(Async)");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling commentsVersionsList(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling commentsVersionsList(Async)");
        }
        

        okhttp3.Call localVarCall = commentsVersionsListCall(organization, project, workItemId, commentId, apiVersion, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return List&lt;CommentVersion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public List<CommentVersion> commentsVersionsList(String organization, String project, Integer workItemId, Integer commentId, String apiVersion) throws ApiException {
        ApiResponse<List<CommentVersion>> localVarResp = commentsVersionsListWithHttpInfo(organization, project, workItemId, commentId, apiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return ApiResponse&lt;List&lt;CommentVersion&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CommentVersion>> commentsVersionsListWithHttpInfo(String organization, String project, Integer workItemId, Integer commentId, String apiVersion) throws ApiException {
        okhttp3.Call localVarCall = commentsVersionsListValidateBeforeCall(organization, project, workItemId, commentId, apiVersion, null);
        Type localVarReturnType = new TypeToken<List<CommentVersion>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param workItemId  (required)
     * @param commentId  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call commentsVersionsListAsync(String organization, String project, Integer workItemId, Integer commentId, String apiVersion, final ApiCallback<List<CommentVersion>> _callback) throws ApiException {

        okhttp3.Call localVarCall = commentsVersionsListValidateBeforeCall(organization, project, workItemId, commentId, apiVersion, _callback);
        Type localVarReturnType = new TypeToken<List<CommentVersion>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
