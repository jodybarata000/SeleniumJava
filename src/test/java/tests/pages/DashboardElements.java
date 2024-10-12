package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.utils.driver.DriverUtils.driver;

public class DashboardElements {

    public WebElement getOrangeHRMDashboard(){
        return driver().findElement(By.xpath("//span//*[text()='Dashboard']"));
    }
    public WebElement getAssignLeaveIcon(){
        return driver().findElement(By.xpath("//*[@title='Assign Leave' and @type='button']"));
    }
}
