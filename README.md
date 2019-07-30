# openapi-java-client

This is api client library for AVM (automated valuation machine) - https://avm.enbisys.com/

Get instant and accurate Property Valuations and Predictive Analytics with our AI and Big Data tools. And make smart decisions faster

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile avm
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.enbisys.avm.api.DefaultApi;
import com.enbisys.avm.auth.ApiKeyAuth;
import com.enbisys.avm.model.*;

public class Example {
    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://avm.enbisys.com/api");

        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        apiKeyAuth.setApiKey("SET YOUR TOKEN HERE!");

        DefaultApi apiInstance = new DefaultApi(defaultClient);

        PropertyFeatures propertyFeatures = new PropertyFeatures();
        RequiredFeatures requiredFeatures = new RequiredFeatures();
        AdditionalFeatures additionalFeatures = new AdditionalFeatures();

        requiredFeatures.setFloorLevel(FloorLevel.FLOOR_2);
        requiredFeatures.setNewOrResale(NewOrResale.NEW);
        requiredFeatures.setNumberOfRooms(9);
        requiredFeatures.setPostcode("b1 1TB");
        requiredFeatures.setPropertyType(PropertyType.SEMI_DETACHED_HOUSE);
        requiredFeatures.setTotalFloorAreaInSqf(135);
        propertyFeatures.setRequiredFeatures(requiredFeatures);

        additionalFeatures.setBuiltForm(BuiltForm.ENCLOSED_MID_TERRACE);
        additionalFeatures.setCurrentEnergyRating(EnergyRating.E);
        additionalFeatures.setLeaseholdOrFreehold(LeaseholdOrFreehold.FREEHOLD);
        additionalFeatures.setWindowEnergyEfficiency(EnergyEfficiency.GOOD);

        try {
            Integer result = apiInstance.getFastValuation(propertyFeatures);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getFastValuation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}


```

## Documentation for API Endpoints

All URIs are relative to *https://avm.enbisys.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getFastValuation**](docs/DefaultApi.md#getFastValuation) | **POST** /properties/getFastValuation | 
*DefaultApi* | [**getValuation**](docs/DefaultApi.md#getValuation) | **POST** /properties/getValuation | 


## Documentation for Models

 - [AdditionalFeatures](docs/AdditionalFeatures.md)
 - [BuiltForm](docs/BuiltForm.md)
 - [EnergyEfficiency](docs/EnergyEfficiency.md)
 - [EnergyRating](docs/EnergyRating.md)
 - [FloorLevel](docs/FloorLevel.md)
 - [LeaseholdOrFreehold](docs/LeaseholdOrFreehold.md)
 - [NewOrResale](docs/NewOrResale.md)
 - [Problem](docs/Problem.md)
 - [PropertyFeatures](docs/PropertyFeatures.md)
 - [PropertyType](docs/PropertyType.md)
 - [RequiredFeatures](docs/RequiredFeatures.md)
 - [RoofInsulation](docs/RoofInsulation.md)
 - [RoofType](docs/RoofType.md)
 - [Valuation](docs/Valuation.md)
 - [ValuationPriceDistribution](docs/ValuationPriceDistribution.md)
 - [WallInsulation](docs/WallInsulation.md)
 - [WallType](docs/WallType.md)
 - [WindowGlazingType](docs/WindowGlazingType.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@enbisys.com

