package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;
public class Post {

   // String RootURI = "https://petstore.swagger.io/v2/pet";

    public static void main(String[] args) throws FileNotFoundException {
        String RootURI = "https://petstore.swagger.io/v2/pet";

       FileReader fileReader=new FileReader(new File("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\notepad.txt"));



        Response response= given().contentType(ContentType.JSON).body(fileReader).when().post(RootURI);
        System.out.println(response.getBody().prettyPrint());
       response= given().contentType(ContentType.JSON) // Set headers
                .when().get(RootURI + "/77232");
       response.body().prettyPrint();
    }
}
