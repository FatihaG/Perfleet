Feature: Vehicle Saving
@maria


	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager/Driver I should be able to create car
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1- Storemanager/SalesManager can create car by using Create Car button
	#2- Storemanager/SalesManager can also add Vehicle Model Vehicle Make informations by using +Add button when creating car
	#3- Driver can not create car
  @PER-84
  Scenario Outline: Storemanager can create car by using Create Car button
    Given the user is on the login page
    When the user logs in using "<username>" and "<password>"
    And the user navigates to "Fleet" "Vehicles"
    And the user clicks on "Car Create" element
    Then the user should be on Create Car page
    And the user fills "<licenecePlate>" , "<driverName>"
    And the user clicks on "save" element

    Examples:
      | username     | password    | licenecePlate | driverName |
      | salesmanager | UserUser123 | abc123        | andy       |
      | storemanager | UserUser123 | xyz234        | ellie      |
