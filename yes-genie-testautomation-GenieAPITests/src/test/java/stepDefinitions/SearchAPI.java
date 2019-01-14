package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.ResponseValidation;

import static net.serenitybdd.rest.SerenityRest.given;
import static utils.Utilities.matchesJsonSchema;

/**
 * Created by vibhu on 11/13/2018.
 */
public class SearchAPI extends ResponseValidation {

    public static Response response;
    public static Response responseAccessToken;
    public static String uri, uriAccessToken, accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @When("^a user search with value \"([^\"]*)\" and setting value for threshold \"([^\"]*)\"$")
    public void get_the_response_of_the_api_by_passing_parameters_directly(String query, String thresholdValue) {
        response = given().accept(ContentType.JSON).
                header("Authorization", accessToken).
                param("query", query).
                param("threshold", thresholdValue).
                get(uri);
    }

    @Given("^user wants a valid access token from \"([^\"]*)\" URI$")
    public void get_access_token(String value) {
        uriAccessToken = value;

    }

    @And("^to get valid access token user passes \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\"$")
    public void to_get_valid_access_token_user_passes_as_and_as_and_as_and_as_and_as(String client_idValue, String client_id, String grant_typeValue, String grant_type, String usernameValue, String username, String passwordValue, String password, String client_secretValue, String client_secret) throws Throwable {
        responseAccessToken = given().accept(ContentType.JSON).
                header("Content-Type", "application/x-www-form-urlencoded").
                param(client_id, client_idValue).
                param(grant_type, grant_typeValue).
                param(username, usernameValue).
                param(password, passwordValue).
                param(client_secret, client_secretValue).
                post(uriAccessToken);
        responseValidation.validateResponseOk(responseAccessToken);
        accessToken = responseValidation.getResponse(responseAccessToken);
        accessToken = "Bearer ".concat(accessToken);
        System.out.println("accessToken : " + accessToken);
    }

    @Given("^api to test is \"([^\"]*)\"$")
    public void api_Value(String value) {
        uri = value;
    }

    @Then("^a user get the status code 200 as a response from the api$")
    public void validate_API_is_OK() {
        responseValidation.validateResponseOk(response);
    }

    @Then("^user get status code is 400 as response from the api$")
    public void validate_API_is_400() {
        responseValidation.validateBadRequest(response);
    }

    @Then("^user get the response from the api for the initial record for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void respose_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "records[0].";
        responseValidation.responseCompareForStringValue(param, response, key, value);
    }

    @Then("^user get the response from the api for initial record of numeric type for \"([^\"]*)\" is (\\d+)$")
    public void result_for_numeric_is(String key, int value) throws Throwable {
        String param = "records[0].";
        System.out.println("response.getBody().asString()" + response.getBody().asString());
        responseValidation.responseIntValueCompare(param, response, key, value);
    }

    @Then("^user get the response from the api and count of records is more than or equal to (\\d+)$")
    public void result_for_count_is(int value) throws Throwable {
        String param = "count";
        responseValidation.compareCount(param, response, value);
    }

    @Then("^user get the response from the api as \"([^\"]*)\"$")
    public void result_as_response_is(String value) throws Throwable {
        String param = "records[0].accessible";
        responseValidation.responseBooleanValueCompare(param, response, value);
    }

    @Then("^search api response json schema is validated successfully$")
    public void response_schema_is_validated_successfully() throws Throwable {
        response.then().
                body(matchesJsonSchema("searchAPISchema.json"));
    }

    @Then("^user get the response from the elastic search API$")
    public void user_get_the_response_from_the_elastic_search_API() throws Throwable {
        responseValidation.compareResponseAsAStringIsNotEmpty(response);
    }

}


