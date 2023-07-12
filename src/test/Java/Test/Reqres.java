package Test;

import Utill.JSONUtils;
import Utill.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Utils.RandomDataGenerator.faker;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;

public class Reqres {
        static String name;
        static String id;
        static JsonPath jsonPath;
        static Map<String,String>data;
    @Test(priority = 1)
    public void CreateAUser() throws IOException {
        data = JSONUtils.getJsonDataAsMap("regressApi.json");
       String endpoint = data.get("RegressPost");
        Map<String,String> payload = Payloads.CreateRegressPayloadAsMockData();
        Response response = RestUtils.RegressPostAsMap(endpoint, payload);
        Assert.assertEquals(response.getStatusCode(), 201);
        String Response = response.asString();
        Assert.assertTrue(Response.contains("name"),"There is no name mentioned in the RequestBody please fill in the name and Retry");
        jsonPath = response.jsonPath();
        id = jsonPath.get("id").toString();
        System.out.println(id);




    }

    @Test(priority = 2, dependsOnMethods = "CreateAUser")
    public void getAUser() throws IOException {

        data = JSONUtils.getJsonDataAsMap("regressApi.json");
        String endpoint = data.get("RegressGet");
         Response response = RestUtils.RegressGetWithID(endpoint,id);
      // Response response = RestUtils.RegressGet(endpoint+id);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);

    }
    ///Users/devxi.t/Desktop/Desktop - Ali’s MacBook Pro/API/YoutubeApiRestAssured


@Test
    public void CreateAUserDefaultUsingStringAsResponse(){
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\",\n" +
                "    \"id\": \"72\",\n" +
                "    \"createdAt\": \"2023-07-11T16:56:31.311Z\"\n" +
                "}";
       String response =  RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(body).post().then().extract().body().asPrettyString();
        System.out.println(response);
    }
}
