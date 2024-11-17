package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.utils.driver.DriverUtils.driver;

public class PIMElements {
    public WebElement getAddBButton(){
        return driver().findElement(By.xpath("//*[text()=' Add ']"));
    }

    public WebElement getAddEmployee(){
        return driver().findElement(By.xpath("//*[text()='Add Employee']"));
    }

    public WebElement getFirstNameField(){
        return driver().findElement(By.name("firstName"));
    }

    public WebElement getMiddleNameField(){
        return driver().findElement(By.name("middleName"));
    }

    public WebElement getLastNameField(){
        return driver().findElement(By.name("lastName"));
    }

    public WebElement getSaveBtn(){
        return driver().findElement(By.xpath("//*[text()=' Save ']"));
    }

    public WebElement getSuccesfullySavedPopup(){
        return driver().findElement(By.xpath("//*[text()='Successfully Saved']"));
    }

    public WebElement getLoginDetailsCheckbox(){
        return driver().findElement(By.xpath("//*[text()='Create Login Details']/following::label"));
    }

    public WebElement getUsernameField(){
        return driver().findElement(By.xpath("//*[text()='Username']/following::input[1]"));
    }

    public WebElement getPasswordField(){
        return driver().findElement(By.xpath("//*[text()='Password']/following::input[1]"));
    }

    public WebElement getConfirmPasswordField(){
        return driver().findElement(By.xpath("//*[text()='Confirm Password']/following::input[1]"));
    }
}
