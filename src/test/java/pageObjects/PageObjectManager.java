package pageObjects;

import org.openqa.selenium.WebDriver;

// this class is used 
public class PageObjectManager {
	public FlightBookingPage flightbookingpage;
	public FlightBookingReviewPage flightbookingreviewpage;
	public StaysBookingPage staysBookingPage;
	public StaysBookingReviewPage staysBookingReviewPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	
	public FlightBookingPage getFlightBookingPage() {
		flightbookingpage = new FlightBookingPage(driver);
		return flightbookingpage;
	}
	
	public FlightBookingReviewPage getFlightBookingReviewPage() {
		flightbookingreviewpage = new FlightBookingReviewPage(driver);
		return flightbookingreviewpage;
	}
	
	public StaysBookingPage getStaysBookingPage() {
		staysBookingPage = new StaysBookingPage(driver);
		return staysBookingPage;
	}
	
	public StaysBookingReviewPage getStaysBookingReviewPage() {
		staysBookingReviewPage = new StaysBookingReviewPage(driver);
		return staysBookingReviewPage;
		
	}
	
	

}
