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


package com.azure.dev.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.azure.dev.api.model.AccountWorkWorkItemModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class AccountMyWorkResult {
  public static final String SERIALIZED_NAME_QUERY_SIZE_LIMIT_EXCEEDED = "querySizeLimitExceeded";
  @SerializedName(SERIALIZED_NAME_QUERY_SIZE_LIMIT_EXCEEDED)
  private Boolean querySizeLimitExceeded;

  public static final String SERIALIZED_NAME_WORK_ITEM_DETAILS = "workItemDetails";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_DETAILS)
  private List<AccountWorkWorkItemModel> workItemDetails = null;


  public AccountMyWorkResult querySizeLimitExceeded(Boolean querySizeLimitExceeded) {
    
    this.querySizeLimitExceeded = querySizeLimitExceeded;
    return this;
  }

   /**
   * True, when length of WorkItemDetails is same as the limit
   * @return querySizeLimitExceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True, when length of WorkItemDetails is same as the limit")

  public Boolean getQuerySizeLimitExceeded() {
    return querySizeLimitExceeded;
  }


  public void setQuerySizeLimitExceeded(Boolean querySizeLimitExceeded) {
    this.querySizeLimitExceeded = querySizeLimitExceeded;
  }


  public AccountMyWorkResult workItemDetails(List<AccountWorkWorkItemModel> workItemDetails) {
    
    this.workItemDetails = workItemDetails;
    return this;
  }

  public AccountMyWorkResult addWorkItemDetailsItem(AccountWorkWorkItemModel workItemDetailsItem) {
    if (this.workItemDetails == null) {
      this.workItemDetails = new ArrayList<AccountWorkWorkItemModel>();
    }
    this.workItemDetails.add(workItemDetailsItem);
    return this;
  }

   /**
   * WorkItem Details
   * @return workItemDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WorkItem Details")

  public List<AccountWorkWorkItemModel> getWorkItemDetails() {
    return workItemDetails;
  }


  public void setWorkItemDetails(List<AccountWorkWorkItemModel> workItemDetails) {
    this.workItemDetails = workItemDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMyWorkResult accountMyWorkResult = (AccountMyWorkResult) o;
    return Objects.equals(this.querySizeLimitExceeded, accountMyWorkResult.querySizeLimitExceeded) &&
        Objects.equals(this.workItemDetails, accountMyWorkResult.workItemDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(querySizeLimitExceeded, workItemDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMyWorkResult {\n");
    sb.append("    querySizeLimitExceeded: ").append(toIndentedString(querySizeLimitExceeded)).append("\n");
    sb.append("    workItemDetails: ").append(toIndentedString(workItemDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

