package Utill;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JSONUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, String> getJsonDataAsMap(String jsonFile) throws IOException {
        String completeJsonFilePath = System.getProperty("user.dir") + "/src/test/Java/resources/qa/" + jsonFile;
        Map<String, String> data = objectMapper.readValue(new File(completeJsonFilePath), new TypeReference<>() {
        });
        return data;


    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }


}

