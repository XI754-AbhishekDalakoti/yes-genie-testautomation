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
public class GetAus {

    public static Response response;
    public static String uri,accessToken,value;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^I want to execute the GetAus API$")
    public void i_want_to_execute_the_GetAus_API() throws Throwable {
        value="/api/genie/demographic/aus/";
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
        accessToken  = TokenGenerator.getToken();
    }

    @Given("^I pass \"([^\"]*)\" mdmid in the request$")
    public void i_pass_mdmid_in_the_request(String mdmid) throws Throwable {
        uri=uri.concat(mdmid);

    }

    @When("^I submit the GET request in getaus api$")
    public void i_submit_the_GET_request_in_getaus_api() throws Throwable {
        response = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(response.body().asString());

    }

    @Given("^I pass blank in Authorization header in getaus api$")
    public void i_pass_blank_in_Authorization_header_in_getaus_api() throws Throwable {
        accessToken  ="";
    }


    @Then("^I get the status code (\\d+) as a response in getaus api$")
    public void i_get_the_status_code_as_a_response_in_getaus_api(int code) throws Throwable {
        responseValidation.compareResponseCode(response,code);
    }




    @Then("^I validate the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_validate_the_and(String key, String value) throws Throwable {
        String param="[0].";
        responseValidation.responseCompareForStringValue(param,response,key,value);
    }

    @Then("^I validate the \"([^\"]*)\" field with value \"([^\"]*)\"$")
    public void i_validate_the_field_with_value(String key, String value) throws Throwable {
        String param="[0].accountNo[0]";
        responseValidation.responseStringValueCompare(param,response,value);

    }





}
