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
public class RoleMapping {


    public static Response response;
    public static String uri,accessToken,value;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^I want to execute the Role Mapping API$")
    public void i_want_to_execute_the_Role_Mapping_API() throws Throwable {
        value="/api/genie/roleMapping";
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
        accessToken  = TokenGenerator.getToken();
    }

    @When("^I pass status as \"([^\"]*)\" and submit the Get request$")
    public void i_pass_status_as_and_submit_the_Get_request(String value) throws Throwable {
        response = given().relaxedHTTPSValidation().accept(ContentType.JSON).
                header("Authorization", accessToken).
                param("status", value).
                get(uri);
    }

    @Then("^I validate \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_validate_and(String field,String key, String value) throws Throwable {
        String param ="records".concat(".").concat(field);
        responseValidation.responseCompareForStringValue(param,response,key,value);

    }





}
