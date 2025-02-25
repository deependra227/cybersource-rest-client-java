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
 * PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields
 */

public class PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields {
  @SerializedName("displayMerchantDefinedData1")
  private Boolean displayMerchantDefinedData1 = null;

  @SerializedName("displayMerchantDefinedData2")
  private Boolean displayMerchantDefinedData2 = null;

  @SerializedName("displayMerchantDefinedData3")
  private Boolean displayMerchantDefinedData3 = null;

  @SerializedName("displayMerchantDefinedData4")
  private Boolean displayMerchantDefinedData4 = null;

  @SerializedName("displayMerchantDefinedData5")
  private Boolean displayMerchantDefinedData5 = null;

  @SerializedName("merchantDefinedData1DefaultValue")
  private String merchantDefinedData1DefaultValue = null;

  @SerializedName("merchantDefinedData1Label")
  private String merchantDefinedData1Label = null;

  @SerializedName("requireMerchantDefinedData1")
  private Boolean requireMerchantDefinedData1 = null;

  @SerializedName("merchantDefinedData2DefaultValue")
  private String merchantDefinedData2DefaultValue = null;

  @SerializedName("merchantDefinedData2Label")
  private String merchantDefinedData2Label = null;

  @SerializedName("requireMerchantDefinedData2")
  private Boolean requireMerchantDefinedData2 = null;

  @SerializedName("merchantDefinedData3DefaultValue")
  private String merchantDefinedData3DefaultValue = null;

  @SerializedName("merchantDefinedData3Label")
  private String merchantDefinedData3Label = null;

  @SerializedName("requireMerchantDefinedData3")
  private Boolean requireMerchantDefinedData3 = null;

  @SerializedName("merchantDefinedData4DefaultValue")
  private String merchantDefinedData4DefaultValue = null;

  @SerializedName("merchantDefinedData4Label")
  private String merchantDefinedData4Label = null;

  @SerializedName("requireMerchantDefinedData4")
  private Boolean requireMerchantDefinedData4 = null;

  @SerializedName("merchantDefinedData5DefaultValue")
  private String merchantDefinedData5DefaultValue = null;

  @SerializedName("merchantDefinedData5Label")
  private String merchantDefinedData5Label = null;

  @SerializedName("requireMerchantDefinedData5")
  private Boolean requireMerchantDefinedData5 = null;

  @SerializedName("merchantDefinedData1DisplayOnReceipt")
  private Boolean merchantDefinedData1DisplayOnReceipt = null;

  @SerializedName("merchantDefinedData2DisplayOnReceipt")
  private Boolean merchantDefinedData2DisplayOnReceipt = null;

  @SerializedName("merchantDefinedData3DisplayOnReceipt")
  private Boolean merchantDefinedData3DisplayOnReceipt = null;

  @SerializedName("merchantDefinedData4DisplayOnReceipt")
  private Boolean merchantDefinedData4DisplayOnReceipt = null;

  @SerializedName("merchantDefinedData5DisplayOnReceipt")
  private Boolean merchantDefinedData5DisplayOnReceipt = null;

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields displayMerchantDefinedData1(Boolean displayMerchantDefinedData1) {
    this.displayMerchantDefinedData1 = displayMerchantDefinedData1;
    return this;
  }

