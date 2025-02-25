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
import Model.GetAllPlansResponseLinks;
import Model.GetAllPlansResponsePlans;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAllPlansResponse
 */

public class GetAllPlansResponse {
  @SerializedName("_links")
  private GetAllPlansResponseLinks links = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("plans")
  private List<GetAllPlansResponsePlans> plans = null;

  public GetAllPlansResponse links(GetAllPlansResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public GetAllPlansResponseLinks getLinks() {
    return links;
  }

  public void setLinks(GetAllPlansResponseLinks links) {
    this.links = links;
  }

  public GetAllPlansResponse submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public GetAllPlansResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * total number of plans created
   * @return totalCount
  **/
  @ApiModelProperty(value = "total number of plans created")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public GetAllPlansResponse plans(List<GetAllPlansResponsePlans> plans) {
    this.plans = plans;
    return this;
  }

  public GetAllPlansResponse addPlansItem(GetAllPlansResponsePlans plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<GetAllPlansResponsePlans>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @ApiModelProperty(value = "")
  public List<GetAllPlansResponsePlans> getPlans() {
    return plans;
  }

  public void setPlans(List<GetAllPlansResponsePlans> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllPlansResponse getAllPlansResponse = (GetAllPlansResponse) o;
    return Objects.equals(this.links, getAllPlansResponse.links) &&
        Objects.equals(this.submitTimeUtc, getAllPlansResponse.submitTimeUtc) &&
        Objects.equals(this.totalCount, getAllPlansResponse.totalCount) &&
        Objects.equals(this.plans, getAllPlansResponse.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, submitTimeUtc, totalCount, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllPlansResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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

