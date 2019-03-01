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

public class CreateCaseModulesAPI {

    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a createcasemodules api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_createcasemodules_api_to_test_is(String arg1) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(arg1);
    }

    @When("^user pass productname \"([^\"]*)\"$")
    public void user_pass_productname(String arg1) throws Throwable {
        uri = uri.concat(arg1);


    }

    @When("^get the response from createcasemodules api$")
    public void get_the_response_from_createcasemodules_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseIndividual =given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);

    }

    @Then("^a user get the status code (\\d+) as a response from the createcasemodules api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcasemodules_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);

    }

    @Then("^user get the response  with productname \"([^\"]*)\" in createcasemodules api where customer type is individual$")
    public void user_get_the_response_with_productname_in_createcasemodules_api_where_customer_type_is_individual(String arg1) throws Throwable {
        String param="productName";
        responseValidation.responseStringValueCompare(param,responseIndividual,arg1);

    }

    @Then("^user get the response for caseModuleAttributes  \"([^\"]*)\" is \"([^\"]*)\" from the createcasemodules api where customer type is individual$")
    public void user_get_the_response_for_caseModuleAttributes_is_from_the_createcasemodules_api_where_customer_type_is_individual(String arg1, String arg2) throws Throwable {
        String param="caseModuleAttributes[0].";
        responseValidation.responseStringValueCompare(param,responseIndividual,arg1,arg2);
    }



    @Then("^user get the response with issueTypeId (\\d+) from the createcasemodules api where customer type is individual$")
    public void user_get_the_response_with_issueTypeId_from_the_createcasemodules_api_where_customer_type_is_individual(int arg1) throws Throwable {
        String param="caseModuleAttributes[0].caseTypeAttribute[0].issueTypeId";
        responseValidation.responseIntValueCompare(param,responseIndividual,arg1);

    }

    @Then("^user get the response for caseTypeAttribute  \"([^\"]*)\" is \"([^\"]*)\" from the createcasemodules api where customer type is individual$")
    public void user_get_the_response_for_caseTypeAttribute_is_from_the_createcasemodules_api_where_customer_type_is_individual(String arg1, String arg2) throws Throwable {
        String param="caseModuleAttributes[0].caseTypeAttribute[0].";
        responseValidation.responseStringValueCompare(param,responseIndividual,arg1,arg2);

    }

    @Then("^a user get the blank response from the createcasemodules api where customer type is individualzzz$")
    public void a_user_get_the_blank_response_from_the_createcasemodules_api_where_customer_type_is_individualzzz() throws Throwable {
        String param="caseModuleAttributes[0]";
        responseValidation.responseNullValueCompare(param,responseIndividual);

    }

}
