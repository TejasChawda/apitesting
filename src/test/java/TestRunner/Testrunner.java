package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/admin/Desktop/API_Automation_Framework/src/test/java/Features/demo.feature",
        glue = "StepDefinition"
)
public class Testrunner {
}
