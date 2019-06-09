Feature: Create account facebook50
As a user you need to open fb homepage and do validation
 

Scenario: Validate first name field51
Given User is on facebook login page
When User enters first name
Then User checks first name is present

#Scenario: Validate create user multiple fields
#Given User is on facebook login page
#When User enters first name
#And User enters surname
#Then User checks user first name is present
#And User checks user surname is present 
#But User mobile field is empty
