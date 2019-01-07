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
 * Created by vibhu on 12/19/2018.
 */
public class NbaAPI {

    public static Response responseIndividual, responseCorporate, responseLeadIndividual, responseLeadCorporate;
    public static String uri;
    public int codeEditRemark;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a nba api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from nba api where customer type is individual$")
    public void get_the_response_of_the_Api_by_passing_parameters_directly(String mdmid) {
        uri = uri.concat(mdmid);
        responseIndividual = given().accept(ContentType.JSON).
                get(uri);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba api where customer type is individual$")
    public void respose_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }
    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba api where customer type is individual and field is of boolean type$")
    public void respose_for_key_and_value_is_boolean_type(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseBooleanValueCompare(param,responseIndividual,key,value);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" as additional info from the nba api where customer type is individual$")
    public void respose_as_additional_info_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "additionalInfo[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^a user get the status code 200 as a response from the nba api where customer type is individual$")
    public void validate_demographic_API_response_is_oK() {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from nba api where customer type is corporate$")
    public void get_the_response_of_the_Api_by_passing_mdmId_directly(String mdmid) {
        uri = uri.concat(mdmid);
        responseCorporate = given().accept(ContentType.JSON).
                get(uri);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba api where customer type is corporate$")
    public void respose_for_nba_key_and_value_is(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" as additional info from the nba api where customer type is corporate$")
    public void respose_nba_as_additional_info_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "additionalInfo[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^a user get the status code 200 as a response from the nba api where customer type is corporate$")
    public void validate_demographic_API_response_is_oK_for_corporate$() {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @When("^a genie user passes the \"([^\"]*)\" as action codes to get the response from nba api where customer type is individual$")
    public void get_the_response_of_the_Api_by_passing_parameters_directly_for_action_code_individual(String actionCode) {
        responseIndividual = given().accept(ContentType.JSON).
                param("query", actionCode).
                get(uri);
    }

    @When("^a genie user passes the \"([^\"]*)\" as action codes to get the response from nba api where customer type is corporate")
    public void get_the_response_of_the_Api_by_passing_parameters_directly_for_action_code_corporate(String actionCode) {
        responseCorporate = given().accept(ContentType.JSON).
                param("query", actionCode).
                get(uri);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as a refrence id to get the response from nba api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_a_refrence_id_to_get_the_response_from_nba_api_where_customer_type_is_individual(String mdmId, String refrenceID) throws Throwable {
        uri = uri.concat(mdmId).concat("/").concat(refrenceID);
        responseLeadIndividual = given().accept(ContentType.JSON).
                get(uri);
    }

    @Then("^a user get the status code 200 as a response from the nba lead api where customer type is individual$")
    public void validate_nba_lead_API_response_is_oK() {
        responseValidation.validateResponseOk(responseLeadIndividual);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba lead api where customer type is individual$")
    public void respose_nba_lead_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "";
        responseValidation.responseStringValueCompare(param, responseLeadIndividual, key, value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as a refrence id to get the response from nba api where customer type is corporate$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_a_refrence_id_to_get_the_response_from_nba_api_where_customer_type_is_corporate(String mdmId, String refrenceID) throws Throwable {
        uri = uri.concat(mdmId).concat("/").concat(refrenceID);
        responseLeadCorporate = given().accept(ContentType.JSON).
                get(uri);
    }

    @Then("^a user get the status code 200 as a response from the nba lead api where customer type is corporate$")
    public void a_user_get_the_status_code_as_a_response_from_the_nba_lead_api_where_customer_type_is_corporate() throws Throwable {
        responseValidation.validateResponseOk(responseLeadCorporate);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba lead api where customer type is corporate$")
    public void user_get_the_response_for_is_from_the_nba_lead_api_where_customer_type_is_corporate(String key, String value) throws Throwable {
        String param = "";
        responseValidation.responseStringValueCompare(param, responseLeadCorporate, key, value);
    }

    @When("^a genie user edits the \"([^\"]*)\" field by the \"([^\"]*)\"$")
    public void a_genie_user_enters_the_as(String key, String value) throws Throwable {
        codeEditRemark = responseValidation.putOperation(uri, key, value);
    }

    @Then("^user validates remarks modify successfully$")
    public void user_validates_remarks_modify_successfully() throws Throwable {
        Assert.assertEquals(codeEditRemark, 200);
    }

    @Then("^a user get empty List as response$")
    public void a_user_get_empty_List_as_response() throws Throwable {
        responseValidation.responseEmpty(responseIndividual);
    }

    @Then("^user get the only records which have open status and we know only (\\d+) records having open status$")
    public void user_get_the_only_records_which_have_open_status_and_we_know_only_records_having_open_status(int count) throws Throwable {
        responseValidation.compareEqualCount(responseIndividual,count);
    }
    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba api where customer type is corporate and field is of boolean type$")
    public void respose_corporate_for_key_and_value_is_boolean_type(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseBooleanValueCompare(param,responseCorporate,key,value);
    }

}
