package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FlightBookingPage;
import utils.TestContextSetup;

public class FlightBookingSteps {
	
	public FlightBookingPage flightBookingPage;
	TestContextSetup testContextSetup;
	
	public FlightBookingSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.flightBookingPage = testContextSetup.pageobjectmanager.getFlightBookingPage();
	}

	
	@Given("user is on booking.com landing page")
	public void user_is_on_booking_com_landing_page() {
	    
	}
	@When("user selects flight tab")
	public void user_selects_flight_tab() {
		flightBookingPage.clickFlightTab();
	}
	@When("user clicks on one way")
	public void user_clicks_on_one_way() {
		flightBookingPage.clickonOneWayTrip();
	}
	@When("^user selects from location as (.+)$")
	public void user_selects_from_location_as(String city) {
		flightBookingPage.enterWhereFrom(city);
	}
	@When("^user selects to locations as (.+)$")
	public void user_selects_to_locations_as(String city) {
		flightBookingPage.enterWhereTo(city);
	}
	@When("User selects date as {string}")
	public void user_selects_date_as(String date) throws InterruptedException {
		flightBookingPage.selectFlightOneWayDate(date);
		testContextSetup.oneWayBookingDate = flightBookingPage.gettodaysDate();
	 
	}
	@When("User selects {int} adults")
	public void user_selects_adults(int count) {
		flightBookingPage.addAdults(count);
	}
	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		flightBookingPage.clickOnSearchButton();
	}


}
