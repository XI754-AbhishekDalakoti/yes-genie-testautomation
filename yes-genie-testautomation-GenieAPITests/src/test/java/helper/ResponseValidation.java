package helper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.Matchers.*;


public class ResponseValidation {

    public static String accessToken;

    public void responseStringValueCompare(String param, Response response, String key, String vlaue) {
        if (vlaue.equalsIgnoreCase("null")) {
            response.then().
                    body((param.concat(key)), is(nullValue()));
        } else {
            response.then().
                    body((param.concat(key)).trim(), is(vlaue));
        }
    }


    public void responseStringValueCompare(String param, Response response, String key, Boolean vlaue) {
        response.then().
                    body((param.concat(key)).trim(), is(vlaue));

    }

    public void responseCompareForStringValue(String param, Response response, String key, String vlaue) {
        response.then().
                body((param.concat(key)), is(vlaue));
    }

    public void responseIntValueCompare(String param, Response response, String key, int vlaue) {
        response.then().
                body((param.concat(key)), is(vlaue));
    }

    public void responseIntValueCompare(String param, Response response, int vlaue) {
        response.then().
                body(param, is(vlaue));
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

    public void responseBooleanValueCompare(String param, Response response, String key, String value) {
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

    public void responseStringValueContains(Response response, String vlaue) {
        response.body().asString().contains(vlaue);
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


    public void responseNullValueCompare(String param, Response response) {
        response.then().
                body(param, is(nullValue()));
    }

    public String getResponse(Response response) {
        JsonPath jsonPath = new JsonPath(response.body().asString());
        String token = jsonPath.getString("access_token");
        return token;
    }

    public int putOperation(String uri, String key, String value) {
        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        accessToken=TokenGenerator.getToken();
        requestSpecification.header("Content-Type", "application/json").header("Authorization", accessToken);;
        JSONObject json = new JSONObject();
        json.put(key, value);
        requestSpecification.body(json.toJSONString());
        Response response = requestSpecification.put(uri);
        int code = response.getStatusCode();
        return code;

    }

    public void responseEmpty(Response response) {
        response.then().
                body("isEmpty()", Matchers.is(true));
    }

    public void compareEqualCount(Response response, int vlaue) {
        response.then().assertThat().body("size()", is(vlaue));
    }
    public void validateNullObject(Response response) {
        String body = response.getBody().asString();
        Assert.assertTrue(body.equals("{}"));
    }

    public void validateNullObjectArray(Response response) {
        String body = response.getBody().asString();
        Assert.assertTrue(body.equals("[]"));
    }


    public void validateResponseForUnauthorized(Response response) {
        response.
                then().assertThat().statusCode(HttpStatus.SC_UNAUTHORIZED);
    }

    public int putOperationForTwoKeys(String uri, String keyOne, String valueOne, String keyTwo, String valueTwo, String responseBody) {
        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        accessToken=TokenGenerator.getToken();
        requestSpecification.header("Content-Type", "application/json").header("Authorization", accessToken);;
        JSONObject json = new JSONObject();
        json.put(keyOne, valueOne);
        json.put(keyTwo, valueTwo);
        requestSpecification.body(json.toJSONString());
        Response response = requestSpecification.put(uri);
        int code = response.getStatusCode();
        String body = response.getBody().asString();
        Assert.assertEquals(responseBody, body);
        return code;
    }

    public int putOperationForThreeKeys(String uri, String keyOne, String valueOne, String keyTwo, String valueTwo, String keyThree, String valueThree, String responseBody) {
        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        accessToken=TokenGenerator.getToken();
        requestSpecification.header("Content-Type", "application/json").header("Authorization", accessToken);;
        JSONObject json = new JSONObject();
        json.put(keyOne, valueOne);
        json.put(keyTwo, valueTwo);
        json.put(keyThree, valueThree);
        requestSpecification.body(json.toJSONString());
        Response response = requestSpecification.put(uri);
        int code = response.getStatusCode();
        String body = response.getBody().asString();
        Assert.assertEquals(responseBody, body);
        return code;
    }



    public int putOperationForThreeKeys(String uri, String keyOne, String valueOne, String keyTwo, String valueTwo, String keyThree, String valueThree) {
        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        accessToken=TokenGenerator.getToken();
        requestSpecification.header("Content-Type", "application/json").header("Authorization", accessToken);;
        JSONObject json = new JSONObject();
        json.put(keyOne, valueOne);
        json.put(keyTwo, valueTwo);
        json.put(keyThree, valueThree);
        requestSpecification.body(json.toJSONString());
        Response response = requestSpecification.put(uri);
        int code = response.getStatusCode();
        return code;
    }

    public void validateResponseBadRequest(Response response) {
        response.
                then().assertThat().statusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
    }
    public void validateResponseNoContent(Response response) {
        response.
                then().assertThat().statusCode(HttpStatus.SC_NO_CONTENT);
    }

    public void validateResponseOk(Response response, String message) {
        String body = response.getBody().asString();
        Assert.assertEquals(message, body);
        response.
                then().assertThat().statusCode(HttpStatus.SC_OK);
    }

    public void compareResponseAsAStringIsNotEmpty(Response response) {
        String body = response.getBody().asString();
        System.out.println("body is :" + body);
        Assert.assertFalse(body.isEmpty());
    }

    public int putOperationForSixKeys(String uri, String keyOne, String valueOne, String keyTwo, String valueTwo, String keyThree,
                                      String valueThree, String keyFour, String valueFour, String keyFive, String valueFive,
                                      String keySix,String valueSix) {
        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        accessToken=TokenGenerator.getToken();
        requestSpecification.header("Content-Type", "application/json").header("Authorization", accessToken);;
        JSONObject json = new JSONObject();
        json.put(keyOne, valueOne);
        json.put(keyTwo, valueTwo);
        json.put(keyThree, valueThree);
        json.put(keyFour, valueFour);
        json.put(keyFive, valueFive);
        json.put(keySix, valueSix);
        requestSpecification.body(json.toJSONString());
        Response response = requestSpecification.put(uri);
        int code = response.getStatusCode();
        return code;
    }


    public Response putOperationForEightKeys(String uri,String path,String keyOne, String valueOne, String keyTwo, String valueTwo, String keyThree,
                                             String valueThree, String keyFour, String valueFour, String keyFive, String valueFive,
                                             String keySix, String valueSix, String keySeven, String valueSeven, String keyEight, int valueEight, String keyNine, String valueNine) {

        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        accessToken=TokenGenerator.getToken();
        requestSpecification.header("Content-Type", "application/json").header("Authorization", accessToken);
        JSONObject json = new JSONObject();
        json.put(keyOne, valueOne);
        json.put(keyTwo, valueTwo);
        json.put(keyThree, valueThree);
        json.put(keyFour, valueFour);
        json.put(keyFive, valueFive);
        json.put(keySix, valueSix);
        json.put(keySeven, valueSeven);
        json.put(keyEight, valueEight);
        json.put(keyNine, valueNine);
        requestSpecification.body(json.toJSONString());
        requestSpecification.basePath(path);
        requestSpecification.baseUri(uri);
        Response response = requestSpecification.put();
        return response;
    }

    public String getAttributeValue(Response apiResponse, String jasonPath) {
        // jasonPath: api response attribute json path
        String restApiResponse = apiResponse.asString();
        JsonPath jpath = new JsonPath(restApiResponse);
        String attributeValue = jpath.get(jasonPath);
//            System.out.println("Attribute Value: "+attributeValue);
        return attributeValue;
    }

    public int getAttributeIntValue(Response apiResponse, String jasonPath) {
        // jasonPath: api response attribute json path
        String restApiResponse = apiResponse.asString();
        JsonPath jpath = new JsonPath(restApiResponse);
        int attributeValue = jpath.get(jasonPath);
//            System.out.println("Attribute Value: "+attributeValue);
        return attributeValue;
    }

    public boolean getAttributeBooleanValue(Response apiResponse, String jasonPath) {
        // jasonPath: api response attribute json path
        String restApiResponse = apiResponse.asString();
        JsonPath jpath = new JsonPath(restApiResponse);
        boolean attributeValue = jpath.get(jasonPath);
//            System.out.println("Attribute Value: "+attributeValue);
        return attributeValue;
    }

    //This function will be used to get any specific attribute values from end-point response.
    public ArrayList<String> getAttributeValues(Response apiResponse, String jasonPath) {
        // jasonPath: api response attribute json path
        String restApiResponse = apiResponse.asString();
        JsonPath jpath = new JsonPath(restApiResponse);
        ArrayList<String> attributeValues = jpath.get(jasonPath);
//        System.out.println("Attribute Value: "+attributeValue);
        return attributeValues;
    }
}


