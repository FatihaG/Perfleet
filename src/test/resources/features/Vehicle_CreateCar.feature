Feature:
  @PER-46
  Scenario Outline: SalesManager can create car by using Create Car button
    Given the user is on the login page
    When the user logs in using "<username>" and "<password>"
    And the user navigates to "Fleet" "Vehicles"
    And the user clicks on "Create Car"
    When the user fills in the blanks with data below
      | License Plate       | yc123    |
      | Driver              | yusuf    |
      | Fuel Type           | Electric |
      | CO2 Emissions       | 22       |
      | Horsepower          | 122      |
      | Horsepower Taxation | 2000     |
      | Seats Number        | 67       |
      | Doors Number        | 32       |
      | Color               | blue     |
    And the user clicks on "Save and Close"

    Examples:
      | username        | password    |
      | storemanager85  | UserUser123 |
      | salesmanager101 | UserUser123 |