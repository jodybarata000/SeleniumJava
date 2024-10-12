package tests.Steps;

import io.cucumber.java.en.*;
import tests.pages.LoginPage;
import static tests.utils.ConfigFileReader.getData;

public class LoginSteps {
    private final LoginPage LoginPage = new LoginPage();

    @Given("User navigated to the OrangeHRM Login page")
    public void userNavigatedtoTheOrangeHRMLoginPage() {
        LoginPage
                .navigateToPage()
                .verifySuccessLoadLogo();
    }

    @When("User Enters Valid username and password")
    public void userEntersValidUsernameandPassword() {
        LoginPage
                .enterLoginUsername(getData("USERNAME"))
                .enterLoginPassword(getData("PASSWORD"));
    }

    @When("User Clicks Login Button")
    public void userClicksLoginButton() {
        LoginPage.clickLoginButton();
    }

    @Then("User redirects to OrangeHRM Dashboard")
    public void userRedirectstoOrangeHRMDashboard() {
        LoginPage.verifyUserSuccessLogin();
    }

    @When("User Enters Invalid {string} and {string}")
    public void userEntersInvalidUsernameandPassword(String username, String password){
        LoginPage
                .enterLoginUsername(username)
                .enterLoginPassword(password);
    }

    @Then("User should see failed login message")
    public void userShouldSeeFailedLoginMessage(){
        LoginPage.verifyUserFailedLogin();
    }
}
