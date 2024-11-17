package tests.utils;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
public class RandomUtils {
    public final HashMap<String, String> randomDetails = new HashMap<>();

    /**
     * Each time randomUtils class is initialized, random data will be generated automatically. To re-generate data,
     * call generateRandomPersonalData() separately.
     */
    public RandomUtils() {
        generateRandomPersonalData();
    }

    /**
     * Generates random personal data
     */
    private RandomUtils generateRandomPersonalData() {
        FakeValuesService fake = new FakeValuesService(new Locale("en-US"), new RandomService());
        Faker faker = new Faker();

        randomDetails.put("firstName", faker.name().firstName());
        randomDetails.put("middleName", faker.name().firstName());
        randomDetails.put("lastName", faker.name().lastName());
        randomDetails.put("username",faker.name().firstName()+faker.random().nextInt(100, 999));
        randomDetails.put("password", faker.internet().password(13, 14, true, true, true));
        randomDetails.put("phone", faker.phoneNumber().cellPhone().replaceAll("\\D+", ""));
        randomDetails.put("email", fake.bothify("test-" + generateCurrentDateAndTime() + "-####@yopmail.com"));
        return this;
    }
    public String getFirstName() {
        return randomDetails.get("firstName");
    }
    public String getMiddleName() {
        return randomDetails.get("middleName");
    }
    public String getLastName() {
        return randomDetails.get("lastName");
    }
    public String getUsername() {
        return randomDetails.get("username");
    }
    public String getPassword() {
        return randomDetails.get("password");
    }
    public String getPhone() {
        return randomDetails.get("phone");
    }
    public String getEmail() {
        return randomDetails.get("email");
    }

    public String generateCurrentDateAndTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        return formatter.format(currentDateAndTime);
    }

}
