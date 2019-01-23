package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;

import static net.serenitybdd.rest.SerenityRest.given;

public class PortfolioAPI {

    public static Response responseIndividual, responseCorporate;
    public static String uri;
    ResponseValidation responseValidation = new ResponseValidation();


    @Given("^a genie user has a portfolio api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_portfolio_api_to_test_is(String value) {
        uri =value;
    }

    @When("^a genie user passes the \"([^\"]*)\" as a mdmid to get the response from portfolio api where customer type is individual$")
    public void a_genie_user_passes_the_as_a_mdmid_to_get_the_response_from_portfolio_api_where_customer_type_is_individual(String mdmid) {
        uri = uri.concat(mdmid);
    }

    @When("^get the response from portfolio api$")
    public void get_the_response_from_portfolio_api() throws Throwable {
        responseIndividual = given().accept(ContentType.JSON).get(uri);
        System.out.print(responseIndividual.body().asString());
    }


    @Then("^a user get the status code (\\d+) as a response from the portfolio api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_portfolio_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.validateResponseOk(responseIndividual);
    }



    @Then("^productCategory will be LOANS \"([^\"]*)\" and total \"([^\"]*)\"$")
    public void productcategory_will_be_LOANS_and_total(String arg1, String arg2) throws Throwable {
        String param1 = "[0].productCategory";
        System.out.print("param1 is " +param1);
        String param2 ="[0].total";
        System.out.print("param2 is " +param2);
        responseValidation.responseStringValueCompare(param1,responseIndividual,arg1);
        responseValidation.responseStringValueCompare(param2,responseIndividual,arg2);
    }

    @Then("^user get the response for productCategory loans \"([^\"]*)\" is \"([^\"]*)\" from the portfolio api where customer type is individual$")
    public void user_get_the_response_for_productCategory_loans_is_from_the_portfolio_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "[0].portfolioProducts[0].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }


    @Then("^productCategory will be OTHERS \"([^\"]*)\" and total \"([^\"]*)\"$")
    public void productcategory_will_be_OTHERS_and_total(String arg1, String arg2) throws Throwable {
        String param1 = "[1].productCategory";
        System.out.print("param1 is " +param1);
        String param2 ="[1].total";
        System.out.print("param2 is " +param2);
        responseValidation.responseStringValueCompare(param1,responseIndividual,arg1);
        responseValidation.responseStringValueCompare(param2,responseIndividual,arg2);
    }



    @Then("^user get the response for productCategory others \"([^\"]*)\" is \"([^\"]*)\" from the portfolio api where customer type is individual$")
    public void user_get_the_response_for_productCategory_others_is_from_the_portfolio_api_where_customer_type_is_individual(String key, String value) throws Throwable {
        String param = "[0].portfolioProducts[1].";
        responseValidation.responseStringValueCompare(param, responseIndividual, key, value);
    }

    @Then("^a user get empty Object as response from the portfolio api where customer type is individual$")
    public void a_user_get_empty_Object_as_response_from_the_portfolio_api_where_customer_type_is_individual() throws Throwable {
        responseValidation.validateNullObjectArray(responseIndividual);
    }

}