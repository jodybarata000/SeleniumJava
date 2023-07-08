package tests.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.utils.Driver;

import java.time.Duration;

public class LoginSteps {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setup(){
        driver = new Driver().setupDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Given("User navigated to the OrangeHRM Login page")
    public void user_navigated_to_the_orange_hrm_login_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User Enters Valid username and password")
    public void user_enters_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User Clicks Login Button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User redirects to OrangeHRM Dashboard")
    public void user_redirects_to_orange_hrm_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
