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


import com.azure.dev.api.model.WorkItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisionsApi {
    private ApiClient localVarApiClient;

    public RevisionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RevisionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for revisionsGet
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param revisionNumber  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $expand  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call revisionsGetCall(String organization, Integer id, Integer revisionNumber, String project, String apiVersion, String $expand, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/workItems/{id}/revisions/{revisionNumber}"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "revisionNumber" + "\\}", localVarApiClient.escapeString(revisionNumber.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if ($expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$expand", $expand));
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
    private okhttp3.Call revisionsGetValidateBeforeCall(String organization, Integer id, Integer revisionNumber, String project, String apiVersion, String $expand, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling revisionsGet(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling revisionsGet(Async)");
        }
        
        // verify the required parameter 'revisionNumber' is set
        if (revisionNumber == null) {
            throw new ApiException("Missing the required parameter 'revisionNumber' when calling revisionsGet(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling revisionsGet(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling revisionsGet(Async)");
        }
        

        okhttp3.Call localVarCall = revisionsGetCall(organization, id, revisionNumber, project, apiVersion, $expand, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a fully hydrated work item for the requested revision
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param revisionNumber  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $expand  (optional)
     * @return WorkItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public WorkItem revisionsGet(String organization, Integer id, Integer revisionNumber, String project, String apiVersion, String $expand) throws ApiException {
        ApiResponse<WorkItem> localVarResp = revisionsGetWithHttpInfo(organization, id, revisionNumber, project, apiVersion, $expand);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a fully hydrated work item for the requested revision
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param revisionNumber  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $expand  (optional)
     * @return ApiResponse&lt;WorkItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkItem> revisionsGetWithHttpInfo(String organization, Integer id, Integer revisionNumber, String project, String apiVersion, String $expand) throws ApiException {
        okhttp3.Call localVarCall = revisionsGetValidateBeforeCall(organization, id, revisionNumber, project, apiVersion, $expand, null);
        Type localVarReturnType = new TypeToken<WorkItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a fully hydrated work item for the requested revision
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param revisionNumber  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $expand  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call revisionsGetAsync(String organization, Integer id, Integer revisionNumber, String project, String apiVersion, String $expand, final ApiCallback<WorkItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = revisionsGetValidateBeforeCall(organization, id, revisionNumber, project, apiVersion, $expand, _callback);
        Type localVarReturnType = new TypeToken<WorkItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for revisionsList
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $top  (optional)
     * @param $skip  (optional)
     * @param $expand  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call revisionsListCall(String organization, Integer id, String project, String apiVersion, Integer $top, Integer $skip, String $expand, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/workItems/{id}/revisions"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if ($top != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", $top));
        }

        if ($skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", $skip));
        }

        if ($expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$expand", $expand));
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
    private okhttp3.Call revisionsListValidateBeforeCall(String organization, Integer id, String project, String apiVersion, Integer $top, Integer $skip, String $expand, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling revisionsList(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling revisionsList(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling revisionsList(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling revisionsList(Async)");
        }
        

        okhttp3.Call localVarCall = revisionsListCall(organization, id, project, apiVersion, $top, $skip, $expand, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns the list of fully hydrated work item revisions, paged.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $top  (optional)
     * @param $skip  (optional)
     * @param $expand  (optional)
     * @return List&lt;WorkItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public List<WorkItem> revisionsList(String organization, Integer id, String project, String apiVersion, Integer $top, Integer $skip, String $expand) throws ApiException {
        ApiResponse<List<WorkItem>> localVarResp = revisionsListWithHttpInfo(organization, id, project, apiVersion, $top, $skip, $expand);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns the list of fully hydrated work item revisions, paged.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $top  (optional)
     * @param $skip  (optional)
     * @param $expand  (optional)
     * @return ApiResponse&lt;List&lt;WorkItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WorkItem>> revisionsListWithHttpInfo(String organization, Integer id, String project, String apiVersion, Integer $top, Integer $skip, String $expand) throws ApiException {
        okhttp3.Call localVarCall = revisionsListValidateBeforeCall(organization, id, project, apiVersion, $top, $skip, $expand, null);
        Type localVarReturnType = new TypeToken<List<WorkItem>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the list of fully hydrated work item revisions, paged.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param id  (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.3&#39; to use this version of the api. (required)
     * @param $top  (optional)
     * @param $skip  (optional)
     * @param $expand  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call revisionsListAsync(String organization, Integer id, String project, String apiVersion, Integer $top, Integer $skip, String $expand, final ApiCallback<List<WorkItem>> _callback) throws ApiException {

        okhttp3.Call localVarCall = revisionsListValidateBeforeCall(organization, id, project, apiVersion, $top, $skip, $expand, _callback);
        Type localVarReturnType = new TypeToken<List<WorkItem>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
