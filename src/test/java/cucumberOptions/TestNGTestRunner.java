package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
glue="stepDefinitions", 
monochrome=true, dryRun=false,tags="@stays",
plugin= {"summary","pretty","html:target/cucumber.html","json:target/cucmber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun: target/failed_scenarios.txt"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel =true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}

// AbstractTestNGCucumberTests Cucumber-JVM library for integrating Cucumber with TestNG, which is a popular testing framework in Java. It serves as a base class for running Cucumber scenarios using TestNG.

//monochrome=true option is used to make the console output more readable and clean 

//dryrun=true checks for the existence of step definitions for all the steps in your feature files without running the steps