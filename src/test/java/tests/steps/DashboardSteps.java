package tests.steps;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
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
    @Step("User Log in with User admin to OrangeHrm Dashboard")
    public void userLogInWithUserAdminToOrangeHrmDashboard() {
        LoginPage
                .navigateToPage()
                .loginToDashboardPage(getData("USERNAME"),getData("PASSWORD"));
        DashboardPage.verifyUserSuccessLogin();
    }

    @When("User click Quick Launch Assign Leave")
    @Step("User click Quick Launch Assign Leave")
    public void userClickQuickLaunchAssignLeave() {
        DashboardPage.clickAssignLeave();
    }

    @Then("User redirects to Assign Leave Page")
    @Step("User redirects to Assign Leave Page")
    public void userRedirectsToAssignLeavePage() {
        LeavePage.verifyAssignLeavePage();
    }

    @When("User click Quick Launch Leave List")
    @Step("User click Quick Launch Leave List")
    public void userClickQuickLaunchLeaveList() {
        DashboardPage.clickLeaveList();
    }

    @Then("User redirects to Leave List Page")
    @Step("User redirects to Leave List Page")
    public void userRedirectsToLeaveListPage() {
        LeavePage.verifyLeaveListPage();
    }

    @When("User click Quick Launch Timesheet")
    @Step("User click Quick Launch Timesheet")
    public void userClickQuickLaunchTimesheet() {
        DashboardPage.clickTimesheets();
    }

    @Then("User redirects to Timesheet Page")
    @Step("User redirects to Timesheet Page")
    public void userRedirectsToTimesheetPage() {
        TimesheetsPage.verifyTimesheetsPage();
    }

    @When("User click Quick Launch Apply Leave")
    @Step("User click Quick Launch Apply Leave")
    public void userClickQuickLaunchApplyLeave() {
        DashboardPage.clickApplyLeave();
    }

    @Then("User redirects to Apply Leave Page")
    @Step("User redirects to Apply Leave Page")
    public void userRedirectsToApplyLeavePage() {
        LeavePage.verifyApplyLeavePage();
    }

    @When("User click Quick Launch My Leave")
    @Step("User click Quick Launch My Leave")
    public void userClickQuickLaunchMyLeave() {
        DashboardPage.clickMyLeave();
    }

    @Then("User redirects to My Leave Page")
    @Step("User redirects to My Leave Page")
    public void userRedirectsToMyLeavePage() {
        LeavePage.verifyMyLeavePage();
    }

    @When("User click Quick Launch My Timesheet")
    @Step("User click Quick Launch My Timesheet")
    public void userClickQuickLaunchMyTimesheet() {
        DashboardPage.clickMyTimesheet();
    }

    @Then("User redirects to My Timesheet Page")
    @Step("User redirects to My Timesheet Page")
    public void userRedirectsToMyTimesheetPage() {
        TimesheetsPage.verifyMyTimesheetsPage();
    }

    @When("User click Pending Review on My Actions")
    @Step("User click Pending Review on My Actions")
    public void userClickPendingReviewOnMyActions() {
    }

    @Then("User redirects to My Review page")
    @Step("User redirects to My Review page")
    public void userRedirectsToMyReviewPage() {
    }

    @When("User click Candidate to interview on My Actions")
    @Step("User click Candidate to interview on My Actions")
    public void userClickCandidateToInterviewOnMyActions() {
    }

    @Then("User redirects to Candidate Recruitment page")
    @Step("User redirects to Candidate Recruitment page")
    public void userRedirectsToCandidateRecruitmentPage() {
    }
}
