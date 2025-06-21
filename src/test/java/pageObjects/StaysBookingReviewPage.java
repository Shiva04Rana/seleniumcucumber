package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaysBookingReviewPage {

	public WebDriver driver;

	public StaysBookingReviewPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By searchDestinationResult = By.xpath("//h1[@aria-live='assertive']");
	
	public String getDestination() {
		return driver.findElement(searchDestinationResult).getText();
	}

}