   /**
   * Get displayMerchantDefinedData1
   * @return displayMerchantDefinedData1
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayMerchantDefinedData1() {
    return displayMerchantDefinedData1;
  }

  public void setDisplayMerchantDefinedData1(Boolean displayMerchantDefinedData1) {
    this.displayMerchantDefinedData1 = displayMerchantDefinedData1;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields displayMerchantDefinedData2(Boolean displayMerchantDefinedData2) {
    this.displayMerchantDefinedData2 = displayMerchantDefinedData2;
    return this;
  }

   /**
   * Get displayMerchantDefinedData2
   * @return displayMerchantDefinedData2
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayMerchantDefinedData2() {
    return displayMerchantDefinedData2;
  }

  public void setDisplayMerchantDefinedData2(Boolean displayMerchantDefinedData2) {
    this.displayMerchantDefinedData2 = displayMerchantDefinedData2;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields displayMerchantDefinedData3(Boolean displayMerchantDefinedData3) {
    this.displayMerchantDefinedData3 = displayMerchantDefinedData3;
    return this;
  }

   /**
   * Get displayMerchantDefinedData3
   * @return displayMerchantDefinedData3
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayMerchantDefinedData3() {
    return displayMerchantDefinedData3;
  }

  public void setDisplayMerchantDefinedData3(Boolean displayMerchantDefinedData3) {
    this.displayMerchantDefinedData3 = displayMerchantDefinedData3;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields displayMerchantDefinedData4(Boolean displayMerchantDefinedData4) {
    this.displayMerchantDefinedData4 = displayMerchantDefinedData4;
    return this;
  }

   /**
   * Get displayMerchantDefinedData4
   * @return displayMerchantDefinedData4
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayMerchantDefinedData4() {
    return displayMerchantDefinedData4;
  }

  public void setDisplayMerchantDefinedData4(Boolean displayMerchantDefinedData4) {
    this.displayMerchantDefinedData4 = displayMerchantDefinedData4;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields displayMerchantDefinedData5(Boolean displayMerchantDefinedData5) {
    this.displayMerchantDefinedData5 = displayMerchantDefinedData5;
    return this;
  }

   /**
   * Get displayMerchantDefinedData5
   * @return displayMerchantDefinedData5
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayMerchantDefinedData5() {
    return displayMerchantDefinedData5;
  }

  public void setDisplayMerchantDefinedData5(Boolean displayMerchantDefinedData5) {
    this.displayMerchantDefinedData5 = displayMerchantDefinedData5;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData1DefaultValue(String merchantDefinedData1DefaultValue) {
    this.merchantDefinedData1DefaultValue = merchantDefinedData1DefaultValue;
    return this;
  }

   /**
   * Get merchantDefinedData1DefaultValue
   * @return merchantDefinedData1DefaultValue
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData1DefaultValue() {
    return merchantDefinedData1DefaultValue;
  }

  public void setMerchantDefinedData1DefaultValue(String merchantDefinedData1DefaultValue) {
    this.merchantDefinedData1DefaultValue = merchantDefinedData1DefaultValue;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData1Label(String merchantDefinedData1Label) {
    this.merchantDefinedData1Label = merchantDefinedData1Label;
    return this;
  }

   /**
   * Get merchantDefinedData1Label
   * @return merchantDefinedData1Label
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData1Label() {
    return merchantDefinedData1Label;
  }

  public void setMerchantDefinedData1Label(String merchantDefinedData1Label) {
    this.merchantDefinedData1Label = merchantDefinedData1Label;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields requireMerchantDefinedData1(Boolean requireMerchantDefinedData1) {
    this.requireMerchantDefinedData1 = requireMerchantDefinedData1;
    return this;
  }

   /**
   * Get requireMerchantDefinedData1
   * @return requireMerchantDefinedData1
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequireMerchantDefinedData1() {
    return requireMerchantDefinedData1;
  }

  public void setRequireMerchantDefinedData1(Boolean requireMerchantDefinedData1) {
    this.requireMerchantDefinedData1 = requireMerchantDefinedData1;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData2DefaultValue(String merchantDefinedData2DefaultValue) {
    this.merchantDefinedData2DefaultValue = merchantDefinedData2DefaultValue;
    return this;
  }

   /**
   * Get merchantDefinedData2DefaultValue
   * @return merchantDefinedData2DefaultValue
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData2DefaultValue() {
    return merchantDefinedData2DefaultValue;
  }

  public void setMerchantDefinedData2DefaultValue(String merchantDefinedData2DefaultValue) {
    this.merchantDefinedData2DefaultValue = merchantDefinedData2DefaultValue;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData2Label(String merchantDefinedData2Label) {
    this.merchantDefinedData2Label = merchantDefinedData2Label;
    return this;
  }

   /**
   * Get merchantDefinedData2Label
   * @return merchantDefinedData2Label
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData2Label() {
    return merchantDefinedData2Label;
  }

  public void setMerchantDefinedData2Label(String merchantDefinedData2Label) {
    this.merchantDefinedData2Label = merchantDefinedData2Label;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields requireMerchantDefinedData2(Boolean requireMerchantDefinedData2) {
    this.requireMerchantDefinedData2 = requireMerchantDefinedData2;
    return this;
  }

   /**
   * Get requireMerchantDefinedData2
   * @return requireMerchantDefinedData2
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequireMerchantDefinedData2() {
    return requireMerchantDefinedData2;
  }

  public void setRequireMerchantDefinedData2(Boolean requireMerchantDefinedData2) {
    this.requireMerchantDefinedData2 = requireMerchantDefinedData2;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData3DefaultValue(String merchantDefinedData3DefaultValue) {
    this.merchantDefinedData3DefaultValue = merchantDefinedData3DefaultValue;
    return this;
  }

   /**
   * Get merchantDefinedData3DefaultValue
   * @return merchantDefinedData3DefaultValue
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData3DefaultValue() {
    return merchantDefinedData3DefaultValue;
  }

  public void setMerchantDefinedData3DefaultValue(String merchantDefinedData3DefaultValue) {
    this.merchantDefinedData3DefaultValue = merchantDefinedData3DefaultValue;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData3Label(String merchantDefinedData3Label) {
    this.merchantDefinedData3Label = merchantDefinedData3Label;
    return this;
  }

   /**
   * Get merchantDefinedData3Label
   * @return merchantDefinedData3Label
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData3Label() {
    return merchantDefinedData3Label;
  }

  public void setMerchantDefinedData3Label(String merchantDefinedData3Label) {
    this.merchantDefinedData3Label = merchantDefinedData3Label;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields requireMerchantDefinedData3(Boolean requireMerchantDefinedData3) {
    this.requireMerchantDefinedData3 = requireMerchantDefinedData3;
    return this;
  }

   /**
   * Get requireMerchantDefinedData3
   * @return requireMerchantDefinedData3
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequireMerchantDefinedData3() {
    return requireMerchantDefinedData3;
  }

  public void setRequireMerchantDefinedData3(Boolean requireMerchantDefinedData3) {
    this.requireMerchantDefinedData3 = requireMerchantDefinedData3;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData4DefaultValue(String merchantDefinedData4DefaultValue) {
    this.merchantDefinedData4DefaultValue = merchantDefinedData4DefaultValue;
    return this;
  }

   /**
   * Get merchantDefinedData4DefaultValue
   * @return merchantDefinedData4DefaultValue
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData4DefaultValue() {
    return merchantDefinedData4DefaultValue;
  }

  public void setMerchantDefinedData4DefaultValue(String merchantDefinedData4DefaultValue) {
    this.merchantDefinedData4DefaultValue = merchantDefinedData4DefaultValue;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData4Label(String merchantDefinedData4Label) {
    this.merchantDefinedData4Label = merchantDefinedData4Label;
    return this;
  }

   /**
   * Get merchantDefinedData4Label
   * @return merchantDefinedData4Label
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData4Label() {
    return merchantDefinedData4Label;
  }

  public void setMerchantDefinedData4Label(String merchantDefinedData4Label) {
    this.merchantDefinedData4Label = merchantDefinedData4Label;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields requireMerchantDefinedData4(Boolean requireMerchantDefinedData4) {
    this.requireMerchantDefinedData4 = requireMerchantDefinedData4;
    return this;
  }

   /**
   * Get requireMerchantDefinedData4
   * @return requireMerchantDefinedData4
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequireMerchantDefinedData4() {
    return requireMerchantDefinedData4;
  }

  public void setRequireMerchantDefinedData4(Boolean requireMerchantDefinedData4) {
    this.requireMerchantDefinedData4 = requireMerchantDefinedData4;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData5DefaultValue(String merchantDefinedData5DefaultValue) {
    this.merchantDefinedData5DefaultValue = merchantDefinedData5DefaultValue;
    return this;
  }

   /**
   * Get merchantDefinedData5DefaultValue
   * @return merchantDefinedData5DefaultValue
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData5DefaultValue() {
    return merchantDefinedData5DefaultValue;
  }

  public void setMerchantDefinedData5DefaultValue(String merchantDefinedData5DefaultValue) {
    this.merchantDefinedData5DefaultValue = merchantDefinedData5DefaultValue;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData5Label(String merchantDefinedData5Label) {
    this.merchantDefinedData5Label = merchantDefinedData5Label;
    return this;
  }

   /**
   * Get merchantDefinedData5Label
   * @return merchantDefinedData5Label
  **/
  @ApiModelProperty(value = "")
  public String getMerchantDefinedData5Label() {
    return merchantDefinedData5Label;
  }

