package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.FlightBookingReviewPage;
import utils.TestContextSetup;

public class FlightBookingReviewStep {
	
	
	public FlightBookingReviewPage flightBookingReviewPage;
	TestContextSetup testContextSetup;
	
	public FlightBookingReviewStep(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.flightBookingReviewPage = testContextSetup.pageobjectmanager.getFlightBookingReviewPage();
	}
	
	@Then("verify flight result shows all the filghts of {string} date")
	public void verify_flight_result_shows_all_the_filghts_of_date(String date) {
		boolean checkValues = flightBookingReviewPage.getFlightDatesOnSearchResult().stream().allMatch(flightBookingReviewPage.getDateFromBookingScreen(testContextSetup.oneWayBookingDate)::equals);
		Assert.assertEquals(checkValues, true);
	    
	}

}
