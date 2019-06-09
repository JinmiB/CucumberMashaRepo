Feature: Create account facebook62
As a user you need to open fb homepage and do validation
 
Scenario: Validate create user multiple fields63
Given User is on facebook login page
When User enters following data
  |userName  |userSurname |Mobile |
  |alex      |hanks       |75696  |
  |michael   |jones       |25599  |

