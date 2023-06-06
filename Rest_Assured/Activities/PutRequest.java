package org.example;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutRequest {


    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    public void AddnewPet(){

        String reqBody ="adat";

    Response response=given().contentType(ContentType.JSON).body(reqBody).when().put(ROOT_URI);
    response.getBody().prettyPrint();
    response.then().body("name",equalTo("Hansel"));

    }
}
