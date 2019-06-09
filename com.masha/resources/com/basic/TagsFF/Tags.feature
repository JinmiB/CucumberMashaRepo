@Important
Feature: Create account facebook
As a user you need to open fb homepage and do validation
 
@Smoke
Scenario: Validate first name field1
Given User is on facebook login page
When User enters "David" first name
Then User checks "David" first name is present
And Close browser

@Smoke @Regression
Scenario: Validate create user multiple fields2
Given User is on facebook login page
When User enters "Ryan" first name
And User enters "Jack" surname
Then User checks "Ryan" first name is present
Then User mobile field should be blank
And Close browser

Scenario: Validate first name field3
Given User is on facebook login page
When User enters "Davids" first name
Then User checks "Davids" first name is present
And Close browser

@Regression
Scenario: Validate first name field4
Given User is on facebook login page
When User enters "Ben" first name
Then User checks "Ben" first name is present
And Close browser

@Smoke
Scenario: Validate first name field5
Given User is on facebook login page
When User enters "Vid" first name
Then User checks "Vid" first name is present
And Close browser