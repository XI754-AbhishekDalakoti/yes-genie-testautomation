package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;
import pages.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class KPIAPI
{

    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a kpi api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_kpi_api_to_test_is(String value) throws Throwable {
        uri=value;
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from kpi api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_to_get_the_response_from_kpi_api_where_customer_type_is_individual(String mdmid) throws Throwable {
        uri = uri.concat(mdmid);
    }

    @When("^get the response from kpi api$")
    public void get_the_response_from_kpi_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        responseIndividual = given().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());
    }

    @Then("^a user get the status code (\\d+) as a response from the kpi api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_kpi_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);
    }

    @Then("^user get the response  \"([^\"]*)\" is \"([^\"]*)\" from the kpi api where customer type is individual$")
    public void user_get_the_response_is_from_the_portfolio_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);

    }

    @Then("^user get the response  \"([^\"]*)\" is \"([^\"]*)\" for currencyflag from the kpi api where customer type is individual$")
    public void user_get_the_response_is_for_currencyflag_from_the_portfolio_api_where_customer_type_is_individual(String key, Boolean value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }


    @Then("^a user get empty Object as response from the kpi api where customer type is individual$")
    public void a_user_get_empty_Object_as_response_from_the_kpi_api_where_customer_type_is_individual() throws Throwable {
        responseValidation.validateNullObjectArray(responseIndividual);
    }


}
