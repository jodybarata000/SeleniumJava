package tests.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Test",
        features = "./src/test/resources/features",
        glue = "tests.Steps",
        plugin = {"summary","pretty","html:target/cucumber-reports","json:target/cucumber-reports"}
)
public class TestRunners {

}
