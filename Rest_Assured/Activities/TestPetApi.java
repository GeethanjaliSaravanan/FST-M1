package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestPetApi {

    @Test
    public void getPetDetails(){

        String baseUri="https://petstore.swagger.io/v2/pet";
        Response response=given().contentType(ContentType.JSON).when().get(baseUri+"/findByStatus?status=sold");
        String res=response.getBody().toString();
       System.out.println("Response Body is =>  " + response.getBody().prettyPrint());
        System.out.println("Response Body is =>  " + response.getHeaders().asList());
        response.then().statusCode(200);
        response.then().body("[0].status",equalTo("sold"));


    }
}
