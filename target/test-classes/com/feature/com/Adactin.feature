Feature: Checking the booking functionality of the adactin hotel application

Scenario: User checking the login page using valid username and password
Given user launch the application
When user enter the valid username in the username field
And user enter the valid password in the password field
Then user clicks on the login button and user navigate to next page

Scenario: User checking the availability of the room in preferred data
Given user select the preferred location

When user select the preferred hotel
And user select the no of rooms
And user select room type
And user enter the check In date
And user enter the check Out date
And user select the Adults per room
And user clicks on the search button and navigate to next page

And user click on the selected hotel
Then user click on the continue button and navigate to the next page

Scenario: User enter the personal details
Given User enter the first name
When User enter the last name
And user enter the Billing address
And user enter the credit card no
And user select the credit card type
And user select the month
And user select the year
And User enter the CVV number
And user click on Book now button 
And user click on My Iternary button 
Then user click on logout button




