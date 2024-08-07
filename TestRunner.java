package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/Assesment1/SwagLabs/src/main/feature/Login.feature",glue = "stepDefinitions")
public class TestRunner {
}