  public void setMerchantDefinedData5Label(String merchantDefinedData5Label) {
    this.merchantDefinedData5Label = merchantDefinedData5Label;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields requireMerchantDefinedData5(Boolean requireMerchantDefinedData5) {
    this.requireMerchantDefinedData5 = requireMerchantDefinedData5;
    return this;
  }

   /**
   * Get requireMerchantDefinedData5
   * @return requireMerchantDefinedData5
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequireMerchantDefinedData5() {
    return requireMerchantDefinedData5;
  }

  public void setRequireMerchantDefinedData5(Boolean requireMerchantDefinedData5) {
    this.requireMerchantDefinedData5 = requireMerchantDefinedData5;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData1DisplayOnReceipt(Boolean merchantDefinedData1DisplayOnReceipt) {
    this.merchantDefinedData1DisplayOnReceipt = merchantDefinedData1DisplayOnReceipt;
    return this;
  }

   /**
   * Get merchantDefinedData1DisplayOnReceipt
   * @return merchantDefinedData1DisplayOnReceipt
  **/
  @ApiModelProperty(value = "")
  public Boolean getMerchantDefinedData1DisplayOnReceipt() {
    return merchantDefinedData1DisplayOnReceipt;
  }

  public void setMerchantDefinedData1DisplayOnReceipt(Boolean merchantDefinedData1DisplayOnReceipt) {
    this.merchantDefinedData1DisplayOnReceipt = merchantDefinedData1DisplayOnReceipt;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData2DisplayOnReceipt(Boolean merchantDefinedData2DisplayOnReceipt) {
    this.merchantDefinedData2DisplayOnReceipt = merchantDefinedData2DisplayOnReceipt;
    return this;
  }

   /**
   * Get merchantDefinedData2DisplayOnReceipt
   * @return merchantDefinedData2DisplayOnReceipt
  **/
  @ApiModelProperty(value = "")
  public Boolean getMerchantDefinedData2DisplayOnReceipt() {
    return merchantDefinedData2DisplayOnReceipt;
  }

  public void setMerchantDefinedData2DisplayOnReceipt(Boolean merchantDefinedData2DisplayOnReceipt) {
    this.merchantDefinedData2DisplayOnReceipt = merchantDefinedData2DisplayOnReceipt;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData3DisplayOnReceipt(Boolean merchantDefinedData3DisplayOnReceipt) {
    this.merchantDefinedData3DisplayOnReceipt = merchantDefinedData3DisplayOnReceipt;
    return this;
  }

   /**
   * Get merchantDefinedData3DisplayOnReceipt
   * @return merchantDefinedData3DisplayOnReceipt
  **/
  @ApiModelProperty(value = "")
  public Boolean getMerchantDefinedData3DisplayOnReceipt() {
    return merchantDefinedData3DisplayOnReceipt;
  }

  public void setMerchantDefinedData3DisplayOnReceipt(Boolean merchantDefinedData3DisplayOnReceipt) {
    this.merchantDefinedData3DisplayOnReceipt = merchantDefinedData3DisplayOnReceipt;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData4DisplayOnReceipt(Boolean merchantDefinedData4DisplayOnReceipt) {
    this.merchantDefinedData4DisplayOnReceipt = merchantDefinedData4DisplayOnReceipt;
    return this;
  }

   /**
   * Get merchantDefinedData4DisplayOnReceipt
   * @return merchantDefinedData4DisplayOnReceipt
  **/
  @ApiModelProperty(value = "")
  public Boolean getMerchantDefinedData4DisplayOnReceipt() {
    return merchantDefinedData4DisplayOnReceipt;
  }

  public void setMerchantDefinedData4DisplayOnReceipt(Boolean merchantDefinedData4DisplayOnReceipt) {
    this.merchantDefinedData4DisplayOnReceipt = merchantDefinedData4DisplayOnReceipt;
  }

  public PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields merchantDefinedData5DisplayOnReceipt(Boolean merchantDefinedData5DisplayOnReceipt) {
    this.merchantDefinedData5DisplayOnReceipt = merchantDefinedData5DisplayOnReceipt;
    return this;
  }

   /**
   * Get merchantDefinedData5DisplayOnReceipt
   * @return merchantDefinedData5DisplayOnReceipt
  **/
  @ApiModelProperty(value = "")
  public Boolean getMerchantDefinedData5DisplayOnReceipt() {
    return merchantDefinedData5DisplayOnReceipt;
  }

  public void setMerchantDefinedData5DisplayOnReceipt(Boolean merchantDefinedData5DisplayOnReceipt) {
    this.merchantDefinedData5DisplayOnReceipt = merchantDefinedData5DisplayOnReceipt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields = (PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields) o;
    return Objects.equals(this.displayMerchantDefinedData1, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.displayMerchantDefinedData1) &&
        Objects.equals(this.displayMerchantDefinedData2, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.displayMerchantDefinedData2) &&
        Objects.equals(this.displayMerchantDefinedData3, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.displayMerchantDefinedData3) &&
        Objects.equals(this.displayMerchantDefinedData4, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.displayMerchantDefinedData4) &&
        Objects.equals(this.displayMerchantDefinedData5, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.displayMerchantDefinedData5) &&
        Objects.equals(this.merchantDefinedData1DefaultValue, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData1DefaultValue) &&
        Objects.equals(this.merchantDefinedData1Label, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData1Label) &&
        Objects.equals(this.requireMerchantDefinedData1, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.requireMerchantDefinedData1) &&
        Objects.equals(this.merchantDefinedData2DefaultValue, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData2DefaultValue) &&
        Objects.equals(this.merchantDefinedData2Label, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData2Label) &&
        Objects.equals(this.requireMerchantDefinedData2, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.requireMerchantDefinedData2) &&
        Objects.equals(this.merchantDefinedData3DefaultValue, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData3DefaultValue) &&
        Objects.equals(this.merchantDefinedData3Label, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData3Label) &&
        Objects.equals(this.requireMerchantDefinedData3, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.requireMerchantDefinedData3) &&
        Objects.equals(this.merchantDefinedData4DefaultValue, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData4DefaultValue) &&
        Objects.equals(this.merchantDefinedData4Label, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData4Label) &&
        Objects.equals(this.requireMerchantDefinedData4, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.requireMerchantDefinedData4) &&
        Objects.equals(this.merchantDefinedData5DefaultValue, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData5DefaultValue) &&
        Objects.equals(this.merchantDefinedData5Label, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData5Label) &&
        Objects.equals(this.requireMerchantDefinedData5, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.requireMerchantDefinedData5) &&
        Objects.equals(this.merchantDefinedData1DisplayOnReceipt, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData1DisplayOnReceipt) &&
        Objects.equals(this.merchantDefinedData2DisplayOnReceipt, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData2DisplayOnReceipt) &&
        Objects.equals(this.merchantDefinedData3DisplayOnReceipt, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData3DisplayOnReceipt) &&
        Objects.equals(this.merchantDefinedData4DisplayOnReceipt, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData4DisplayOnReceipt) &&
        Objects.equals(this.merchantDefinedData5DisplayOnReceipt, paymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields.merchantDefinedData5DisplayOnReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayMerchantDefinedData1, displayMerchantDefinedData2, displayMerchantDefinedData3, displayMerchantDefinedData4, displayMerchantDefinedData5, merchantDefinedData1DefaultValue, merchantDefinedData1Label, requireMerchantDefinedData1, merchantDefinedData2DefaultValue, merchantDefinedData2Label, requireMerchantDefinedData2, merchantDefinedData3DefaultValue, merchantDefinedData3Label, requireMerchantDefinedData3, merchantDefinedData4DefaultValue, merchantDefinedData4Label, requireMerchantDefinedData4, merchantDefinedData5DefaultValue, merchantDefinedData5Label, requireMerchantDefinedData5, merchantDefinedData1DisplayOnReceipt, merchantDefinedData2DisplayOnReceipt, merchantDefinedData3DisplayOnReceipt, merchantDefinedData4DisplayOnReceipt, merchantDefinedData5DisplayOnReceipt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationMerchantDefinedDataFields {\n");
    
    sb.append("    displayMerchantDefinedData1: ").append(toIndentedString(displayMerchantDefinedData1)).append("\n");
    sb.append("    displayMerchantDefinedData2: ").append(toIndentedString(displayMerchantDefinedData2)).append("\n");
    sb.append("    displayMerchantDefinedData3: ").append(toIndentedString(displayMerchantDefinedData3)).append("\n");
    sb.append("    displayMerchantDefinedData4: ").append(toIndentedString(displayMerchantDefinedData4)).append("\n");
    sb.append("    displayMerchantDefinedData5: ").append(toIndentedString(displayMerchantDefinedData5)).append("\n");
    sb.append("    merchantDefinedData1DefaultValue: ").append(toIndentedString(merchantDefinedData1DefaultValue)).append("\n");
    sb.append("    merchantDefinedData1Label: ").append(toIndentedString(merchantDefinedData1Label)).append("\n");
    sb.append("    requireMerchantDefinedData1: ").append(toIndentedString(requireMerchantDefinedData1)).append("\n");
    sb.append("    merchantDefinedData2DefaultValue: ").append(toIndentedString(merchantDefinedData2DefaultValue)).append("\n");
    sb.append("    merchantDefinedData2Label: ").append(toIndentedString(merchantDefinedData2Label)).append("\n");
    sb.append("    requireMerchantDefinedData2: ").append(toIndentedString(requireMerchantDefinedData2)).append("\n");
    sb.append("    merchantDefinedData3DefaultValue: ").append(toIndentedString(merchantDefinedData3DefaultValue)).append("\n");
    sb.append("    merchantDefinedData3Label: ").append(toIndentedString(merchantDefinedData3Label)).append("\n");
    sb.append("    requireMerchantDefinedData3: ").append(toIndentedString(requireMerchantDefinedData3)).append("\n");
    sb.append("    merchantDefinedData4DefaultValue: ").append(toIndentedString(merchantDefinedData4DefaultValue)).append("\n");
    sb.append("    merchantDefinedData4Label: ").append(toIndentedString(merchantDefinedData4Label)).append("\n");
    sb.append("    requireMerchantDefinedData4: ").append(toIndentedString(requireMerchantDefinedData4)).append("\n");
    sb.append("    merchantDefinedData5DefaultValue: ").append(toIndentedString(merchantDefinedData5DefaultValue)).append("\n");
    sb.append("    merchantDefinedData5Label: ").append(toIndentedString(merchantDefinedData5Label)).append("\n");
    sb.append("    requireMerchantDefinedData5: ").append(toIndentedString(requireMerchantDefinedData5)).append("\n");
    sb.append("    merchantDefinedData1DisplayOnReceipt: ").append(toIndentedString(merchantDefinedData1DisplayOnReceipt)).append("\n");
    sb.append("    merchantDefinedData2DisplayOnReceipt: ").append(toIndentedString(merchantDefinedData2DisplayOnReceipt)).append("\n");
    sb.append("    merchantDefinedData3DisplayOnReceipt: ").append(toIndentedString(merchantDefinedData3DisplayOnReceipt)).append("\n");
    sb.append("    merchantDefinedData4DisplayOnReceipt: ").append(toIndentedString(merchantDefinedData4DisplayOnReceipt)).append("\n");
    sb.append("    merchantDefinedData5DisplayOnReceipt: ").append(toIndentedString(merchantDefinedData5DisplayOnReceipt)).append("\n");
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

