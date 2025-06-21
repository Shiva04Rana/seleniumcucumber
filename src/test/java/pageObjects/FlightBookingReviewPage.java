package pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightBookingReviewPage {
	
	public WebDriver driver;

	public FlightBookingReviewPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By serachResultFlightDate = By.cssSelector("div[data-testid*='flight_card_segment_departure_date']");
	
	public String getDateFromBookingScreen(String date) {
		
		return LocalDate.parse(date).format(DateTimeFormatter.ofPattern("dd MMM"));
	}
	
	public List<String> getFlightDatesOnSearchResult() {
					
	return driver.findElements(serachResultFlightDate).stream().map(s->s.getText()).collect(Collectors.toList());
		
	}

}
