package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		format={"pretty","html:report/html","json:report/json/cucumber.json"},
		features="src/main/java/Feature",
		glue={"StepDefenitions"}

		)
public class TestRunner extends AbstractTestNGCucumberTests {
}
