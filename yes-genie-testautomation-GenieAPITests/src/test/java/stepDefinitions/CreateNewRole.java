package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

/**
 * Created by Prabhat Arya on  Apr,10 2019
 **/
public class CreateNewRole {

    public static Response response;
    public static String uri,accessToken,value;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^I want to execute the Create new role API$")
    public void i_want_to_execute_the__API() throws Throwable {
        value="/api/genie/rolemapping/";
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
        accessToken  = TokenGenerator.getToken();
    }

    @When("^I submit the POST request$")
    public void i_submit_the_POST_request() throws Throwable {
        String body ="{ \"role\":\"Administrator\", \"requestReferenceNo\":\"GEN-1234\", \"config\": { \"search\":[1,2], \"widget\":[1,2], \"transactions\":[1,2] } }";
        response = given().relaxedHTTPSValidation().accept(ContentType.JSON).
                header("Authorization", accessToken).
                body(body).
                post(uri);
    }



}
