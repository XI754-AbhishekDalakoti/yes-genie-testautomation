package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;
import static net.serenitybdd.rest.SerenityRest.given;
import static org.hamcrest.Matchers.is;
import static utils.Utilities.matchesJsonSchema;

/**
 * Created by vibhu on 11/26/2018.
 */
public class CreateUserAPI extends ResponseValidation {

    public static Response response;
    public static Response responseUpdatedRoleContractBaseApi, responseSearchUserContractBaseApi, responseCreateUserContractBaseApi, responseGetCreatedUserContractBaseApi, responseModifyRoleContractBaseApi, responseDeleteContractBaseApi;
    public static String uri;
    ResponseValidation responseValidation = new ResponseValidation();

    @When("^a genie user creates a user$")
    public void getTheResponseOfTheApiByPassingParametersDirectly(String query, String thresholdValue) {
        response = given().accept(ContentType.JSON).
                param("query", query).
                param("threshold", thresholdValue).
                get(uri);
    }

    @Given("^a genie user has an api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;
    }

    @Then("^json schema response of \"([^\"]*)\" is validated successfully$")
    public void reponse_schema_search_user_is_validated_successfully(String fileName) throws Throwable {
        response.then().
                body(matchesJsonSchema(fileName));
    }

    @When("^a genie user searches the role on user management tab$")
    public void getResponseFromUpdatedRoleContractBaseApi() {
        responseUpdatedRoleContractBaseApi = given().accept(ContentType.JSON).
                get(uri);
    }

    @Then("^a genie user get the status code 200 as a response from the user management api$")
    public void validateAPIisOK() {
        responseValidation.validateResponseOk(responseUpdatedRoleContractBaseApi);
    }

    @Then("^a genie user get the \"([^\"]*)\" as a response from the user management api for the initial record$")
    public void respose_for_key_and_value_is(String param, String key, String value) throws Throwable {
        param = "roles[0].";
        responseValidation.responseStringValueCompare(param, responseUpdatedRoleContractBaseApi, key, value);
    }

    @When("^a genie user searches the user with the \"([^\"]*)\"$")
    public void getResponseFromSearchUserContractBaseApi(String userId) {
        responseSearchUserContractBaseApi = given().accept(ContentType.JSON).
                param("userId", userId).
                post(uri);
    }

    @Then("^a genie user get the status code 200 as a response from the search user api$")
    public void validateSearchUserAPIisOK() {
        responseValidation.validateResponseOk(responseSearchUserContractBaseApi);
    }

    @Then("^a genie user get the response from the search user api for the initial record for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void respose_for_search_user_api_key_and_value_is(String param, String key, String value) throws Throwable {
        param = "roles[0].";
        responseValidation.responseStringValueCompare(param, responseSearchUserContractBaseApi, key, value);
    }

    @Then("^a genie user get the status code 103 as a response from the search user api as user does not exist$")
    public void validateSearchUserHavingStatusCodeOneZeroThree(int value) {
        value = 103;
        responseValidation.compareResponseCode(response, value);
    }

    @Then("^a genie user get the status code 104 as a response from the search user api as user already exist$")
    public void validateSearchUserHavingStatusCodeOneZeroFour(int value) {
        value = 104;
        responseValidation.compareResponseCode(response, value);
    }

    @When("^a genie user creates the user with the \"([^\"]*)\"$")
    public void getResponseFromCreateUserContractBaseApi(String userId) {
        responseCreateUserContractBaseApi = given().accept(ContentType.JSON).
                param("userId", userId).
                post(uri);
    }

    @Then("^a genie user get the status code 200 as a response from the create user api$")
    public void validateCreateUserAPIisOK() {
        responseValidation.validateResponseOk(responseCreateUserContractBaseApi);
    }

    @When("^a genie user gets the user on view users page with the \"([^\"]*)\"$")
    public void getResponseFromgetCreatedUserContractBaseApi(String userId) {
        responseGetCreatedUserContractBaseApi = given().accept(ContentType.JSON).
                param("userId", userId).
                post(uri);
    }

    @Then("^a genie user get the status code 200 as a response from the view users api$")
    public void validateGetCreatedUserAPIisOK() {
        responseValidation.validateResponseOk(responseCreateUserContractBaseApi);
    }

    @When("^a genie user modify the \"([^\"]*)\" on view users page for the \"([^\"]*)\"$")
    public void getResponseFromModifyRoleContractBaseApi(String role, String userId) {
        responseModifyRoleContractBaseApi = given().accept(ContentType.JSON).
                param("role", role).
                param("userId", userId).
                post(uri);
    }

    @Then("^a genie user get the status code 200 as a response from the modify role api$")
    public void validateModifyRoleAPIisOK() {
        responseValidation.validateResponseOk(responseModifyRoleContractBaseApi);
    }

    @When("^a genie user delete the user on view users page for the \"([^\"]*)\"$")
    public void getResponseFromDeleteContractBaseApi(String userId) {
        responseDeleteContractBaseApi = given().accept(ContentType.JSON).
                param("userId", userId).
                post(uri);
    }

    @Then("^a genie user get the status code 200 as a response from the delete role api$")
    public void validateDeleteAPIisOK() {
        responseValidation.validateResponseOk(responseDeleteContractBaseApi);
    }
}
