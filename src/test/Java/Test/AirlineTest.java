package Test;

import Test.Pojo.Airline.Airline;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class AirlineTest extends AirlineApi{
    @Test
    public void createAirline() throws IOException {
        //Map<String, Object> payload = Payloads.getCreateAirlinePayloadFromMap();
        //System.out.println(payload);
        Airline payload = Payloads.getCreateAirlinePayloadFromPojo();
        Response response = createAirline(payload);
        Assert.assertEquals(response.getStatusCode(),200);




    }
}
