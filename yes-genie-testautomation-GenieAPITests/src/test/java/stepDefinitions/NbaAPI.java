package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import helper.ResponseValidation;
import helper.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

/**
 * Created by vibhu on 12/19/2018.
 */
public class NbaAPI {

    public static Response responseIndividual, responseCorporate, responseLeadIndividual, responseLeadCorporate,responseBlacklist;
    public static String uri,accessToken;
    public int codeEditRemark;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^a genie user has a nba api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from nba api where customer type is individual$")
    public void get_the_response_of_the_Api_by_passing_parameters_directly(String mdmid) {
        uri = uri.concat(mdmid);
        accessToken = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
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
        String param = "[0].additionalInfo.";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^a user get the status code 200 as a response from the nba api where customer type is individual$")
    public void validate_demographic_API_response_is_oK() {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^a user get the status code 500 as a response from the nba lead api where customer type is individual$")
    public void validate_demographic_API_response_is_bad_request() {
        responseValidation.validateResponseBadRequest(responseLeadIndividual);
    }

    @Then("^a user get the status code 204 as a response from the nba lead api where customer type is individual$")
    public void validate_demographic_API_response_is_no_content() {
        responseValidation.validateResponseNoContent(responseLeadIndividual);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from nba api where customer type is corporate$")
    public void get_the_response_of_the_Api_by_passing_mdmId_directly(String mdmid) {
        uri = uri.concat(mdmid);
        accessToken = TokenGenerator.getToken();
        responseCorporate = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
                get(uri);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" from the nba api where customer type is corporate$")
    public void respose_for_nba_key_and_value_is(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^user get the response for \"([^\"]*)\" is \"([^\"]*)\" as additional info from the nba api where customer type is corporate$")
    public void respose_nba_as_additional_info_for_key_and_value_is(String key, String value) throws Throwable {
        String param = "[0].additionalInfo.";
        responseValidation.responseStringValueCompare(param, responseCorporate, key, value);
    }

    @Then("^a user get the status code 200 as a response from the nba api where customer type is corporate$")
    public void validate_demographic_API_response_is_oK_for_corporate$() {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @When("^a genie user passes the \"([^\"]*)\" as action codes to get the response from nba api where customer type is individual$")
    public void get_the_response_of_the_Api_by_passing_parameters_directly_for_action_code_individual(String actionCode) {
        accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
                param("query", actionCode).
                get(uri);
    }

    @When("^a genie user passes the \"([^\"]*)\" as action codes to get the response from nba api where customer type is corporate")
    public void get_the_response_of_the_Api_by_passing_parameters_directly_for_action_code_corporate(String actionCode) {
        accessToken  = TokenGenerator.getToken();
        responseCorporate = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
                param("query", actionCode).
                get(uri);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as a refrence id to get the response from nba api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_a_refrence_id_to_get_the_response_from_nba_api_where_customer_type_is_individual(String mdmId, String refrenceID) throws Throwable {
        uri = uri.concat(mdmId).concat("/").concat(refrenceID);
        accessToken  = TokenGenerator.getToken();
        responseLeadIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
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
        accessToken = TokenGenerator.getToken();
        responseLeadCorporate = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
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


    @When("^a genie user edits the \"([^\"]*)\" field by the \"([^\"]*)\" where \"([^\"]*)\"is \"([^\"]*)\" and \"([^\"]*)\" is \"([^\"]*)\"$")
    public void a_genie_user_edits_the_field_by_the_where_is_and_is(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        codeEditRemark = responseValidation.putOperationForThreeKeys(uri, arg1, arg2,arg3,arg4,arg5,arg6);
    }



    @Then("^user validates remarks modify successfully$")
    public void user_validates_remarks_modify_successfully() throws Throwable {
        Assert.assertEquals(200,codeEditRemark);
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

    @Given("^a genie user has a blacklist api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_blacklist_api_to_test_is(String value) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as action codes to get the response from blacklist api$")
    public void a_genie_user_passes_the_as_action_codes_to_get_the_response_from_blacklist_api(String actionCodeValue) throws Throwable {
        uri=uri.concat("/").concat(actionCodeValue);
        accessToken  = TokenGenerator.getToken();
        responseBlacklist = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
                get(uri);
    }

    @Then("^a user get the status code 200 as a response from the blacklist api and \"([^\"]*)\" as a message in body$")
    public void a_user_get_the_status_code_as_a_response_from_the_blacklist_api_as_a_message_in_body(String message) throws Throwable {
        responseValidation.validateResponseOk(responseBlacklist,message);
    }


    @Then("^a user get the status code 200 as a response from the blacklist api$")
    public void a_user_get_the_status_code_as_a_response_from_the_blacklist_api() throws Throwable {
        responseValidation.validateResponseOk(responseBlacklist);
    }

    @Then("^user get the reason \"([^\"]*)\" from the blacklist api$")
    public void user_get_the_reason_from_the_blacklist_api(String reason) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseBlacklist, reason);
    }

    @Then("^a user get empty List as response from blacklist api$")
    public void a_user_get_empty_List_as_response_from_blacklist_api() throws Throwable {
        responseValidation.responseEmpty(responseBlacklist);
    }

    @Given("^a genie user has a dismissal api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_dismissal_api_to_test_is(String value) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as a refrence id to get the response from dismissal api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_a_refrence_id_to_get_the_response_from_dismissal_api_where_customer_type_is_individual(String mdmId, String refrenceID) throws Throwable {
        uri = uri.concat("/").concat(mdmId).concat("/").concat(refrenceID);
       /* accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).
                get(uri);*/
    }

    @When("^a genie user edits the \"([^\"]*)\" field by the \"([^\"]*)\" and \"([^\"]*)\" field by the \"([^\"]*)\" to see \"([^\"]*)\" from dismissal api where customer type is individual$")
    public void a_genie_user_edits_the_field_by_the_to_get_the_response_from_dismissal_api_where_customer_type_is_individual(String keyOne, String valueOne,String keyTwo, String valueTwo,String body) throws Throwable {
        codeEditRemark = responseValidation.putOperationForTwoKeys(uri, keyOne, valueOne,keyTwo,valueTwo,body);
    }

    @Then("^user validates response code to validate fields modify successfully for dismissal$")
    public void user_validates_response_code_to_validate_fields_modify_successfully() throws Throwable {
        Assert.assertEquals(200,codeEditRemark );

    }

    @Then("^user validates the response code to validate fields modify unsuccessfully$")
    public void user_validates_response_code_to_validate_fields_modify_unsuccessfully() throws Throwable {
        Assert.assertEquals(500,codeEditRemark);
    }

    @Then("^user validates the response body as \"([^\"]*)\" in response$")
    public void user_validates_the_response_body_as_in_response(String value) throws Throwable {
        Assert.assertEquals(value,responseLeadIndividual.body().asString());
    }

    @Given("^a genie user has a defer api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_defer_api_to_test_is(String value) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as a refrence id to get the response from defer api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_a_refrence_id_to_get_the_response_from_defer_api_where_customer_type_is_individual(String mdmId, String refrenceID) throws Throwable {
        uri = uri.concat("/").concat(mdmId).concat("/").concat(refrenceID);
        /*accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken)
                .get(uri);*/
    }

    @When("^a genie user edits the \"([^\"]*)\" field by the \"([^\"]*)\" and \"([^\"]*)\" field by the \"([^\"]*)\" and \"([^\"]*)\" field by the \"([^\"]*)\" to see \"([^\"]*)\" as body from defer api where customer type is individual$")
    public void a_genie_user_edits_the_field_by_the_and_field_by_the_and_field_by_the_to_see_from_defer_api_where_customer_type_is_individual(String keyOne, String valueOne, String keyTwo, String valueTwo, String keyThree, String valueThree, String body) throws Throwable {
        codeEditRemark = responseValidation.putOperationForThreeKeys(uri, keyOne, valueOne,keyTwo,valueTwo,keyThree,valueThree,body);
    }

    @Then("^user validates response code to validate fields modify successfully for defer$")
    public void user_validates_response_code_to_validate_fields_modify_successfully_for_defer() throws Throwable {
        Assert.assertEquals(codeEditRemark, 200);
    }

    @Then("^user validates the response code to validate fields modify unsuccessfully for defer$")
    public void user_validates_the_response_code_to_validate_fields_modify_unsuccessfully_for_defer() throws Throwable {
        Assert.assertEquals(codeEditRemark, 500);
    }
}
