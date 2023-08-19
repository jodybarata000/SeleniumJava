package tests.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static tests.utils.BrowserActions.*;
import static tests.utils.driver.DriverUtils.*;

import java.time.Duration;

public class Hooks {
    private static final ThreadLocal<Scenario> threadScenario = new ThreadLocal<>();
    private static final ThreadLocal<String> threadTestName = new ThreadLocal<>();
    public static String getTestName() {
        return threadTestName.get();
    }

    public static void setTestName(String testName) {
        threadTestName.set(testName);
    }
    public static Scenario getScenario() {
        return threadScenario.get();
    }
    public static void setScenario(Scenario scenario) {
        threadScenario.set(scenario);
    }

    @Before
    public static void setup(Scenario scenario){
        setTestName(scenario.getName());
        setScenario(scenario);
        startBrowser();
        maximizeWindow();
        scenario.log("------------------------------\n");
        scenario.log("Test Started: " + getTestName() + "\n");
    }

    @After
    public static void tearDown(Scenario scenario) {
        scenario.log("Test Status: " + getScenario().getStatus() + "\n");
        scenario.log("------------------------------\n");
        try{
            if(isBrowserAlive()){
                setTestName(scenario.getName());
                clearCookies();
                closeAllAdditionalTabs();
            }
            quitBrowser();
        }catch (AssertionError | Exception e) {
            scenario.log("Hook method 'After' failed due to: \n" + e.getMessage());
            e.printStackTrace();
        }
    }
}
