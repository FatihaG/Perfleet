@odometercreate
Feature: Creating Odometer

  Scenario: Driver Create Odometer
    Given the user is on the login page
    When the user logs in using "user1" and "UserUser123"
    And the user navigates to "Fleet" "Vehicle Odometer"
    When the user clicks on "Create Vehicle Odometer"
    And the user fills in the blanks with data below
      | Odometer Value | 23456       |
      | Date           | Feb 3, 2021 |
      | Driver         | Elon Musk   |
    And the user clicks on "Save"
    