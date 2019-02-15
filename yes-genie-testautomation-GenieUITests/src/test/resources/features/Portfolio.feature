@portfolio
Feature: Portfolio Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://cust360.yesgenie.com:30978/"

Scenario: Verify deposit options of the Portfolio section of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify deposit options of portfolio section

Scenario: Verify investment options of the Portfolio section of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify investment options of portfolio section

Scenario: Verify loan options of the Portfolio section of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify loan options of portfolio section

Scenario: Verify cards and wallets options of the Portfolio section of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify cards and wallets options of portfolio section

Scenario: Verify other options of the Portfolio section of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify other options of portfolio section

Scenario: Verify KPI data of the Portfolio section of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify KPI data of portfolio section



Scenario: Verify options of the Portfolio section of customer type Individual
  And I wait for 2 sec
  Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
  And I wait for 2 sec
  When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
  And I wait for 2 sec
  Then I lands to SNAP page directly
  And I wait for 2 sec
  Then I verify deposit options of portfolio section
  And I verify investment options of portfolio section
  And I verify loan options of portfolio section
  And I verify cards and wallets options of portfolio section
  And I verify other options of portfolio section