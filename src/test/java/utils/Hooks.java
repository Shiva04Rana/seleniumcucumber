package utils;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup =testcontextsetup;
		
	}
	@After
	public void AfterScenario() throws InterruptedException, IOException {
		
		testcontextsetup.webdrivermanager.getWebDriverManagement().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws InterruptedException, IOException {
		WebDriver driver=testcontextsetup.webdrivermanager.getWebDriverManagement();
		if(scenario.isFailed()) {
			
		File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
		scenario.attach(filecontent, "image/png", "image");
		}
		
	}

}
