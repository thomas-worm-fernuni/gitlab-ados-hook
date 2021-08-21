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
import com.azure.dev.api.model.WorkItemRelation;
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
 * Describes updates to a work item&#39;s relations.
 */
@ApiModel(description = "Describes updates to a work item's relations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemRelationUpdates {
  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private List<WorkItemRelation> added = null;

  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private List<WorkItemRelation> removed = null;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private List<WorkItemRelation> updated = null;


  public WorkItemRelationUpdates added(List<WorkItemRelation> added) {
    
    this.added = added;
    return this;
  }

  public WorkItemRelationUpdates addAddedItem(WorkItemRelation addedItem) {
    if (this.added == null) {
      this.added = new ArrayList<WorkItemRelation>();
    }
    this.added.add(addedItem);
    return this;
  }

   /**
   * List of newly added relations.
   * @return added
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of newly added relations.")

  public List<WorkItemRelation> getAdded() {
    return added;
  }


  public void setAdded(List<WorkItemRelation> added) {
    this.added = added;
  }


  public WorkItemRelationUpdates removed(List<WorkItemRelation> removed) {
    
    this.removed = removed;
    return this;
  }

  public WorkItemRelationUpdates addRemovedItem(WorkItemRelation removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<WorkItemRelation>();
    }
    this.removed.add(removedItem);
    return this;
  }

   /**
   * List of removed relations.
   * @return removed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of removed relations.")

  public List<WorkItemRelation> getRemoved() {
    return removed;
  }


  public void setRemoved(List<WorkItemRelation> removed) {
    this.removed = removed;
  }


  public WorkItemRelationUpdates updated(List<WorkItemRelation> updated) {
    
    this.updated = updated;
    return this;
  }

  public WorkItemRelationUpdates addUpdatedItem(WorkItemRelation updatedItem) {
    if (this.updated == null) {
      this.updated = new ArrayList<WorkItemRelation>();
    }
    this.updated.add(updatedItem);
    return this;
  }

   /**
   * List of updated relations.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of updated relations.")

  public List<WorkItemRelation> getUpdated() {
    return updated;
  }


  public void setUpdated(List<WorkItemRelation> updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemRelationUpdates workItemRelationUpdates = (WorkItemRelationUpdates) o;
    return Objects.equals(this.added, workItemRelationUpdates.added) &&
        Objects.equals(this.removed, workItemRelationUpdates.removed) &&
        Objects.equals(this.updated, workItemRelationUpdates.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, removed, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemRelationUpdates {\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
