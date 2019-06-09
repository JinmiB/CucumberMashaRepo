Feature: Create account facebook_5
As a user you need to open fb homepage and do validation

Scenario Outline: Validate create user multiple fields_5
Given User is on facebook login page
When User enters "<user>" first name
And User enters "<surname>" surname
Then User checks "<user>" first name is present
Then User mobile field should be blank
And Close browser
Examples:
   |user     |surname   |
   |James    |Bayleaf   |
   |martin   |clooney   |
   |andrew   |carr      |