package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/Login_Test.feature"},
        glue = {"Steps"},
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json",
                    "html:target/cucumber-html-report","usage:target/cucumber-usage.json",""+"junit:target/cucumber-result.xml"},
        dryRun = false
)
public class RegressionTest extends AbstractTestNGCucumberTests {

}
