package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ResponseValidation;
import helper.TokenGenerator;
import helper.UriHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static net.serenitybdd.rest.SerenityRest.given;

public class learn {

    public static Response responseIndividual, responseCorporate;
    public static String uri,accessToken;
    ResponseValidation responseValidation = new ResponseValidation();

    @Given("^a genie user has a learn api to test is \"([^\"]*)\"$")
    public void a_genie_user_has_a_learn_api_to_test_is(String value) {
        uri = UriHelper.uricheck();
        uri = uri.concat(value);
    }

    @When("^get the response from learn api$")
    public void get_the_response_from_learn_api() {
        System.out.println("public void a_user_get_the_status_code_as_a_response_from_the_learn_api(int");
        accessToken  = TokenGenerator.getToken();
        responseIndividual = given().relaxedHTTPSValidation().accept(ContentType.JSON).header("Authorization", accessToken).get(uri);
        System.out.print(responseIndividual.body().asString());
    }
    @Then("^a user get the status code 200 as a response from the learn api$")
    public void a_user_get_the_status_code_as_a_response_from_the_learn_api() {
        System.out.println("a_user_get_the_status_code_as_a_response_from_the_learn_api");
        responseValidation.validateResponseOk(responseIndividual);
    }

    @And ("^a user validates a node from response json$")
    public void a_user_validates_a_node_from_response_json() {
        int strVal = responseValidation.getAttributeIntValue(responseIndividual,"roles.Administrator.approveduserCount");
        System.out.println("Value of node: "+ strVal );



    }


}
