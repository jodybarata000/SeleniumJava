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

    public LoginPage navigateToPage() {
        navigateToUrl(getData("LOGIN_URL"));
        waitUntilElementIsDisplayed(LoginElements.getCompanyLogo());;
        return this;
    }

    public LoginPage verifyUserFailedLogin(){
        waitUntilElementIsDisplayed(LoginElements.getFailedLoginMessage());
        return this;
    }

    public LoginPage loginToDashboardPage(String Username,String Password){
        enterTextToField(LoginElements.getUsername(),Username);
        enterTextToField(LoginElements.getPassword(),Password);
        clickElement(LoginElements.getLoginButton());
        return this;
    }
}

