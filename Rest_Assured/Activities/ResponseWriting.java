package org.example;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import  static io.restassured.RestAssured.given;
public class ResponseWriting {
    public static void main(String[] args) throws IOException {
        String ROOT_URI = "https://petstore.swagger.io/v2/pet";
        File resJson=new File("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\nested.json");
        Response response=given().contentType(ContentType.JSON).when().get(ROOT_URI + "/77232");
       String body=response.asPrettyString();

       resJson.createNewFile();
        FileWriter fileWriter=new FileWriter(resJson.getPath());
        fileWriter.write(body);
        fileWriter.close();




    }
}
