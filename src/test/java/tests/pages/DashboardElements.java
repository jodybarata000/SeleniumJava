package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.utils.driver.DriverUtils.driver;

public class DashboardElements {

    public WebElement getOrangeHRMDashboard(){
        return driver().findElement(By.xpath("//span//*[text()='Dashboard']"));
    }
    public WebElement getAssignLeaveIcon(){
        return driver().findElement(By.xpath("//*[@title='Assign Leave' and @type='button']"));
    }

    public WebElement getLeaveListIcon(){
        return driver().findElement(By.xpath("//*[@title='Leave List' and @type='button']"));
    }

    public WebElement getTimesheetsIcon(){
        return driver().findElement(By.xpath("//*[@title='Timesheets' and @type='button']"));
    }

    public WebElement getApplyLeaveIcon(){
        return driver().findElement(By.xpath("//*[@title='Apply Leave' and @type='button']"));
    }

    public WebElement getMyLeaveIcon(){
        return driver().findElement(By.xpath("//*[@title='My Leave' and @type='button']"));
    }

    public WebElement getMyTimesheetIcon(){
        return driver().findElement(By.xpath("//*[@title='My Timesheet' and @type='button']"));
    }

    public WebElement getPendingInterview(){
        return driver().findElement(By.xpath("//*[contains(text(), 'Pending Self Review')]"));
    }

    public WebElement getCandidateInterview(){
        return driver().findElement(By.xpath("//*[text()='(1) Pending Self Review']"));
    }
}
