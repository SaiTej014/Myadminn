Feature: Login Functionality

  Scenario: Test the User Login Functionality
    Given Im in the Login Page
    When I Fill the Login Credentials
    And I click on Login button
    And dropdown for selecting server should be present
    When I select country as Europe and click Go button
    Then I should navigate to home page
