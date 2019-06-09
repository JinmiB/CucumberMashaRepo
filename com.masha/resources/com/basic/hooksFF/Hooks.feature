Feature: Create account facebook42
As a user you need to open fb homepage and do validation
 

Scenario: Validate first name field43
Given User is on facebook login page
When User enters "David" first name
Then User checks "David" first name is present

Scenario: Validate create user multiple fields44
Given User is on facebook login page
When User enters "Ryan" first name
And User enters "Jack" surname
Then User checks "Ryan" first name is present
Then User mobile field should be blank
