package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static net.serenitybdd.rest.SerenityRest.given;
import static utils.Utilities.matchesJsonSchema;

/**
 * Created by vibhu on 11/26/2018.
 */
public class CreateUserAPI {

    public static Response response;
    public static Response responseUpdatedRoleContractBaseApi;
    public static String uri;

    @When("^a genie user creates a user$")
    public void getTheResponseOfTheApiByPassingParametersDirectly(String query, String thresholdValue) {
        response = given().accept(ContentType.JSON).
                param("query", query).
                param("threshold", thresholdValue).
                get(uri);
    }

    @Given("^api to test create user is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;
    }

    @Then("^json schema response of \"([^\"]*)\" is validated successfully$")
    public void reponse_schema_search_user_is_validated_successfully(String fileName) throws Throwable {
        response.then().
                body(matchesJsonSchema(fileName));
    }

    @When ("^a genie user searches the role on user management tab$")
    public void getResponseFromUpdatedRoleContractBaseApi(){
        responseUpdatedRoleContractBaseApi = given().accept(ContentType.JSON).
                  get(uri);
    }

}
