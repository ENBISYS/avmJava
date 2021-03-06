/*
 * AVM
 * This is api for AVM (automated valuation machine)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@enbisys.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.enbisys.avm.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * ValuationPriceDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-12T12:39:15.489+07:00[Asia/Novosibirsk]")
public class ValuationPriceDistribution {
  public static final String SERIALIZED_NAME_PRICE_FROM = "priceFrom";
  @SerializedName(SERIALIZED_NAME_PRICE_FROM)
  private Integer priceFrom;

  public static final String SERIALIZED_NAME_PRICE_TO = "priceTo";
  @SerializedName(SERIALIZED_NAME_PRICE_TO)
  private Integer priceTo;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability = null;

  public ValuationPriceDistribution priceFrom(Integer priceFrom) {
    this.priceFrom = priceFrom;
    return this;
  }

   /**
   * left subrange boundary
   * @return priceFrom
  **/
  @ApiModelProperty(example = "230000", value = "left subrange boundary")
  public Integer getPriceFrom() {
    return priceFrom;
  }

  public void setPriceFrom(Integer priceFrom) {
    this.priceFrom = priceFrom;
  }

  public ValuationPriceDistribution priceTo(Integer priceTo) {
    this.priceTo = priceTo;
    return this;
  }

   /**
   * right subrange boundary
   * @return priceTo
  **/
  @ApiModelProperty(example = "231000", value = "right subrange boundary")
  public Integer getPriceTo() {
    return priceTo;
  }

  public void setPriceTo(Integer priceTo) {
    this.priceTo = priceTo;
  }

  public ValuationPriceDistribution probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Probability that price is within the specified boundaries
   * @return probability
  **/
  @ApiModelProperty(example = "0.05", value = "Probability that price is within the specified boundaries")
  public Double getProbability() {
    return probability;
  }

  public void setProbability(Double probability) {
    this.probability = probability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuationPriceDistribution valuationPriceDistribution = (ValuationPriceDistribution) o;
    return Objects.equals(this.priceFrom, valuationPriceDistribution.priceFrom) &&
        Objects.equals(this.priceTo, valuationPriceDistribution.priceTo) &&
        Objects.equals(this.probability, valuationPriceDistribution.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceFrom, priceTo, probability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationPriceDistribution {\n");
    sb.append("    priceFrom: ").append(toIndentedString(priceFrom)).append("\n");
    sb.append("    priceTo: ").append(toIndentedString(priceTo)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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

