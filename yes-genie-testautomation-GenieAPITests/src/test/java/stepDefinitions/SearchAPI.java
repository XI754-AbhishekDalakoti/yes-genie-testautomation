package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import utils.SetupConfiguration;

import static net.serenitybdd.rest.SerenityRest.given;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static utils.Utilities.matchesJsonSchema;

/**
 * Created by vibhu on 11/13/2018.
 */
public class SearchAPI extends SetupConfiguration {

    public static Response response;
    public static String uri;

    @When("^a user search with value \"([^\"]*)\" and setting value for threshold \"([^\"]*)\"$")
    public void getTheResponseOfTheApiByPassingParametersDirectly(String query, String isCustomerId, String thresholdValue) {
        response = given().accept(ContentType.JSON).
                param("query", query).
                param("threshold", thresholdValue).
                get(uri);
    }

    @Given("^api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;
    }

    @Then("^a user get the status code 200 as a response from the api$")
    public void validateAPIisOK() {
        response.
                then().assertThat().statusCode(HttpStatus.SC_OK);
    }

    @Then("^user get status code is 400 as response from the api$")
    public void validateAPIis400() {
        response.
                then().assertThat().statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    @Then("^result for custid in search parameter is \"([^\"]*)\"$")
    public void result_for_custid_in_search_parameter_is(String value) throws Throwable {
        response.then().
                body("searchParams['custId'][0]".toString(), is(value));
    }

    @Then("^user get the response from the api for the initial record for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void respose_for_key_and_value_is(String key, String value) throws Throwable {
        response.then().
                body(("records[0].".concat(key)), is(value));
    }

    @Then("^user get the response from the api for initial record of numeric type for \"([^\"]*)\" is (\\d+)$")
    public void result_for_numeric_is(String key, int value) throws Throwable {
        response.then().
                body("records[0].".concat(key), is(value));
    }

    @Then("^user get the response from the api and count of records is more than (\\d+)$")
    public void result_for_count_is(int value) throws Throwable {
        response.then().
                body("count", greaterThanOrEqualTo(value));
    }

    @Then("^user get the response from the api as \"([^\"]*)\"$")
    public void result_as_response_is(String value) throws Throwable {
        boolean b = Boolean.parseBoolean(value);
        response.then().
                body("records[0].customerSearchEnabled", is(b));
    }

    @Then("^search api response json schema is validated successfully$")
    public void reponse_schema_is_validated_successfully() throws Throwable {
        response.then().
                body(matchesJsonSchema("searchAPISchema.json"));
    }
}
