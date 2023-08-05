package tests.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static tests.utils.driver.DriverUtils.driver;
import static tests.utils.driver.DriverUtils.webDriverWait;

public class WaitUtils {
    public static void waitUntilElementToBeClickable(WebElement element) {
        webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitUntilElementIsDisplayed(WebElement element) {
        webDriverWait().until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public static WebElement waitUntilElementIsSelected(WebElement element) {
        webDriverWait().until(ExpectedConditions.elementToBeSelected(element));
        return element;
    }
    public static WebElement waitUntilElementIsNotSelected(WebElement element) {
        webDriverWait().until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(element)));
        return element;
    }
    public static void waitForDuration(Duration duration) {
        try {
            MILLISECONDS.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void setImplicitWaitSeconds(Duration timeInSeconds) {
        driver().manage().timeouts().implicitlyWait(timeInSeconds);
    }
    public static void setPageLoadWaitSeconds(Duration timeInSeconds) {
        driver().manage().timeouts().pageLoadTimeout(timeInSeconds);
    }
}
