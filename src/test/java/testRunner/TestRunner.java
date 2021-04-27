package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature",
glue = {"stepDefination"},
tags = {"@signup"}, // and opeartor
dryRun = false,
monochrome = true,
plugin = {"pretty" , "html:target/cucumber-pretty" , "json:target/jsonreport", "junit:target/xmlreport"})


public class TestRunner {

}
