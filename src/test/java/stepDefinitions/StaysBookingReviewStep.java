package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.StaysBookingReviewPage;
import utils.TestContextSetup;

public class StaysBookingReviewStep {
	TestContextSetup testContextSetup;
	StaysBookingReviewPage  staysBookingReviewPage;
	
	public StaysBookingReviewStep(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.staysBookingReviewPage = testContextSetup.pageobjectmanager.getStaysBookingReviewPage();
		
		
	}
	@Then("user should see all the stays for selected destination")
	public void user_should_see_all_the_stays_for_selected_destination() {
		testContextSetup.baseclass.switchWindowToChild();
		System.out.println("testContextSetup.staysDestinationReview "+testContextSetup.staysDestinationReview);
		System.out.println("staysBookingReviewPage.getDestination() "+staysBookingReviewPage.getDestination());
		Assert.assertTrue(staysBookingReviewPage.getDestination().contains(testContextSetup.staysDestinationReview));
		
	}


}
