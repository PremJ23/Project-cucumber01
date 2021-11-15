Feature: Check the room booking accordingly in Atactin application

Scenario Outline: User checking the login page using the correct username and password
Given user launch the application
When User enter the valid "<username>" in the username field
And User enter the correct "<password>" in the password field
Then User clicks on the login button

Examples: 

| username |  | password |
| Kumar |     | 54226o |
| anbu |      | 53333h |
| 8056976137 |  | 805697613 |



Scenario: User has to searching the hotels using checking and checkout date
Given User select the correct location in the location field
When User select the correct hotel in the hotels field
And User has to select the corrcet room type in the room type field
And User select the corrcet number of room in the number of rooms field
And User enter the valid checkin date in the checkin date field
And User enter the valid checkout date in the checkout date field
And User select the adults in the adults per room field
And User select the childrens in the children per room field
Then User clicks the search button

@Sanity
Scenario: User has to select the hotel
Given User select the hotel in the select hotel field
Then User clicks on the continue button

@Regression
Scenario: User has to booking the hotel using valid credit card details
Given User enter the valid first name in the first name field
When User enter the valid last name in the last name field
And User enter the valid address in the billing address field
And User enter the valid credit card number in the card no field
And User selecting the correct card type in the credit card type field
And User selecting the correct month in the expiry month field
And User selecting the correct year in the expiry year field
And User enter the valid cvv number in the cvv number field  
Then User clicks on the book button

Scenario: User has to confirming the hotel booking
When User clicks on the ltinerary button
Then User clicks on the logout button
