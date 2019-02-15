package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.ResponseValidation;
import pages.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

/**
 * Created by vibhu on 1/11/2019.
 */
public class CreateLeadAPI extends ResponseValidation {

    public static Response response;
    public static String uri,accessToken;
    int codeSubmitLead;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a create lead lineofbusinesses api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_create_lead_lineofbusinesses_api_to_test_is(String value) throws Throwable {
        uri = value;
    }

    @Then("^a user get the status code 200 as a response from the create lead lineofbusinesses api$")
    public void a_user_get_the_status_code_as_a_response_from_the_create_lead_lineofbusinesses_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        response = given().accept(ContentType.JSON).header("Authorization", accessToken).
                get(uri);
        responseValidation.validateResponseOk(response);
    }

    @Then("^user get \"([^\"]*)\" as a response from create lead lineofbusinesses api$")
    public void user_get_as_a_response_from_create_lead_lineofbusinesses_api(String value) throws Throwable {
        String param ="[0]";
        responseValidation.responseStringValueCompare(param,response,value);
    }

    @Given("^a genie user has a create lead product name api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_create_lead_product_name_api_to_test_is(String value) throws Throwable {
        uri=value;
    }

    @When("^a genie user passes the \"([^\"]*)\" as a product name to get the response from create lead product name api$")
    public void a_genie_user_passes_the_as_a_product_name_to_get_the_response_from_create_lead_product_name_api(String product) throws Throwable {
        uri = uri.concat("/").concat(product);
    }

    @Then("^a user get the status code 200 as a response from the create lead product name api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_create_lead_product_name_api_where_customer_type_is_individual() throws Throwable {
        accessToken = TokenGenerator.getToken();
        response = given().accept(ContentType.JSON).header("Authorization", accessToken).
                get(uri);
        responseValidation.validateResponseOk(response);
    }

    @Then("^user get \"([^\"]*)\" as a response from create lead product name api$")
    public void user_get_as_a_response_from_create_lead_product_name_api(String value) throws Throwable {
        String param ="[0]";
        responseValidation.responseStringValueCompare(param,response,value);
    }

    @Given("^a genie user has a create lead branchcodes api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_create_lead_branchcodes_api_to_test_is(String value) throws Throwable {
        uri=value;
    }

    @Then("^a user get the status code 200 as a response from the create lead branchcodes api$")
    public void a_user_get_the_status_code_as_a_response_from_the_create_lead_branchcodes_api() throws Throwable {
        accessToken = TokenGenerator.getToken();
        response = given().accept(ContentType.JSON).header("Authorization", accessToken).
                get(uri);
        responseValidation.validateResponseOk(response);
    }

    @Then("^user get \"([^\"]*)\" as \"([^\"]*)\" from create lead branchcodes api as a first value$")
    public void user_get_as_branchCode_and_as_branchDisplayName_from_create_lead_branchcodes_api_as_a_first_value(String value, String key) throws Throwable {
        String param ="[0].";
        responseValidation.responseStringValueCompare(param,response,key,value);
    }

    @Given("^a genie user has a nba create lead without recommendation api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_nba_create_lead_without_recommendation_api_to_test_is(String value) throws Throwable {
        uri = value;
    }

    @When("^a genie user edits the \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\"$")
    public void a_genie_user_edits_the_field_by_and_field_by_and_field_by_and_field_by_and_field_by_and_field_by(String keyOne, String valueOne, String keyTwo, String valueTwo,String keyThree, String valueThree, String keyFour, String valueFour,String keyFive, String valueFive, String keySix, String valueSix) throws Throwable {
       codeSubmitLead =  responseValidation.putOperationForSixKeys(uri,keyOne,valueOne,keyTwo,valueTwo,keyThree,valueThree,keyFour,valueFour, keyFive,valueFive,keySix,valueSix);
    }

    @Then("^user validates all fields in nba create lead without recommendation api modify successfully$")
    public void user_validates_all_fields_in_nba_create_lead_without_recommendation_api_modify_successfully() throws Throwable {
        Assert.assertEquals(200,codeSubmitLead);
    }

}
