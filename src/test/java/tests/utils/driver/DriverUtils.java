package tests.utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static tests.utils.driver.DriverBuilder.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static tests.utils.WaitUtils.setImplicitWaitSeconds;
import static tests.utils.WaitUtils.setPageLoadWaitSeconds;
import static tests.Steps.Hooks.getScenario;

import java.time.Duration;

public class DriverUtils {

    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static final ThreadLocal<JavascriptExecutor> threadJSExecutor = new ThreadLocal<>();
    private static final ThreadLocal<Actions> threadActions = new ThreadLocal<>();
    private static final ThreadLocal<WebDriverWait> threadWebDriverWait = new ThreadLocal<>();
    public static synchronized WebDriver driver() {
        return threadDriver.get();
    }
    public static synchronized JavascriptExecutor jsExecutor() {
        return threadJSExecutor.get();
    }
    public static synchronized Actions actions() {
        return threadActions.get();
    }
    public static synchronized WebDriverWait webDriverWait() {
        return threadWebDriverWait.get();
    }
    private static final ThreadLocal<Boolean> driverRegistered = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        threadDriver.set(driver);
        // Driver global registration point.
        if (driverRegistered.get() == null) {
            DriverStorage.addToStorage(Thread.currentThread(), driver);
            driverRegistered.set(true);
        } else {
            DriverStorage.reinitializeDriverInStorage(Thread.currentThread(), driver);
        }
        threadWebDriverWait.set(new WebDriverWait(driver, Duration.ofSeconds(45)));
        threadJSExecutor.set((JavascriptExecutor) driver);
        threadActions.set(new Actions(driver));
    }

    public static void startBrowser() {
        if (!isBrowserAlive()) {
            setDriver(setupDriver());
            assertNotNull(driver(), "Driver was not created");
            setPageLoadWaitSeconds(Duration.ofSeconds(60));
            setImplicitWaitSeconds(Duration.ofSeconds(45));
        }
    }

    public static boolean isBrowserAlive() {
        if (driver() == null) {
            return false;
        }
        try {
            driver().getCurrentUrl();
            return true;
        } catch (Exception ignore) {
            threadDriver.remove();
            return false;
        }
    }
    public static void quitBrowser() {
        try {
            if (driver() != null) {
                driver().quit();
                getScenario().log(">>> Browser was closed. <<<");
            }
        } catch (WebDriverException e) {
            getScenario().log(">>> Browser could not be closed, due to WebDriverException <<<");
        }
        threadDriver.remove();
    }

    public static void navigateToUrl(String url) {
        driver().get(url);
    }

    public static void clearCookies(){
        driver().manage().deleteAllCookies();
        getScenario().log(">>> Cookies cleared successfully. <<<");
    }


}
