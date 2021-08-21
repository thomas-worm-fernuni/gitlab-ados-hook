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


import com.azure.dev.api.model.WorkItemIcon;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkItemIconsApi {
    private ApiClient localVarApiClient;

    public WorkItemIconsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkItemIconsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for workItemIconsGet
     * @param icon The name of the icon (required)
     * @param organization The name of the Azure DevOps organization. (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param color The 6-digit hex color for the icon (optional)
     * @param v The version of the icon (used only for cache invalidation) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workItemIconsGetCall(String icon, String organization, String apiVersion, String color, Integer v, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/_apis/wit/workitemicons/{icon}"
            .replaceAll("\\{" + "icon" + "\\}", localVarApiClient.escapeString(icon.toString()))
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (color != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("color", color));
        }

        if (v != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("v", v));
        }

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        final String[] localVarAccepts = {
            "image/svg+xml", "image/xaml+xml", "application/json"
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
    private okhttp3.Call workItemIconsGetValidateBeforeCall(String icon, String organization, String apiVersion, String color, Integer v, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'icon' is set
        if (icon == null) {
            throw new ApiException("Missing the required parameter 'icon' when calling workItemIconsGet(Async)");
        }
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling workItemIconsGet(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling workItemIconsGet(Async)");
        }
        

        okhttp3.Call localVarCall = workItemIconsGetCall(icon, organization, apiVersion, color, v, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get a work item icon given the friendly name and icon color.
     * @param icon The name of the icon (required)
     * @param organization The name of the Azure DevOps organization. (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param color The 6-digit hex color for the icon (optional)
     * @param v The version of the icon (used only for cache invalidation) (optional)
     * @return WorkItemIcon
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public WorkItemIcon workItemIconsGet(String icon, String organization, String apiVersion, String color, Integer v) throws ApiException {
        ApiResponse<WorkItemIcon> localVarResp = workItemIconsGetWithHttpInfo(icon, organization, apiVersion, color, v);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a work item icon given the friendly name and icon color.
     * @param icon The name of the icon (required)
     * @param organization The name of the Azure DevOps organization. (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param color The 6-digit hex color for the icon (optional)
     * @param v The version of the icon (used only for cache invalidation) (optional)
     * @return ApiResponse&lt;WorkItemIcon&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkItemIcon> workItemIconsGetWithHttpInfo(String icon, String organization, String apiVersion, String color, Integer v) throws ApiException {
        okhttp3.Call localVarCall = workItemIconsGetValidateBeforeCall(icon, organization, apiVersion, color, v, null);
        Type localVarReturnType = new TypeToken<WorkItemIcon>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a work item icon given the friendly name and icon color.
     * @param icon The name of the icon (required)
     * @param organization The name of the Azure DevOps organization. (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @param color The 6-digit hex color for the icon (optional)
     * @param v The version of the icon (used only for cache invalidation) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workItemIconsGetAsync(String icon, String organization, String apiVersion, String color, Integer v, final ApiCallback<WorkItemIcon> _callback) throws ApiException {

        okhttp3.Call localVarCall = workItemIconsGetValidateBeforeCall(icon, organization, apiVersion, color, v, _callback);
        Type localVarReturnType = new TypeToken<WorkItemIcon>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workItemIconsList
     * @param organization The name of the Azure DevOps organization. (required)
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
    public okhttp3.Call workItemIconsListCall(String organization, String apiVersion, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{organization}/_apis/wit/workitemicons"
            .replaceAll("\\{" + "organization" + "\\}", localVarApiClient.escapeString(organization.toString()));

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
    private okhttp3.Call workItemIconsListValidateBeforeCall(String organization, String apiVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling workItemIconsList(Async)");
        }
        
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling workItemIconsList(Async)");
        }
        

        okhttp3.Call localVarCall = workItemIconsListCall(organization, apiVersion, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get a list of all work item icons.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return List&lt;WorkItemIcon&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public List<WorkItemIcon> workItemIconsList(String organization, String apiVersion) throws ApiException {
        ApiResponse<List<WorkItemIcon>> localVarResp = workItemIconsListWithHttpInfo(organization, apiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a list of all work item icons.
     * @param organization The name of the Azure DevOps organization. (required)
     * @param apiVersion Version of the API to use.  This should be set to &#39;6.1-preview.1&#39; to use this version of the api. (required)
     * @return ApiResponse&lt;List&lt;WorkItemIcon&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WorkItemIcon>> workItemIconsListWithHttpInfo(String organization, String apiVersion) throws ApiException {
        okhttp3.Call localVarCall = workItemIconsListValidateBeforeCall(organization, apiVersion, null);
        Type localVarReturnType = new TypeToken<List<WorkItemIcon>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of all work item icons.
     * @param organization The name of the Azure DevOps organization. (required)
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
    public okhttp3.Call workItemIconsListAsync(String organization, String apiVersion, final ApiCallback<List<WorkItemIcon>> _callback) throws ApiException {

        okhttp3.Call localVarCall = workItemIconsListValidateBeforeCall(organization, apiVersion, _callback);
        Type localVarReturnType = new TypeToken<List<WorkItemIcon>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
