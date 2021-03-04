@eo
Feature: Edit Odometer

  Scenario: Driver edits odometer
    Given the user logged in as "driver"
    When the user navigates to "Fleet" "Vehicle Odometer"
    And the user selects 1 st option
    And the user clicks on "Edit Vehicle Odometer"
    And the user fills in the blanks with data below
    |Odometer Value|99999999999|
    And the user clicks on "Save"



    
    
    
    
  Scenario Outline: <user>  cannot edit odometer
    
    

    Examples:
      | user          |
      | sales manager |
      | store manager |