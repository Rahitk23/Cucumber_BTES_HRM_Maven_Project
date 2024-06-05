package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\Features\\", tags = ("@All"), glue = { "StepDefinition" })

public class LoginTestRunner {

}
