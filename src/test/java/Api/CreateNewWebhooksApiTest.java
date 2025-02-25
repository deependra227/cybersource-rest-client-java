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
import Model.CreateWebhookRequest;
import Model.InlineResponse2003;
import Model.InlineResponse2012;
import Model.InlineResponse2013;
import Model.SaveSymEgressKey;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateNewWebhooksApi
 */
@Ignore
public class CreateNewWebhooksApiTest {

    private final CreateNewWebhooksApi api = new CreateNewWebhooksApi();

    
    /**
     * Create a Webhook
     *
     * Create a new webhook subscription. Before creating a webhook, ensure that a security key has been created at the top of this developer center section. You will not need to pass us back the key during the creation of the webhook, but you will receive an error if you did not already create a key or store one on file. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWebhookSubscriptionTest() throws ApiException {
        CreateWebhookRequest createWebhookRequest = null;
        InlineResponse2013 response = api.createWebhookSubscription(createWebhookRequest);

        // TODO: test validations
    }
    
    /**
     * Find Products You Can Subscribe To
     *
     * Retrieve a list of products and event types that your account is eligible for. These products and events are the ones that you may subscribe to in the next step of creating webhooks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findProductsToSubscribeTest() throws ApiException {
        String organizationId = null;
        List<InlineResponse2003> response = api.findProductsToSubscribe(organizationId);

        // TODO: test validations
    }
    
    /**
     * Create Webhook Security Keys
     *
     * Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remeber to save the key in the API response, so that you can use it to validate messages later. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveSymEgressKeyTest() throws ApiException {
        String vCSenderOrganizationId = null;
        String vCPermissions = null;
        String vCCorrelationId = null;
        SaveSymEgressKey saveSymEgressKey = null;
        InlineResponse2012 response = api.saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey);

        // TODO: test validations
    }
    
}
