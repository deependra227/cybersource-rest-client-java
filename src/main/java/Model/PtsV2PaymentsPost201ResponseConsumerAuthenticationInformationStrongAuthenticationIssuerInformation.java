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
 * PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation
 */

public class PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation {
  @SerializedName("riskAnalysisExemptionResult")
  private String riskAnalysisExemptionResult = null;

  @SerializedName("trustedMerchantExemptionResult")
  private String trustedMerchantExemptionResult = null;

  @SerializedName("lowValueExemptionResult")
  private String lowValueExemptionResult = null;

  @SerializedName("secureCorporatePaymentResult")
  private String secureCorporatePaymentResult = null;

  @SerializedName("transactionRiskAnalysisExemptionResult")
  private String transactionRiskAnalysisExemptionResult = null;

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation riskAnalysisExemptionResult(String riskAnalysisExemptionResult) {
    this.riskAnalysisExemptionResult = riskAnalysisExemptionResult;
    return this;
  }

   /**
   * Possible values: Visa Platform Connect - &#x60;8401&#x60; Merchant not participating in Visa Trusted Listing Program. - &#x60;8402&#x60; Issuer not participating in Visa Trusted Listing Program. - &#x60;8403&#x60; Cardholder has not trusted the merchant (supplied by Visa Net). - &#x60;8404&#x60; Indeterminate or invalid issuer response. - &#x60;8473&#x60; Cardholder has not trusted the merchant (issuer-supplied). - &#x60;8474&#x60; Did not meet the exemption criteria (issuer-supplied).  Upto 20 Values may be received in a transaction. 
   * @return riskAnalysisExemptionResult
  **/
  @ApiModelProperty(value = "Possible values: Visa Platform Connect - `8401` Merchant not participating in Visa Trusted Listing Program. - `8402` Issuer not participating in Visa Trusted Listing Program. - `8403` Cardholder has not trusted the merchant (supplied by Visa Net). - `8404` Indeterminate or invalid issuer response. - `8473` Cardholder has not trusted the merchant (issuer-supplied). - `8474` Did not meet the exemption criteria (issuer-supplied).  Upto 20 Values may be received in a transaction. ")
  public String getRiskAnalysisExemptionResult() {
    return riskAnalysisExemptionResult;
  }

