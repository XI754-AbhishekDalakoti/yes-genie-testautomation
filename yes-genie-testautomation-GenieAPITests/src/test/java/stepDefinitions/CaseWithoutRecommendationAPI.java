package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.ResponseValidation;
import pages.TokenGenerator;

import static net.serenitybdd.rest.SerenityRest.given;

public class CaseWithoutRecommendationAPI  {
    int codeSubmitLead;
    public static Response responseIndividual, responseCorporate,responseAccessToken;
    public static String uri;
    public static String path,accessToken;
    public static String uriAccessToken="http://sso.yesgenie.com:30978/auth/realms/YBL/protocol/openid-connect/token";
    ResponseValidation responseValidation = new ResponseValidation();




    @Given("^a genie user has a createcasesubmit api to test uri is \"([^\"]*)\" and path is \"([^\"]*)\"$")
    public void a_genie_user_has_a_createcasesubmit_api_to_test_uri_is_and_path_is(String arg1, String arg2) throws Throwable {
         uri = arg1;
         path =arg2;


    }




    @When("^a genie user edits the \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by \"([^\"]*)\"  and \"([^\"]*)\" field by \"([^\"]*)\" and \"([^\"]*)\" field by (\\d+) and \"([^\"]*)\" field by \"([^\"]*)\"$")
    public void a_genie_user_edits_the_field_by_and_field_by_and_field_by_and_field_by_and_field_by_and_field_by_and_field_by_and_field_by_and_field_by(String keyOne, String valueOne, String keyTwo, String valueTwo, String keyThree, String valueThree, String keyFour, String valueFour, String keyFive, String valueFive, String keySix, String valueSix, String keySeven, String valueSeven, String keyEight, int valueEight, String keyNine, String valueNine) {
        responseIndividual = responseValidation.putOperationForEightKeys(uri,path,keyOne, valueOne, keyTwo, valueTwo, keyThree, valueThree, keyFour, valueFour, keyFive, valueFive, keySix, valueSix, keySeven, valueSeven, keyEight, valueEight,keyNine,valueNine);

    }

    @Then("^a user get the status code (\\d+) as a response from the createcasesubmit api where customer type is individual$")
    public void a_user_get_the_status_code_as_a_response_from_the_createcasesubmit_api_where_customer_type_is_individual(int arg1) throws Throwable {
        responseValidation.compareResponseCode(responseIndividual, arg1);
    }


    @Then("^user get the response  \"([^\"]*)\" from the createcasesubmit api where customer type is individual$")
    public void user_get_the_response_from_the_createcasesubmit_api_where_customer_type_is_individual(String arg1) throws Throwable {
        responseValidation.responseStringValueContains(responseIndividual,arg1);
    }

    @When("^User sends the request$")
    public void user_sends_the_request() throws Throwable {
        accessToken=TokenGenerator.getToken();
        responseIndividual =given().accept(ContentType.JSON).header("Authorization", accessToken).put(uri.concat(path));
    }



}
