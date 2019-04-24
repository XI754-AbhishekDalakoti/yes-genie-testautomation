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
import java.util.concurrent.SynchronousQueue;

import static net.serenitybdd.rest.SerenityRest.given;

public class UserManagementFlow {

    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a UserManagement api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_UserManagement_api_to_test_is(String value) {
        uri = UriHelper.uricheck();
        uri = uri.concat(value);
    }

    @When("^get the response from UserManagement api$")
    public void get_the_response_from_UserManagement_api() {
        System.out.println("public void a_user_get_the_status_code_as_a_response_from_the_UserManagement_api(int");
        accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());
    }
    @Then("^a user get the status code 200 as a response from the UserManagement api$")
    public void a_user_get_the_status_code_as_a_response_from_the_UserManagement_api() {
        System.out.println("a_user_get_the_status_code_as_a_response_from_the_UserManagement_api");
        responseValidation.validateResponseOk(responseIndividual);
    }

    @And ("^a user validates a node from response json$")
    public void a_user_validates_a_node_from_response_json() {
        int strVal = responseValidation.getAttributeIntValue(responseIndividual,"roles.Administrator.approveduserCount.");
        System.out.println("Value of node: "+ strVal );

    }

    //User validates the response code of UserManagement search user api
    @And("^user passes username \"([^\"]*)\" with the api url$")
    public void user_passes_username_with_api_url (String value) {
        uri = uri.concat(value);
    }

    @And("^user get the response for user information \"([^\"]*)\" is \"([^\"]*)\" from the usermanagement api$")
    public void user_get_the_response_for_user_information_from_the_usermanagement_api(String key, String value) throws Throwable {
        String param = "";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

        //User validates the response code of UserManagement create ap
    @And("^user passes role name as \"([^\"]*)\" and username as \"([^\"]*)\" and sends post request$")
    public void user_passes_rolename_and_username(String roleName, String userName) throws Throwable {

        accessToken  = TokenGenerator.getToken();

        JSONObject userRole = new JSONObject();
        ArrayList<String> user = new ArrayList<String>();
        user.add(userName);

        userRole.put("role", roleName);
        userRole.put("users", user);

        System.out.println("userRole***************: " + userRole);

        responseIndividual = given().relaxedHTTPSValidation().header("Authorization", accessToken).accept(ContentType.JSON).
                header("Content-Type", "application/json")
                .body(userRole).
                        post(uri);

    }

    @And("^a user validates response string$")
    public void a_user_validates_response_string() {
        responseValidation.responseStringValueContains(responseIndividual,"Request for user creation is raised successfully");
    }

    //User validates the response code of View UserManagement api
    //User validates the response code of detail view UserManagement search user api
    @When("^get the response from View UserManagement api$")
    public void get_the_response_from_View_UserManagement_api() {
        System.out.println("public void a_user_get_the_status_code_as_a_response_from_the_UserManagement_api(int");
        accessToken  = TokenGenerator.getTokenForAnotherUser();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());
}
    //User validates the response code of View UserManagement api
    @And ("^a user validates a node from view response json$")
    public void a_user_validates_a_node_from_view_response_json() {
        int strVal = responseValidation.getAttributeIntValue(responseIndividual, "roles.Administrator.approveduserCount.");
        System.out.println("Value of node: " + strVal);
        boolean boolVal = responseValidation.getAttributeBooleanValue(responseIndividual, "roles.Administrator.activityRequired.");
        System.out.println("Value of node2: " + boolVal);

    }
        //User validates the response code of detail view UserManagement search user api
        @And("^user get the response for user information \"([^\"]*)\" is \"([^\"]*)\" from the view UserManagement api$")
        public void user_get_the_response_for_user_information_from_the_view_usermanagement_api(String key, String value) throws Throwable {
            String param = "[0].";
            responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
}


    //User validates the response code of Approve UserManagement api
    @And("^user passes actionType as \"([^\"]*)\" and remarks as \"([^\"]*)\" and username as \"([^\"]*)\" and sends post request$")
    public void user_passes_rolename_and_username(String actionType, String remarks,String userName) throws Throwable {

        accessToken  = TokenGenerator.getTokenForAnotherUser();
        System.out.println("hi");

        JSONObject userVal = new JSONObject();
        ArrayList<String> user = new ArrayList<String>();
        user.add(userName);

        userVal.put("actionType", actionType);
        userVal.put("remarks", remarks);
        userVal.put("users", user);

        System.out.println("userRole: " + userVal);

        responseIndividual = given().relaxedHTTPSValidation().header("Authorization", accessToken).accept(ContentType.JSON).
                header("Content-Type", "application/json")
                .body(userVal).
                        post(uri);

    }
}
