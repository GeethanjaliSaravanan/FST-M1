package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileInputStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class inputfromJson {

    public static void main(String[] args) throws  Exception{
        String ROOT_URI = "https://petstore.swagger.io/v2/pet";

        File file = new File("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\nested.json");
        FileInputStream inputJSON = new FileInputStream(file);
        // Get all bytes from JSON file
        byte[] bytes = new byte[(int) file.length()];
        System.out.println(inputJSON.read(bytes) + " shasu");
        // Read JSON file as String
        String reqBody = new String(bytes, "UTF-8");

        System.out.println(reqBody + "body");

        Response response = given()
                .contentType(ContentType.JSON) // Set headers
                .body(reqBody) // Pass request body from file
                .when().post(ROOT_URI); // Send POST request

        // Print response
        String body = response.getBody().asPrettyString();
        System.out.println(body);

        inputJSON.close();

        // Assertion
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
    }
}
