package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = "src/test/java/featureLayer",
				glue = "stepDefinitions",
//				dryRun = true,
				monochrome = true,
				plugin = {"pretty","html:target/cucumber.html"
						,"json:target/cucumber.json"}
//				tags = { "@RegressionTest2" }
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
