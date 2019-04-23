package stepDefinitions;

import helper.ResponseValidation;
import io.restassured.response.Response;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import static net.serenitybdd.rest.SerenityRest.given;

public class ChannelAPI {
    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a channel api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_channel_api_to_test_is(String value) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(value);

    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from channel api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_to_get_the_response_from_channel_api_where_customer_type_is_individual(String mdmid) throws Throwable {
        uri = uri.concat(mdmid);

    }

    @When("^get the response from channel api$")
    public void get_the_response_from_channel_api() throws Throwable {
        accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());

    }

    @Then("^a user get the status code (\\d+) as a response from the channel api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_channel_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);

    }

    @Then("^user get the response for netbanking loans \"([^\"]*)\" is \"([^\"]*)\" from the channel api where customer type is individual$")
    public void user_get_the_response_for_netbanking_loans_is_from_the_channel_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "[0].netbanking.";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);

    }

    @Then("^a user get empty Object as response from the channel api where customer type is individual$")
    public void a_user_get_empty_Object_as_response_from_the_channel_api_where_customer_type_is_individual() throws Throwable {
        responseValidation.validateNullObjectArray(responseIndividual);

    }

}
