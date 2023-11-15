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
 * GetAllSubscriptionsResponsePlanInformationBillingCycles
 */

public class GetAllSubscriptionsResponsePlanInformationBillingCycles {
  @SerializedName("total")
  private String total = null;

  @SerializedName("current")
  private String current = null;

  public GetAllSubscriptionsResponsePlanInformationBillingCycles total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Describe total number of billing cycles 
   * @return total
  **/
  @ApiModelProperty(value = "Describe total number of billing cycles ")
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

  public GetAllSubscriptionsResponsePlanInformationBillingCycles current(String current) {
    this.current = current;
    return this;
  }

   /**
   * Current billing cycle 
   * @return current
  **/
  @ApiModelProperty(value = "Current billing cycle ")
  public String getCurrent() {
    return current;
  }

  public void setCurrent(String current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllSubscriptionsResponsePlanInformationBillingCycles getAllSubscriptionsResponsePlanInformationBillingCycles = (GetAllSubscriptionsResponsePlanInformationBillingCycles) o;
    return Objects.equals(this.total, getAllSubscriptionsResponsePlanInformationBillingCycles.total) &&
        Objects.equals(this.current, getAllSubscriptionsResponsePlanInformationBillingCycles.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, current);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllSubscriptionsResponsePlanInformationBillingCycles {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
