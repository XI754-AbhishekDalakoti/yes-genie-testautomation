package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.SetupConfiguration;

import static net.serenitybdd.rest.SerenityRest.given;
import static utils.Utilities.matchesJsonSchema;

/**
 * Created by vibhu on 11/26/2018.
 */
public class CreateUserAPI {

        public static Response response;
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
    @Then("^json schema response of search user api is validated successfully$")
    public void reponse_schema_search_user_is_validated_successfully() throws Throwable {
        response.then().
                body(matchesJsonSchema("searchUserApiOnCreateUserSchema.json"));
    }
    }
