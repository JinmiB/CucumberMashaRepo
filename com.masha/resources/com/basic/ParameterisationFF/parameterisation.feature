Feature: Create account facebook22
As a user you need to open fb homepage and do validation
 

Scenario: Validate first name field23
Given User is on facebook login page
When User enters "David" first name
Then User checks "David" first name is present
And Close browser

Scenario: Validate create user multiple fields24
Given User is on facebook login page
When User enters "Ryan" first name
And User enters "Jack" surname
Then User checks "Ryan" first name is present
Then User mobile field should be blank
And Close browser