package org.example;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import  static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
public class QueryParam {

    public static void main(String[] args) {
        String ROOT_URI = "http://ip-api.com/json";
        Response response=given().contentType(ContentType.JSON).when().queryParam("fields","query,country,city,timezone").get(ROOT_URI + "/125.219.5.94");
        System.out.println(response.getBody().asPrettyString());
    }
}
