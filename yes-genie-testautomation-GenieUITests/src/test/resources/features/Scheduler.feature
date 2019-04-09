Feature: Login
  As a user I should able to login into my Genie

  Background: User is on Genie Page
    Given I navigate to url "https://cust360.genie.yesbank.com"




  @Regression
  Scenario: User should be able to login when User ID is case insensitive
    Then I wait for 2 sec
    And I enter "SMC0008397" into input field having id "username"
    And I enter "Password#3" into input field having id "password"
    When I click on Login
    Then I should get logged-in with welcome message

     @Regression @Smoke
  Scenario: Search with different parameters
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen2
    And I wait for 2 sec