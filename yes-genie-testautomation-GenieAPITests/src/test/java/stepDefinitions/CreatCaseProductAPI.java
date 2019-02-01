package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;

import static net.serenitybdd.rest.SerenityRest.given;

public class CreatCaseProductAPI {

    public static Response responseIndividual, responseCorporate;
    public static String uri;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^get the response from createcaseproduct api$")
    public void get_the_response_from_createcaseproduct_api() throws Throwable {
        responseIndividual = given().accept(ContentType.JSON).get(uri);
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