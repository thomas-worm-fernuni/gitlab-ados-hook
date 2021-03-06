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
import com.azure.dev.api.model.EmailRecipients;
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
public class MailMessage {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private EmailRecipients cc;

  public static final String SERIALIZED_NAME_IN_REPLY_TO = "inReplyTo";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO)
  private String inReplyTo;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private EmailRecipients replyTo;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private EmailRecipients to;


  public MailMessage body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The mail body in HTML format.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mail body in HTML format.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public MailMessage cc(EmailRecipients cc) {
    
    this.cc = cc;
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailRecipients getCc() {
    return cc;
  }


  public void setCc(EmailRecipients cc) {
    this.cc = cc;
  }


  public MailMessage inReplyTo(String inReplyTo) {
    
    this.inReplyTo = inReplyTo;
    return this;
  }

   /**
   * The in-reply-to header value
   * @return inReplyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The in-reply-to header value")

  public String getInReplyTo() {
    return inReplyTo;
  }


  public void setInReplyTo(String inReplyTo) {
    this.inReplyTo = inReplyTo;
  }


  public MailMessage messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * The Message Id value
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Message Id value")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public MailMessage replyTo(EmailRecipients replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailRecipients getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(EmailRecipients replyTo) {
    this.replyTo = replyTo;
  }


  public MailMessage subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The mail subject.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mail subject.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public MailMessage to(EmailRecipients to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailRecipients getTo() {
    return to;
  }


  public void setTo(EmailRecipients to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailMessage mailMessage = (MailMessage) o;
    return Objects.equals(this.body, mailMessage.body) &&
        Objects.equals(this.cc, mailMessage.cc) &&
        Objects.equals(this.inReplyTo, mailMessage.inReplyTo) &&
        Objects.equals(this.messageId, mailMessage.messageId) &&
        Objects.equals(this.replyTo, mailMessage.replyTo) &&
        Objects.equals(this.subject, mailMessage.subject) &&
        Objects.equals(this.to, mailMessage.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, cc, inReplyTo, messageId, replyTo, subject, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMessage {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    inReplyTo: ").append(toIndentedString(inReplyTo)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

