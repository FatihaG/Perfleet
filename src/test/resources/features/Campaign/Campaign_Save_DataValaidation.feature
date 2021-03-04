@PER-166
Feature:


  @PER-167 @PER-165
  Scenario: US44- TC1 Validating Name Field with Valid Data (Positive)
    Given the user logged in as "store manager"
    When the user navigates to "Marketing" "Campaigns"
    And click on "Create Campaign" button
    Then subtitle should changed to "Create Campaign"
    When the user fills "Name" field with "IBM" value
    And click on "Save" button
    Then there should be NO warning message under "Name" input box
    And the user delete the keys in "Name" input box


  @PER-168 @PER-165
  Scenario: US44- TC2 Validating Budget Field with Valid Data (Positive)
    Given the user logged in as "store manager"
    When the user navigates to "Marketing" "Campaigns"
    And click on "Create Campaign" button
    Then subtitle should changed to "Create Campaign"
    When the user fills "butget" field with "123" value
    And click on "Save" button
    Then there should be NO warning message under "Budget" input box
    And the user delete the keys in "Budget" input box


  @PER-169 @PER-165
  Scenario Outline: US44- TC3 Validating Code Field with Valid Data (Positive)
    Given the user logged in as "store manager"
    When the user navigates to "Marketing" "Campaigns"
    And click on "Create Campaign" button
    Then subtitle should changed to "Create Campaign"
    When the user fills "Code" field with "<value>" value
    And click on "Save" button
    Then there should be NO warning message under "Code" input box
    And the user delete the keys in "Code" input box
    Examples:
      | value  |
      | abc    |
      | 123    |
      | abc123 |


  @PER-170 @PER-165
  Scenario Outline: US44- TC4 Sending Invalida Data (Negative Scenario)
    Given the user logged in as "store manager"
    When the user navigates to "Marketing" "Campaigns"
    And click on "Create Campaign" button
    Then subtitle should changed to "Create Campaign"
    When the user fills "<labelName>" field with "<value>" value
    And click on "Save" button
    Then there should be "<expectedMessage>" under "<labelName>"
    And the user delete the keys in "<labelName>" input box
    Examples:
      | labelName | value         | expectedMessage                                                |
      | Name      |               | This value should not be blank.                                |
      | Name      | more than 100 | This value is too long. It should have 100 characters or less. |
#      | Name      | 123           | This value can not be numeric.                                 |
#      | Name      | abc123        | This value can not be numeric.                                 |
#      | Code      |               | This value should not be blank.                                |
#      | Code      | more than 20  | This value is too long. It should have 20 characters or less.  |
#      | Budget    | abv           | This value can not be alphabetic.                              |
#      | Budget    | abc123        | This value can not be alphabetic.                              |






