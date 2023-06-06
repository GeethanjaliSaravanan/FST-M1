package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class RequestSpecifications {

    public static void main(String[] args){

        RequestSpecification requestSpec=new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://petstore.swagger.io/v2/pet").build();
        Response response=given().spec(requestSpec).pathParam("petId", "103").get("/{petId}");
        String body = response.getBody().asPrettyString();
        System.out.println(body);

        ResponseSpecification responseSpecification=new ResponseSpecBuilder().
                expectContentType("application/json").
                expectStatusCode(200).expectBody("size()",is(3)).build();


    }
}
