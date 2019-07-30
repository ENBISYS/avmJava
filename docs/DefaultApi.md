# DefaultApi

All URIs are relative to *https://avm.enbisys.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFastValuation**](DefaultApi.md#getFastValuation) | **POST** /properties/getFastValuation | 
[**getValuation**](DefaultApi.md#getValuation) | **POST** /properties/getValuation | 


<a name="getFastValuation"></a>
# **getFastValuation**
> Integer getFastValuation(propertyFeatures)



Get only property price valuation without confidence estimation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyFeatures** | [**PropertyFeatures**](PropertyFeatures.md)| Property features that describe property |

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully done |  -  |
**400** | Bad request |  -  |
**402** | Payment Required |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method not allowed |  -  |
**415** | Unsupported media type |  -  |
**429** | Too many request |  -  |
**500** | Internal server error |  -  |

<a name="getValuation"></a>
# **getValuation**
> Valuation getValuation(propertyFeatures)

Get property price valuation with confidence estimation


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyFeatures** | [**PropertyFeatures**](PropertyFeatures.md)| Property features to valuate |

### Return type

[**Valuation**](Valuation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successfully done |  -  |
**400** | Bad request |  -  |
**402** | Payment Required |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method not allowed |  -  |
**415** | Unsupported media type |  -  |
**429** | Too many request |  -  |
**500** | Internal server error |  -  |

