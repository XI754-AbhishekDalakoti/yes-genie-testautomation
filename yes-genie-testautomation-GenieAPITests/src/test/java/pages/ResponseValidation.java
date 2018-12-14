package pages;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

/**
 * Created by vibhu on 11/27/2018.
 */
public class ResponseValidation {

    public void responseStringValueCompare(String param,Response response,String key, String vlaue){
        response.then().
                body((param.concat(key)), is(vlaue));
    }

    public void responseIntValueCompare(String param,Response response,String key, int vlaue){
        response.then().
                body((param.concat(key)), is(vlaue));
    }
    public void responseBooleanValueCompare(String param,Response response,String value){
        boolean b = Boolean.parseBoolean(value);
        response.then().
                body(param, is(b));
    }

    public void validateResponseOk(Response response){
        response.
                then().assertThat().statusCode(HttpStatus.SC_OK);
    }
    public void validateBadRequest(Response response){
        response.
                then().assertThat().statusCode(HttpStatus.SC_BAD_REQUEST);
    }
    public void validateResultNotRequest(Response response){
        response.
                then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);
    }

    public void compareCount(String param,Response response,int vlaue){
        response.then().
                body(param, greaterThanOrEqualTo(vlaue));
    }

    public void compareResponseCode(Response response,int vlaue){
        response.
                then().assertThat().statusCode(vlaue);
    }

    public void responseStringValueCompare(String param,Response response, String vlaue){
        response.then().
                body((param), is(vlaue));
    }

    public void responseNullValueCompare(String param,Response response,String key){
        response.then().
                body((param.concat(key)), is(nullValue()));
    }
}
