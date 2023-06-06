package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import  static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
public class PathParam {




    public static void main(String[] args) {
        String ROOT_URI = "http://ip-api.com/json/{ipAddress}";

        Response response = given().contentType(ContentType.JSON).when().pathParam("ipAddress","107.218.134.107").get(ROOT_URI);
        System.out.println(response.getBody().prettyPrint());
    }
}
