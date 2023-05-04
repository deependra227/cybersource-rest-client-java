/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PushFunds201ResponseClientReferenceInformation
 */

public class PushFunds201ResponseClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("submitLocalDateTime")
  private String submitLocalDateTime = null;

  public PushFunds201ResponseClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction. 
   * @return code
  **/
  @ApiModelProperty(value = "Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PushFunds201ResponseClientReferenceInformation submitLocalDateTime(String submitLocalDateTime) {
    this.submitLocalDateTime = submitLocalDateTime;
    return this;
  }

   /**
   * Date and time at your physical location.  Format: YYYYMMDDhhmmss, where YYYY &#x3D; year, MM &#x3D; month, DD &#x3D; day, hh &#x3D; hour, mm &#x3D; minutes ss &#x3D; seconds 
   * @return submitLocalDateTime
  **/
  @ApiModelProperty(value = "Date and time at your physical location.  Format: YYYYMMDDhhmmss, where YYYY = year, MM = month, DD = day, hh = hour, mm = minutes ss = seconds ")
  public String getSubmitLocalDateTime() {
    return submitLocalDateTime;
  }

  public void setSubmitLocalDateTime(String submitLocalDateTime) {
    this.submitLocalDateTime = submitLocalDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201ResponseClientReferenceInformation pushFunds201ResponseClientReferenceInformation = (PushFunds201ResponseClientReferenceInformation) o;
    return Objects.equals(this.code, pushFunds201ResponseClientReferenceInformation.code) &&
        Objects.equals(this.submitLocalDateTime, pushFunds201ResponseClientReferenceInformation.submitLocalDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, submitLocalDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201ResponseClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    submitLocalDateTime: ").append(toIndentedString(submitLocalDateTime)).append("\n");
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
