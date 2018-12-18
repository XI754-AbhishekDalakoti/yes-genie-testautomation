Feature: Snap Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://yesgenie.com:30978/"

  Scenario: Verify demographics attributes in SNAP page of customer type Individual
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "panna" into input field having id "username"
    And I enter "123" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    And I verify all the attributes of demographics having customer type individual

  Scenario: Verify demographics attributes in SNAP page of customer type Corporate
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    And I verify all the attributes of demographics having customer type corporate
    Then I should get logout

  @Regression
  Scenario: Close browser
    Then I close browser