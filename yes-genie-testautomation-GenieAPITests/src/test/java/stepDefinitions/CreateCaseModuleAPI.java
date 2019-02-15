package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;
import pages.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class CreateCaseModuleAPI {

    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a createcasemodule api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_createcasemodule_api_to_test_is(String value) throws Throwable {
        uri=value;
    }

    @When("^user pass crm_id \"([^\"]*)\"$")
    public void user_pass_crm_id(String value) throws Throwable {
        uri =uri.concat(value);
    }

    @When("^get the response from createcasemodule api$")
    public void get_the_response_from_createcasemodule_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseIndividual = given().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
    }
    @When("^get the response from createcasemodule api for corporate$")
    public void get_the_response_from_createcasemodule_api_for_corportate() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseCorporate = given().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
    }

    @Then("^a user get the status code (\\d+) as a response from the createcasemodule api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcasemodule_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^user get the response  with issueTypeId (\\d+) in createcasemodule api where customer type is individual$")
    public void user_get_the_response_with_issueTypeId_in_createcasemodule_api_where_customer_type_is_individual(int arg1) throws Throwable {
        String param ="issueTypeId";
        responseValidation.responseIntValueCompare(param, responseIndividual,arg1);
    }


    @Then("^user get the response  \"([^\"]*)\" is \"([^\"]*)\" from the createcasemodule api where customer type is individual$")
    public void user_get_the_response_is_from_the_createcasemodule_api_where_customer_type_is_individual(String arg1, String arg2) throws Throwable {
        String param= "" ;
        responseValidation.responseStringValueCompare(param, responseIndividual, arg1, arg2);
    }


    @Then("^a user get the blank response from the createcasemodule api where customer type is individual$")
    public void a_user_get_the_blank_response_from_the_createcasemodule_api_where_customer_type_is_individual() throws Throwable {
       responseValidation.responseStringValueContains(responseIndividual, "");
    }

    @Then("^a user get the status code (\\d+) as a response from the createcasemodule api where customer type is corporate$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcasemodule_api_where_customer_type_is_corporate(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseCorporate);
    }

    @Then("^user get the response  with issueTypeId (\\d+) in createcasemodule api where customer type is corporate$")
    public void user_get_the_response_with_issueTypeId_in_createcasemodule_api_where_customer_type_is_corporate(int arg1) throws Throwable {
        String param ="issueTypeId";
        responseValidation.responseIntValueCompare(param, responseCorporate,arg1);
    }


    @Then("^user get the response  \"([^\"]*)\" is \"([^\"]*)\" from the createcasemodule api where customer type is corporate$")
    public void user_get_the_response_is_from_the_createcasemodule_api_where_customer_type_is_corporate(String arg1, String arg2) throws Throwable {
        String param= "" ;
        responseValidation.responseStringValueCompare(param, responseCorporate, arg1, arg2);
    }



}
