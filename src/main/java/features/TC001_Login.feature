Feature: Login Action
Scenario: Verify Login For valid inputs and messase as Login Successful
Given user navigates to login page
When user enters correct user name and password
Then user is directed to the home page
When user is on Home page diplay a message as Login Successful
Then Logout
Scenario: Verify Login For invalid inputs and messase as Login Successful
Given user navigates to login page
When user enters incorrect user name or incorrect password
Then user error message is displayed 
