# PaymentsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayment**](PaymentsApi.md#createPayment) | **POST** /pts/v2/payments | Process a Payment
[**incrementAuth**](PaymentsApi.md#incrementAuth) | **PATCH** /pts/v2/payments/{id} | Increment an Authorization
[**refreshPaymentStatus**](PaymentsApi.md#refreshPaymentStatus) | **POST** /pts/v2/refresh-payment-status/{id} | Check a Payment Status


<a name="createPayment"></a>
# **createPayment**
> PtsV2PaymentsPost201Response createPayment(createPaymentRequest)

Process a Payment

A payment authorizes the amount for the transaction. There are a number of supported payment features, such as E-commerce and Card Present - Credit Card/Debit Card, Echeck, e-Wallets, Level II/III Data, etc..  A payment response includes the status of the request. It also includes processor-specific information when the request is successful and errors if unsuccessful. See the [Payments Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/payments/developer/ctv/rest/payments/payments-intro.html).  Authorization can be requested with Capture, Decision Manager, Payer Authentication(3ds), and Token Creation. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
CreatePaymentRequest createPaymentRequest = new CreatePaymentRequest(); // CreatePaymentRequest | 
try {
    PtsV2PaymentsPost201Response result = apiInstance.createPayment(createPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPaymentRequest** | [**CreatePaymentRequest**](CreatePaymentRequest.md)|  |

### Return type

[**PtsV2PaymentsPost201Response**](PtsV2PaymentsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="incrementAuth"></a>
# **incrementAuth**
> PtsV2IncrementalAuthorizationPatch201Response incrementAuth(id, incrementAuthRequest)

Increment an Authorization

Use this service to authorize additional charges in a lodging or autorental transaction. Include the ID returned from the original authorization in the PATCH request to add additional charges to that authorization. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String id = "id_example"; // String | The ID returned from the original authorization request.
IncrementAuthRequest incrementAuthRequest = new IncrementAuthRequest(); // IncrementAuthRequest | 
try {
    PtsV2IncrementalAuthorizationPatch201Response result = apiInstance.incrementAuth(id, incrementAuthRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#incrementAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID returned from the original authorization request. |
 **incrementAuthRequest** | [**IncrementAuthRequest**](IncrementAuthRequest.md)|  |

### Return type

[**PtsV2IncrementalAuthorizationPatch201Response**](PtsV2IncrementalAuthorizationPatch201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="refreshPaymentStatus"></a>
# **refreshPaymentStatus**
> PtsV2PaymentsPost201Response1 refreshPaymentStatus(id, refreshPaymentStatusRequest)

Check a Payment Status

Checks and updates the payment status 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String id = "id_example"; // String | The payment id whose status needs to be checked and updated.
RefreshPaymentStatusRequest refreshPaymentStatusRequest = new RefreshPaymentStatusRequest(); // RefreshPaymentStatusRequest | 
try {
    PtsV2PaymentsPost201Response1 result = apiInstance.refreshPaymentStatus(id, refreshPaymentStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#refreshPaymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The payment id whose status needs to be checked and updated. |
 **refreshPaymentStatusRequest** | [**RefreshPaymentStatusRequest**](RefreshPaymentStatusRequest.md)|  |

### Return type

[**PtsV2PaymentsPost201Response1**](PtsV2PaymentsPost201Response1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

