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
import com.azure.dev.api.model.GraphSubjectBase;
import com.azure.dev.api.model.ReferenceLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class IdentityRef {
  public static final String SERIALIZED_NAME_DIRECTORY_ALIAS = "directoryAlias";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_ALIAS)
  private String directoryAlias;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_INACTIVE = "inactive";
  @SerializedName(SERIALIZED_NAME_INACTIVE)
  private Boolean inactive;

  public static final String SERIALIZED_NAME_IS_AAD_IDENTITY = "isAadIdentity";
  @SerializedName(SERIALIZED_NAME_IS_AAD_IDENTITY)
  private Boolean isAadIdentity;

  public static final String SERIALIZED_NAME_IS_CONTAINER = "isContainer";
  @SerializedName(SERIALIZED_NAME_IS_CONTAINER)
  private Boolean isContainer;

  public static final String SERIALIZED_NAME_IS_DELETED_IN_ORIGIN = "isDeletedInOrigin";
  @SerializedName(SERIALIZED_NAME_IS_DELETED_IN_ORIGIN)
  private Boolean isDeletedInOrigin;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profileUrl";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "uniqueName";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ReferenceLinks links;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public IdentityRef directoryAlias(String directoryAlias) {
    
    this.directoryAlias = directoryAlias;
    return this;
  }

   /**
   * Deprecated - Can be retrieved by querying the Graph user referenced in the \&quot;self\&quot; entry of the IdentityRef \&quot;_links\&quot; dictionary
   * @return directoryAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - Can be retrieved by querying the Graph user referenced in the \"self\" entry of the IdentityRef \"_links\" dictionary")

  public String getDirectoryAlias() {
    return directoryAlias;
  }


  public void setDirectoryAlias(String directoryAlias) {
    this.directoryAlias = directoryAlias;
  }


  public IdentityRef id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentityRef imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Deprecated - Available in the \&quot;avatar\&quot; entry of the IdentityRef \&quot;_links\&quot; dictionary
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - Available in the \"avatar\" entry of the IdentityRef \"_links\" dictionary")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public IdentityRef inactive(Boolean inactive) {
    
    this.inactive = inactive;
    return this;
  }

   /**
   * Deprecated - Can be retrieved by querying the Graph membership state referenced in the \&quot;membershipState\&quot; entry of the GraphUser \&quot;_links\&quot; dictionary
   * @return inactive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - Can be retrieved by querying the Graph membership state referenced in the \"membershipState\" entry of the GraphUser \"_links\" dictionary")

  public Boolean getInactive() {
    return inactive;
  }


  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }


  public IdentityRef isAadIdentity(Boolean isAadIdentity) {
    
    this.isAadIdentity = isAadIdentity;
    return this;
  }

   /**
   * Deprecated - Can be inferred from the subject type of the descriptor (Descriptor.IsAadUserType/Descriptor.IsAadGroupType)
   * @return isAadIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - Can be inferred from the subject type of the descriptor (Descriptor.IsAadUserType/Descriptor.IsAadGroupType)")

  public Boolean getIsAadIdentity() {
    return isAadIdentity;
  }


  public void setIsAadIdentity(Boolean isAadIdentity) {
    this.isAadIdentity = isAadIdentity;
  }


  public IdentityRef isContainer(Boolean isContainer) {
    
    this.isContainer = isContainer;
    return this;
  }

   /**
   * Deprecated - Can be inferred from the subject type of the descriptor (Descriptor.IsGroupType)
   * @return isContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - Can be inferred from the subject type of the descriptor (Descriptor.IsGroupType)")

  public Boolean getIsContainer() {
    return isContainer;
  }


  public void setIsContainer(Boolean isContainer) {
    this.isContainer = isContainer;
  }


  public IdentityRef isDeletedInOrigin(Boolean isDeletedInOrigin) {
    
    this.isDeletedInOrigin = isDeletedInOrigin;
    return this;
  }

   /**
   * Get isDeletedInOrigin
   * @return isDeletedInOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDeletedInOrigin() {
    return isDeletedInOrigin;
  }


  public void setIsDeletedInOrigin(Boolean isDeletedInOrigin) {
    this.isDeletedInOrigin = isDeletedInOrigin;
  }


  public IdentityRef profileUrl(String profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Deprecated - not in use in most preexisting implementations of ToIdentityRef
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - not in use in most preexisting implementations of ToIdentityRef")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public IdentityRef uniqueName(String uniqueName) {
    
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Deprecated - use Domain+PrincipalName instead
   * @return uniqueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use Domain+PrincipalName instead")

  public String getUniqueName() {
    return uniqueName;
  }


  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  public IdentityRef links(ReferenceLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReferenceLinks getLinks() {
    return links;
  }


  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }


  public IdentityRef descriptor(String descriptor) {
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * The descriptor is the primary way to reference the graph subject while the system is running. This field will uniquely identify the same graph subject across both Accounts and Organizations.
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptor is the primary way to reference the graph subject while the system is running. This field will uniquely identify the same graph subject across both Accounts and Organizations.")

  public String getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(String descriptor) {
    this.descriptor = descriptor;
  }


  public IdentityRef displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * This is the non-unique display name of the graph subject. To change this field, you must alter its value in the source provider.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the non-unique display name of the graph subject. To change this field, you must alter its value in the source provider.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public IdentityRef url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * This url is the full route to the source resource of this graph subject.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This url is the full route to the source resource of this graph subject.")

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
    IdentityRef identityRef = (IdentityRef) o;
    return Objects.equals(this.directoryAlias, identityRef.directoryAlias) &&
        Objects.equals(this.id, identityRef.id) &&
        Objects.equals(this.imageUrl, identityRef.imageUrl) &&
        Objects.equals(this.inactive, identityRef.inactive) &&
        Objects.equals(this.isAadIdentity, identityRef.isAadIdentity) &&
        Objects.equals(this.isContainer, identityRef.isContainer) &&
        Objects.equals(this.isDeletedInOrigin, identityRef.isDeletedInOrigin) &&
        Objects.equals(this.profileUrl, identityRef.profileUrl) &&
        Objects.equals(this.uniqueName, identityRef.uniqueName) &&
        Objects.equals(this.links, identityRef.links) &&
        Objects.equals(this.descriptor, identityRef.descriptor) &&
        Objects.equals(this.displayName, identityRef.displayName) &&
        Objects.equals(this.url, identityRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryAlias, id, imageUrl, inactive, isAadIdentity, isContainer, isDeletedInOrigin, profileUrl, uniqueName, links, descriptor, displayName, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityRef {\n");
    sb.append("    directoryAlias: ").append(toIndentedString(directoryAlias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    isAadIdentity: ").append(toIndentedString(isAadIdentity)).append("\n");
    sb.append("    isContainer: ").append(toIndentedString(isContainer)).append("\n");
    sb.append("    isDeletedInOrigin: ").append(toIndentedString(isDeletedInOrigin)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

