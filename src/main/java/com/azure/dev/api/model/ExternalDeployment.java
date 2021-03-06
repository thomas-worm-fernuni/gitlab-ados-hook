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
import com.azure.dev.api.model.ExternalEnvironment;
import com.azure.dev.api.model.ExternalPipeline;
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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class ExternalDeployment {
  public static final String SERIALIZED_NAME_ARTIFACT_ID = "artifactId";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_ID)
  private UUID artifactId;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UUID createdBy;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private ExternalEnvironment environment;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private ExternalPipeline pipeline;

  public static final String SERIALIZED_NAME_RELATED_WORK_ITEM_IDS = "relatedWorkItemIds";
  @SerializedName(SERIALIZED_NAME_RELATED_WORK_ITEM_IDS)
  private List<Integer> relatedWorkItemIds = null;

  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private Integer runId;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Integer sequenceNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DATE = "statusDate";
  @SerializedName(SERIALIZED_NAME_STATUS_DATE)
  private OffsetDateTime statusDate;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public ExternalDeployment artifactId(UUID artifactId) {
    
    this.artifactId = artifactId;
    return this;
  }

   /**
   * Get artifactId
   * @return artifactId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getArtifactId() {
    return artifactId;
  }


  public void setArtifactId(UUID artifactId) {
    this.artifactId = artifactId;
  }


  public ExternalDeployment createdBy(UUID createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }


  public ExternalDeployment description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExternalDeployment displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ExternalDeployment environment(ExternalEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalEnvironment getEnvironment() {
    return environment;
  }


  public void setEnvironment(ExternalEnvironment environment) {
    this.environment = environment;
  }


  public ExternalDeployment group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public ExternalDeployment pipeline(ExternalPipeline pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPipeline getPipeline() {
    return pipeline;
  }


  public void setPipeline(ExternalPipeline pipeline) {
    this.pipeline = pipeline;
  }


  public ExternalDeployment relatedWorkItemIds(List<Integer> relatedWorkItemIds) {
    
    this.relatedWorkItemIds = relatedWorkItemIds;
    return this;
  }

  public ExternalDeployment addRelatedWorkItemIdsItem(Integer relatedWorkItemIdsItem) {
    if (this.relatedWorkItemIds == null) {
      this.relatedWorkItemIds = new ArrayList<Integer>();
    }
    this.relatedWorkItemIds.add(relatedWorkItemIdsItem);
    return this;
  }

   /**
   * Get relatedWorkItemIds
   * @return relatedWorkItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getRelatedWorkItemIds() {
    return relatedWorkItemIds;
  }


  public void setRelatedWorkItemIds(List<Integer> relatedWorkItemIds) {
    this.relatedWorkItemIds = relatedWorkItemIds;
  }


  public ExternalDeployment runId(Integer runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * Get runId
   * @return runId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunId() {
    return runId;
  }


  public void setRunId(Integer runId) {
    this.runId = runId;
  }


  public ExternalDeployment sequenceNumber(Integer sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public ExternalDeployment status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ExternalDeployment statusDate(OffsetDateTime statusDate) {
    
    this.statusDate = statusDate;
    return this;
  }

   /**
   * Get statusDate
   * @return statusDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStatusDate() {
    return statusDate;
  }


  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }


  public ExternalDeployment url(String url) {
    
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
    ExternalDeployment externalDeployment = (ExternalDeployment) o;
    return Objects.equals(this.artifactId, externalDeployment.artifactId) &&
        Objects.equals(this.createdBy, externalDeployment.createdBy) &&
        Objects.equals(this.description, externalDeployment.description) &&
        Objects.equals(this.displayName, externalDeployment.displayName) &&
        Objects.equals(this.environment, externalDeployment.environment) &&
        Objects.equals(this.group, externalDeployment.group) &&
        Objects.equals(this.pipeline, externalDeployment.pipeline) &&
        Objects.equals(this.relatedWorkItemIds, externalDeployment.relatedWorkItemIds) &&
        Objects.equals(this.runId, externalDeployment.runId) &&
        Objects.equals(this.sequenceNumber, externalDeployment.sequenceNumber) &&
        Objects.equals(this.status, externalDeployment.status) &&
        Objects.equals(this.statusDate, externalDeployment.statusDate) &&
        Objects.equals(this.url, externalDeployment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactId, createdBy, description, displayName, environment, group, pipeline, relatedWorkItemIds, runId, sequenceNumber, status, statusDate, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDeployment {\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    relatedWorkItemIds: ").append(toIndentedString(relatedWorkItemIds)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
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

