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
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsOrganization;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsPortfolioControls;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdparty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations
 */

public class Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations {
  @SerializedName("processingOptions")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions processingOptions = null;

  @SerializedName("organization")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsOrganization organization = null;

  @SerializedName("portfolioControls")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsPortfolioControls portfolioControls = null;

  @SerializedName("thirdparty")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdparty thirdparty = null;

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations processingOptions(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions processingOptions) {
    this.processingOptions = processingOptions;
    return this;
  }

   /**
   * Get processingOptions
   * @return processingOptions
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions getProcessingOptions() {
    return processingOptions;
  }

  public void setProcessingOptions(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions processingOptions) {
    this.processingOptions = processingOptions;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations organization(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsOrganization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsOrganization getOrganization() {
    return organization;
  }

  public void setOrganization(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsOrganization organization) {
    this.organization = organization;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations portfolioControls(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsPortfolioControls portfolioControls) {
    this.portfolioControls = portfolioControls;
    return this;
  }

   /**
   * Get portfolioControls
   * @return portfolioControls
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsPortfolioControls getPortfolioControls() {
    return portfolioControls;
  }

  public void setPortfolioControls(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsPortfolioControls portfolioControls) {
    this.portfolioControls = portfolioControls;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations thirdparty(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdparty thirdparty) {
    this.thirdparty = thirdparty;
    return this;
  }

   /**
   * Get thirdparty
   * @return thirdparty
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdparty getThirdparty() {
    return thirdparty;
  }

  public void setThirdparty(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdparty thirdparty) {
    this.thirdparty = thirdparty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations = (Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations) o;
    return Objects.equals(this.processingOptions, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations.processingOptions) &&
        Objects.equals(this.organization, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations.organization) &&
        Objects.equals(this.portfolioControls, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations.portfolioControls) &&
        Objects.equals(this.thirdparty, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations.thirdparty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingOptions, organization, portfolioControls, thirdparty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurations {\n");
    
    sb.append("    processingOptions: ").append(toIndentedString(processingOptions)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    portfolioControls: ").append(toIndentedString(portfolioControls)).append("\n");
    sb.append("    thirdparty: ").append(toIndentedString(thirdparty)).append("\n");
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
