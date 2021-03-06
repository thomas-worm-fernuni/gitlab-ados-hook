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
import com.azure.dev.api.model.WorkItemFieldOperation;
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
import java.util.UUID;

/**
 * Describes a field on a work item and it&#39;s properties specific to that work item type.
 */
@ApiModel(description = "Describes a field on a work item and it's properties specific to that work item type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemField {
  public static final String SERIALIZED_NAME_CAN_SORT_BY = "canSortBy";
  @SerializedName(SERIALIZED_NAME_CAN_SORT_BY)
  private Boolean canSortBy;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_IS_IDENTITY = "isIdentity";
  @SerializedName(SERIALIZED_NAME_IS_IDENTITY)
  private Boolean isIdentity;

  public static final String SERIALIZED_NAME_IS_PICKLIST = "isPicklist";
  @SerializedName(SERIALIZED_NAME_IS_PICKLIST)
  private Boolean isPicklist;

  public static final String SERIALIZED_NAME_IS_PICKLIST_SUGGESTED = "isPicklistSuggested";
  @SerializedName(SERIALIZED_NAME_IS_PICKLIST_SUGGESTED)
  private Boolean isPicklistSuggested;

  public static final String SERIALIZED_NAME_IS_QUERYABLE = "isQueryable";
  @SerializedName(SERIALIZED_NAME_IS_QUERYABLE)
  private Boolean isQueryable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PICKLIST_ID = "picklistId";
  @SerializedName(SERIALIZED_NAME_PICKLIST_ID)
  private UUID picklistId;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_REFERENCE_NAME = "referenceName";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NAME)
  private String referenceName;

  public static final String SERIALIZED_NAME_SUPPORTED_OPERATIONS = "supportedOperations";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_OPERATIONS)
  private List<WorkItemFieldOperation> supportedOperations = null;

  /**
   * The type of the field.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("string"),
    
    INTEGER("integer"),
    
    DATETIME("dateTime"),
    
    PLAINTEXT("plainText"),
    
    HTML("html"),
    
    TREEPATH("treePath"),
    
    HISTORY("history"),
    
    DOUBLE("double"),
    
    GUID("guid"),
    
    BOOLEAN("boolean"),
    
    IDENTITY("identity"),
    
    PICKLISTSTRING("picklistString"),
    
    PICKLISTINTEGER("picklistInteger"),
    
    PICKLISTDOUBLE("picklistDouble");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The usage of the field.
   */
  @JsonAdapter(UsageEnum.Adapter.class)
  public enum UsageEnum {
    NONE("none"),
    
    WORKITEM("workItem"),
    
    WORKITEMLINK("workItemLink"),
    
    TREE("tree"),
    
    WORKITEMTYPEEXTENSION("workItemTypeExtension");

    private String value;

    UsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsageEnum fromValue(String value) {
      for (UsageEnum b : UsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private UsageEnum usage;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WorkItemField canSortBy(Boolean canSortBy) {
    
    this.canSortBy = canSortBy;
    return this;
  }

   /**
   * Indicates whether the field is sortable in server queries.
   * @return canSortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the field is sortable in server queries.")

  public Boolean getCanSortBy() {
    return canSortBy;
  }


  public void setCanSortBy(Boolean canSortBy) {
    this.canSortBy = canSortBy;
  }


  public WorkItemField description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the field.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the field.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WorkItemField isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates whether this field is deleted.
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this field is deleted.")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public WorkItemField isIdentity(Boolean isIdentity) {
    
    this.isIdentity = isIdentity;
    return this;
  }

   /**
   * Indicates whether this field is an identity field.
   * @return isIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this field is an identity field.")

  public Boolean getIsIdentity() {
    return isIdentity;
  }


  public void setIsIdentity(Boolean isIdentity) {
    this.isIdentity = isIdentity;
  }


  public WorkItemField isPicklist(Boolean isPicklist) {
    
    this.isPicklist = isPicklist;
    return this;
  }

   /**
   * Indicates whether this instance is picklist.
   * @return isPicklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this instance is picklist.")

  public Boolean getIsPicklist() {
    return isPicklist;
  }


  public void setIsPicklist(Boolean isPicklist) {
    this.isPicklist = isPicklist;
  }


  public WorkItemField isPicklistSuggested(Boolean isPicklistSuggested) {
    
    this.isPicklistSuggested = isPicklistSuggested;
    return this;
  }

   /**
   * Indicates whether this instance is a suggested picklist .
   * @return isPicklistSuggested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this instance is a suggested picklist .")

  public Boolean getIsPicklistSuggested() {
    return isPicklistSuggested;
  }


  public void setIsPicklistSuggested(Boolean isPicklistSuggested) {
    this.isPicklistSuggested = isPicklistSuggested;
  }


  public WorkItemField isQueryable(Boolean isQueryable) {
    
    this.isQueryable = isQueryable;
    return this;
  }

   /**
   * Indicates whether the field can be queried in the server.
   * @return isQueryable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the field can be queried in the server.")

  public Boolean getIsQueryable() {
    return isQueryable;
  }


  public void setIsQueryable(Boolean isQueryable) {
    this.isQueryable = isQueryable;
  }


  public WorkItemField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkItemField picklistId(UUID picklistId) {
    
    this.picklistId = picklistId;
    return this;
  }

   /**
   * If this field is picklist, the identifier of the picklist associated, otherwise null
   * @return picklistId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this field is picklist, the identifier of the picklist associated, otherwise null")

  public UUID getPicklistId() {
    return picklistId;
  }


  public void setPicklistId(UUID picklistId) {
    this.picklistId = picklistId;
  }


  public WorkItemField readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Indicates whether the field is [read only].
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the field is [read only].")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public WorkItemField referenceName(String referenceName) {
    
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


  public WorkItemField supportedOperations(List<WorkItemFieldOperation> supportedOperations) {
    
    this.supportedOperations = supportedOperations;
    return this;
  }

  public WorkItemField addSupportedOperationsItem(WorkItemFieldOperation supportedOperationsItem) {
    if (this.supportedOperations == null) {
      this.supportedOperations = new ArrayList<WorkItemFieldOperation>();
    }
    this.supportedOperations.add(supportedOperationsItem);
    return this;
  }

   /**
   * The supported operations on this field.
   * @return supportedOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The supported operations on this field.")

  public List<WorkItemFieldOperation> getSupportedOperations() {
    return supportedOperations;
  }


  public void setSupportedOperations(List<WorkItemFieldOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
  }


  public WorkItemField type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the field.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the field.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WorkItemField usage(UsageEnum usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * The usage of the field.
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The usage of the field.")

  public UsageEnum getUsage() {
    return usage;
  }


  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }


  public WorkItemField url(String url) {
    
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
    WorkItemField workItemField = (WorkItemField) o;
    return Objects.equals(this.canSortBy, workItemField.canSortBy) &&
        Objects.equals(this.description, workItemField.description) &&
        Objects.equals(this.isDeleted, workItemField.isDeleted) &&
        Objects.equals(this.isIdentity, workItemField.isIdentity) &&
        Objects.equals(this.isPicklist, workItemField.isPicklist) &&
        Objects.equals(this.isPicklistSuggested, workItemField.isPicklistSuggested) &&
        Objects.equals(this.isQueryable, workItemField.isQueryable) &&
        Objects.equals(this.name, workItemField.name) &&
        Objects.equals(this.picklistId, workItemField.picklistId) &&
        Objects.equals(this.readOnly, workItemField.readOnly) &&
        Objects.equals(this.referenceName, workItemField.referenceName) &&
        Objects.equals(this.supportedOperations, workItemField.supportedOperations) &&
        Objects.equals(this.type, workItemField.type) &&
        Objects.equals(this.usage, workItemField.usage) &&
        Objects.equals(this.url, workItemField.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSortBy, description, isDeleted, isIdentity, isPicklist, isPicklistSuggested, isQueryable, name, picklistId, readOnly, referenceName, supportedOperations, type, usage, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemField {\n");
    sb.append("    canSortBy: ").append(toIndentedString(canSortBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isIdentity: ").append(toIndentedString(isIdentity)).append("\n");
    sb.append("    isPicklist: ").append(toIndentedString(isPicklist)).append("\n");
    sb.append("    isPicklistSuggested: ").append(toIndentedString(isPicklistSuggested)).append("\n");
    sb.append("    isQueryable: ").append(toIndentedString(isQueryable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    picklistId: ").append(toIndentedString(picklistId)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
    sb.append("    supportedOperations: ").append(toIndentedString(supportedOperations)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

