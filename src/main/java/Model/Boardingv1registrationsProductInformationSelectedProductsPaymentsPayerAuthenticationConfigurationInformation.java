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
import Model.Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformationConfigurations;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation
 */

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation {
  @SerializedName("templateId")
  private UUID templateId = null;

  @SerializedName("configurations")
  private Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformationConfigurations configurations = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation templateId(UUID templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public UUID getTemplateId() {
    return templateId;
  }

  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation configurations(Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformationConfigurations configurations) {
    this.configurations = configurations;
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformationConfigurations getConfigurations() {
    return configurations;
  }

  public void setConfigurations(Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformationConfigurations configurations) {
    this.configurations = configurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation = (Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation) o;
    return Objects.equals(this.templateId, boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation.templateId) &&
        Objects.equals(this.configurations, boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, configurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsPayerAuthenticationConfigurationInformation {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
