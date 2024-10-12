package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.utils.driver.DriverUtils.driver;

public class TimesheetsElements {
    public WebElement getTitleTimesheetsList(){
        return driver().findElement(By.xpath("//*[text()='Timesheets Pending Action']"));
    }
}
