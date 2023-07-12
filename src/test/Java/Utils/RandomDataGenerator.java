package Utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {
    public static Faker faker = new Faker();

    public static String getRandomFirstName() {
        return faker.name().firstName();


    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomFullName() {
        return faker.name().fullName();
    }

    public static String getRandomDataFor(RandomDataTypeName dataTypeName) {
        switch (dataTypeName) {
            case FIRSTNAME:
                return faker.name().firstName();
            case LASTNAME:
                return faker.name().lastName();
            case FULLNAME:
                return faker.name().fullName();
            case CITYNAME:
                return faker.address().cityName();
            case COUNTRY:
                return faker.address().country();
            default:
                return "This type of random data generator is not available";

        }
    }

    public static String getRandomNumber(int count) {
        return faker.number().digits(count);
    }

    public static int getRandomNumber(int min, int max){
        return faker.number().numberBetween(min,max);
    }
    public static String getRandomAlphabets(int count){
        return RandomStringUtils.randomAlphabetic(count);
    }
    public static String getRandomWebsiteName(){
        return "http//" + RandomStringUtils.randomAlphabetic(8)+ ".com";
    }
}
