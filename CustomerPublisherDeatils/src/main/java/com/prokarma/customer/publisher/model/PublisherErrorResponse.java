package com.prokarma.customer.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * PublisherErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-30T11:57:58.245Z")


public class PublisherErrorResponse   {
  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("errorType")
  private String errorType = null;

  public PublisherErrorResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public PublisherErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PublisherErrorResponse errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(value = "")


  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublisherErrorResponse publisherErrorResponse = (PublisherErrorResponse) o;
    return Objects.equals(this.statusCode, publisherErrorResponse.statusCode) &&
        Objects.equals(this.message, publisherErrorResponse.message) &&
        Objects.equals(this.errorType, publisherErrorResponse.errorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, errorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublisherErrorResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

