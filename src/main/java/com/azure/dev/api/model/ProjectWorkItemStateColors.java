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
import com.azure.dev.api.model.WorkItemTypeStateColors;
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
 * Project work item type state colors
 */
@ApiModel(description = "Project work item type state colors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class ProjectWorkItemStateColors {
  public static final String SERIALIZED_NAME_PROJECT_NAME = "projectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_WORK_ITEM_TYPE_STATE_COLORS = "workItemTypeStateColors";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_TYPE_STATE_COLORS)
  private List<WorkItemTypeStateColors> workItemTypeStateColors = null;


  public ProjectWorkItemStateColors projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * Project name
   * @return projectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Project name")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public ProjectWorkItemStateColors workItemTypeStateColors(List<WorkItemTypeStateColors> workItemTypeStateColors) {
    
    this.workItemTypeStateColors = workItemTypeStateColors;
    return this;
  }

  public ProjectWorkItemStateColors addWorkItemTypeStateColorsItem(WorkItemTypeStateColors workItemTypeStateColorsItem) {
    if (this.workItemTypeStateColors == null) {
      this.workItemTypeStateColors = new ArrayList<WorkItemTypeStateColors>();
    }
    this.workItemTypeStateColors.add(workItemTypeStateColorsItem);
    return this;
  }

   /**
   * State colors for all work item type in a project
   * @return workItemTypeStateColors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State colors for all work item type in a project")

  public List<WorkItemTypeStateColors> getWorkItemTypeStateColors() {
    return workItemTypeStateColors;
  }


  public void setWorkItemTypeStateColors(List<WorkItemTypeStateColors> workItemTypeStateColors) {
    this.workItemTypeStateColors = workItemTypeStateColors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectWorkItemStateColors projectWorkItemStateColors = (ProjectWorkItemStateColors) o;
    return Objects.equals(this.projectName, projectWorkItemStateColors.projectName) &&
        Objects.equals(this.workItemTypeStateColors, projectWorkItemStateColors.workItemTypeStateColors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, workItemTypeStateColors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectWorkItemStateColors {\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    workItemTypeStateColors: ").append(toIndentedString(workItemTypeStateColors)).append("\n");
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

