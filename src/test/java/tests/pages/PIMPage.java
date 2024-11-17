package tests.pages;

import static tests.utils.ConfigFileReader.*;
import static tests.utils.ComponentUtils.*;
import static tests.utils.driver.DriverUtils.navigateToUrl;
import static tests.utils.WaitUtils.waitUntilElementIsDisplayed;
public class PIMPage {
    private final PIMElements PIMElements = new PIMElements();

    public PIMPage clickAddEmployeeBtn(){
       clickElement(PIMElements.getAddBButton());
       return this;
    }

    public PIMPage enterFirstName(String firstName){
        enterTextToField(PIMElements.getFirstNameField(),firstName);
        return this;
    }

    public PIMPage enterMiddleName(String middleName){
        enterTextToField(PIMElements.getMiddleNameField(),middleName);
        return this;
    }

    public PIMPage enterLastName(String lastName){
        enterTextToField(PIMElements.getLastNameField(),lastName);
        return this;
    }

    public PIMPage clickSaveButton(){
        clickElement(PIMElements.getSaveBtn());
        return this;
    }

    public PIMPage verifySuccessPopup(){
        waitUntilElementIsDisplayed(PIMElements.getSuccesfullySavedPopup());
        return this;
    }

    public PIMPage clickLoginDetailsCheckbox(){
        clickElement(PIMElements.getLoginDetailsCheckbox());
        return this;
    }

    public PIMPage enterUsernameEmployee(String username){
        enterTextToField(PIMElements.getUsernameField(),username);
        return this;
    }

    public PIMPage enterPasswordEmployee(String password){
        enterTextToField(PIMElements.getPasswordField(),password);
        enterTextToField(PIMElements.getConfirmPasswordField(),password);
        return this;
    }
}
