package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

import static net.serenitybdd.rest.SerenityRest.given;

public class Transactions extends ResponseValidation {

    public static Response response;
    public static Response responseAccessToken;
    public static String uri, uriAccessToken, accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^I want to execute the transaction API \"([^\"]*)\"$")
    public void a_genie_user_has_a_transaction_api_to_test(String value) {
        uri = UriHelper.uricheck();
        uri =uri.concat(value);
    }

    @When("^I pass attribute \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" and send post request$")
    public void user_sends_post_request(String firstfilter,String firstfiltervalue,String secondfilter,String secondfiltervalue1,String secondfiltervalue2) {
        accessToken  = TokenGenerator.getToken();
        JSONObject finalObj = new JSONObject();
        JSONArray filter = new JSONArray();

        JSONObject filter1 = new JSONObject();
        ArrayList<String> filterList1 = new ArrayList<String>();
        filterList1.add(firstfiltervalue);
        filter1.put("filterType", firstfilter);
        filter1.put("filterValues", filterList1);

        JSONObject filter2 = new JSONObject();
        ArrayList<String> filterList2 = new ArrayList<String>();
        filterList2.add(secondfiltervalue1);
        filterList2.add(secondfiltervalue2);
        filter2.put("filterType", secondfilter);
        filter2.put("filterValues", filterList2);

        filter.add(filter1);
        filter.add(filter2);

        finalObj.put("filterList", filter);

        response = given().relaxedHTTPSValidation().header("Authorization", accessToken).accept(ContentType.JSON).
                header("Content-Type", "application/json")
                .body(finalObj).post(uri);
    }

    @Then("^I get success status code 200 as response$")
    public void verify_success_status_code_200(){
        responseValidation.validateResponseOk(response);
    }

    @Then("^I get failure status code 500 as response$")
    public void verify_failure_status_code_500(){
        responseValidation.validateResponseBadRequest(response);
    }

    @Then("^I get status code 400 as bad request in response$")
    public void verify_bad_request_status_code_400(){
        responseValidation.validateBadRequest(response);
    }

    @And("^I verify the key \"([^\"]*)\" as \"([^\"]*)\" in the response$")
    public void verify_key_and_value_in_the_response(String key,String value){
        String param = "[0].";
        responseValidation.responseStringValueCompare(param,response,key,value);
    }

    @And("^I verify key \"([^\"]*)\" as \"([^\"]*)\"$")
    public void verify_key_and_value_in_response(String key,int value){
        String param = "";
        responseValidation.responseIntValueCompare(param,response,key,value);
    }
}
