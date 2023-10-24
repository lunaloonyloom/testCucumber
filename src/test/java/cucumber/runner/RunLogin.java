package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/features/Login.feature",
        glue = "stepDef",
        plugin = {"html:target/HTML_report.html"},
        tags ="@TDD"

)
public class RunLogin {
}
