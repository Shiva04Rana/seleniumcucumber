package pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContextSetup;

public class FlightBookingPage {
	
	public WebDriver driver;

	public FlightBookingPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	private By flightsTab = By.id("flights");
	private By oneWayTripRadioButton = By.cssSelector("#search_type_option_ONEWAY");
	private By whereFromBox = By.xpath("//button[contains(@data-ui-name,'input_location_from_segment')]");
	private By locationInputfield = By.xpath("//input[@placeholder='Airport or city']");
	private By locationDropdownOption = By.cssSelector("span[class*='List-module__checkBox']");
	private By whereToBox = By.xpath("//button[contains(@data-ui-name,'input_location_to_segment')]");
	private By whereToInput = By.xpath("//input[@placeholder='Airport or city']");
	private By dateCalendar = By.xpath("//button[contains(@data-ui-name,'button_date_segment')]");
	private By searchButton = By.xpath("//button[@data-ui-name='button_search_submit']");
	private By adultButton = By.xpath("//button[@data-ui-name='button_occupancy']");
	private By addAdultButton = By.xpath("//button[@data-ui-name='button_occupancy_adults_plus']");
	private By doneAdultButton = By.xpath("//button[@data-ui-name='button_occupancy_action_bar_done']");
	private By oneWayCalandar = By.xpath("//*[@data-ui-name='button_date_segment_0']");
	private By calandarPreviousButton = By.xpath("(//*[@data-ui-name='calendar_body']//button)[1]");
	
	public void clickFlightTab() {
		driver.findElement(flightsTab).click();
	}
	
	public String gettodaysDate() {
		LocalDate today = LocalDate.now();
		return today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
	}
	
	public WebElement todaysDatelocator() {
	return driver.findElement(By.xpath("//span[@data-date='"+gettodaysDate()+"']"));
		
	}
	
	public void checkIfPreviousCalanderEnabled() throws InterruptedException {
		WebElement button = driver.findElement(calandarPreviousButton);
		if(button.isEnabled()) {
			System.out.println("print ");
			Thread.sleep(2000);
			button.click();
		}
	}
	
	public void clickonOneWayTrip() {
		driver.findElement(oneWayTripRadioButton).click();
	}

	public void enterWhereFrom(String fromCity) {
		driver.findElement(whereFromBox).click();
		driver.findElement(locationInputfield).sendKeys(fromCity);
		driver.findElements(locationDropdownOption).getFirst().click();
	}
	
	public void enterWhereTo(String toCity) {
		driver.findElement(whereToBox).click();
		driver.findElement(locationInputfield).sendKeys(toCity);
		driver.findElements(locationDropdownOption).getFirst().click();
	}
	
	public void addAdults(int adult) {
		driver.findElement(adultButton).click();
		System.out.println(adult);
		for(int i=0;i<adult;i++) {
			driver.findElement(addAdultButton).click();;
		}
		
		driver.findElement(doneAdultButton).click();;
	}
	
	public void clickOnSearchButton() {
		driver.findElement(searchButton).click();;
	}
	
	public String selectFlightOneWayDate(String date) throws InterruptedException {
		driver.findElement(oneWayCalandar).click();
		checkIfPreviousCalanderEnabled();
		if(date.equalsIgnoreCase("Today")) {
			todaysDatelocator().click();
			return gettodaysDate();
			
		}
		return "";
		
		
	}

	
	
}
