package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

//this class is created to use variables and methods which are shared among multiple page object files 

public class TestContextSetup {
	  public WebDriver driver;
	  public WebDriverManagement webdrivermanager;
	  public PageObjectManager pageobjectmanager;
	  public BaseClass baseclass;
	  
	  //variables shared across different page files 
	  
	  public String staysDestinationReview;
	  public String oneWayBookingDate;
	  
	  
	  public TestContextSetup() throws InterruptedException, IOException {
		  webdrivermanager = new WebDriverManagement(); 
		  pageobjectmanager = new PageObjectManager(webdrivermanager.getWebDriverManagement());
		  baseclass = new BaseClass(webdrivermanager.getWebDriverManagement());
		  
	  }

}
