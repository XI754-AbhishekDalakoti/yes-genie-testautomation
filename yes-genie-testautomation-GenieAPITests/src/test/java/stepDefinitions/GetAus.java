package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import io.restassured.response.Response;


/**
 * Created by Prabhat Arya on  Apr,10 2019
 **/
public class GetAus {

    public static Response response;
    public static String uri,accessToken,value;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^I want to execute the GetAus API$")
    public void i_want_to_execute_the_GetAus_API() throws Throwable {
        value="/api/aus/";
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
        accessToken  = TokenGenerator.getToken();
    }

    @Given("^I pass \"([^\"]*)\" mdmid in the request$")
    public void i_pass_mdmid_in_the_request(String mdmid) throws Throwable {
        uri=uri.concat(mdmid);

    }

    @Then("^I validate the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_validate_the_and(String key, String value) throws Throwable {
        String param="records.";
        responseValidation.responseCompareForStringValue(param,response,key,value);
    }




}
