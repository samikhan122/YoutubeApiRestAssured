package Test;

import Test.Pojo.Airline.Airline;
import Utils.DateGenerator;
import Utils.RandomDataGenerator;
import Utils.RandomDataTypeName;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String getCreateAirlinePayloadFromString(String id, String name, String country, String logo, String slogan, String head_quaters, String website, String established) {
        String payload = "{\n" +
                "    \"id\": 12232342,\n" +
                "    \"name\": \"Sri Lankan Airways\",\n" +
                "    \"country\": \"Sri Lanka\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From Sri Lanka\",\n" +
                "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                "    \"website\": \"www.srilankaairways.com\",\n" +
                "    \"established\": \"1990\"\n" +
                "}\n";
        return payload;
    }

    public static Map<String, Object> getCreateAirlinePayloadFromMap(String id, String name, String country, String logo, String slogan, String head_quaters, String website, String established) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("id", id);
        payload.put("name", name);
        payload.put("country", country);
        payload.put("logo", logo);
        payload.put("slogan", slogan);
        payload.put("head_quaters", head_quaters);
        payload.put("website", website);
        payload.put("established", established);
        return payload;

    }

    public static Map<String, Object> getCreateAirlinePayloadFromMap() {
        //make sure to have apache common dependency to generate random alphabet
        Map<String, Object> payload = new HashMap<>();
        Faker faker = new Faker();
        payload.put("id", RandomDataGenerator.getRandomNumber(5));
        payload.put("firstName", RandomDataGenerator.getRandomDataFor(RandomDataTypeName.FIRSTNAME));
        payload.put("lastName", RandomDataGenerator.getRandomDataFor(RandomDataTypeName.LASTNAME));
        payload.put("country", RandomDataGenerator.getRandomDataFor(RandomDataTypeName.COUNTRY));
        payload.put("logo", RandomDataGenerator.getRandomAlphabets(8));
        payload.put("slogan", RandomDataGenerator.getRandomAlphabets(10));
        payload.put("head_quarters", faker.address().cityName());
        payload.put("website", RandomDataGenerator.getRandomWebsiteName());
        payload.put("established", RandomDataGenerator.getRandomNumber(1990, DateGenerator.getCurrentYear()));

        return payload;

    }

    public static Airline getCreateAirlinePayloadFromPojo() {
        return Airline
                .builder()
                //    .id(RandomDataGenerator.getRandomNumber(3))
                .name(RandomDataGenerator.getRandomDataFor(RandomDataTypeName.FULLNAME))
                .country(RandomDataGenerator.getRandomDataFor(RandomDataTypeName.COUNTRY))
                .logo(RandomDataGenerator.getRandomAlphabets(25))
                .slogan(RandomDataGenerator.getRandomAlphabets(20))
                .head_quarters(RandomDataGenerator.getRandomDataFor(RandomDataTypeName.CITYNAME))
                .website(RandomDataGenerator.getRandomWebsiteName())
                .established(String.valueOf(RandomDataGenerator.getRandomNumber(1900, DateGenerator.getCurrentYear())))
                .build();
    }

    public static String getRegressPayload(String name, String job, String id, String createdAt) {
        String payload = "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"job\": \"" + job + "\",\n" +
                "    \"id\": \"" + id + "\",\n" +
                "    \"createdAt\": \"" + createdAt + "\"\n" + "}";

        return payload;
    }

    public static Map<String, String> CreateRegressPayloadAsMockData() {

        Faker faker = new Faker();
        String id = faker.bothify("###");
        String name = faker.bothify("????");
        String job = faker.job().position();
        String createdAt = faker.date().toString();
        Map<String, String> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("job", job);
        payload.put("id", id);
        payload.put("createdAt", createdAt);
        return payload;
    }

    public static Map<String, String> getRegressPayloadAsMap(String name, String id, String job, String createdAt) {
        Map<String, String> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("job", job);
        payload.put("id", id);
        payload.put("createdAt", createdAt);
        return payload;


    }
}