package pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.*;

/**
 * Created by vibhu on 11/27/2018.
 */
public class ResponseValidation {

    public void responseStringValueCompare(String param, Response response, String key, String vlaue) {
        if (vlaue.equalsIgnoreCase("null")) {
            response.then().
                    body((param.concat(key)), is(nullValue()));
        } else {
            response.then().
                    body((param.concat(key)), is(vlaue));
        }
    }

    public void responseCompareForStringValue(String param, Response response, String key, String vlaue) {
        response.then().
                body((param.concat(key)), is(vlaue));
    }

    public void responseIntValueCompare(String param, Response response, String key, int vlaue) {
        response.then().
                body((param.concat(key)), is(vlaue));
    }

    public void responseBooleanValueCompare(String param, Response response, String value) {
        if (value.equalsIgnoreCase("null")) {
            response.then().
                    body((param), is(nullValue()));
        } else {
            boolean b = Boolean.parseBoolean(value);
            response.then().
                    body(param, is(b));
        }
    }

    public void responseBooleanValueCompare(String param, Response response,String key, String value) {
        if (value.equalsIgnoreCase("null")) {
            response.then().
                    body((param), is(nullValue()));
        } else {
            boolean b = Boolean.parseBoolean(value);
            response.then().
                    body(param.concat(key), is(b));
        }
    }
    public void validateResponseOk(Response response) {
        response.
                then().assertThat().statusCode(HttpStatus.SC_OK);
    }

    public void validateBadRequest(Response response) {
        response.
                then().assertThat().statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    public void validateResultNotRequest(Response response) {
        response.
                then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);
    }

    public void compareCount(String param, Response response, int vlaue) {
        response.then().
                body(param, greaterThanOrEqualTo(vlaue));
    }

    public void compareResponseCode(Response response, int vlaue) {
        response.
                then().assertThat().statusCode(vlaue);
    }

    public void responseStringValueCompare(String param, Response response, String vlaue) {
        if (vlaue.equalsIgnoreCase("null")) {
            response.then().
                    body((param), is(nullValue()));
        } else {
            response.then().
                    body((param), is(vlaue));
        }
    }

    public void responseNullValueCompare(String param, Response response, String key) {
        response.then().
                body((param.concat(key)), is(nullValue()));
    }

    public String getResponse(Response response) {
        JsonPath jsonPath = new JsonPath(response.body().asString());
        String token = jsonPath.getString("access_token");
        return token;
    }

    public int putOperation(String uri, String key, String value) {
        System.out.println("URI Value : " + uri);
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put(key, value);
        requestSpecification.body(json.toJSONString());
        Response response = requestSpecification.put(uri);
        int code = response.getStatusCode();
        System.out.println("status code is : " + code);
        return code;

    }

    public void responseEmpty(Response response) {
        response.then().
                body("isEmpty()", Matchers.is(true));
    }

    public void compareEqualCount(Response response, int vlaue) {
        response.then().assertThat().body("size()", is(vlaue));
    }
}
