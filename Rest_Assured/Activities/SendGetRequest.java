package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
public class SendGetRequest {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet/";

    @Test(dataProvider="Data")
    public void simple_get(String getid) {
        Response response = given().contentType(ContentType.JSON).when().get(ROOT_URI + getid);
        System.out.println(response.prettyPrint());
        response.then().body("status", equalTo("alive"));

    }

    @DataProvider(name="Data")
    public Object[][] iddata() {

        Object[][] objects = new Object[][] {{"77232"}, {"77233"}};

        return objects;
    }

}
