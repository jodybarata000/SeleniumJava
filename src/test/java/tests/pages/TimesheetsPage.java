package tests.pages;

import static tests.utils.WaitUtils.waitUntilElementIsDisplayed;

public class TimesheetsPage {

    private final TimesheetsElements TimesheetsElements = new TimesheetsElements();

    public TimesheetsPage verifyTimesheetsPage(){
        waitUntilElementIsDisplayed(TimesheetsElements.getTitleTimesheetsList());
        return this;
    }
}
