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
import Model.TmsV1InstrumentIdentifiersPost200ResponseCard;
import Model.TmsV1InstrumentIdentifiersPost200ResponseIssuer;
import Model.TmsV1InstrumentIdentifiersPost200ResponseLinks;
import Model.TmsV1InstrumentIdentifiersPost200ResponseMetadata;
import Model.TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation;
import Model.TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard;
import Model.Tmsv1instrumentidentifiersBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EmbeddedInstrumentIdentifierResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class EmbeddedInstrumentIdentifierResponse {
  @SerializedName("_links")
  private TmsV1InstrumentIdentifiersPost200ResponseLinks links = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPost200ResponseCard card = null;

  @SerializedName("tokenizedCard")
  private TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard = null;

  @SerializedName("bankAccount")
  private Tmsv1instrumentidentifiersBankAccount bankAccount = null;

  @SerializedName("issuer")
  private TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer = null;

  @SerializedName("processingInformation")
  private TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation = null;

  @SerializedName("metadata")
  private TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata = null;

  public EmbeddedInstrumentIdentifierResponse links(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
  }

   /**
   * &#39;Describes type of token.&#39;  Valid values: - instrumentIdentifier 
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "'Describes type of token.'  Valid values: - instrumentIdentifier ")
  public String getObject() {
    return object;
  }

   /**
   * &#39;Current state of the token.&#39;  Valid values: - ACTIVE - CLOSED 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "'Current state of the token.'  Valid values: - ACTIVE - CLOSED ")
  public String getState() {
    return state;
  }

  public EmbeddedInstrumentIdentifierResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the existing instrument identifier to be linked to the newly created payment instrument.
   * @return id
  **/
  @ApiModelProperty(example = "1234567890123456789", value = "The ID of the existing instrument identifier to be linked to the newly created payment instrument.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmbeddedInstrumentIdentifierResponse card(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
  }

  public EmbeddedInstrumentIdentifierResponse tokenizedCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public EmbeddedInstrumentIdentifierResponse bankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public EmbeddedInstrumentIdentifierResponse issuer(TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer) {
    this.issuer = issuer;
  }

  public EmbeddedInstrumentIdentifierResponse processingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public EmbeddedInstrumentIdentifierResponse metadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedInstrumentIdentifierResponse embeddedInstrumentIdentifierResponse = (EmbeddedInstrumentIdentifierResponse) o;
    return Objects.equals(this.links, embeddedInstrumentIdentifierResponse.links) &&
        Objects.equals(this.object, embeddedInstrumentIdentifierResponse.object) &&
        Objects.equals(this.state, embeddedInstrumentIdentifierResponse.state) &&
        Objects.equals(this.id, embeddedInstrumentIdentifierResponse.id) &&
        Objects.equals(this.card, embeddedInstrumentIdentifierResponse.card) &&
        Objects.equals(this.tokenizedCard, embeddedInstrumentIdentifierResponse.tokenizedCard) &&
        Objects.equals(this.bankAccount, embeddedInstrumentIdentifierResponse.bankAccount) &&
        Objects.equals(this.issuer, embeddedInstrumentIdentifierResponse.issuer) &&
        Objects.equals(this.processingInformation, embeddedInstrumentIdentifierResponse.processingInformation) &&
        Objects.equals(this.metadata, embeddedInstrumentIdentifierResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, object, state, id, card, tokenizedCard, bankAccount, issuer, processingInformation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedInstrumentIdentifierResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
