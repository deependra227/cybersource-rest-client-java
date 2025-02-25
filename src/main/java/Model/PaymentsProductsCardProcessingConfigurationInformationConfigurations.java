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
import Model.PaymentsProductsCardProcessingConfigurationInformationConfigurationsCommon;
import Model.PaymentsProductsCardProcessingConfigurationInformationConfigurationsFeatures;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsProductsCardProcessingConfigurationInformationConfigurations
 */

public class PaymentsProductsCardProcessingConfigurationInformationConfigurations {
  @SerializedName("common")
  private PaymentsProductsCardProcessingConfigurationInformationConfigurationsCommon common = null;

  @SerializedName("features")
  private PaymentsProductsCardProcessingConfigurationInformationConfigurationsFeatures features = null;

  public PaymentsProductsCardProcessingConfigurationInformationConfigurations common(PaymentsProductsCardProcessingConfigurationInformationConfigurationsCommon common) {
    this.common = common;
    return this;
  }

   /**
   * Get common
   * @return common
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsCardProcessingConfigurationInformationConfigurationsCommon getCommon() {
    return common;
  }

  public void setCommon(PaymentsProductsCardProcessingConfigurationInformationConfigurationsCommon common) {
    this.common = common;
  }

  public PaymentsProductsCardProcessingConfigurationInformationConfigurations features(PaymentsProductsCardProcessingConfigurationInformationConfigurationsFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsCardProcessingConfigurationInformationConfigurationsFeatures getFeatures() {
    return features;
  }

  public void setFeatures(PaymentsProductsCardProcessingConfigurationInformationConfigurationsFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsCardProcessingConfigurationInformationConfigurations paymentsProductsCardProcessingConfigurationInformationConfigurations = (PaymentsProductsCardProcessingConfigurationInformationConfigurations) o;
    return Objects.equals(this.common, paymentsProductsCardProcessingConfigurationInformationConfigurations.common) &&
        Objects.equals(this.features, paymentsProductsCardProcessingConfigurationInformationConfigurations.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(common, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsCardProcessingConfigurationInformationConfigurations {\n");
    
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

