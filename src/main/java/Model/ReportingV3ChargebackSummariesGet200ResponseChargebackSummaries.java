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
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries
 */

public class ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries {
  @SerializedName("count")
  private BigDecimal count = null;

  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("accountId")
  private String accountId = null;

  public ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Chargeback summary list count
   * @return count
  **/
  @ApiModelProperty(example = "8.0", value = "Chargeback summary list count")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Summary Date
   * @return time
  **/
  @ApiModelProperty(example = "2018-01-04T11:33:06.000-0800", value = "Summary Date")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Account Id
   * @return accountId
  **/
  @ApiModelProperty(example = "testrest_acct", value = "Account Id")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries reportingV3ChargebackSummariesGet200ResponseChargebackSummaries = (ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries) o;
    return Objects.equals(this.count, reportingV3ChargebackSummariesGet200ResponseChargebackSummaries.count) &&
        Objects.equals(this.time, reportingV3ChargebackSummariesGet200ResponseChargebackSummaries.time) &&
        Objects.equals(this.accountId, reportingV3ChargebackSummariesGet200ResponseChargebackSummaries.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, time, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

