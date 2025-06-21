Feature: Search and Place the order
@flight
Scenario Outline: Search experiance for product search in both home and offers page
Given user is on booking.com landing page
When user selects flight tab
And user clicks on one way
And user selects from location as <tocity>
And user selects to locations as <fromcity>
And User selects date as "today"
And User selects 3 adults
And user clicks on search button
Then verify flight result shows all the filghts of "45/08/2024" date

Examples:
|  tocity  | fromcity |
| Mumbai   | Chennai  |
|Bangalore  | Chennai  |
