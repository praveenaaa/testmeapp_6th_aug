package skelton99.src.test.java.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "skelton.src.test.resources.skeleton"
		,glue={"skelton99/src/test/java/skeleton/Stepdefs.java"}
		)
//@CucumberOptions(plugin = {"pretty"})
public class RunCukesTest {
}
