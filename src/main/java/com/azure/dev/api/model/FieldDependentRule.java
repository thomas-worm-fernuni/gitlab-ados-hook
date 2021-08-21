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
import com.azure.dev.api.model.WorkItemFieldReference;
import com.azure.dev.api.model.WorkItemTrackingResource;
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
 * Describes a list of dependent fields for a rule.
 */
@ApiModel(description = "Describes a list of dependent fields for a rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class FieldDependentRule {
  public static final String SERIALIZED_NAME_DEPENDENT_FIELDS = "dependentFields";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_FIELDS)
  private List<WorkItemFieldReference> dependentFields = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public FieldDependentRule dependentFields(List<WorkItemFieldReference> dependentFields) {
    
    this.dependentFields = dependentFields;
    return this;
  }

  public FieldDependentRule addDependentFieldsItem(WorkItemFieldReference dependentFieldsItem) {
    if (this.dependentFields == null) {
      this.dependentFields = new ArrayList<WorkItemFieldReference>();
    }
    this.dependentFields.add(dependentFieldsItem);
    return this;
  }

   /**
   * The dependent fields.
   * @return dependentFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dependent fields.")

  public List<WorkItemFieldReference> getDependentFields() {
    return dependentFields;
  }


  public void setDependentFields(List<WorkItemFieldReference> dependentFields) {
    this.dependentFields = dependentFields;
  }


  public FieldDependentRule url(String url) {
    
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
    FieldDependentRule fieldDependentRule = (FieldDependentRule) o;
    return Objects.equals(this.dependentFields, fieldDependentRule.dependentFields) &&
        Objects.equals(this.url, fieldDependentRule.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependentFields, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldDependentRule {\n");
    sb.append("    dependentFields: ").append(toIndentedString(dependentFields)).append("\n");
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
