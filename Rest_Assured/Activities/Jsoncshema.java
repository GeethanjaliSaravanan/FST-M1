package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class Jsoncshema {

    public static  void main(String[] args) throws MalformedURLException {

        String ROOT_URI = "https://petstore.swagger.io/v2/pet";
        Response response=given().contentType(ContentType.JSON).when().
                get(ROOT_URI + "/77232");
        System.out.println(response.getBody().prettyPrint());

        URL swagger=new URL("https://petstore.swagger.io/v2/swagger.json");
        response.then().body(matchesJsonSchema(swagger));

    }
}
