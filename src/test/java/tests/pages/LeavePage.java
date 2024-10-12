package tests.pages;

import static tests.utils.ComponentUtils.clickElement;
import static tests.utils.WaitUtils.waitUntilElementIsDisplayed;

public class LeavePage {
    private final LeaveElements LeaveElements = new LeaveElements();

    public LeavePage verifyAssignLeavePage(){
        waitUntilElementIsDisplayed(LeaveElements.getTitleAssignLeave());
        return this;
    }

    public LeavePage verifyLeaveListPage(){
        waitUntilElementIsDisplayed(LeaveElements.getTitleLeaveList());
        return this;
    }

}
