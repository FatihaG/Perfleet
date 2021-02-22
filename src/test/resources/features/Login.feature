
  Feature: Users should be able to login
    Scenario login as a driver
    Given the user on login page
    When the user given driver information
    Then the user should be able to login

    Scenario login as a sales manager
      Given the user on login page
      When the user given sales manager information
      Then the user should be able to login

    Scenario login as a store manager
      Given the user on login page
      When the user given store manager information
      Then the user should be able to login