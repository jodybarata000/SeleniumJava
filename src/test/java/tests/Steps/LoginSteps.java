package tests.Steps;

import io.cucumber.java.en.*;
import tests.pages.LoginPage;

import static tests.utils.driver.DriverUtils.*;

public class LoginSteps {
    private final LoginPage LoginPage = new LoginPage();

    @Given("User navigated to the OrangeHRM Login page")
    public void user_navigated_to_the_orange_hrm_login_page() {
        LoginPage.navigateToPage();
    }

    @When("User Enters Valid username and password")
    public void user_enters_valid_username_and_password() {
        LoginPage.enterLoginUsername("Admin")
                .enterLoginPassword("admin123");
    }

    @When("User Clicks Login Button")
    public void user_clicks_login_button() {
        LoginPage.clickLoginButton();
    }

    @Then("User redirects to OrangeHRM Dashboard")
    public void user_redirects_to_orange_hrm_dashboard() {
        LoginPage.verifyUserSuccessLogin();
    }
}
