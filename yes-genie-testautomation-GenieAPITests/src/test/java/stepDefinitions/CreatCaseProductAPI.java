package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import helper.ResponseValidation;
import helper.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class CreatCaseProductAPI {

    public static Response responseIndividual, responseCorporate,responseAccessToken;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();
    public static String uriAccessToken="http://sso.yesgenie.com:30978/auth/realms/YBL/protocol/openid-connect/token";



//    @Given("^get access token first$")
//    public void getAccessToken() throws Throwable {
//        accessToken = TokenGenerator.getToken();
//    }
    @Given("^get the response from createcaseproduct api$")
    public void get_the_response_from_createcaseproduct_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
    }

    @Given("^a genie user has a createcaseproduct api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_createcaseproduct_api_to_test_is(String value) throws Throwable {
        uri =value;
    }

    @Then("^user get the response \"([^\"]*)\" from the createcaseproduct api where customer type is individual$")
    public void user_get_the_response_from_the_createcaseproduct_api_where_customer_type_is_individual(String arg1) throws Throwable {
        responseValidation.responseStringValueContains(responseIndividual,arg1);

    }



    @Then("^a user get the status code (\\d+) as a response from the createcaseproduct api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcaseproduct_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);

    }



}