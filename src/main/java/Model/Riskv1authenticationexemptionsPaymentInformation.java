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
import Model.Riskv1authenticationexemptionsPaymentInformationCard;
import Model.Riskv1authenticationexemptionsPaymentInformationFluidData;
import Model.Riskv1authenticationexemptionsPaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationexemptionsPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class Riskv1authenticationexemptionsPaymentInformation {
  @SerializedName("card")
  private Riskv1authenticationexemptionsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Riskv1authenticationexemptionsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private Riskv1authenticationexemptionsPaymentInformationFluidData fluidData = null;

  public Riskv1authenticationexemptionsPaymentInformation card(Riskv1authenticationexemptionsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationexemptionsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1authenticationexemptionsPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1authenticationexemptionsPaymentInformation tokenizedCard(Riskv1authenticationexemptionsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationexemptionsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Riskv1authenticationexemptionsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Riskv1authenticationexemptionsPaymentInformation fluidData(Riskv1authenticationexemptionsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
    return this;
  }

   /**
   * Get fluidData
   * @return fluidData
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationexemptionsPaymentInformationFluidData getFluidData() {
    return fluidData;
  }

  public void setFluidData(Riskv1authenticationexemptionsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationexemptionsPaymentInformation riskv1authenticationexemptionsPaymentInformation = (Riskv1authenticationexemptionsPaymentInformation) o;
    return Objects.equals(this.card, riskv1authenticationexemptionsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, riskv1authenticationexemptionsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, riskv1authenticationexemptionsPaymentInformation.fluidData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, fluidData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationexemptionsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    fluidData: ").append(toIndentedString(fluidData)).append("\n");
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
