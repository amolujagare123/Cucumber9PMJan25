Feature: all login scenarios

  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and password
    And I click on login button
    Then I should be on Dashboard

  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    When I enter incorrect username and password
    And I click on login button
    Then I should get error

  Scenario: to test the functionality of login button for blank input
    Given I am on login page
    When I enter blank username and password
    And I click on login button
    Then I should get error