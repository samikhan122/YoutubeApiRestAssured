package Utill;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;


public class RestUtils {

//    public static Response performPost(String endpoint, String requestPayload, Map<String, String> headers) {
//        return RestAssured.given().log().all()
//                .baseUri(endpoint).headers(headers).contentType(ContentType.JSON)
//                .body(Payloads.getCreateAirlinePayloadFromMap("102233", "Emirates Airllines", "USA", "http:google.com", "From USA", "USAKATYTEXas", "WWWW.emiratesAirlines.com", "1995")).post().then().extract().response();
//    }

    public static Response performPost(String endpoint, Map<String, Object> payload, Map<String, String> headers) {
        return RestAssured.given().log().all()
                .baseUri(endpoint).headers(headers).contentType(ContentType.JSON)
                .body(payload).post().then().extract().response();

    }

    public static Response performPost(String endpoint, Object requestPayloadAsPOJO, Map<String, String> headers) {
        return RestAssured.given().log().all()
                .baseUri(endpoint).headers(headers).contentType(ContentType.JSON)
                .body(requestPayloadAsPOJO).post().then().extract().response();

    }

    public static Response RegressPost(String endpoint, String requestPayload) {
        return RestAssured.given().log().all()
                .baseUri(endpoint)
                .body(requestPayload)
                .contentType(ContentType.JSON)
                .post()
                .then().extract()
                .response();

    }

    public static Response RegressPostAsMap(String endpoint, Map<String, String> requestPayload) {
        return RestAssured.given().log().all()
                .baseUri(endpoint)
                .body(requestPayload)
                .contentType(ContentType.JSON)
                .post()
                .then().extract()
                .response();
    }
    public static Response RegressGet(String endpoint){
       return RestAssured.given().log().all().baseUri(endpoint).contentType(ContentType.JSON).get().then().extract().response();
    }

    public static Response RegressGetWithID(String endpoint,String id){
        return RestAssured.given().log().all().baseUri(endpoint+id).contentType(ContentType.JSON).get().then().extract().response();
    }
}