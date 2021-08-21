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

/**
 * Work item type state name, color and state category
 */
@ApiModel(description = "Work item type state name, color and state category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemStateColor {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public WorkItemStateColor category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category of state
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category of state")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public WorkItemStateColor color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Color value
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color value")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public WorkItemStateColor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Work item type state name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Work item type state name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemStateColor workItemStateColor = (WorkItemStateColor) o;
    return Objects.equals(this.category, workItemStateColor.category) &&
        Objects.equals(this.color, workItemStateColor.color) &&
        Objects.equals(this.name, workItemStateColor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, color, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemStateColor {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
