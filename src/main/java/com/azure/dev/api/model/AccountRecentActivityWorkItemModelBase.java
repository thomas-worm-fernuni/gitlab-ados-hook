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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents Work Item Recent Activity
 */
@ApiModel(description = "Represents Work Item Recent Activity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class AccountRecentActivityWorkItemModelBase {
  public static final String SERIALIZED_NAME_ACTIVITY_DATE = "activityDate";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DATE)
  private OffsetDateTime activityDate;

  /**
   * Type of the activity
   */
  @JsonAdapter(ActivityTypeEnum.Adapter.class)
  public enum ActivityTypeEnum {
    VISITED("visited"),
    
    EDITED("edited"),
    
    DELETED("deleted"),
    
    RESTORED("restored");

    private String value;

    ActivityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActivityTypeEnum fromValue(String value) {
      for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActivityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActivityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActivityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActivityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activityType";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private ActivityTypeEnum activityType;

  public static final String SERIALIZED_NAME_CHANGED_DATE = "changedDate";
  @SerializedName(SERIALIZED_NAME_CHANGED_DATE)
  private OffsetDateTime changedDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IDENTITY_ID = "identityId";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ID)
  private UUID identityId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TEAM_PROJECT = "teamProject";
  @SerializedName(SERIALIZED_NAME_TEAM_PROJECT)
  private String teamProject;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_WORK_ITEM_TYPE = "workItemType";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_TYPE)
  private String workItemType;


  public AccountRecentActivityWorkItemModelBase activityDate(OffsetDateTime activityDate) {
    
    this.activityDate = activityDate;
    return this;
  }

   /**
   * Date of the last Activity by the user
   * @return activityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last Activity by the user")

  public OffsetDateTime getActivityDate() {
    return activityDate;
  }


  public void setActivityDate(OffsetDateTime activityDate) {
    this.activityDate = activityDate;
  }


  public AccountRecentActivityWorkItemModelBase activityType(ActivityTypeEnum activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * Type of the activity
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the activity")

  public ActivityTypeEnum getActivityType() {
    return activityType;
  }


  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }


  public AccountRecentActivityWorkItemModelBase changedDate(OffsetDateTime changedDate) {
    
    this.changedDate = changedDate;
    return this;
  }

   /**
   * Last changed date of the work item
   * @return changedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last changed date of the work item")

  public OffsetDateTime getChangedDate() {
    return changedDate;
  }


  public void setChangedDate(OffsetDateTime changedDate) {
    this.changedDate = changedDate;
  }


  public AccountRecentActivityWorkItemModelBase id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Work Item Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Work Item Id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AccountRecentActivityWorkItemModelBase identityId(UUID identityId) {
    
    this.identityId = identityId;
    return this;
  }

   /**
   * TeamFoundationId of the user this activity belongs to
   * @return identityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TeamFoundationId of the user this activity belongs to")

  public UUID getIdentityId() {
    return identityId;
  }


  public void setIdentityId(UUID identityId) {
    this.identityId = identityId;
  }


  public AccountRecentActivityWorkItemModelBase state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the work item
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State of the work item")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public AccountRecentActivityWorkItemModelBase teamProject(String teamProject) {
    
    this.teamProject = teamProject;
    return this;
  }

   /**
   * Team project the work item belongs to
   * @return teamProject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Team project the work item belongs to")

  public String getTeamProject() {
    return teamProject;
  }


  public void setTeamProject(String teamProject) {
    this.teamProject = teamProject;
  }


  public AccountRecentActivityWorkItemModelBase title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the work item
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the work item")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AccountRecentActivityWorkItemModelBase workItemType(String workItemType) {
    
    this.workItemType = workItemType;
    return this;
  }

   /**
   * Type of Work Item
   * @return workItemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of Work Item")

  public String getWorkItemType() {
    return workItemType;
  }


  public void setWorkItemType(String workItemType) {
    this.workItemType = workItemType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRecentActivityWorkItemModelBase accountRecentActivityWorkItemModelBase = (AccountRecentActivityWorkItemModelBase) o;
    return Objects.equals(this.activityDate, accountRecentActivityWorkItemModelBase.activityDate) &&
        Objects.equals(this.activityType, accountRecentActivityWorkItemModelBase.activityType) &&
        Objects.equals(this.changedDate, accountRecentActivityWorkItemModelBase.changedDate) &&
        Objects.equals(this.id, accountRecentActivityWorkItemModelBase.id) &&
        Objects.equals(this.identityId, accountRecentActivityWorkItemModelBase.identityId) &&
        Objects.equals(this.state, accountRecentActivityWorkItemModelBase.state) &&
        Objects.equals(this.teamProject, accountRecentActivityWorkItemModelBase.teamProject) &&
        Objects.equals(this.title, accountRecentActivityWorkItemModelBase.title) &&
        Objects.equals(this.workItemType, accountRecentActivityWorkItemModelBase.workItemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDate, activityType, changedDate, id, identityId, state, teamProject, title, workItemType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRecentActivityWorkItemModelBase {\n");
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    teamProject: ").append(toIndentedString(teamProject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    workItemType: ").append(toIndentedString(workItemType)).append("\n");
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

