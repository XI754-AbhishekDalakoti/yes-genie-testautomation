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

    @Given("^api to test is \"([^\"]*)\"$")
    public void apiValue(String value) {
        uri = value;

    }

    @When("^I set the base URL with query \"([^\"]*)\" and isCustomerId \"([^\"]*)\" and threshold \"([^\"]*)\"$")
    public void getTheResponseOfTheApi(String query, String isCustomerId, String thresholdValue) {
        response = given().accept(ContentType.JSON).
                param("query", query).
                param("isCustomerId", isCustomerId).
                param("threshold", thresholdValue).
                get(uri);

    }

    @Then("^I validate the status is OK$")
    public void validateAPIisOK() {


        response.
                then().assertThat().statusCode(HttpStatus.SC_OK);

    }

    @Then("^I validate the status code is 400$")
    public void validateAPIis400() {


        response.
                then().assertThat().statusCode(HttpStatus.SC_BAD_REQUEST);

    }

    @Then("^result for custid in search parameter is \"([^\"]*)\"$")
    public void result_for_custid_in_search_parameter_is(String value) throws Throwable {

        response.then().
                body("searchParams['custId'][0]".toString(), is(value));
    }

    @Then("^the result for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void result_for_is(String key, String value) throws Throwable {

        response.then().
                body(("records[0].".concat(key)), is(value));

    }


    @Then("^the result for numeric \"([^\"]*)\" is (\\d+)$")
    public void result_for_numeric_is(String key, int value) throws Throwable {

        response.then().
                body("records[0].".concat(key), is(value));
    }
    @Then("^validate count is greater than (\\d+)$")
    public void result_for_count_is(int value) throws Throwable {

        response.then().
                body("count",greaterThanOrEqualTo(value));

    }

    @Then("^the result for boolean custId is \"([^\"]*)\"$")
    public void result_for_boolean_is(String value) throws Throwable {

        boolean b = Boolean.parseBoolean(value);
        response.then().
                body("records[0].customerSearchEnabled", is(b));
    }


    @Then("^the result for boolean customerSearchEnabled is \"([^\"]*)\"$")
    public void result_for_boolean_customerSearchEnabled_is(String value) throws Throwable {

        boolean b = Boolean.parseBoolean(value);
        response.then().
                body("records[0].customerSearchEnabled", is(b));
    }


    @Then("^search api response schema is validated successfully$")
    public void reponse_schema_is_validated_successfully() throws Throwable {

        response.then().
                body(matchesJsonSchema("searchAPISchema.json"));
    }

}
