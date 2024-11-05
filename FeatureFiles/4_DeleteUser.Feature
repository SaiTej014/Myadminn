Feature: Deleting User In MyAdmin

  Scenario: Deleting the user
    Given Iam in the Users Page
    And I enter the updated User Id
    When I click Search
    And I should get the new user details
    And Click on the EmailId
    Then I delete the users
