package stepDefinitions;

import com.google.gson.JsonObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.ArrayList;

import static net.serenitybdd.rest.SerenityRest.given;

/**
 * Created by Prabhat Arya on  Apr,10 2019
 **/
public class RoleMapping {


    public static Response response;
    public static String uri,accessToken,value;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^I want to execute the Role Mapping API \"([^\"]*)\"$")
    public void i_want_to_execute_the_Role_Mapping_API(String value) throws Throwable {
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

    @Then("^I get status code 200 as response$")
    public void i_get_status_code_200_as_response() throws Throwable {
        responseValidation.validateResponseOk(response);
    }

    @Then("^I get status code 400 as response$")
    public void i_get_status_code_400_as_response() throws Throwable {
        responseValidation.validateBadRequest(response);
    }

    @And("^I verify the \"([^\"]*)\" and \"([^\"]*)\" in the response$")
    public void i_verify_key_value_pairs(String key,String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param,response,key,value);
    }

    @Then("^I validate \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_validate_and(String field,String key, String value) throws Throwable {
        String param ="records".concat(".").concat(field);
        responseValidation.responseCompareForStringValue(param,response,key,value);

    }

    @When("^I pass role as \"([^\"]*)\" and requestReferenceNo \"([^\"]*)\" and config numbers as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_pass_role_and_reference_number_and_config(String rolename,String refno,String searchno,String widgetno,String transactionsno) throws Throwable {
        JSONObject userRole = new JSONObject();
        JSONObject configObject = new JSONObject();
        ArrayList<String> searchConfig = new ArrayList<String>();
        ArrayList<String> widgetConfig = new ArrayList<String>();
        ArrayList<String> transactionConfig = new ArrayList<String>();
        searchConfig.add(searchno);
        widgetConfig.add(widgetno);
        transactionConfig.add(transactionsno);

        configObject.put("search",searchConfig);
        configObject.put("widget",widgetConfig);
        configObject.put("transactions",transactionConfig);


        userRole.put("role", rolename);
        userRole.put("config", configObject);
        userRole.put("requestReferenceNo", refno);

        System.out.println("userRole***************: " + userRole);

        response = given().relaxedHTTPSValidation().header("Authorization", accessToken).accept(ContentType.JSON).
                header("Content-Type", "application/json")
                .body(userRole).
                        post(uri);
    }



}
