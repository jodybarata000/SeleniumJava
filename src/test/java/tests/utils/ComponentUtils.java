package tests.utils;

import org.openqa.selenium.*;

import java.time.Duration;

import static tests.utils.WaitUtils.waitForDuration;
import static tests.utils.WaitUtils.waitUntilElementToBeClickable;
import static tests.utils.driver.DriverUtils.*;

public class ComponentUtils {
    public static WebElement enterTextToField(WebElement element, String text) {
        clearInputField(element);
        element.sendKeys(text);
        return element;
    }
    public static WebElement clearInputField(WebElement element) {
        waitUntilElementToBeClickable(element);
        element.clear();
        return element;
    }


    public static WebElement clickElement(WebElement element) {
        try {
            waitUntilElementToBeClickable(element);
            element.click();
        } catch (ElementClickInterceptedException e) {
            scrollToElement(element);
            waitForDuration(Duration.ofSeconds(1));
            element.click();
        }
        return element;
    }
    public static void scrollToElement(WebElement element) {
        jsExecutor().executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
