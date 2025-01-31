Feature: all add customer Scenarios

  @addCustomer @stockManagement
  Scenario Outline: to test the functionality of login button for valid input
    Given I am on login page
  #  When I enter correct username and password
    When I enter "admin" as username and "admin" as password
    And I click on login button
    And I click on add customer link
    And I enter <name> , <address> , <Contact1> , <Contact2>
    And I click on add button
    Then user should be added
    Examples:
    | name      | address | Contact1 | Contact2 |
    | Shrinivas | xyz1    | 4343434  | 343434   |
    | Pragati   | xyz2    | 434343   | 4343     |
    | Mahesh    | xyz3    | 434348   | 676767   |
    | Ramneet   | xyz4    | 767676   | 767767   |