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
import Model.Ptsv2paymentsidrefundsPaymentInformationPaymentTypeMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2refreshpaymentstatusidPaymentInformationPaymentType
 */

public class Ptsv2refreshpaymentstatusidPaymentInformationPaymentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("method")
  private Ptsv2paymentsidrefundsPaymentInformationPaymentTypeMethod method = null;

  public Ptsv2refreshpaymentstatusidPaymentInformationPaymentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. Possible values: - &#x60;CARD&#x60; (use this for a PIN debit transaction) - &#x60;CHECK&#x60; (use this for all eCheck payment transactions - ECP Debit, ECP Follow-on Credit, ECP StandAlone Credit) - &#x60;bankTransfer&#x60; (use for Online Bank Transafer for methods such as P24, iDeal, Estonia Bank, KCP) - &#x60;localCard&#x60; (KCP Local card via Altpay) - &#x60;carrierBilling&#x60; (KCP Carrier Billing via Altpay) 
   * @return name
  **/
  @ApiModelProperty(value = "A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. Possible values: - `CARD` (use this for a PIN debit transaction) - `CHECK` (use this for all eCheck payment transactions - ECP Debit, ECP Follow-on Credit, ECP StandAlone Credit) - `bankTransfer` (use for Online Bank Transafer for methods such as P24, iDeal, Estonia Bank, KCP) - `localCard` (KCP Local card via Altpay) - `carrierBilling` (KCP Carrier Billing via Altpay) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2refreshpaymentstatusidPaymentInformationPaymentType method(Ptsv2paymentsidrefundsPaymentInformationPaymentTypeMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsPaymentInformationPaymentTypeMethod getMethod() {
    return method;
  }

  public void setMethod(Ptsv2paymentsidrefundsPaymentInformationPaymentTypeMethod method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2refreshpaymentstatusidPaymentInformationPaymentType ptsv2refreshpaymentstatusidPaymentInformationPaymentType = (Ptsv2refreshpaymentstatusidPaymentInformationPaymentType) o;
    return Objects.equals(this.name, ptsv2refreshpaymentstatusidPaymentInformationPaymentType.name) &&
        Objects.equals(this.method, ptsv2refreshpaymentstatusidPaymentInformationPaymentType.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2refreshpaymentstatusidPaymentInformationPaymentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

