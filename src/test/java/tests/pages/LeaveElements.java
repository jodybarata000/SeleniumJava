package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.utils.driver.DriverUtils.driver;

public class LeaveElements {
    public WebElement getTitleAssignLeave(){
        return driver().findElement(By.xpath("//*[text()='Assign Leave']"));
    }

    public WebElement getTitleLeaveList(){
        return driver().findElement(By.xpath("//*[text()='Leave List']"));
    }
}
