package tests.Steps;

import io.cucumber.java.en.*;
import tests.pages.DashboardPage;
import tests.pages.LoginPage;
import tests.pages.LeavePage;
import tests.pages.TimesheetsPage;
import static tests.utils.ConfigFileReader.getData;

public class DashboardSteps {
    private final LoginPage LoginPage = new LoginPage();
    private final DashboardPage DashboardPage = new DashboardPage();
    private final LeavePage LeavePage = new LeavePage();
    private final TimesheetsPage TimesheetsPage = new TimesheetsPage();

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

    @When("User click Quick Launch Leave List")
    public void userClickQuickLaunchLeaveList() {
        DashboardPage.clickLeaveList();
    }

    @Then("User redirects to Leave List Page")
    public void userRedirectsToLeaveListPage() {
        LeavePage.verifyLeaveListPage();
    }

    @When("User click Quick Launch Timesheet")
    public void userClickQuickLaunchTimesheet() {
        DashboardPage.clickTimesheets();
    }

    @Then("User redirects to Timesheet Page")
    public void userRedirectsToTimesheetPage() {
        TimesheetsPage.verifyTimesheetsPage();
    }
}
