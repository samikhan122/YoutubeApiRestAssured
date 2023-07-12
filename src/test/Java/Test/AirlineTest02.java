package Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AirlineTest02 {

    @Test
    public void CreateAnAirline(){
        String body = "{\n" +
                "    \"id\": 121140,\n" +
                "    \"name\": \"Sri Lankan Airways\",\n" +
                "    \"country\": \"Sri Lanka\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From Sri Lanka\",\n" +
                "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                "    \"website\": \"www.srilankaairways.com\",\n" +
                "    \"established\": \"1990\"\n" +
                "}";
         RestAssured.given().baseUri("https://api.instantwebtools.net/v1/airlines").contentType(ContentType.JSON).body(body).post().then().log().all().extract().response();


    }
}
