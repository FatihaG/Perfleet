Feature:Vehicle Add Event

  Scenario Outline:
    Given the user logged in as "<usertype>"
    When the user navigates to "Activities" "Calendar Event"
    And the user clicks on "Create Calendar Event"
    Then "<usertype>" select any car on grid button
    And "<usertype>" should be able to add event
    When "<usertype>" updated general information page
    Then "<usertype>" should see update in both general information page
    And "<usertype>" should see update activity tab related add event


    Examples:
      | usertype      |
      | store manager |
      | sales manager |

  @wip
  Scenario Outline: test
    Given the user logged in as "<usertype>"
    When the user navigates to "Activities" "Calendar Events"
    And the user clicks on "Create Calendar event"

    And the user should check the "All-day event" checkbox
    And the user should check the "Call via Hangout" checkbox
    And the user should check the "Repeat" checkbox

    Examples:
      | usertype      |
      | store manager |
