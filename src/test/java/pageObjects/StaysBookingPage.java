package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaysBookingPage {
	
	public WebDriver driver;

	public StaysBookingPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	private By staysTab = By.cssSelector("#accommodations");
	
	private By vibedestinationBlock = By.xpath("//div[contains(@data-capla-component-boundary,'TripTypesCarousel')]");
	
	private By vibeList = By.xpath("//button[@data-testid='webcore-filter-carousel-tab-trigger']");
	
	private By destinationLists = By.xpath("//*[@data-testid='webcore-carousel-title']");
	
	
	
	public void clickOnStaysTab() {
		driver.findElement(staysTab).click();
	}
	
	public void selectVibe(String vibe) {
		List<WebElement> vibleelements =driver.findElement(vibedestinationBlock).findElements(vibeList);
		//vibleelements.stream().map(ele-> ele.getText()).findFirst()
		vibleelements.stream().filter(ele-> ele.getText().equals(vibe)).findFirst().orElse(null).click();
	}
	
	public void selectDestination(String destination) {
		//List<WebElement> destinationList = driver.findElement(vibedestinationBlock).findElements(destinationList);
		List<WebElement> destinationList =driver.findElement(vibedestinationBlock).findElements(destinationLists);
		destinationList.stream().filter(ele->ele.getText().equals(destination)).findFirst().orElse(null).click();
		 
	}

}
