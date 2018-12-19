package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;
import static net.serenitybdd.rest.SerenityRest.given;
import static utils.Utilities.matchesJsonSchema;

/**
 * Created by vibhu on 12/5/2018.
 */
public class demographicsAPI extends ResponseValidation {

    public static Response responseIndividual, responseCorporate;
    public static String uri;
    ResponseValidation responseValidation = new ResponseValidation();

    @When("^a genie user passes the \"([^\"]*)\" as a parameter to get the response from demographic api where customer type is individual$")
    public void getTheResponseOfTheApiByPassingParametersDirectly(String mdmid) {
        uri=uri.concat(mdmid);
        responseIndividual = given().accept(ContentType.JSON).
                get(uri);
    }

    @Given("^a genie user has a demographic api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;
    }

    @Then("^a genie user validates that in the response for demographic api for corporate has all the required fields of required types as mentioned in \"([^\"]*)\"$")
    public void reponse_schema_search_user_is_validated_successfully(String fileName) throws Throwable {
        responseIndividual.then().
                body(matchesJsonSchema(fileName));
    }

    @Then("^a user get the status code 200 as a response from the demographic api where customer type is individual$")
    public void validateDemographicAPIResponseisOK() {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^user get the response from the demographic api where customer type is individual and count of records in response is more than (\\d+)$")
    public void result_for_count_is(int value) throws Throwable {
        String param = "count";
        responseValidation.compareCount(param, responseIndividual, value);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the demographic api where customer type is individual$")
    public void respose_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^user get the response for the initial record for mdmid is \"([^\"]*)\" from the demographic api where customer type is individual$")
    public void respose_for_individual_for_the_initial_record_for_mdmidkey_and_value_is(String value) throws Throwable {
        String param = "records[0].demogData[0].mdmID[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, value);
    }

    @Then("^user get the response for \"([^\"]*)\" like pan is \"([^\"]*)\" from the demographic api where customer type is individual$")
    public void result_as_response_is(String key, String value) throws Throwable {
        String param = "records[0].demogData[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a parameter to get the response from demographic api where customer type is corporate$")
    public void getThecorporateResponseOfTheApiByPassingParametersDirectly(String mdmid) {
        uri=uri.concat(mdmid);
        responseCorporate = given().accept(ContentType.JSON).
                get(uri);
    }

      @Then("^a genie user validates that in the response for demographic api for individual has all the required fields of required types as mentioned in \"([^\"]*)\"$")
    public void reponse_schema_search_user_for_corporateis_validated_successfully(String fileName) throws Throwable {
        responseCorporate.then().
                body(matchesJsonSchema(fileName));
    }
    @Then("^a genie user get the \"([^\"]*)\" as \"([^\"]*)\" from the api as a response$")
    public void messsageAsaResponse(String key,String value){
        String param = "";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^a user get the status code 404 as a response from the demographic api where customer type is individual$")
    public void validateResultNotFoundInResponse(){
        responseValidation.validateResultNotRequest(responseIndividual);
    }

    @Then("^a user get the status code 200 as a response from the demographic api where customer type is corporate")
    public void validateDemographicCorporateAPIResponseisOK() {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @Then("^user get the response from the demographic api where customer type is corporate and count of records in response is more than (\\d+)$")
    public void result_for_Corporate_count_is(int value) throws Throwable {
        String param = "count";
        responseValidation.compareCount(param, responseCorporate, value);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the demographic api where customer type is corporate$")
    public void resposecorporate_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^user get the response for the initial record for mdmid is \"([^\"]*)\" from the demographic api where customer type is corporate$")
    public void respose_for_corporate_for_the_initial_record_for_mdmidkey_and_value_is(String value) throws Throwable {
        String param = "records[0].demogData[0].mdmID[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, value);
    }

    @Then("^user get the response for \"([^\"]*)\" like pan is \"([^\"]*)\" from the demographic api where customer type is corporate$")
    public void resultcorporate_as_response_is(String key, String value) throws Throwable {
        String param = "records[0].demogData[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then ("^user get the response for \"([^\"]*)\" is null from the demographic api where customer type is corporate$")
    public void resultcorporate_for_key_is(String key) throws Throwable {
        String param = "";
        responseValidation.responseNullValueCompare(param, responseCorporate, key);
    }

    @Then("^a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual$")
    public void validateDemographicAPIResponseForInitialCFlagisOK() {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the demographic api for initial c flag record where customer type is individual$")
    public void respose_for_key_and_value_for_initial_cust_record_is(String key, String value) throws Throwable {
        String param = "custData[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate")
    public void validateDemographicCorporateAPIResponseForInitialCFlagisOK() {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the demographic api for initial c flag record where customer type is corporate$")
    public void resposecorporate_for_key_and_value_for_initial_cust_record_is(String key, String value) throws Throwable {
        String param = "custData[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }
}
