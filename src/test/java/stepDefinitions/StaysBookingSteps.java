package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FlightBookingPage;
import pageObjects.StaysBookingPage;
import utils.BaseClass;
import utils.TestContextSetup;

public class StaysBookingSteps {
	
	//public BaseClass base;
	TestContextSetup testContextSetup;
	StaysBookingPage staysBookingPage;
	
	public StaysBookingSteps(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.staysBookingPage = testContextSetup.pageobjectmanager.getStaysBookingPage();
			
	}
	

@When("user selects stays tab")
public void user_selects_stays_tab() {
	staysBookingPage.clickOnStaysTab();
}
@When("user selects vibe as {string}")
public void user_selects_vibe_as(String vibe) {
    staysBookingPage.selectVibe(vibe);
}
@When("user selects destination as {string}")
public void user_selects_destination_as(String destination) {
	staysBookingPage.selectDestination(destination);
	testContextSetup.staysDestinationReview =destination;
	
}



}
