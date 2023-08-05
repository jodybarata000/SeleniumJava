package tests.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    public static Properties properties = new Properties();
    public static String ConfigReader(String config) {
        try (FileReader reader = new FileReader("src/test/resources/config.properties")) {
            properties.load(reader);
            return properties.getProperty(config);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
