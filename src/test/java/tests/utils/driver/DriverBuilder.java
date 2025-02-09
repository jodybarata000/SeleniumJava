package tests.utils.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static tests.steps.Hooks.getScenario;

public class DriverBuilder {

    private static final String browser = System.getProperty("browser", "chrome").toLowerCase();
    private static final boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));

    public static WebDriver setupDriver() {
        WebDriver driver;

        switch (browser) {
            case "firefox":
                driver = setupFirefox();
                break;
            case "edge":
                driver = setupEdge();
                break;
            case "chrome":
            default:
                driver = setupChrome();
                break;
        }
        getScenario().log("Launching " + browser.toUpperCase() + " in headless mode: " + isHeadless);
        return driver;
    }

    private static WebDriver setupChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1366,768", "--disable-gpu", "--disable-notifications", "--no-sandbox", "--disable-dev-shm-usage");

        if (isHeadless) {
            options.addArguments("--headless=new");
        }
        return new ChromeDriver(options);
    }

    private static WebDriver setupFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1366", "--height=768");

        // Disable notifications (correct method for Firefox)
        options.addPreference("dom.webnotifications.enabled", false);
        options.addPreference("permissions.default.desktop-notification", 2);

        if (isHeadless) {
            options.addArguments("--headless");
        }

        return new FirefoxDriver(options);
    }

    private static WebDriver setupEdge() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--window-size=1366,768", "--disable-gpu", "--disable-notifications");

        if (isHeadless) {
            options.addArguments("--headless");
        }
        return new EdgeDriver(options);
    }
}
