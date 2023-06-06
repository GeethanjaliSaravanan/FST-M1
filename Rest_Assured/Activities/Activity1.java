package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {
    public static void main(String[] args) throws IOException {
        String ROOT_URI = "https://petstore.swagger.io/v2/pet";

        File files = new File("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\nested.json");

        FileInputStream inputJSON = new FileInputStream(files);
        // Get all bytes from JSON file
       // byte[] bytes = new byte[(int) files.length()];
      //  System.out.println(inputJSON.read(bytes) + " shasu");
        // Read JSON file as String
        String reqBody = new String(inputJSON.readAllBytes());
        Response response = given().when().body(reqBody).post(ROOT_URI);
        System.out.println(response.getBody().prettyPrint());
       // response.then().body("id", equalTo(659));

        Response response1 =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "658") // Set path parameter
                        .delete(ROOT_URI + "/{petId}");
        inputJSON.close();
    }
}
