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
import com.azure.dev.api.model.WorkItemTypeFieldInstanceBase;
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
 * Field Instance of a workItemype with detailed references.
 */
@ApiModel(description = "Field Instance of a workItemype with detailed references.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemTypeFieldWithReferences {
  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<Object> allowedValues = null;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private Object defaultValue;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REFERENCE_NAME = "referenceName";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NAME)
  private String referenceName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WorkItemTypeFieldWithReferences allowedValues(List<Object> allowedValues) {
    
    this.allowedValues = allowedValues;
    return this;
  }

  public WorkItemTypeFieldWithReferences addAllowedValuesItem(Object allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<Object>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * The list of field allowed values.
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of field allowed values.")

  public List<Object> getAllowedValues() {
    return allowedValues;
  }


  public void setAllowedValues(List<Object> allowedValues) {
    this.allowedValues = allowedValues;
  }


  public WorkItemTypeFieldWithReferences defaultValue(Object defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Represents the default value of the field.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the default value of the field.")

  public Object getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }


  public WorkItemTypeFieldWithReferences name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The friendly name of the field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The friendly name of the field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkItemTypeFieldWithReferences referenceName(String referenceName) {
    
    this.referenceName = referenceName;
    return this;
  }

   /**
   * The reference name of the field.
   * @return referenceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference name of the field.")

  public String getReferenceName() {
    return referenceName;
  }


  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }


  public WorkItemTypeFieldWithReferences url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The REST URL of the resource.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The REST URL of the resource.")

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
    WorkItemTypeFieldWithReferences workItemTypeFieldWithReferences = (WorkItemTypeFieldWithReferences) o;
    return Objects.equals(this.allowedValues, workItemTypeFieldWithReferences.allowedValues) &&
        Objects.equals(this.defaultValue, workItemTypeFieldWithReferences.defaultValue) &&
        Objects.equals(this.name, workItemTypeFieldWithReferences.name) &&
        Objects.equals(this.referenceName, workItemTypeFieldWithReferences.referenceName) &&
        Objects.equals(this.url, workItemTypeFieldWithReferences.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, defaultValue, name, referenceName, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemTypeFieldWithReferences {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
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

