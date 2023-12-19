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
import Model.RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifydCredentials;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd
 */

public class RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("credentials")
  private RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifydCredentials credentials = null;

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd credentials(RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifydCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifydCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifydCredentials credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd = (RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd) o;
    return Objects.equals(this.enabled, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd.enabled) &&
        Objects.equals(this.credentials, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
