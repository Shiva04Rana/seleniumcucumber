Feature: Search and book stays
@stays
Scenario: Pick a vibe and explore the top destinations in India
Given user is on booking.com landing page
When user selects stays tab
And user selects vibe as "City"
And user selects destination as "Gurgaon"
Then  user should see all the stays for selected destination