package Test;

import Utill.RestUtils;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTest1 {
    @Test
    public void createAirline() throws IOException {
        System.out.println(System.getProperty("env") +"ENV value");
        String env = System.getProperty("env") == null? "qa" : System.getProperty("env");
        String endpoint = "https://api.instantwebtools.net/v1/airlines";
        Map<String, Object> payload = Payloads.getCreateAirlinePayloadFromMap("112323212333", "Sri Lanka", "USA", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "From Sri Lanka", "Katunayake, Sri Lanka", "www.srilankaairways.com", "1990");
        Response response = RestUtils.performPost(endpoint, payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 200);
        response.prettyPrint();

    }
}
