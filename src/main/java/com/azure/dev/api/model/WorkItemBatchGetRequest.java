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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Describes a request to get a set of work items
 */
@ApiModel(description = "Describes a request to get a set of work items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-21T10:09:21.598267402Z[Etc/UTC]")
public class WorkItemBatchGetRequest {
  /**
   * The expand parameters for work item attributes. Possible options are { None, Relations, Fields, Links, All }
   */
  @JsonAdapter(ExpandEnum.Adapter.class)
  public enum ExpandEnum {
    NONE("none"),
    
    RELATIONS("relations"),
    
    FIELDS("fields"),
    
    LINKS("links"),
    
    ALL("all");

    private String value;

    ExpandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String value) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExpandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExpandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_$_EXPAND = "$expand";
  @SerializedName(SERIALIZED_NAME_$_EXPAND)
  private ExpandEnum $expand;

  public static final String SERIALIZED_NAME_AS_OF = "asOf";
  @SerializedName(SERIALIZED_NAME_AS_OF)
  private OffsetDateTime asOf;

  /**
   * The flag to control error policy in a bulk get work items request. Possible options are {Fail, Omit}.
   */
  @JsonAdapter(ErrorPolicyEnum.Adapter.class)
  public enum ErrorPolicyEnum {
    FAIL("fail"),
    
    OMIT("omit");

    private String value;

    ErrorPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorPolicyEnum fromValue(String value) {
      for (ErrorPolicyEnum b : ErrorPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_POLICY = "errorPolicy";
  @SerializedName(SERIALIZED_NAME_ERROR_POLICY)
  private ErrorPolicyEnum errorPolicy;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Integer> ids = null;


  public WorkItemBatchGetRequest $expand(ExpandEnum $expand) {
    
    this.$expand = $expand;
    return this;
  }

   /**
   * The expand parameters for work item attributes. Possible options are { None, Relations, Fields, Links, All }
   * @return $expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expand parameters for work item attributes. Possible options are { None, Relations, Fields, Links, All }")

  public ExpandEnum get$Expand() {
    return $expand;
  }


  public void set$Expand(ExpandEnum $expand) {
    this.$expand = $expand;
  }


  public WorkItemBatchGetRequest asOf(OffsetDateTime asOf) {
    
    this.asOf = asOf;
    return this;
  }

   /**
   * AsOf UTC date time string
   * @return asOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AsOf UTC date time string")

  public OffsetDateTime getAsOf() {
    return asOf;
  }


  public void setAsOf(OffsetDateTime asOf) {
    this.asOf = asOf;
  }


  public WorkItemBatchGetRequest errorPolicy(ErrorPolicyEnum errorPolicy) {
    
    this.errorPolicy = errorPolicy;
    return this;
  }

   /**
   * The flag to control error policy in a bulk get work items request. Possible options are {Fail, Omit}.
   * @return errorPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flag to control error policy in a bulk get work items request. Possible options are {Fail, Omit}.")

  public ErrorPolicyEnum getErrorPolicy() {
    return errorPolicy;
  }


  public void setErrorPolicy(ErrorPolicyEnum errorPolicy) {
    this.errorPolicy = errorPolicy;
  }


  public WorkItemBatchGetRequest fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public WorkItemBatchGetRequest addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<String>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * The requested fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The requested fields")

  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public WorkItemBatchGetRequest ids(List<Integer> ids) {
    
    this.ids = ids;
    return this;
  }

  public WorkItemBatchGetRequest addIdsItem(Integer idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<Integer>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested work item ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The requested work item ids")

  public List<Integer> getIds() {
    return ids;
  }


  public void setIds(List<Integer> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemBatchGetRequest workItemBatchGetRequest = (WorkItemBatchGetRequest) o;
    return Objects.equals(this.$expand, workItemBatchGetRequest.$expand) &&
        Objects.equals(this.asOf, workItemBatchGetRequest.asOf) &&
        Objects.equals(this.errorPolicy, workItemBatchGetRequest.errorPolicy) &&
        Objects.equals(this.fields, workItemBatchGetRequest.fields) &&
        Objects.equals(this.ids, workItemBatchGetRequest.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash($expand, asOf, errorPolicy, fields, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemBatchGetRequest {\n");
    sb.append("    $expand: ").append(toIndentedString($expand)).append("\n");
    sb.append("    asOf: ").append(toIndentedString(asOf)).append("\n");
    sb.append("    errorPolicy: ").append(toIndentedString(errorPolicy)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

