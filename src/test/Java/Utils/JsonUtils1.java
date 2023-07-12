package Utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonUtils1 {
    public static void main(String[] args) {
        String completeJsonFilePath = System.getProperty("user.dir") +"src/test/Java/resources";
        System.out.println(completeJsonFilePath);
    }
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, String> getJsonDataAsMap(String jsonFileName) throws IOException {

        String completeJsonFilePath = System.getProperty("user.dir") +"src/test/Java/resources"+ jsonFileName;
        System.out.println(completeJsonFilePath);
        Map<String, String> data = objectMapper.readValue(new File(completeJsonFilePath), new TypeReference<>() {
        });
        return data;
        //("user.dir") +


       // String fullpath = "/Users/devxi.t/Desktop/API/YoutubeApiRestAssured/src/test/Java/resources/qa/airlines.json";
    }
}
