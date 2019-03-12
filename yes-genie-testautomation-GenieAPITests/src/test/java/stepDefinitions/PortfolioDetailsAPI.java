package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import helper.ResponseValidation;
import helper.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class PortfolioDetailsAPI {

    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a portfoliodetails api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_portfoliodetails_api_to_test_is(String arg1) throws Throwable {
        uri = UriHelper.uricheck();
        uri =uri.concat(arg1);

    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as product type to get the response from portfoliodetails api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_product_type_to_get_the_response_from_portfoliodetails_api_where_customer_type_is_individual(String arg1, String arg2) throws Throwable {
        uri=uri.concat(arg1).concat("/").concat(arg2);

    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as product type to get the response from portfoliodetails api where customer type is customer$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_product_type_to_get_the_response_from_portfoliodetails_api_where_customer_type_is_customer(String arg1, String arg2) throws Throwable {
        uri=uri.concat(arg1).concat("/").concat(arg2);

    }

    @When("^get the response from portfoliodetails api$")
    public void get_the_response_from_portfoliodetails_api() throws Throwable {
        accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());

    }

    @Then("^a user get the status code (\\d+) as a response from the portfoliodetails api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_portfoliodetails_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.compareResponseCode(responseIndividual,arg1);

    }

    @When("^user get the response for productCategory loans \"([^\"]*)\" is \"([^\"]*)\" from the portfoliodetails api where customer type is individual$")
    public void user_get_the_response_for_productCategory_loans_is_from_the_portfoliodetails_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);

    }

    @Then("^a user get empty Object as response from the portfoliodetails api where customer type is individual$")
    public void a_user_get_empty_Object_as_response_from_the_portfoliodetails_api_where_customer_type_is_individual() throws Throwable {
        responseValidation.validateNullObjectArray(responseIndividual);

    }
}
