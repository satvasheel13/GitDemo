package CucumberRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/CucumberFeature",
                  glue="Cucumberstepdefinatons",
                  monochrome=true,
                  tags="@Checkout",
                		  plugin = {"json:target/cucumber-reports/Cucumber.json",
                					"html:target/cucumber-reports/cucumber.html",
                					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                  dryRun=false)
public class Testngrunner extends AbstractTestNGCucumberTests {
	
}
