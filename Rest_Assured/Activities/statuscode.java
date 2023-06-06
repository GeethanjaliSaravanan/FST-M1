package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class statuscode {

        public static void main(String[] args) {
            String baseUri = "https://petstore.swagger.io/v2/pet";
            Response response = given().contentType(ContentType.JSON).when().get(baseUri + "/findByStatus?status=sold");
          response.then().statusCode(200);
         // response.then().statusCode(anyOf(is(200),is(201),is(202),is(203),is(204)));
        }
}
