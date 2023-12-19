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
import Model.PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesCB;
import Model.PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure;
import Model.PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes
 */

public class PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes {
  @SerializedName("verifiedByVisa")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa verifiedByVisa = null;

  @SerializedName("masterCardSecureCode")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa masterCardSecureCode = null;

  @SerializedName("amexSafeKey")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa amexSafeKey = null;

  @SerializedName("jCBJSecure")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure jCBJSecure = null;

  @SerializedName("dinersClubInternationalProtectBuy")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa dinersClubInternationalProtectBuy = null;

  @SerializedName("ELO")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa ELO = null;

  @SerializedName("UPI")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa UPI = null;

  @SerializedName("CB")
  private PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesCB CB = null;

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes verifiedByVisa(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa verifiedByVisa) {
    this.verifiedByVisa = verifiedByVisa;
    return this;
  }

   /**
   * Get verifiedByVisa
   * @return verifiedByVisa
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa getVerifiedByVisa() {
    return verifiedByVisa;
  }

  public void setVerifiedByVisa(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa verifiedByVisa) {
    this.verifiedByVisa = verifiedByVisa;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes masterCardSecureCode(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa masterCardSecureCode) {
    this.masterCardSecureCode = masterCardSecureCode;
    return this;
  }

   /**
   * Get masterCardSecureCode
   * @return masterCardSecureCode
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa getMasterCardSecureCode() {
    return masterCardSecureCode;
  }

  public void setMasterCardSecureCode(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa masterCardSecureCode) {
    this.masterCardSecureCode = masterCardSecureCode;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes amexSafeKey(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa amexSafeKey) {
    this.amexSafeKey = amexSafeKey;
    return this;
  }

   /**
   * Get amexSafeKey
   * @return amexSafeKey
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa getAmexSafeKey() {
    return amexSafeKey;
  }

  public void setAmexSafeKey(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa amexSafeKey) {
    this.amexSafeKey = amexSafeKey;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes jCBJSecure(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure jCBJSecure) {
    this.jCBJSecure = jCBJSecure;
    return this;
  }

   /**
   * Get jCBJSecure
   * @return jCBJSecure
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure getJCBJSecure() {
    return jCBJSecure;
  }

  public void setJCBJSecure(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure jCBJSecure) {
    this.jCBJSecure = jCBJSecure;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes dinersClubInternationalProtectBuy(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa dinersClubInternationalProtectBuy) {
    this.dinersClubInternationalProtectBuy = dinersClubInternationalProtectBuy;
    return this;
  }

   /**
   * Get dinersClubInternationalProtectBuy
   * @return dinersClubInternationalProtectBuy
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa getDinersClubInternationalProtectBuy() {
    return dinersClubInternationalProtectBuy;
  }

  public void setDinersClubInternationalProtectBuy(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa dinersClubInternationalProtectBuy) {
    this.dinersClubInternationalProtectBuy = dinersClubInternationalProtectBuy;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes ELO(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa ELO) {
    this.ELO = ELO;
    return this;
  }

   /**
   * Get ELO
   * @return ELO
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa getELO() {
    return ELO;
  }

  public void setELO(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa ELO) {
    this.ELO = ELO;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes UPI(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa UPI) {
    this.UPI = UPI;
    return this;
  }

   /**
   * Get UPI
   * @return UPI
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa getUPI() {
    return UPI;
  }

  public void setUPI(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisa UPI) {
    this.UPI = UPI;
  }

  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes CB(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesCB CB) {
    this.CB = CB;
    return this;
  }

   /**
   * Get CB
   * @return CB
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesCB getCB() {
    return CB;
  }

  public void setCB(PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesCB CB) {
    this.CB = CB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes = (PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes) o;
    return Objects.equals(this.verifiedByVisa, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.verifiedByVisa) &&
        Objects.equals(this.masterCardSecureCode, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.masterCardSecureCode) &&
        Objects.equals(this.amexSafeKey, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.amexSafeKey) &&
        Objects.equals(this.jCBJSecure, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.jCBJSecure) &&
        Objects.equals(this.dinersClubInternationalProtectBuy, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.dinersClubInternationalProtectBuy) &&
        Objects.equals(this.ELO, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.ELO) &&
        Objects.equals(this.UPI, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.UPI) &&
        Objects.equals(this.CB, paymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes.CB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifiedByVisa, masterCardSecureCode, amexSafeKey, jCBJSecure, dinersClubInternationalProtectBuy, ELO, UPI, CB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypes {\n");
    
    sb.append("    verifiedByVisa: ").append(toIndentedString(verifiedByVisa)).append("\n");
    sb.append("    masterCardSecureCode: ").append(toIndentedString(masterCardSecureCode)).append("\n");
    sb.append("    amexSafeKey: ").append(toIndentedString(amexSafeKey)).append("\n");
    sb.append("    jCBJSecure: ").append(toIndentedString(jCBJSecure)).append("\n");
    sb.append("    dinersClubInternationalProtectBuy: ").append(toIndentedString(dinersClubInternationalProtectBuy)).append("\n");
    sb.append("    ELO: ").append(toIndentedString(ELO)).append("\n");
    sb.append("    UPI: ").append(toIndentedString(UPI)).append("\n");
    sb.append("    CB: ").append(toIndentedString(CB)).append("\n");
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
