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
import com.azure.dev.api.model.IdentityReference;
import com.azure.dev.api.model.WorkItemTrackingResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemHistory {
  public static final String SERIALIZED_NAME_REV = "rev";
  @SerializedName(SERIALIZED_NAME_REV)
  private Integer rev;

  public static final String SERIALIZED_NAME_REVISED_BY = "revisedBy";
  @SerializedName(SERIALIZED_NAME_REVISED_BY)
  private IdentityReference revisedBy;

  public static final String SERIALIZED_NAME_REVISED_DATE = "revisedDate";
  @SerializedName(SERIALIZED_NAME_REVISED_DATE)
  private OffsetDateTime revisedDate;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WorkItemHistory rev(Integer rev) {
    
    this.rev = rev;
    return this;
  }

   /**
   * Get rev
   * @return rev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRev() {
    return rev;
  }


  public void setRev(Integer rev) {
    this.rev = rev;
  }


  public WorkItemHistory revisedBy(IdentityReference revisedBy) {
    
    this.revisedBy = revisedBy;
    return this;
  }

   /**
   * Get revisedBy
   * @return revisedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityReference getRevisedBy() {
    return revisedBy;
  }


  public void setRevisedBy(IdentityReference revisedBy) {
    this.revisedBy = revisedBy;
  }


  public WorkItemHistory revisedDate(OffsetDateTime revisedDate) {
    
    this.revisedDate = revisedDate;
    return this;
  }

   /**
   * Get revisedDate
   * @return revisedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRevisedDate() {
    return revisedDate;
  }


  public void setRevisedDate(OffsetDateTime revisedDate) {
    this.revisedDate = revisedDate;
  }


  public WorkItemHistory value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public WorkItemHistory url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemHistory workItemHistory = (WorkItemHistory) o;
    return Objects.equals(this.rev, workItemHistory.rev) &&
        Objects.equals(this.revisedBy, workItemHistory.revisedBy) &&
        Objects.equals(this.revisedDate, workItemHistory.revisedDate) &&
        Objects.equals(this.value, workItemHistory.value) &&
        Objects.equals(this.url, workItemHistory.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, revisedBy, revisedDate, value, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemHistory {\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    revisedBy: ").append(toIndentedString(revisedBy)).append("\n");
    sb.append("    revisedDate: ").append(toIndentedString(revisedDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
