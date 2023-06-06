package org.example;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Headers {

    public static  void main(String[] args) {
        String baseUri = "https://petstore.swagger.io/v2/pet";
        Response response = given().contentType(ContentType.JSON).when().get(baseUri + "/findByStatus?status=sold");
        String res = response.getBody().toString();
        List<Header> list = response.getHeaders().asList();
        System.out.println(list);
        io.restassured.http.Headers headers=response.then().extract().headers();
        System.out.println(headers);
        response.then().extract().headers().hasHeaderWithName("Transfer-Encoding");

    }

}
