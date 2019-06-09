Feature: Create account facebook16
As a user you need to open fb homepage and do validation
 

Scenario: Validate first name field17
Given User is on facebook login page
When User enters first name
Then User checks first name is present
And Close browser

Scenario: Validate create user multiple fields18
Given User is on facebook login page
When User enters first name
And User enters surname
Then User checks first name is present
Then User mobile field should be blank
And Close browser