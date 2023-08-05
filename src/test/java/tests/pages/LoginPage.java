package tests.pages;

import static tests.utils.ConfigFileReader.*;

import static tests.utils.ComponentUtils.*;
import static tests.utils.driver.DriverUtils.navigateToUrl;
import static tests.utils.WaitUtils.waitUntilElementIsDisplayed;

public class LoginPage {
    private final LoginElements LoginElements = new LoginElements();

    public LoginPage enterLoginUsername(String Username){
        enterTextToField(LoginElements.getUsername(),Username);
        return this;
    }
    public LoginPage enterLoginPassword(String Password){
        enterTextToField(LoginElements.getPassword(),Password);
        return this;
    }

    public LoginPage clickLoginButton(){
        clickElement(LoginElements.getLoginButton());
        return this;
    }
    public LoginPage verifyUserSuccessLogin(){
        waitUntilElementIsDisplayed(LoginElements.getOrangeHRMDashboard());
        return this;
    }

    public LoginPage navigateToPage() {
        String url = ConfigReader("LOGIN_URL");
        navigateToUrl(url);
        return this;
    }
}

