Feature: Browse Cars Information "<sdsdsd>" as user

  Background:
    Given the user is on the login page
    When the user logged in as "<user>"
    Then the user should see "Dashboard"

  Scenario Outline:

    When the user navigates to "Vehicles" under "Fleet" module
    Then the user should see total number of records in table
    When the user clicks on record 1 in table
    Then the user should see the "General Information" subtitle
    When the user clicks on "Activity" tab
    Then the user should see the "Activity Type" button
    When the user clicks the "Activity Type" button
    Then the checkbox "All" should be checked
    And the user should see the Input-Box empty
    When the user enters "Calendar event" in the Input-Box
    Then the table record should have "Calendar event added" as beginning of title
    When the user clicks the "Date Range" button
    Then the user should see dropdown value "between" selected
    When the user selects "earlier than" dropdown option
    Then the user should see 1 date selector
    When the user clicks on "Choose a date" input box
    Then the user should see "Variables" tab option
    When the user clicks on "Variables" tab option
    Then the user should see "today" link active
    When the user clicks on "today" link
    Then the user should see "today" text
    When the user clicks on "Update" button
    Then the user should see "Date Range: earlier than today" in "Date Range" button
    When the user clicks on the "Refresh" button
    Then the user should see the loader mask
    When the user clicks on the "Newer" button
    Then the table record should have "Calendar event added" as beginning of title
    When the user clicks on the "Older" button
    Then the table record should have "Calendar event added" as beginning of title

    Examples:
      | user         |
      | driver       |
      | storemanager |
      | salesmanager |