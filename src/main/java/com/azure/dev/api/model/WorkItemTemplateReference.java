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
import com.azure.dev.api.model.WorkItemTrackingResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Describes a shallow reference to a work item template.
 */
@ApiModel(description = "Describes a shallow reference to a work item template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemTemplateReference {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WORK_ITEM_TYPE_NAME = "workItemTypeName";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_TYPE_NAME)
  private String workItemTypeName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WorkItemTemplateReference description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the work item template.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the work item template.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WorkItemTemplateReference id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of the work item template.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the work item template.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public WorkItemTemplateReference name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the work item template.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the work item template.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkItemTemplateReference workItemTypeName(String workItemTypeName) {
    
    this.workItemTypeName = workItemTypeName;
    return this;
  }

   /**
   * The name of the work item type.
   * @return workItemTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the work item type.")

  public String getWorkItemTypeName() {
    return workItemTypeName;
  }


  public void setWorkItemTypeName(String workItemTypeName) {
    this.workItemTypeName = workItemTypeName;
  }


  public WorkItemTemplateReference url(String url) {
    
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
    WorkItemTemplateReference workItemTemplateReference = (WorkItemTemplateReference) o;
    return Objects.equals(this.description, workItemTemplateReference.description) &&
        Objects.equals(this.id, workItemTemplateReference.id) &&
        Objects.equals(this.name, workItemTemplateReference.name) &&
        Objects.equals(this.workItemTypeName, workItemTemplateReference.workItemTypeName) &&
        Objects.equals(this.url, workItemTemplateReference.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, workItemTypeName, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemTemplateReference {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workItemTypeName: ").append(toIndentedString(workItemTypeName)).append("\n");
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
