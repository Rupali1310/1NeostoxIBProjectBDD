Feature: Login feature
 
Scenario: login into Application

Given user is on loginpage 
When user enters mobile number as "amarwaghmare573@gmail.com"
And user enters digit password as "Test@1234"
And clicks on login button
Then user logged into application and showing username as "Amar Testing" on homepage




   


