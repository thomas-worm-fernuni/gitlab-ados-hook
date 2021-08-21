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


import com.azure.dev.api.model.WorkItemTagDefinition;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagsApi {
    private ApiClient localVarApiClient;

    public TagsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for tagsDelete
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
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
    public okhttp3.Call tagsDeleteCall(String organization, String project, String tagIdOrName, String apiVersion, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/tags/{tagIdOrName}"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()))
            .replaceAll("\\{" + "tagIdOrName" + "\\}", localVarApiClient.escapeString(tagIdOrName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tagsDeleteValidateBeforeCall(String organization, String project, String tagIdOrName, String apiVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling tagsDelete(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling tagsDelete(Async)");
        }
        
        // verify the required parameter 'tagIdOrName' is set
        if (tagIdOrName == null) {
            throw new ApiException("Missing the required parameter 'tagIdOrName' when calling tagsDelete(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling tagsDelete(Async)");
        }
        

        okhttp3.Call localVarCall = tagsDeleteCall(organization, project, tagIdOrName, apiVersion, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public void tagsDelete(String organization, String project, String tagIdOrName, String apiVersion) throws ApiException {
        tagsDeleteWithHttpInfo(organization, project, tagIdOrName, apiVersion);
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> tagsDeleteWithHttpInfo(String organization, String project, String tagIdOrName, String apiVersion) throws ApiException {
        okhttp3.Call localVarCall = tagsDeleteValidateBeforeCall(organization, project, tagIdOrName, apiVersion, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
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
    public okhttp3.Call tagsDeleteAsync(String organization, String project, String tagIdOrName, String apiVersion, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagsDeleteValidateBeforeCall(organization, project, tagIdOrName, apiVersion, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for tagsGet
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
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
    public okhttp3.Call tagsGetCall(String organization, String project, String tagIdOrName, String apiVersion, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/tags/{tagIdOrName}"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()))
            .replaceAll("\\{" + "tagIdOrName" + "\\}", localVarApiClient.escapeString(tagIdOrName.toString()));

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
    private okhttp3.Call tagsGetValidateBeforeCall(String organization, String project, String tagIdOrName, String apiVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling tagsGet(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling tagsGet(Async)");
        }
        
        // verify the required parameter 'tagIdOrName' is set
        if (tagIdOrName == null) {
            throw new ApiException("Missing the required parameter 'tagIdOrName' when calling tagsGet(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling tagsGet(Async)");
        }
        

        okhttp3.Call localVarCall = tagsGetCall(organization, project, tagIdOrName, apiVersion, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return WorkItemTagDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public WorkItemTagDefinition tagsGet(String organization, String project, String tagIdOrName, String apiVersion) throws ApiException {
        ApiResponse<WorkItemTagDefinition> localVarResp = tagsGetWithHttpInfo(organization, project, tagIdOrName, apiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return ApiResponse&lt;WorkItemTagDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkItemTagDefinition> tagsGetWithHttpInfo(String organization, String project, String tagIdOrName, String apiVersion) throws ApiException {
        okhttp3.Call localVarCall = tagsGetValidateBeforeCall(organization, project, tagIdOrName, apiVersion, null);
        Type localVarReturnType = new TypeToken<WorkItemTagDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
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
    public okhttp3.Call tagsGetAsync(String organization, String project, String tagIdOrName, String apiVersion, final ApiCallback<WorkItemTagDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagsGetValidateBeforeCall(organization, project, tagIdOrName, apiVersion, _callback);
        Type localVarReturnType = new TypeToken<WorkItemTagDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tagsList
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
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
    public okhttp3.Call tagsListCall(String organization, String project, String apiVersion, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/tags"
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tagsListValidateBeforeCall(String organization, String project, String apiVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling tagsList(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling tagsList(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling tagsList(Async)");
        }
        

        okhttp3.Call localVarCall = tagsListCall(organization, project, apiVersion, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return List&lt;WorkItemTagDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public List<WorkItemTagDefinition> tagsList(String organization, String project, String apiVersion) throws ApiException {
        ApiResponse<List<WorkItemTagDefinition>> localVarResp = tagsListWithHttpInfo(organization, project, apiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return ApiResponse&lt;List&lt;WorkItemTagDefinition&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WorkItemTagDefinition>> tagsListWithHttpInfo(String organization, String project, String apiVersion) throws ApiException {
        okhttp3.Call localVarCall = tagsListValidateBeforeCall(organization, project, apiVersion, null);
        Type localVarReturnType = new TypeToken<List<WorkItemTagDefinition>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
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
    public okhttp3.Call tagsListAsync(String organization, String project, String apiVersion, final ApiCallback<List<WorkItemTagDefinition>> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagsListValidateBeforeCall(organization, project, apiVersion, _callback);
        Type localVarReturnType = new TypeToken<List<WorkItemTagDefinition>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tagsUpdate
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
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
    public okhttp3.Call tagsUpdateCall(String organization, String project, String tagIdOrName, String apiVersion, WorkItemTagDefinition body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/wit/tags/{tagIdOrName}"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", localVarApiClient.escapeString(project.toString()))
            .replaceAll("\\{" + "tagIdOrName" + "\\}", localVarApiClient.escapeString(tagIdOrName.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tagsUpdateValidateBeforeCall(String organization, String project, String tagIdOrName, String apiVersion, WorkItemTagDefinition body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling tagsUpdate(Async)");
        }
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling tagsUpdate(Async)");
        }
        
        // verify the required parameter 'tagIdOrName' is set
        if (tagIdOrName == null) {
            throw new ApiException("Missing the required parameter 'tagIdOrName' when calling tagsUpdate(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling tagsUpdate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tagsUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = tagsUpdateCall(organization, project, tagIdOrName, apiVersion, body, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param body  (required)
     * @return WorkItemTagDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public WorkItemTagDefinition tagsUpdate(String organization, String project, String tagIdOrName, String apiVersion, WorkItemTagDefinition body) throws ApiException {
        ApiResponse<WorkItemTagDefinition> localVarResp = tagsUpdateWithHttpInfo(organization, project, tagIdOrName, apiVersion, body);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param body  (required)
     * @return ApiResponse&lt;WorkItemTagDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkItemTagDefinition> tagsUpdateWithHttpInfo(String organization, String project, String tagIdOrName, String apiVersion, WorkItemTagDefinition body) throws ApiException {
        okhttp3.Call localVarCall = tagsUpdateValidateBeforeCall(organization, project, tagIdOrName, apiVersion, body, null);
        Type localVarReturnType = new TypeToken<WorkItemTagDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project Project ID or project name (required)
     * @param tagIdOrName  (required)
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
    public okhttp3.Call tagsUpdateAsync(String organization, String project, String tagIdOrName, String apiVersion, WorkItemTagDefinition body, final ApiCallback<WorkItemTagDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagsUpdateValidateBeforeCall(organization, project, tagIdOrName, apiVersion, body, _callback);
        Type localVarReturnType = new TypeToken<WorkItemTagDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}