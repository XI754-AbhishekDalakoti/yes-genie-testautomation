package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;
import pages.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class PortfolioTrendAPI {
    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();



    @Given("^a genie user has a portfoliotrend api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_portfoliotrend_api_to_test_is(String arg1) throws Throwable {
        uri=arg1;


    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid and \"([^\"]*)\" as product type to get the response from portfoliotrend api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_and_as_product_type_to_get_the_response_from_portfoliotrend_api_where_customer_type_is_individual(String arg1, String arg2) throws Throwable {
        uri=uri.concat(arg1).concat("/").concat(arg2);

    }

    @When("^get the response from portfoliotrend api$")
    public void get_the_response_from_portfoliotrend_api() throws Throwable {
        accessToken  = TokenGenerator.getToken();
        responseIndividual = given().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());

    }

    @Then("^a user get the status code (\\d+) as a response from the portfoliotrend api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_portfoliotrend_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.compareResponseCode(responseIndividual,arg1);

    }

    @Then("^Verify data for account no \"([^\"]*)\"$")
    public void verify_data_for_account_no(String arg1) throws Throwable {
        responseValidation.responseStringValueContains(responseIndividual,arg1);


    }

    @Then("^user get the response for kpiTrendEntityMap BANK_AMB for account \"([^\"]*)\" is \"([^\"]*)\" from the portfoliotrend api where customer type is individual$")
    public void user_get_the_response_for_kpiTrendEntityMap_BANK_AMB_for_account_is_from_the_portfoliotrend_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "kpiTrendDetail[0].kpiTrendEntityMap.BANK_AMB[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);


    }


    @When("^user get the cumulative response for kpiTrendAggregatedData BANK_AMB \"([^\"]*)\" is \"([^\"]*)\" from the portfoliotrend api where customer type is individual$")
    public void user_get_the_cumulative_response_for_kpiTrendAggregatedData_BANK_AMB_is_from_the_portfoliotrend_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "kpiTrendAggregatedData.BANK_AMB[6].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }



    @When("^user get the response for kpiTrendEntityMap BANK_AQB \"([^\"]*)\" is \"([^\"]*)\" from the portfoliotrend api where customer type is individual$")
    public void user_get_the_response_for_kpiTrendEntityMap_BANK_AQB_is_from_the_portfoliotrend_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "kpiTrendDetail[1].kpiTrendEntityMap.BANK_AQB[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);


    }


}
