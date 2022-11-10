Feature: Buy feature 

#------------------------------------------------
Background: login into Application

Given user is on loginpage 
When user enters mobile number as "amarwaghmare573@gmail.com"
And user enters digit password as "Test@1234"
And clicks on login button
Then user logged into application and showing username as "Amar Testing" on homepage

#------------------------------------------------

Scenario Outline: Buy Wipro trades 

Given user is on homepage 
When user search company name as <"companyName">
And select company from listed options 
Then user is on Exchange page 
When user clicks on buy button1
And Enters quantity <"count">
And user clicks on buy button2
Then user sucessfully placed order and showing msg as "Order placed sucessfully"

Examples: 

	|companyName|count|
	|Wipro|5|