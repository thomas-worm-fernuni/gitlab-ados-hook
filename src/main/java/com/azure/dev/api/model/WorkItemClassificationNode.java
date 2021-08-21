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
import com.azure.dev.api.model.WorkItemClassificationNode;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Defines a classification node for work item tracking.
 */
@ApiModel(description = "Defines a classification node for work item tracking.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemClassificationNode {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<WorkItemClassificationNode> children = null;

  public static final String SERIALIZED_NAME_HAS_CHILDREN = "hasChildren";
  @SerializedName(SERIALIZED_NAME_HAS_CHILDREN)
  private Boolean hasChildren;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private UUID identifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  /**
   * Node structure type.
   */
  @JsonAdapter(StructureTypeEnum.Adapter.class)
  public enum StructureTypeEnum {
    AREA("area"),
    
    ITERATION("iteration");

    private String value;

    StructureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StructureTypeEnum fromValue(String value) {
      for (StructureTypeEnum b : StructureTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StructureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StructureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StructureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StructureTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STRUCTURE_TYPE = "structureType";
  @SerializedName(SERIALIZED_NAME_STRUCTURE_TYPE)
  private StructureTypeEnum structureType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WorkItemClassificationNode attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public WorkItemClassificationNode putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Dictionary that has node attributes like start/finish date for iteration nodes.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dictionary that has node attributes like start/finish date for iteration nodes.")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public WorkItemClassificationNode children(List<WorkItemClassificationNode> children) {
    
    this.children = children;
    return this;
  }

  public WorkItemClassificationNode addChildrenItem(WorkItemClassificationNode childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<WorkItemClassificationNode>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * List of child nodes fetched.
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of child nodes fetched.")

  public List<WorkItemClassificationNode> getChildren() {
    return children;
  }


  public void setChildren(List<WorkItemClassificationNode> children) {
    this.children = children;
  }


  public WorkItemClassificationNode hasChildren(Boolean hasChildren) {
    
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * Flag that indicates if the classification node has any child nodes.
   * @return hasChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag that indicates if the classification node has any child nodes.")

  public Boolean getHasChildren() {
    return hasChildren;
  }


  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  public WorkItemClassificationNode id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Integer ID of the classification node.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Integer ID of the classification node.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WorkItemClassificationNode identifier(UUID identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * GUID ID of the classification node.
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GUID ID of the classification node.")

  public UUID getIdentifier() {
    return identifier;
  }


  public void setIdentifier(UUID identifier) {
    this.identifier = identifier;
  }


  public WorkItemClassificationNode name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the classification node.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the classification node.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkItemClassificationNode path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path of the classification node.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path of the classification node.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public WorkItemClassificationNode structureType(StructureTypeEnum structureType) {
    
    this.structureType = structureType;
    return this;
  }

   /**
   * Node structure type.
   * @return structureType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Node structure type.")

  public StructureTypeEnum getStructureType() {
    return structureType;
  }


  public void setStructureType(StructureTypeEnum structureType) {
    this.structureType = structureType;
  }


  public WorkItemClassificationNode url(String url) {
    
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
    WorkItemClassificationNode workItemClassificationNode = (WorkItemClassificationNode) o;
    return Objects.equals(this.attributes, workItemClassificationNode.attributes) &&
        Objects.equals(this.children, workItemClassificationNode.children) &&
        Objects.equals(this.hasChildren, workItemClassificationNode.hasChildren) &&
        Objects.equals(this.id, workItemClassificationNode.id) &&
        Objects.equals(this.identifier, workItemClassificationNode.identifier) &&
        Objects.equals(this.name, workItemClassificationNode.name) &&
        Objects.equals(this.path, workItemClassificationNode.path) &&
        Objects.equals(this.structureType, workItemClassificationNode.structureType) &&
        Objects.equals(this.url, workItemClassificationNode.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, children, hasChildren, id, identifier, name, path, structureType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemClassificationNode {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    structureType: ").append(toIndentedString(structureType)).append("\n");
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

