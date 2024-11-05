Feature: Creating a Temporary email

  Scenario: Creating a temporary mail
    Given Im in Temp mail Website
    And I verify the search bar
    When I enter a random email
    And I click on Copy
    Then I Close the Window
