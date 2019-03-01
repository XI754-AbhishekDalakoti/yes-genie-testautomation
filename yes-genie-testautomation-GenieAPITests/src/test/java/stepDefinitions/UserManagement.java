package stepDefinitions;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsString;

import static net.serenitybdd.rest.SerenityRest.given;
/**
 * Created by vibhu on 11/20/2018.
 */
public class UserManagement {
    public static String access_token = "";
    public static Response response;

    public void getAccessTocken(){
        access_token =
                given().relaxedHTTPSValidation().
                        header("Authorization", "Basic Z3Vlc3RfaG91c2VfcHdkOmdoX3NlY3JldA==").
                        param("username", "123").
                        param("password", "123").
                        param("grant_type", "password").
                        when().
                        post("http://oauth-server-795787960.ap-northeast-2.elb.amazonaws.com/OAuth2-SSO/oauth/token").
                        asString();

        access_token = access_token.substring(17, 53);
        System.out.println(access_token);
    }

    public void validateVa(){
        access_token = "Bearer ".concat(access_token);
        String value="hh";
        System.out.println("access_token : " + access_token);

        response = given().relaxedHTTPSValidation().header("Authorization", access_token).
                get("");

        response.
                then().
                statusCode(200).
                body("",is(value));

        response.
                then().
                statusCode(200).
                body("",containsString(value));
    }
}
