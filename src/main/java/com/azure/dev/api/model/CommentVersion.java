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
import com.azure.dev.api.model.IdentityRef;
import com.azure.dev.api.model.WorkItemTrackingResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a specific version of a comment on a work item.
 */
@ApiModel(description = "Represents a specific version of a comment on a work item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class CommentVersion {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private IdentityRef createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_ON_BEHALF_DATE = "createdOnBehalfDate";
  @SerializedName(SERIALIZED_NAME_CREATED_ON_BEHALF_DATE)
  private OffsetDateTime createdOnBehalfDate;

  public static final String SERIALIZED_NAME_CREATED_ON_BEHALF_OF = "createdOnBehalfOf";
  @SerializedName(SERIALIZED_NAME_CREATED_ON_BEHALF_OF)
  private IdentityRef createdOnBehalfOf;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private IdentityRef modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_RENDERED_TEXT = "renderedText";
  @SerializedName(SERIALIZED_NAME_RENDERED_TEXT)
  private String renderedText;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public CommentVersion createdBy(IdentityRef createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityRef getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(IdentityRef createdBy) {
    this.createdBy = createdBy;
  }


  public CommentVersion createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The creation date of the comment.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation date of the comment.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public CommentVersion createdOnBehalfDate(OffsetDateTime createdOnBehalfDate) {
    
    this.createdOnBehalfDate = createdOnBehalfDate;
    return this;
  }

   /**
   * Effective Date/time value for adding the comment. Can be optionally different from CreatedDate.
   * @return createdOnBehalfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Effective Date/time value for adding the comment. Can be optionally different from CreatedDate.")

  public OffsetDateTime getCreatedOnBehalfDate() {
    return createdOnBehalfDate;
  }


  public void setCreatedOnBehalfDate(OffsetDateTime createdOnBehalfDate) {
    this.createdOnBehalfDate = createdOnBehalfDate;
  }


  public CommentVersion createdOnBehalfOf(IdentityRef createdOnBehalfOf) {
    
    this.createdOnBehalfOf = createdOnBehalfOf;
    return this;
  }

   /**
   * Get createdOnBehalfOf
   * @return createdOnBehalfOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityRef getCreatedOnBehalfOf() {
    return createdOnBehalfOf;
  }


  public void setCreatedOnBehalfOf(IdentityRef createdOnBehalfOf) {
    this.createdOnBehalfOf = createdOnBehalfOf;
  }


  public CommentVersion id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id assigned to the comment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id assigned to the comment.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CommentVersion isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the comment has been deleted at this version.
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the comment has been deleted at this version.")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public CommentVersion modifiedBy(IdentityRef modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityRef getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(IdentityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public CommentVersion modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * The modification date of the comment for this version.
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The modification date of the comment for this version.")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public CommentVersion renderedText(String renderedText) {
    
    this.renderedText = renderedText;
    return this;
  }

   /**
   * The rendered content of the comment at this version.
   * @return renderedText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rendered content of the comment at this version.")

  public String getRenderedText() {
    return renderedText;
  }


  public void setRenderedText(String renderedText) {
    this.renderedText = renderedText;
  }


  public CommentVersion text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text of the comment at this version.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text of the comment at this version.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CommentVersion version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version number.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public CommentVersion url(String url) {
    
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
    CommentVersion commentVersion = (CommentVersion) o;
    return Objects.equals(this.createdBy, commentVersion.createdBy) &&
        Objects.equals(this.createdDate, commentVersion.createdDate) &&
        Objects.equals(this.createdOnBehalfDate, commentVersion.createdOnBehalfDate) &&
        Objects.equals(this.createdOnBehalfOf, commentVersion.createdOnBehalfOf) &&
        Objects.equals(this.id, commentVersion.id) &&
        Objects.equals(this.isDeleted, commentVersion.isDeleted) &&
        Objects.equals(this.modifiedBy, commentVersion.modifiedBy) &&
        Objects.equals(this.modifiedDate, commentVersion.modifiedDate) &&
        Objects.equals(this.renderedText, commentVersion.renderedText) &&
        Objects.equals(this.text, commentVersion.text) &&
        Objects.equals(this.version, commentVersion.version) &&
        Objects.equals(this.url, commentVersion.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, createdOnBehalfDate, createdOnBehalfOf, id, isDeleted, modifiedBy, modifiedDate, renderedText, text, version, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentVersion {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdOnBehalfDate: ").append(toIndentedString(createdOnBehalfDate)).append("\n");
    sb.append("    createdOnBehalfOf: ").append(toIndentedString(createdOnBehalfOf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    renderedText: ").append(toIndentedString(renderedText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

