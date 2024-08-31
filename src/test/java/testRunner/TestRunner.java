package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/featurePackage/", glue = {"stepDefinition"}, 
	    plugin = {
	        "pretty", 
	        "html:target/cucumber-html-report",
	        "json:target/cucumber.json",
	        "junit:target/cucumber.xml" },
	    monochrome = true, dryRun = false)

public class TestRunner extends AbstractTestNGCucumberTests{

}
