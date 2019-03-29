Feature: Next Best Action Page
  As a user I should able to login into my app

  Scenario: User has logged in to Genie
    Given I navigate to url "https://cust360.uat-genie.yesbank.com"
    And I wait for 2 sec
    And I enter "MCC0008398" into input field having id "username"
    And I enter "yesbank@321" into input field having id "password"
    And I click on Login
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I click on record
    And I wait for 2 sec
    Then I lands to SNAP page directly

  @Smoke @Regression
  Scenario: Verify NBA categories and data for Individual customer
    And I wait for 2 sec
    Then I verify categories like "All", "Regulatory", "Service", "X-Sell", "Alerts" and "Information" is displayed in NBA

  @Smoke @Regression
  Scenario: Verify NBA categories and data for Individual customer
    And I wait for 2 sec
    Then I verify recommendation is displayed with below details with icons
      | Kindly Renew your existing FD 1 By: 31-Mar-2019 Book FD |
