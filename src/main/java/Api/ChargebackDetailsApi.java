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


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import org.joda.time.DateTime;
import Model.ReportingV3ChargebackDetailsGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChargebackDetailsApi {
    private static Logger logger = LogManager.getLogger(ChargebackDetailsApi.class);
    
    private ApiClient apiClient;

    public ChargebackDetailsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChargebackDetailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getChargebackDetails
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getChargebackDetailsCall(DateTime startTime, DateTime endTime, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/chargeback-details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getChargebackDetailsValidateBeforeCall(DateTime startTime, DateTime endTime, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
        	logger.error("Missing the required parameter 'startTime' when calling getChargebackDetails(Async)");
            throw new ApiException("Missing the required parameter 'startTime' when calling getChargebackDetails(Async)");
        }
        
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
        	logger.error("Missing the required parameter 'endTime' when calling getChargebackDetails(Async)");
            throw new ApiException("Missing the required parameter 'endTime' when calling getChargebackDetails(Async)");
        }
        
        
        okhttp3.Call call = getChargebackDetailsCall(startTime, endTime, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Chargeback Details
     * Chargeback Detail Report Description
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ReportingV3ChargebackDetailsGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportingV3ChargebackDetailsGet200Response getChargebackDetails(DateTime startTime, DateTime endTime, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'getChargebackDetails' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<ReportingV3ChargebackDetailsGet200Response> resp = getChargebackDetailsWithHttpInfo(startTime, endTime, organizationId);
        logger.info("CALL TO METHOD 'getChargebackDetails' ENDED");
        return resp.getData();
    }

    /**
     * Get Chargeback Details
     * Chargeback Detail Report Description
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ApiResponse&lt;ReportingV3ChargebackDetailsGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportingV3ChargebackDetailsGet200Response> getChargebackDetailsWithHttpInfo(DateTime startTime, DateTime endTime, String organizationId) throws ApiException {
        okhttp3.Call call = getChargebackDetailsValidateBeforeCall(startTime, endTime, organizationId, null, null);
        Type localVarReturnType = new TypeToken<ReportingV3ChargebackDetailsGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Chargeback Details (asynchronously)
     * Chargeback Detail Report Description
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getChargebackDetailsAsync(DateTime startTime, DateTime endTime, String organizationId, final ApiCallback<ReportingV3ChargebackDetailsGet200Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getChargebackDetailsValidateBeforeCall(startTime, endTime, organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportingV3ChargebackDetailsGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}