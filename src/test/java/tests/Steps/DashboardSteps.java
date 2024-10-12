package tests.Steps;

import io.cucumber.java.en.*;
import tests.pages.DashboardPage;
import tests.pages.LoginPage;
import tests.pages.LeavePage;
import static tests.utils.ConfigFileReader.getData;

public class DashboardSteps {
    private final LoginPage LoginPage = new LoginPage();
    private final DashboardPage DashboardPage = new DashboardPage();
    private final LeavePage LeavePage = new LeavePage();

    @Given("User Log in with User admin to OrangeHrm Dashboard")
    public void userLogInWithUserAdminToOrangeHrmDashboard() {
        LoginPage
                .navigateToPage()
                .loginToDashboardPage(getData("USERNAME"),getData("PASSWORD"));
        DashboardPage.verifyUserSuccessLogin();
    }

    @When("User click Quick Launch Assign Leave")
    public void userClickQuickLaunchAssignLeave() {
        DashboardPage.clickAssignLeave();
    }

    @Then("User redirects to Assign Leave Page")
    public void userRedirectsToAssignLeavePage() {
        LeavePage.verifyAssignLeavePage();
    }
}
