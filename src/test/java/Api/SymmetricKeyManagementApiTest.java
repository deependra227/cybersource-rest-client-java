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

import Invokers.ApiException;
import Model.CreateSharedSecretKeysRequest;
import Model.CreateSharedSecretKeysVerifiRequest;
import Model.DeleteBulkSymmetricKeysRequest;
import Model.InlineResponse4005;
import Model.InlineResponse5021;
import Model.KmsV2KeysSymDeletesPost200Response;
import Model.KmsV2KeysSymGet200Response;
import Model.KmsV2KeysSymPost201Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SymmetricKeyManagementApi
 */
@Ignore
public class SymmetricKeyManagementApiTest {

    private final SymmetricKeyManagementApi api = new SymmetricKeyManagementApi();

    
    /**
     * Create Shared-Secret Keys
     *
     * Create one or more Shared-Secret Keys 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createV2SharedSecretKeysTest() throws ApiException {
        CreateSharedSecretKeysRequest createSharedSecretKeysRequest = null;
        KmsV2KeysSymPost201Response response = api.createV2SharedSecretKeys(createSharedSecretKeysRequest);

        // TODO: test validations
    }
    
    /**
     * Create Shared-Secret Keys as per verifi spec
     *
     * Create one or more Shared-Secret Keys as per Verifi spec with 32 chars, store digest algo during key generation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createV2SharedSecretKeysVerifiTest() throws ApiException {
        String vIcDomain = null;
        CreateSharedSecretKeysVerifiRequest createSharedSecretKeysVerifiRequest = null;
        KmsV2KeysSymPost201Response response = api.createV2SharedSecretKeysVerifi(vIcDomain, createSharedSecretKeysVerifiRequest);

        // TODO: test validations
    }
    
    /**
     * Delete one or more Symmetric keys
     *
     * &#39;Delete one or more Symmetric keys&#39; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBulkSymmetricKeysTest() throws ApiException {
        DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest = null;
        KmsV2KeysSymDeletesPost200Response response = api.deleteBulkSymmetricKeys(deleteBulkSymmetricKeysRequest);

        // TODO: test validations
    }
    
    /**
     * Retrieves shared secret key details
     *
     * Retrieves keys details by providing the key id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKeyDetailsTest() throws ApiException {
        String keyId = null;
        KmsV2KeysSymGet200Response response = api.getKeyDetails(keyId);

        // TODO: test validations
    }
    
}
