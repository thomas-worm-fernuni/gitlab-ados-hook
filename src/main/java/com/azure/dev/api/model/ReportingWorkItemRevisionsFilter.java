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
 * The class represents the reporting work item revision filer.
 */
@ApiModel(description = "The class represents the reporting work item revision filer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class ReportingWorkItemRevisionsFilter {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_INCLUDE_DELETED = "includeDeleted";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DELETED)
  private Boolean includeDeleted;

  public static final String SERIALIZED_NAME_INCLUDE_IDENTITY_REF = "includeIdentityRef";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IDENTITY_REF)
  private Boolean includeIdentityRef;

  public static final String SERIALIZED_NAME_INCLUDE_LATEST_ONLY = "includeLatestOnly";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LATEST_ONLY)
  private Boolean includeLatestOnly;

  public static final String SERIALIZED_NAME_INCLUDE_TAG_REF = "includeTagRef";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TAG_REF)
  private Boolean includeTagRef;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = null;


  public ReportingWorkItemRevisionsFilter fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public ReportingWorkItemRevisionsFilter addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<String>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.")

  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public ReportingWorkItemRevisionsFilter includeDeleted(Boolean includeDeleted) {
    
    this.includeDeleted = includeDeleted;
    return this;
  }

   /**
   * Include deleted work item in the result.
   * @return includeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include deleted work item in the result.")

  public Boolean getIncludeDeleted() {
    return includeDeleted;
  }


  public void setIncludeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
  }


  public ReportingWorkItemRevisionsFilter includeIdentityRef(Boolean includeIdentityRef) {
    
    this.includeIdentityRef = includeIdentityRef;
    return this;
  }

   /**
   * Return an identity reference instead of a string value for identity fields.
   * @return includeIdentityRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return an identity reference instead of a string value for identity fields.")

  public Boolean getIncludeIdentityRef() {
    return includeIdentityRef;
  }


  public void setIncludeIdentityRef(Boolean includeIdentityRef) {
    this.includeIdentityRef = includeIdentityRef;
  }


  public ReportingWorkItemRevisionsFilter includeLatestOnly(Boolean includeLatestOnly) {
    
    this.includeLatestOnly = includeLatestOnly;
    return this;
  }

   /**
   * Include only the latest version of a work item, skipping over all previous revisions of the work item.
   * @return includeLatestOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include only the latest version of a work item, skipping over all previous revisions of the work item.")

  public Boolean getIncludeLatestOnly() {
    return includeLatestOnly;
  }


  public void setIncludeLatestOnly(Boolean includeLatestOnly) {
    this.includeLatestOnly = includeLatestOnly;
  }


  public ReportingWorkItemRevisionsFilter includeTagRef(Boolean includeTagRef) {
    
    this.includeTagRef = includeTagRef;
    return this;
  }

   /**
   * Include tag reference instead of string value for System.Tags field
   * @return includeTagRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include tag reference instead of string value for System.Tags field")

  public Boolean getIncludeTagRef() {
    return includeTagRef;
  }


  public void setIncludeTagRef(Boolean includeTagRef) {
    this.includeTagRef = includeTagRef;
  }


  public ReportingWorkItemRevisionsFilter types(List<String> types) {
    
    this.types = types;
    return this;
  }

  public ReportingWorkItemRevisionsFilter addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.")

  public List<String> getTypes() {
    return types;
  }


  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingWorkItemRevisionsFilter reportingWorkItemRevisionsFilter = (ReportingWorkItemRevisionsFilter) o;
    return Objects.equals(this.fields, reportingWorkItemRevisionsFilter.fields) &&
        Objects.equals(this.includeDeleted, reportingWorkItemRevisionsFilter.includeDeleted) &&
        Objects.equals(this.includeIdentityRef, reportingWorkItemRevisionsFilter.includeIdentityRef) &&
        Objects.equals(this.includeLatestOnly, reportingWorkItemRevisionsFilter.includeLatestOnly) &&
        Objects.equals(this.includeTagRef, reportingWorkItemRevisionsFilter.includeTagRef) &&
        Objects.equals(this.types, reportingWorkItemRevisionsFilter.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, includeDeleted, includeIdentityRef, includeLatestOnly, includeTagRef, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingWorkItemRevisionsFilter {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
    sb.append("    includeIdentityRef: ").append(toIndentedString(includeIdentityRef)).append("\n");
    sb.append("    includeLatestOnly: ").append(toIndentedString(includeLatestOnly)).append("\n");
    sb.append("    includeTagRef: ").append(toIndentedString(includeTagRef)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

