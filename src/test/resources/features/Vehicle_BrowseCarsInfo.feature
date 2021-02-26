Feature: Browse Cars Information as user


  Scenario Outline: Browse Cars Information

    Given the user is on the login page
    When the user logged in as "<user>"
#    Then the user should see "Dashboard"
    And the user navigates to "Fleet" "Vehicles"
#    Then the user should see total number of records in table
    And the user clicks on record 1 in table
#    Then the user should see the "General Information" subtitle
    And the user clicks on "Activity" element
#    Then the user should see the "Activity Type" button
    And the user clicks on "Activity Type" element
#    Then the checkbox "All" should be checked
    And the user should see the Input-Box empty
    And the user enters "Calendar event" in the Input-Box
#    Then the table record should have "Calendar event added" as beginning of title
    And the user clicks "Date Range" button
#    Then the user should see dropdown value "between" selected
    And the user selects "earlier than" dropdown option
#    Then the user should see 1 date selector
    And the user clicks "Choose a date" input box
#    Then the user should see "Variables" tab option
    And the user clicks "Variables" tab option
#    Then the user should see "today" link active
    And the user clicks "today" link
#    Then the user should see "today" text
    And the user clicks "Update" button
#    Then the user should see "Date Range: earlier than today" in "Date Range" button
    And the user clicks "Refresh" button
#    Then the user should see the loader mask
    And the user clicks "Newer" button
#    Then the table record should have "Calendar event added" as beginning of title
    And the user clicks "Older" button
#    Then the table record should have "Calendar event added" as beginning of title

    Examples:
      | user         |
      | driver       |
      | storemanager |
      | salesmanager |