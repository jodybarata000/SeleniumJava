package tests.utils;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.fail;
import static tests.utils.driver.DriverUtils.driver;

public class BrowserActions {
    public static void maximizeWindow(){
        driver().manage().window().maximize();
    }
    public static void switchToWindow(String window) {
        driver().switchTo().window(window);
    }
    public static void switchToTab(int tabIndex) {
        ArrayList<String> tabs = new ArrayList<>(driver().getWindowHandles());
        switchToWindow(tabs.get(tabIndex));
    }
    public static void closeAllAdditionalTabs() {
        ArrayList<String> tabs = new ArrayList<>(driver().getWindowHandles());
        if (tabs.size() > 1) {
            for (int i = tabs.size() - 1; i == 1; i--) {
                switchToTab(i); // Switching to tab that should be closed
                closeCurrentTab();
            }
        }
    }
    public static void closeCurrentTab() {
        ArrayList<String> tabs = new ArrayList<>(driver().getWindowHandles());
        if (tabs.size() <= 1) {
            fail("There is nothing to close because only 1 tab is opened.");
        } else {
            driver().close();
            // If we have two tabs. Size of them will be 2. To access first one, idx is 0, second is 1.
            // Since second one is removed, we need to access first tab. Idx of it is generated in this way:
            // 2-2 or in this case tabs.size()-2 .
            switchToTab(tabs.size() - 2);
        }
    }
}

