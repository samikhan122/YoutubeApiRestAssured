package Test;

import Test.Pojo.Airline.Airline;
import Utill.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;

import static Utill.RestUtils.performPost;

public class AirlineApi {

    public Response createAirline(Airline createAirlinePayload) {
        String endpoint = (String) Base.dataFromJsonFile.get("createAirlineEndpoint");
        RestUtils.performPost(endpoint, createAirlinePayload, new HashMap<>());


        return null;
    }
}
