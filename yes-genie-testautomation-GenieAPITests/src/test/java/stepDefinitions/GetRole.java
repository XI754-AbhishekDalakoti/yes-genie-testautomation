package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.given;

/**
 * Created by Prabhat Arya on  Apr,10 2019
 **/

public class GetRole {
    public static Response response;
    public static String uri,accessToken,value;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^I want to execute the GetRole API$")
    public void i_want_to_execute_the_GetRole_API() throws Throwable {
        value="/api/genie/config";
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
        accessToken  = TokenGenerator.getToken();
    }

    @When("^I submit the GET request$")
    public void i_submit_the_GET_request() throws Throwable {
        response = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(response.body().asString());

    }

    @Then("^I get the status code (\\d+) as a response$")
    public void i_get_the_status_code_as_a_response(int code) throws Throwable {
        responseValidation.compareResponseCode(response,code);

    }

    @Given("^I pass blank in Authorization header$")
    public void i_pass_blank_in_Authorization_header() throws Throwable {
        accessToken  ="";
    }


    @Then("^I get \"([^\"]*)\" value$")
    public void i_get_value(String key) throws Throwable {

    }



}
