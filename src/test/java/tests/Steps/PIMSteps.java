package tests.Steps;

import io.cucumber.java.en.*;
import tests.pages.DashboardPage;
import tests.pages.PIMPage;
import tests.utils.RandomUtils;

public class PIMSteps {
    private final DashboardPage DashboardPage = new DashboardPage();

    private final PIMPage PIMPage = new PIMPage();

    private final RandomUtils random = new RandomUtils();

    @Then("User navigates to PIM Page")
    public void userNavigatesToPIMPage() {
        DashboardPage
                .clickPIMMenu()
                .verifyEmployeeInformationSection();

    }

    @When("User navigates to the Add Employee page")
    public void userNavigatesToTheAddEmployeePage() {
        PIMPage.clickAddEmployeeBtn();
    }

    @And("User adds in the employee details form with valid information")
    public void userAddsInTheEmployeeDetailsFormWithValidInformation() {
        PIMPage
                .enterFirstName(random.getFirstName())
                .enterMiddleName(random.getMiddleName())
                .enterLastName(random.getLastName());
    }

    @Then("Confirmation message Successfully added is displayed")
    public void confirmationMessageSuccessfullyAddedIsDisplayed() {
        PIMPage
                .clickSaveButton()
                .verifySuccessPopup();
    }

    @And("User adds in the employee details form with Login Details")
    public void userAddsInTheEmployeeDetailsFormWithLoginDetails() {
        PIMPage
                .enterFirstName(random.getFirstName())
                .enterMiddleName(random.getMiddleName())
                .enterLastName(random.getLastName())
                .clickLoginDetailsCheckbox()
                .enterUsernameEmployee(random.getUsername())
                .enterPasswordEmployee(random.getPassword());
    }
}
