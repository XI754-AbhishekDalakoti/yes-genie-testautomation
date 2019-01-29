package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.ResponseValidation;

import static net.serenitybdd.rest.SerenityRest.given;

/**
 * Created by vibhu on 12/20/2018.
 */
public class RelationshipAPI {

    public static Response responseIndividual, responseCorporate;
    public static String uri;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a relationship api to test is \"([^\"]*)\"$")
    public void api_value(String value) {
        uri = value;
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from relationship api where customer type is individual$")
    public void get_the_response_of_the_Api_by_passing_parameters_directly(String mdmid) {
        uri = uri.concat(mdmid);
    }

    @When("a user pass groupLimit value \"([^\"]*)\" and setting value for relationshipLimit is \"([^\"]*)\" where customer type is Individual")
    public void get_the_response_of_the_Api_by_passing_parameters_directly(String groupLimitValue, String relationshipLimitValue) {
        responseIndividual = given().accept(ContentType.JSON).
                param("groupLimit", groupLimitValue).
                param("relation", relationshipLimitValue).
                get(uri);
    }

    @Then("^a user get empty Object as response from the relationship api where customer type is individual$")
    public void validate_Null_Object() {
        responseValidation.validateNullObject(responseIndividual);
    }

    @Then("^a user get the status code 200 as a response from the relationship api where customer type is individual$")
    public void validate_relationship_API_response_is_oK() {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^user get the response for friend group for \"([^\"]*)\" is \"([^\"]*)\" from the relationship api where customer type is individual$")
    public void respose_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "Friend[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^user get the response for family group for \"([^\"]*)\" is \"([^\"]*)\" from the relationship api where customer type is individual$")
    public void respose_for_family_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "Family[0].";
        value=value.trim();
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from relationship api where customer type is corporate")
    public void get_the_response_of_Api_by_passing_parameters_corporate(String mdmid) {
        uri = uri.concat(mdmid);
    }

    @When("a user pass groupLimit value \"([^\"]*)\" and setting value for relationshipLimit is \"([^\"]*)\" where customer type is Corporate")
    public void get_the_response_of_the_Api_by_passing_parameters_directly_for_corporate(String groupLimitValue, String relationshipLimitValue) {
        responseCorporate = given().accept(ContentType.JSON).
                param("groupLimit", groupLimitValue).
                param("relationshipLimit", relationshipLimitValue).
                get(uri);
    }

    @Then("^a user get the status code 200 as a response from the relationship api where customer type is corporate")
    public void validate_relationship_corporate_API_response_is_oK() {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @Then("^user get the response for friend group for \"([^\"]*)\" is \"([^\"]*)\" from the relationship api where customer type is corporate")
    public void respose_for_friend_Corporate_key_and_value_is(String key, String value) throws Throwable {
        String param = "Friend[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^user get the response for family group for \"([^\"]*)\" is \"([^\"]*)\" from the relationship api where customer type is corporate")
    public void respose_for_family__key_and_value_is(String key, String value) throws Throwable {
        String param = "Family[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^user get the response for Corporate group for \"([^\"]*)\" is \"([^\"]*)\" from the relationship api where customer type is corporate")
    public void respose_for_family_Corporate_key_and_value_is(String key, String value) throws Throwable {
        String param = "Corporate[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }
    @Then("^user get the response for second record of Corporate group for \"([^\"]*)\" is \"([^\"]*)\" from the relationship api where customer type is corporate")
    public void respose_for_second_record_of_Corporate_key_and_value_is(String key, String value) throws Throwable {
        String param = "Corporate[1].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }
}
