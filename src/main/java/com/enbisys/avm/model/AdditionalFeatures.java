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
import org.threeten.bp.LocalDate;

/**
 * AdditionalFeatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-12T12:39:15.489+07:00[Asia/Novosibirsk]")
public class AdditionalFeatures {
  public static final String SERIALIZED_NAME_PRICE_OF_PREVIOUS_SALE = "priceOfPreviousSale";
  @SerializedName(SERIALIZED_NAME_PRICE_OF_PREVIOUS_SALE)
  private Integer priceOfPreviousSale;

  public static final String SERIALIZED_NAME_DATE_OF_PREVIOUS_SALE = "dateOfPreviousSale";
  @SerializedName(SERIALIZED_NAME_DATE_OF_PREVIOUS_SALE)
  private LocalDate dateOfPreviousSale;

  public static final String SERIALIZED_NAME_LEASEHOLD_OR_FREEHOLD = "leaseholdOrFreehold";
  @SerializedName(SERIALIZED_NAME_LEASEHOLD_OR_FREEHOLD)
  private LeaseholdOrFreehold leaseholdOrFreehold;

  public static final String SERIALIZED_NAME_WALL_TYPE = "wallType";
  @SerializedName(SERIALIZED_NAME_WALL_TYPE)
  private WallType wallType;

  public static final String SERIALIZED_NAME_WALL_INSULATION = "wallInsulation";
  @SerializedName(SERIALIZED_NAME_WALL_INSULATION)
  private WallInsulation wallInsulation;

  public static final String SERIALIZED_NAME_WALL_ENERGY_EFFICIENCY = "wallEnergyEfficiency";
  @SerializedName(SERIALIZED_NAME_WALL_ENERGY_EFFICIENCY)
  private EnergyEfficiency wallEnergyEfficiency;

  public static final String SERIALIZED_NAME_ROOF_TYPE = "roofType";
  @SerializedName(SERIALIZED_NAME_ROOF_TYPE)
  private RoofType roofType;

  public static final String SERIALIZED_NAME_ROOF_INSULATION = "roofInsulation";
  @SerializedName(SERIALIZED_NAME_ROOF_INSULATION)
  private RoofInsulation roofInsulation;

  public static final String SERIALIZED_NAME_ROOF_ENERGY_EFFICIENCY = "roofEnergyEfficiency";
  @SerializedName(SERIALIZED_NAME_ROOF_ENERGY_EFFICIENCY)
  private EnergyEfficiency roofEnergyEfficiency;

  public static final String SERIALIZED_NAME_WINDOW_GLAZING_TYPE = "windowGlazingType";
  @SerializedName(SERIALIZED_NAME_WINDOW_GLAZING_TYPE)
  private WindowGlazingType windowGlazingType;

  public static final String SERIALIZED_NAME_WINDOW_ENERGY_EFFICIENCY = "windowEnergyEfficiency";
  @SerializedName(SERIALIZED_NAME_WINDOW_ENERGY_EFFICIENCY)
  private EnergyEfficiency windowEnergyEfficiency;

  public static final String SERIALIZED_NAME_CURRENT_ENERGY_RATING = "currentEnergyRating";
  @SerializedName(SERIALIZED_NAME_CURRENT_ENERGY_RATING)
  private EnergyRating currentEnergyRating;

  public static final String SERIALIZED_NAME_POTENTIAL_ENERGY_RATING = "potentialEnergyRating";
  @SerializedName(SERIALIZED_NAME_POTENTIAL_ENERGY_RATING)
  private EnergyRating potentialEnergyRating;

  public static final String SERIALIZED_NAME_ANNUAL_HEATING_COST_IN_POUNDS = "annualHeatingCostInPounds";
  @SerializedName(SERIALIZED_NAME_ANNUAL_HEATING_COST_IN_POUNDS)
  private Integer annualHeatingCostInPounds;

  public static final String SERIALIZED_NAME_ANNUAL_HOT_WATER_COST_IN_POUNDS = "annualHotWaterCostInPounds";
  @SerializedName(SERIALIZED_NAME_ANNUAL_HOT_WATER_COST_IN_POUNDS)
  private Integer annualHotWaterCostInPounds;

  public static final String SERIALIZED_NAME_ANNUAL_LIGHTING_COST_IN_POUNDS = "annualLightingCostInPounds";
  @SerializedName(SERIALIZED_NAME_ANNUAL_LIGHTING_COST_IN_POUNDS)
  private Integer annualLightingCostInPounds;

  public static final String SERIALIZED_NAME_ANNUAL_ENERGY_CONSUMPTION_IN_K_WH = "annualEnergyConsumptionInKWh";
  @SerializedName(SERIALIZED_NAME_ANNUAL_ENERGY_CONSUMPTION_IN_K_WH)
  private Integer annualEnergyConsumptionInKWh;

  public static final String SERIALIZED_NAME_FLOOR_HEIGHT_IN_FOOT = "floorHeightInFoot";
  @SerializedName(SERIALIZED_NAME_FLOOR_HEIGHT_IN_FOOT)
  private Float floorHeightInFoot;

  public static final String SERIALIZED_NAME_BUILT_FORM = "builtForm";
  @SerializedName(SERIALIZED_NAME_BUILT_FORM)
  private BuiltForm builtForm;

  public AdditionalFeatures priceOfPreviousSale(Integer priceOfPreviousSale) {
    this.priceOfPreviousSale = priceOfPreviousSale;
    return this;
  }

   /**
   * Get priceOfPreviousSale
   * minimum: 1
   * @return priceOfPreviousSale
  **/
  @ApiModelProperty(example = "300000", value = "")
  public Integer getPriceOfPreviousSale() {
    return priceOfPreviousSale;
  }

  public void setPriceOfPreviousSale(Integer priceOfPreviousSale) {
    this.priceOfPreviousSale = priceOfPreviousSale;
  }

  public AdditionalFeatures dateOfPreviousSale(LocalDate dateOfPreviousSale) {
    this.dateOfPreviousSale = dateOfPreviousSale;
    return this;
  }

   /**
   * Get dateOfPreviousSale
   * @return dateOfPreviousSale
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDateOfPreviousSale() {
    return dateOfPreviousSale;
  }

  public void setDateOfPreviousSale(LocalDate dateOfPreviousSale) {
    this.dateOfPreviousSale = dateOfPreviousSale;
  }

  public AdditionalFeatures leaseholdOrFreehold(LeaseholdOrFreehold leaseholdOrFreehold) {
    this.leaseholdOrFreehold = leaseholdOrFreehold;
    return this;
  }

   /**
   * Get leaseholdOrFreehold
   * @return leaseholdOrFreehold
  **/
  @ApiModelProperty(value = "")
  public LeaseholdOrFreehold getLeaseholdOrFreehold() {
    return leaseholdOrFreehold;
  }

  public void setLeaseholdOrFreehold(LeaseholdOrFreehold leaseholdOrFreehold) {
    this.leaseholdOrFreehold = leaseholdOrFreehold;
  }

  public AdditionalFeatures wallType(WallType wallType) {
    this.wallType = wallType;
    return this;
  }

   /**
   * Get wallType
   * @return wallType
  **/
  @ApiModelProperty(value = "")
  public WallType getWallType() {
    return wallType;
  }

  public void setWallType(WallType wallType) {
    this.wallType = wallType;
  }

  public AdditionalFeatures wallInsulation(WallInsulation wallInsulation) {
    this.wallInsulation = wallInsulation;
    return this;
  }

   /**
   * Get wallInsulation
   * @return wallInsulation
  **/
  @ApiModelProperty(value = "")
  public WallInsulation getWallInsulation() {
    return wallInsulation;
  }

  public void setWallInsulation(WallInsulation wallInsulation) {
    this.wallInsulation = wallInsulation;
  }

  public AdditionalFeatures wallEnergyEfficiency(EnergyEfficiency wallEnergyEfficiency) {
    this.wallEnergyEfficiency = wallEnergyEfficiency;
    return this;
  }

   /**
   * Get wallEnergyEfficiency
   * @return wallEnergyEfficiency
  **/
  @ApiModelProperty(value = "")
  public EnergyEfficiency getWallEnergyEfficiency() {
    return wallEnergyEfficiency;
  }

  public void setWallEnergyEfficiency(EnergyEfficiency wallEnergyEfficiency) {
    this.wallEnergyEfficiency = wallEnergyEfficiency;
  }

  public AdditionalFeatures roofType(RoofType roofType) {
    this.roofType = roofType;
    return this;
  }

   /**
   * Get roofType
   * @return roofType
  **/
  @ApiModelProperty(value = "")
  public RoofType getRoofType() {
    return roofType;
  }

  public void setRoofType(RoofType roofType) {
    this.roofType = roofType;
  }

  public AdditionalFeatures roofInsulation(RoofInsulation roofInsulation) {
    this.roofInsulation = roofInsulation;
    return this;
  }

   /**
   * Get roofInsulation
   * @return roofInsulation
  **/
  @ApiModelProperty(value = "")
  public RoofInsulation getRoofInsulation() {
    return roofInsulation;
  }

  public void setRoofInsulation(RoofInsulation roofInsulation) {
    this.roofInsulation = roofInsulation;
  }

  public AdditionalFeatures roofEnergyEfficiency(EnergyEfficiency roofEnergyEfficiency) {
    this.roofEnergyEfficiency = roofEnergyEfficiency;
    return this;
  }

   /**
   * Get roofEnergyEfficiency
   * @return roofEnergyEfficiency
  **/
  @ApiModelProperty(value = "")
  public EnergyEfficiency getRoofEnergyEfficiency() {
    return roofEnergyEfficiency;
  }

  public void setRoofEnergyEfficiency(EnergyEfficiency roofEnergyEfficiency) {
    this.roofEnergyEfficiency = roofEnergyEfficiency;
  }

  public AdditionalFeatures windowGlazingType(WindowGlazingType windowGlazingType) {
    this.windowGlazingType = windowGlazingType;
    return this;
  }

   /**
   * Get windowGlazingType
   * @return windowGlazingType
  **/
  @ApiModelProperty(value = "")
  public WindowGlazingType getWindowGlazingType() {
    return windowGlazingType;
  }

  public void setWindowGlazingType(WindowGlazingType windowGlazingType) {
    this.windowGlazingType = windowGlazingType;
  }

  public AdditionalFeatures windowEnergyEfficiency(EnergyEfficiency windowEnergyEfficiency) {
    this.windowEnergyEfficiency = windowEnergyEfficiency;
    return this;
  }

   /**
   * Get windowEnergyEfficiency
   * @return windowEnergyEfficiency
  **/
  @ApiModelProperty(value = "")
  public EnergyEfficiency getWindowEnergyEfficiency() {
    return windowEnergyEfficiency;
  }

  public void setWindowEnergyEfficiency(EnergyEfficiency windowEnergyEfficiency) {
    this.windowEnergyEfficiency = windowEnergyEfficiency;
  }

  public AdditionalFeatures currentEnergyRating(EnergyRating currentEnergyRating) {
    this.currentEnergyRating = currentEnergyRating;
    return this;
  }

   /**
   * Get currentEnergyRating
   * @return currentEnergyRating
  **/
  @ApiModelProperty(value = "")
  public EnergyRating getCurrentEnergyRating() {
    return currentEnergyRating;
  }

  public void setCurrentEnergyRating(EnergyRating currentEnergyRating) {
    this.currentEnergyRating = currentEnergyRating;
  }

  public AdditionalFeatures potentialEnergyRating(EnergyRating potentialEnergyRating) {
    this.potentialEnergyRating = potentialEnergyRating;
    return this;
  }

   /**
   * Get potentialEnergyRating
   * @return potentialEnergyRating
  **/
  @ApiModelProperty(value = "")
  public EnergyRating getPotentialEnergyRating() {
    return potentialEnergyRating;
  }

  public void setPotentialEnergyRating(EnergyRating potentialEnergyRating) {
    this.potentialEnergyRating = potentialEnergyRating;
  }

  public AdditionalFeatures annualHeatingCostInPounds(Integer annualHeatingCostInPounds) {
    this.annualHeatingCostInPounds = annualHeatingCostInPounds;
    return this;
  }

   /**
   * Get annualHeatingCostInPounds
   * @return annualHeatingCostInPounds
  **/
  @ApiModelProperty(example = "817", value = "")
  public Integer getAnnualHeatingCostInPounds() {
    return annualHeatingCostInPounds;
  }

  public void setAnnualHeatingCostInPounds(Integer annualHeatingCostInPounds) {
    this.annualHeatingCostInPounds = annualHeatingCostInPounds;
  }

  public AdditionalFeatures annualHotWaterCostInPounds(Integer annualHotWaterCostInPounds) {
    this.annualHotWaterCostInPounds = annualHotWaterCostInPounds;
    return this;
  }

   /**
   * Get annualHotWaterCostInPounds
   * @return annualHotWaterCostInPounds
  **/
  @ApiModelProperty(example = "273", value = "")
  public Integer getAnnualHotWaterCostInPounds() {
    return annualHotWaterCostInPounds;
  }

  public void setAnnualHotWaterCostInPounds(Integer annualHotWaterCostInPounds) {
    this.annualHotWaterCostInPounds = annualHotWaterCostInPounds;
  }

  public AdditionalFeatures annualLightingCostInPounds(Integer annualLightingCostInPounds) {
    this.annualLightingCostInPounds = annualLightingCostInPounds;
    return this;
  }

   /**
   * Get annualLightingCostInPounds
   * @return annualLightingCostInPounds
  **/
  @ApiModelProperty(example = "102", value = "")
  public Integer getAnnualLightingCostInPounds() {
    return annualLightingCostInPounds;
  }

  public void setAnnualLightingCostInPounds(Integer annualLightingCostInPounds) {
    this.annualLightingCostInPounds = annualLightingCostInPounds;
  }

  public AdditionalFeatures annualEnergyConsumptionInKWh(Integer annualEnergyConsumptionInKWh) {
    this.annualEnergyConsumptionInKWh = annualEnergyConsumptionInKWh;
    return this;
  }

   /**
   * Get annualEnergyConsumptionInKWh
   * @return annualEnergyConsumptionInKWh
  **/
  @ApiModelProperty(example = "25662", value = "")
  public Integer getAnnualEnergyConsumptionInKWh() {
    return annualEnergyConsumptionInKWh;
  }

  public void setAnnualEnergyConsumptionInKWh(Integer annualEnergyConsumptionInKWh) {
    this.annualEnergyConsumptionInKWh = annualEnergyConsumptionInKWh;
  }

  public AdditionalFeatures floorHeightInFoot(Float floorHeightInFoot) {
    this.floorHeightInFoot = floorHeightInFoot;
    return this;
  }

   /**
   * Get floorHeightInFoot
   * @return floorHeightInFoot
  **/
  @ApiModelProperty(example = "7.58", value = "")
  public Float getFloorHeightInFoot() {
    return floorHeightInFoot;
  }

  public void setFloorHeightInFoot(Float floorHeightInFoot) {
    this.floorHeightInFoot = floorHeightInFoot;
  }

  public AdditionalFeatures builtForm(BuiltForm builtForm) {
    this.builtForm = builtForm;
    return this;
  }

   /**
   * Get builtForm
   * @return builtForm
  **/
  @ApiModelProperty(value = "")
  public BuiltForm getBuiltForm() {
    return builtForm;
  }

  public void setBuiltForm(BuiltForm builtForm) {
    this.builtForm = builtForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalFeatures additionalFeatures = (AdditionalFeatures) o;
    return Objects.equals(this.priceOfPreviousSale, additionalFeatures.priceOfPreviousSale) &&
        Objects.equals(this.dateOfPreviousSale, additionalFeatures.dateOfPreviousSale) &&
        Objects.equals(this.leaseholdOrFreehold, additionalFeatures.leaseholdOrFreehold) &&
        Objects.equals(this.wallType, additionalFeatures.wallType) &&
        Objects.equals(this.wallInsulation, additionalFeatures.wallInsulation) &&
        Objects.equals(this.wallEnergyEfficiency, additionalFeatures.wallEnergyEfficiency) &&
        Objects.equals(this.roofType, additionalFeatures.roofType) &&
        Objects.equals(this.roofInsulation, additionalFeatures.roofInsulation) &&
        Objects.equals(this.roofEnergyEfficiency, additionalFeatures.roofEnergyEfficiency) &&
        Objects.equals(this.windowGlazingType, additionalFeatures.windowGlazingType) &&
        Objects.equals(this.windowEnergyEfficiency, additionalFeatures.windowEnergyEfficiency) &&
        Objects.equals(this.currentEnergyRating, additionalFeatures.currentEnergyRating) &&
        Objects.equals(this.potentialEnergyRating, additionalFeatures.potentialEnergyRating) &&
        Objects.equals(this.annualHeatingCostInPounds, additionalFeatures.annualHeatingCostInPounds) &&
        Objects.equals(this.annualHotWaterCostInPounds, additionalFeatures.annualHotWaterCostInPounds) &&
        Objects.equals(this.annualLightingCostInPounds, additionalFeatures.annualLightingCostInPounds) &&
        Objects.equals(this.annualEnergyConsumptionInKWh, additionalFeatures.annualEnergyConsumptionInKWh) &&
        Objects.equals(this.floorHeightInFoot, additionalFeatures.floorHeightInFoot) &&
        Objects.equals(this.builtForm, additionalFeatures.builtForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceOfPreviousSale, dateOfPreviousSale, leaseholdOrFreehold, wallType, wallInsulation, wallEnergyEfficiency, roofType, roofInsulation, roofEnergyEfficiency, windowGlazingType, windowEnergyEfficiency, currentEnergyRating, potentialEnergyRating, annualHeatingCostInPounds, annualHotWaterCostInPounds, annualLightingCostInPounds, annualEnergyConsumptionInKWh, floorHeightInFoot, builtForm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalFeatures {\n");
    sb.append("    priceOfPreviousSale: ").append(toIndentedString(priceOfPreviousSale)).append("\n");
    sb.append("    dateOfPreviousSale: ").append(toIndentedString(dateOfPreviousSale)).append("\n");
    sb.append("    leaseholdOrFreehold: ").append(toIndentedString(leaseholdOrFreehold)).append("\n");
    sb.append("    wallType: ").append(toIndentedString(wallType)).append("\n");
    sb.append("    wallInsulation: ").append(toIndentedString(wallInsulation)).append("\n");
    sb.append("    wallEnergyEfficiency: ").append(toIndentedString(wallEnergyEfficiency)).append("\n");
    sb.append("    roofType: ").append(toIndentedString(roofType)).append("\n");
    sb.append("    roofInsulation: ").append(toIndentedString(roofInsulation)).append("\n");
    sb.append("    roofEnergyEfficiency: ").append(toIndentedString(roofEnergyEfficiency)).append("\n");
    sb.append("    windowGlazingType: ").append(toIndentedString(windowGlazingType)).append("\n");
    sb.append("    windowEnergyEfficiency: ").append(toIndentedString(windowEnergyEfficiency)).append("\n");
    sb.append("    currentEnergyRating: ").append(toIndentedString(currentEnergyRating)).append("\n");
    sb.append("    potentialEnergyRating: ").append(toIndentedString(potentialEnergyRating)).append("\n");
    sb.append("    annualHeatingCostInPounds: ").append(toIndentedString(annualHeatingCostInPounds)).append("\n");
    sb.append("    annualHotWaterCostInPounds: ").append(toIndentedString(annualHotWaterCostInPounds)).append("\n");
    sb.append("    annualLightingCostInPounds: ").append(toIndentedString(annualLightingCostInPounds)).append("\n");
    sb.append("    annualEnergyConsumptionInKWh: ").append(toIndentedString(annualEnergyConsumptionInKWh)).append("\n");
    sb.append("    floorHeightInFoot: ").append(toIndentedString(floorHeightInFoot)).append("\n");
    sb.append("    builtForm: ").append(toIndentedString(builtForm)).append("\n");
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

