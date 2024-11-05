Feature: Validating sites page

  Scenario: Validating sites page
    Given I am in the sites page
    And Selecting country as Italy and Entering contract number
    When I Search button
    And I click on the accounts which are displayed
    And Click on Save button and close button
    Then I Click on Contract page and enter the text in text field
    When I click on SiteUsers section
    And Search the user
    And Click Add/Delete button and close button
    When I click on Risk Assessment page
    And Check/checkbox the checkboxes
    And Enter some text in the textField
    And clear the text and save button and close
    And I click on SiteAreas Section
    And Add the name of the building
    And click Add button and close button
    Then I click on Floor Button in site areas
    And I select the building  name
    And I Create the floor name
    And I click on Add button and close button
    When I click on Zones Section
    And Select the Building name and Floor name
    And I add the new zone
    And I select the level
    And Click on add button and close button
    When I click on the locations page
    And Click on ViewAllLocations
    And Click on view deleted button
    And I click on Back
    Then I select the building name and floor name and zone name
    And I add new location name
    And I select new area and detector type and detector
    When I enter the barcode
    Then I click on Add button
    And Close Popup using Close Button
    When I click on Edit Button
    And Edit the location name and new area
    And I edit the detector type
    And Edit the barcode number
    Then I click on Save button and close button
    When I click on Move Button
    And Move the building and floor and zone name
    Then I click on Done Button
    When I check the building name amd floor name and zone name
    And I Delete the Location
    And I click on Yes Button
    And I click on View Deleted Checkbox
    Then I click on Restore Button
    And I click on Yes Button and Uncheck the checkbox
    When I click on Exporting the Pdf
    And I Verify the CriticalLimits Page
    Then I Verify the Alerts Page
