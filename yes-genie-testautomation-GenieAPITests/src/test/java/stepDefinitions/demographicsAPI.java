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

    @When("^a genie user searches the \"([^\"]*)\" and open snap page for individual customer type$")
    public void getTheResponseOfTheApiByPassingParametersDirectly(String mdmid) {
        responseIndividual = given().accept(ContentType.JSON).
                param("mdmid", mdmid).
                get(uri);
    }

    @Given("^a genie user has an demographic api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;
    }

    @Then("^json schema response of \"([^\"]*)\" for demographic api for individual is validated successfully$")
    public void reponse_schema_search_user_is_validated_successfully(String fileName) throws Throwable {
        responseIndividual.then().
                body(matchesJsonSchema(fileName));
    }

    @Then("^a user get the status code 200 as a response from the demographic api for individual$")
    public void validateDemographicAPIResponseisOK() {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^user get the response from the demographic api for individual and count of records is more than (\\d+)$")
    public void result_for_count_is(int value) throws Throwable {
        String param = "count";
        responseValidation.compareCount(param, responseIndividual, value);
    }

    @Then("^user get the response from the demographic api for individual for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void respose_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "records[0].demogData[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^user get the response from the demographic api for individual for the initial record for mdmid is \"([^\"]*)\"$")
    public void respose_for_individual_for_the_initial_record_for_mdmidkey_and_value_is(String value) throws Throwable {
        String param = "records[0].demogData[0].mdmID[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, value);
    }

    @Then("^user get the response from the demographic api for individual for \"([^\"]*)\" like pan is \"([^\"]*)\"$")
    public void result_as_response_is(String key, String value) throws Throwable {
        String param = "records[0].demogData[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @When("^a genie user searches the \"([^\"]*)\" and open snap page for corporate customer type$")
    public void getThecorporateResponseOfTheApiByPassingParametersDirectly(String mdmid) {
        responseCorporate = given().accept(ContentType.JSON).
                param("mdmid", mdmid).
                get(uri);
    }

    @Then("^json schema response of \"([^\"]*)\" for demographic api for corporate is validated successfully$")
    public void reponse_schema_search_user_for_corporateis_validated_successfully(String fileName) throws Throwable {
        responseCorporate.then().
                body(matchesJsonSchema(fileName));
    }

    @Then("^a user get the status code 200 as a response from the demographic api for corporate")
    public void validateDemographicCorporateAPIResponseisOK() {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @Then("^user get the response from the demographic api for corporate and count of records is more than (\\d+)$")
    public void result_for_Corporate_count_is(int value) throws Throwable {
        String param = "count";
        responseValidation.compareCount(param, responseCorporate, value);
    }

    @Then("^user get the response from the demographic api for corporate for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void resposecorporate_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "records[0].demogData[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^user get the response from the demographic api for corporate for the initial record for mdmid is \"([^\"]*)\"$")
    public void respose_for_corporate_for_the_initial_record_for_mdmidkey_and_value_is(String value) throws Throwable {
        String param = "records[0].demogData[0].mdmID[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, value);
    }

    @Then("^user get the response from the demographic api for corporate for \"([^\"]*)\" like pan is \"([^\"]*)\"$")
    public void resultcorporate_as_response_is(String key, String value) throws Throwable {
        String param = "records[0].demogData[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

}
