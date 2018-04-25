  @dev              @smokeTest
Feature: Google Title
 
Scenario: Validation of Google title
When user goes to google.com
Then user should get proper title 

  
Scenario: Google search
When user goes to google.com
Then user types "Apple" in the search bar
Then user gets "iPhone" related result



Scenario: Test
When user goes to google.com
And user tests something