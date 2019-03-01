package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import helper.ResponseValidation;
import helper.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class CreateCaseAdditionalFieldsAPI {
    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a createcaseadditionfields api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_createcaseadditionfields_api_to_test_is(String arg1) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(arg1);
    }

    @When("^user pass mdmid \"([^\"]*)\" in createcaseadditionfields api$")
    public void user_pass_mdmid(String arg1) throws Throwable {
        uri=uri.concat(arg1);


    }

    @When("^user pass reference_number \"([^\"]*)\" in createcaseadditionfields api$")
    public void user_pass_reference_number(String arg1) throws Throwable {
        uri=uri.concat("/").concat(arg1);
    }



    @When("^user pass crm_id \"([^\"]*)\" in createcaseadditionfields api$")
    public void user_pass_crm_id(String arg1) throws Throwable {
        uri=uri.concat("/").concat(arg1);
    }

    @When("^get the response from createcaseadditionfields api$")
    public void get_the_response_from_createcaseadditionfields_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseIndividual=given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);


    }

    @Then("^a user get the status code (\\d+) as a response from the createcaseadditionfields api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcaseadditionfields_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);

    }

    @Then("^user get the response  with issueTypeId (\\d+) in createcaseadditionfields api where customer type is individual$")
    public void user_get_the_response_with_issueTypeId_in_createcaseadditionfields_api_where_customer_type_is_individual(int arg1) throws Throwable {
        String param ="issueTypeId";
        responseValidation.responseIntValueCompare(param,responseIndividual,arg1);
    }

    @Then("^user get the response  with fieldReq (\\d+) in createcaseadditionfields api where customer type is individual$")
    public void user_get_the_response_with_fieldReq_in_createcaseadditionfields_api_where_customer_type_is_individual(int arg1) throws Throwable {
        String param ="additionalFields[6].fieldReq";
        responseValidation.responseIntValueCompare(param,responseIndividual,arg1);

    }

    @Then("^user get the response  with maxLength (\\d+) in createcaseadditionfields api where customer type is individual$")
    public void user_get_the_response_with_maxLength_in_createcaseadditionfields_api_where_customer_type_is_individual(int arg1) throws Throwable {
        String param ="additionalFields[6].maxLength";
        responseValidation.responseIntValueCompare(param,responseIndividual,arg1);

    }

    @Then("^user get the response  with value \"([^\"]*)\" in createcaseadditionfields api where customer type is individual$")
    public void user_get_the_response_with_value_No_Yes_in_createcaseadditionfields_api_where_customer_type_is_individual(String values) throws Throwable {
        String param ="additionalFields[6].values[0]";
        responseValidation.responseStringValueCompare(param,responseIndividual,values);

    }

    @Then("^user get the response  \"([^\"]*)\" is \"([^\"]*)\" from the createcaseadditionfields api where customer type is individual$")
    public void user_get_the_response_is_from_the_createcaseadditionfields_api_where_customer_type_is_individual(String arg1, String arg2) throws Throwable {
            String param ="additionalFields[6].";
            responseValidation.responseStringValueCompare(param,responseIndividual,arg1,arg2);

    }

    @When("^get the response from createcaseadditionfields api for corporate$")
    public void get_the_response_from_createcaseadditionfields_api_for_corporate() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseCorporate=given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);

    }

    @Then("^a user get the status code (\\d+) as a response from the createcaseadditionfields api where customer type is corporate$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcaseadditionfields_api_where_customer_type_is_corporate(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseCorporate);

    }

    @Then("^user get the response  with issueTypeId (\\d+) in createcaseadditionfields api where customer type is corporate$")
    public void user_get_the_response_with_issueTypeId_in_createcaseadditionfields_api_where_customer_type_is_corporate(int arg1) throws Throwable {
        String param ="issueTypeId";
        responseValidation.responseIntValueCompare(param,responseCorporate,arg1);

    }

    @Then("^user get the response  with fieldReq (\\d+) in createcaseadditionfields api where customer type is corporate$")
    public void user_get_the_response_with_fieldReq_in_createcaseadditionfields_api_where_customer_type_is_corporate(int arg1) throws Throwable {
        String param ="additionalFields[0].fieldReq";
        responseValidation.responseIntValueCompare(param,responseCorporate,arg1);

    }

    @Then("^user get the response  with maxLength (\\d+) in createcaseadditionfields api where customer type is corporate$")
    public void user_get_the_response_with_maxLength_in_createcaseadditionfields_api_where_customer_type_is_corporate(int arg1) throws Throwable {
        String param ="additionalFields[0].maxLength";
        responseValidation.responseIntValueCompare(param,responseCorporate,arg1);

    }

    @Then("^user get the response  \"([^\"]*)\" is \"([^\"]*)\" from the createcaseadditionfields api where customer type is corporate$")
    public void user_get_the_response_is_from_the_createcaseadditionfields_api_where_customer_type_is_corporate(String arg1, String arg2) throws Throwable {
        String param ="additionalFields[0].";
        responseValidation.responseStringValueCompare(param,responseCorporate,arg1,arg2);

    }

    @Then("^a user get the blank response from the createcaseadditionfields api where customer type is individual$")
    public void a_user_get_the_blank_response_from_the_createcaseadditionfields_api_where_customer_type_is_individual() throws Throwable {
        String param ="additionalFields[0]";
        responseValidation.responseNullValueCompare(param,responseIndividual);

    }

}
