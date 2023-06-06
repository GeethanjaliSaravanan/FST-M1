package org.example;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import  static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class Files {


    public static void main(String[] args) {
        String ROOT_URI = "https://petstore.swagger.io/v2/pet/{petId}/uploadImage";

        File files=new File("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\CHATGPTOPENAI.jpg");
   Response response=given().multiPart(files).when().pathParam("petId","77232").post(ROOT_URI);
        System.out.println(response.getBody().prettyPrint());


    }
}
