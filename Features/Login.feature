Feature: all login scenarios

  @login @valid
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
#    When I enter correct username and password
    When I enter "admin" as username and "admin" as password
    And I click on login button
    Then I should be on Dashboard

  @login @invalid
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
#    When I enter incorrect username and password
    When I enter "user-inc" as username and "dsdsd" as password
    And I click on login button
    Then I should get error
  @login @invalid
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
 #   When I enter blank username and password
    When I enter "" as username and "" as password
    And I click on login button
    Then I should get error


    @userReg
    Scenario: to test the functionality of submit button to create user
      Given I am on user registration page
      When I enter below Data
    | John | Doe |john.doe@example.com|+1234567890|123 Main St|New York|NY|10001|USA|SecurePass123!|
      And I click on submit button
      Then user should be submitted


