package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.utils.driver.DriverUtils.driver;

public class LoginElements {
    public WebElement getCompanyLogo(){
        return driver().findElement(By.xpath("//*[@alt='company-branding']"));
    }
    public WebElement getUsername(){
        return driver().findElement(By.name("username"));
    }

    public WebElement getPassword(){
        return driver().findElement(By.name("password"));
    }

    public WebElement getLoginButton(){
        return driver().findElement(By.xpath("//*[@type='submit']"));
    }

    public WebElement getOrangeHRMDashboard(){
        return driver().findElement(By.xpath("//span//*[text()='Dashboard']"));
    }

    public WebElement getFailedLoginMessage(){
        return driver().findElement(By.xpath("//*[text()='Invalid credentials']"));
    }
}
