package tests.pages;

import static tests.utils.ComponentUtils.clickElement;
import static tests.utils.WaitUtils.waitUntilElementIsDisplayed;

public class DashboardPage {
    private final DashboardElements DashboardElements = new DashboardElements();

    public DashboardPage verifyUserSuccessLogin(){
        waitUntilElementIsDisplayed(DashboardElements.getOrangeHRMDashboard());
        return this;
    }

    public DashboardPage clickAssignLeave(){
        clickElement(DashboardElements.getAssignLeaveIcon());
        return this;
    }

    public DashboardPage clickLeaveList(){
        clickElement(DashboardElements.getLeaveListIcon());
        return this;
    }

    public DashboardPage clickTimesheets(){
        clickElement(DashboardElements.getTimesheetsIcon());
        return this;
    }
}
