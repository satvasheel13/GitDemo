package Cucumberstepdefinatons;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	public BaseTest base;

	public Hooks(BaseTest base) {
		   this.base=base;
		}
	
	@After
	public void teardown() throws IOException {
		base.testbase.webdriver().quit();
	}
	
	@AfterStep
	public void takescreenshot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) base.testbase.webdriver();

			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	}
}
