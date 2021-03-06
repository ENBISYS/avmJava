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

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EnergyEfficiency
 */
@JsonAdapter(EnergyEfficiency.Adapter.class)
public enum EnergyEfficiency {
  
  AVERAGE("average"),
  
  GOOD("good"),
  
  POOR("poor"),
  
  VERY_GOOD("very_good"),
  
  VERY_POOR("very_poor");

  private String value;

  EnergyEfficiency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnergyEfficiency fromValue(String value) {
    for (EnergyEfficiency b : EnergyEfficiency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnergyEfficiency> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnergyEfficiency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnergyEfficiency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnergyEfficiency.fromValue(value);
    }
  }
}

