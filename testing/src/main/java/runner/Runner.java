package runner;

// import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


// @RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/CucumberFeature",glue= {"stepDefinitions"}, dryRun=false)
public class Runner {
}