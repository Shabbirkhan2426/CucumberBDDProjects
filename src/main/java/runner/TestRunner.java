package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "not @ignore",
        plugin = {"pretty", "html:target/cucumber"},
        strict = true,
        features="src/main/resources/",
        glue = "stepsdefinations")
public class TestRunner {
}
