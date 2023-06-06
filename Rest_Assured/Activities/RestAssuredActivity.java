package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import groovy.json.JsonParser;
import io.ktor.http.cio.RequestResponseBuilder;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Reporter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static io.restassured.RestAssured.given;

public class RestAssuredActivity {

    public static void main(String[] args) throws IOException, ParseException {

       // RestAssured.baseURI="https://api.github.com";
        RequestSpecification requestSpecification= given();
        requestSpecification.baseUri("https://api.github.ibm.com");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.header("Authorization","Token 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");

        Response response=given().spec(requestSpecification).when().get("/user/keys");
        System.out.println(response.getBody().prettyPrint());
        PrintWriter printWriter=new PrintWriter(new FileWriter("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\nested.json"));
        printWriter.write(response.getBody().prettyPrint().toString());
        printWriter.close();

        JSONParser jsonParser=new JSONParser();

 FileReader fileReader=new FileReader("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\nested.json");
        ObjectMapper objectMapper=new ObjectMapper();
        JsonNode jsonNode=objectMapper.readTree(fileReader);
        JsonNode firstJsonObject=jsonNode.get(0);
       // String key=firstJsonObject.get("key").asText();
        String key ="{ \"key\" : \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIAOVz6q3z7yVcXjGFHvtGl67DiT3iUVpBY+gEY4CU5hs\"}";

     //   System.out.println(key);
        if(jsonNode.isArray()){

            for(JsonNode jsonNode1:jsonNode){

               // if(jsonNode1.has("key")){
                //    System.out.println(jsonNode1);
               // }
            }
        }



        JSONArray jsonArray= (JSONArray) jsonParser.parse(new FileReader("C:\\Users\\0046EP744\\IdeaProjects\\RestAPI\\target\\nested.json"));

        RequestSpecification requestSpecificationpost= given();
        requestSpecificationpost.baseUri("https://github.ibm.com/api/v3/user/keys?id=612624");
        requestSpecificationpost.contentType(ContentType.JSON);

       // requestSpecificationpost.header("Authorization","Token  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");
Response response1=given().spec(requestSpecification).body(key).when().post("https://github.ibm.com/api/v3/user/keys");
System.out.println("data "+ response1.getBody().prettyPrint());

        response=given().spec(requestSpecification).pathParam("id","612653").when().get("/user/keys/{id}");
        System.out.println(response.getBody().prettyPrint());
        Reporter.log(response.prettyPrint());
        given().spec(requestSpecification).when().delete("https://github.ibm.com/api/v3/user/keys/612587").then().statusCode(204);
       System.out.println(response.getBody().prettyPrint());
       // Reporter.log(response.prettyPrint());






    }
}