  public void setRiskAnalysisExemptionResult(String riskAnalysisExemptionResult) {
    this.riskAnalysisExemptionResult = riskAnalysisExemptionResult;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation trustedMerchantExemptionResult(String trustedMerchantExemptionResult) {
    this.trustedMerchantExemptionResult = trustedMerchantExemptionResult;
    return this;
  }

   /**
   * Possible values: Visa Platform Connect - &#x60;2&#x60; Trusted merchant exemption validated/honored. - &#x60;3&#x60; Trusted merchant exemption failed validation/not honored. 
   * @return trustedMerchantExemptionResult
  **/
  @ApiModelProperty(value = "Possible values: Visa Platform Connect - `2` Trusted merchant exemption validated/honored. - `3` Trusted merchant exemption failed validation/not honored. ")
  public String getTrustedMerchantExemptionResult() {
    return trustedMerchantExemptionResult;
  }

  public void setTrustedMerchantExemptionResult(String trustedMerchantExemptionResult) {
    this.trustedMerchantExemptionResult = trustedMerchantExemptionResult;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation lowValueExemptionResult(String lowValueExemptionResult) {
    this.lowValueExemptionResult = lowValueExemptionResult;
    return this;
  }

   /**
   * This will be the value returned by Visanet when low value exemption has been requested.  Valid values: Visa Platform Connect - &#x60;2&#x60; Low value exemption validated/honored - &#x60;3&#x60; Low value exemption failed validation/not honored 
   * @return lowValueExemptionResult
  **/
  @ApiModelProperty(value = "This will be the value returned by Visanet when low value exemption has been requested.  Valid values: Visa Platform Connect - `2` Low value exemption validated/honored - `3` Low value exemption failed validation/not honored ")
  public String getLowValueExemptionResult() {
    return lowValueExemptionResult;
  }

  public void setLowValueExemptionResult(String lowValueExemptionResult) {
    this.lowValueExemptionResult = lowValueExemptionResult;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation secureCorporatePaymentResult(String secureCorporatePaymentResult) {
    this.secureCorporatePaymentResult = secureCorporatePaymentResult;
    return this;
  }

   /**
   * This will be the value returned by Visanet when secure corporate payment (scp) exemption has been requested.  Valid values: Visa Platform Connect - &#x60;2&#x60; Secure corporate payment exemption validated/honored - &#x60;3&#x60; Secure corporate payment exemption failed validation/not honored 
   * @return secureCorporatePaymentResult
  **/
  @ApiModelProperty(value = "This will be the value returned by Visanet when secure corporate payment (scp) exemption has been requested.  Valid values: Visa Platform Connect - `2` Secure corporate payment exemption validated/honored - `3` Secure corporate payment exemption failed validation/not honored ")
  public String getSecureCorporatePaymentResult() {
    return secureCorporatePaymentResult;
  }

  public void setSecureCorporatePaymentResult(String secureCorporatePaymentResult) {
    this.secureCorporatePaymentResult = secureCorporatePaymentResult;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation transactionRiskAnalysisExemptionResult(String transactionRiskAnalysisExemptionResult) {
    this.transactionRiskAnalysisExemptionResult = transactionRiskAnalysisExemptionResult;
    return this;
  }

   /**
   * This will be the value returned by Visanet when transaction risk analysis (TRA) exemption has been requested.    Valid values: Visa Platform Connect   - &#x60;2&#x60; transaction risk analysis (TRA) exemption validated/honored   - &#x60;3&#x60; transaction risk analysis (TRA) exemption failed validation/not honored 
   * @return transactionRiskAnalysisExemptionResult
  **/
  @ApiModelProperty(value = "This will be the value returned by Visanet when transaction risk analysis (TRA) exemption has been requested.    Valid values: Visa Platform Connect   - `2` transaction risk analysis (TRA) exemption validated/honored   - `3` transaction risk analysis (TRA) exemption failed validation/not honored ")
  public String getTransactionRiskAnalysisExemptionResult() {
    return transactionRiskAnalysisExemptionResult;
  }

  public void setTransactionRiskAnalysisExemptionResult(String transactionRiskAnalysisExemptionResult) {
    this.transactionRiskAnalysisExemptionResult = transactionRiskAnalysisExemptionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation = (PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation) o;
    return Objects.equals(this.riskAnalysisExemptionResult, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation.riskAnalysisExemptionResult) &&
        Objects.equals(this.trustedMerchantExemptionResult, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation.trustedMerchantExemptionResult) &&
        Objects.equals(this.lowValueExemptionResult, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation.lowValueExemptionResult) &&
        Objects.equals(this.secureCorporatePaymentResult, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation.secureCorporatePaymentResult) &&
        Objects.equals(this.transactionRiskAnalysisExemptionResult, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation.transactionRiskAnalysisExemptionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskAnalysisExemptionResult, trustedMerchantExemptionResult, lowValueExemptionResult, secureCorporatePaymentResult, transactionRiskAnalysisExemptionResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationStrongAuthenticationIssuerInformation {\n");
    
    sb.append("    riskAnalysisExemptionResult: ").append(toIndentedString(riskAnalysisExemptionResult)).append("\n");
    sb.append("    trustedMerchantExemptionResult: ").append(toIndentedString(trustedMerchantExemptionResult)).append("\n");
    sb.append("    lowValueExemptionResult: ").append(toIndentedString(lowValueExemptionResult)).append("\n");
    sb.append("    secureCorporatePaymentResult: ").append(toIndentedString(secureCorporatePaymentResult)).append("\n");
    sb.append("    transactionRiskAnalysisExemptionResult: ").append(toIndentedString(transactionRiskAnalysisExemptionResult)).append("\n");
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

