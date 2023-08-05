package tests.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.utils.driver.DriverBuilder;
import static tests.utils.driver.DriverUtils.*;

import java.time.Duration;

public class Hooks {
    private static final ThreadLocal<Scenario> threadScenario = new ThreadLocal<>();
    public static Scenario getScenario() {
    return threadScenario.get();
}

    @Before
    public static void setup(){
        startBrowser();
        maximizeWindow();
    }

    @After
    public static void tearDown() {
        quitBrowser();
    }
}
