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
import Model.Riskv1decisionsidactionsDecisionInformation;
import Model.Riskv1decisionsidactionsProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CaseManagementActionsRequest
 */

public class CaseManagementActionsRequest {
  @SerializedName("decisionInformation")
  private Riskv1decisionsidactionsDecisionInformation decisionInformation = null;

  @SerializedName("processingInformation")
  private Riskv1decisionsidactionsProcessingInformation processingInformation = null;

  public CaseManagementActionsRequest decisionInformation(Riskv1decisionsidactionsDecisionInformation decisionInformation) {
    this.decisionInformation = decisionInformation;
    return this;
  }

   /**
   * Get decisionInformation
   * @return decisionInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsidactionsDecisionInformation getDecisionInformation() {
    return decisionInformation;
  }

  public void setDecisionInformation(Riskv1decisionsidactionsDecisionInformation decisionInformation) {
    this.decisionInformation = decisionInformation;
  }

  public CaseManagementActionsRequest processingInformation(Riskv1decisionsidactionsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsidactionsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Riskv1decisionsidactionsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseManagementActionsRequest caseManagementActionsRequest = (CaseManagementActionsRequest) o;
    return Objects.equals(this.decisionInformation, caseManagementActionsRequest.decisionInformation) &&
        Objects.equals(this.processingInformation, caseManagementActionsRequest.processingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionInformation, processingInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseManagementActionsRequest {\n");
    
    sb.append("    decisionInformation: ").append(toIndentedString(decisionInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
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
