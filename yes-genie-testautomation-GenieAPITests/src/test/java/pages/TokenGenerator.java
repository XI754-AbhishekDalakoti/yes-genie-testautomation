package pages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.given;

public class TokenGenerator {

    public static Response response;
    public static Response responseAccessToken;
    public static String uri, accessToken;
    public static ResponseValidation responseValidation = new ResponseValidation();
    public static String uriAccessToken="http://sso.yesgenie.com:30978/auth/realms/YBL/protocol/openid-connect/token";


    public static String getToken() {
        responseAccessToken = given().accept(ContentType.JSON).
                header("Content-Type", "application/x-www-form-urlencoded").
                formParam("client_id", "yes-genie-frontend").
                formParam("grant_type", "password").
                formParam("username", "prabhat").
                formParam("password", "1234").
                formParam("client_secret", "f2b07a8f-ce69-41c6-9d28-f056bc9713fe").
                post(uriAccessToken);
        responseValidation.validateResponseOk(responseAccessToken);
        accessToken = responseValidation.getResponse(responseAccessToken);
        accessToken = "Bearer ".concat(accessToken);
        return accessToken;
    }
}
