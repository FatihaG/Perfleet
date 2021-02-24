Feature:Vehicle Add Event

  Scenario Outline:
    Given open the url page
    When user write to user name and password
    And user should be able to login successfully
    Then "<usertype>" select any car on grid button
    And "<usertype>" should be able to add event
    When "<usertype>" updated general information page
    Then "<usertype>" should see update in both general information page
    And "<usertype>" should see update activity tab related add event
    Examples:
      | usertype     |
      | storemanager |
      | salesanager  |