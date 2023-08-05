package tests.utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverBuilder {
    public static String isHeadless = System.getProperty("headless", "false");
    public static WebDriver setupDriver() {
        DesiredCapabilities dc = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1366,768");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        if (isHeadless.equals("true")) {
            chromeOptions.addArguments("--headless");
        }

        dc.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        dc.setCapability("browserName", "chrome");
        return new ChromeDriver(chromeOptions);
    }
}
