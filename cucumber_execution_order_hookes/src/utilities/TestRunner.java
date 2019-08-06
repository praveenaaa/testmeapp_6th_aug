package utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature99"
		,glue={"step_definition4"}
		)

public class TestRunner {

}
