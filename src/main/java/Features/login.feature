@All
Feature: Login Scenario
Background:
	Given user is already in login page
@valid
Scenario: To test login functionality with valid credentials

	When user enters username & Password
	Then user clicks on login button
	And user is on HomePage
	And Close the link.
	
@invalid
Scenario: To test login functionality with invalid credentials using invalid name and invalid password.
	
	When user enters invalid name.
	And user enter invalid password.
	And user clicks on login button
	Then An error message is displayed saying invalid login.
	And Close the link.
	
		
@invalid	
Scenario: To test login functionality with invalid credentials using valid name and invalid password.
	
	When user enters valid username
	And user enter invalid password.
	And user clicks on login button
	Then An error message is displayed saying invalid login.	
	And Close the link.
	
@invalid	
Scenario: To test login functionality with invalid credentials using  invalid name and invalid password.
	
	When user enters invalid username
	And user enter valid password.
	And user clicks on login button
	Then An error message is displayed saying invalid login.
	And Close the link.	
	
@invalid	
Scenario: To test login functionality without entering password.
	
	When user enters invalid username
	And user clicks on login button
	Then An error message is displayed.		
	And Close the link.
	
@invalid	
Scenario: To test login functionality without entering password.
	
	When user enters valid username
	And user clicks on login button
	Then An error message is displayed.			
	And Close the link.	
@invalid	
Scenario: To test login functionality without entering name.
	
	When user enters valid password.
	And user clicks on login button
	Then An error message is displayed.			
	And Close the link.