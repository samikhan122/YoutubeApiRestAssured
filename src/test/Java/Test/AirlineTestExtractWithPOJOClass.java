package Test;

import Test.Pojo.Airline.Airline;
import io.restassured.RestAssured;

public class AirlineTestExtractWithPOJOClass {


    public static void main(String[] args) {
        RestAssured.get("https://api.instantwebtools.net/v1/airlines").as(Airline.class);

        String name = Airline.class.getName();
        System.out.println(name);
    }
}
