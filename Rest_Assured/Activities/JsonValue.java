package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class JsonValue {
    public static void main(String[] args) {
        String baseUri = "https://petstore.swagger.io/v2/pet";
        Response response = given().contentType(ContentType.JSON).when().get(baseUri + "/findByStatus?status=sold");
       // String res = response.getBody().toString();
        String responcecode=response.then().extract().path("[0].status");
        String name=response.then().extract().path("[0].name");
        System.out.println(responcecode + name);
        response.then().extract().path("[0].status").equals("sold");
    }
}
