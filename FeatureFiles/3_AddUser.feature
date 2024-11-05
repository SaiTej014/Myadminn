Feature: Adding User in MyAdmin Website

  Scenario: Adding User in MyAdmin
    Given Im in the users page
    And Enter the temp email
    When Click on add user
    And fill all the details including contract number
    And click on create button
    Then I add the country
    And Fill the contract number
    When click done adding
    Then I click add
    And verify the dropdowns
    And I click Save and Email user
