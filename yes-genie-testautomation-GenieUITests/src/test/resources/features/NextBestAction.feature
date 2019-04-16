Feature: Next Best Action Page
  As a user I should able to login into my app

  Background: : User has logged in to Genie
    Given I navigate to url "https://cust360.yesgenie.com:31390"
    And I wait for 2 sec
    And I enter "UIAutomationDND" into input field having id "username"
    And I enter "UIAutomation" into input field having id "password"
    And I click on Login
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I click on individual record
    And I wait for 2 sec
    Then I lands to SNAP page directly

  @Smoke @Regression @logout
  Scenario: Verify NBA categories and data for Individual customer
    And I wait for 2 sec
    Then I verify categories like "All", "Regulatory", "Service", "X-Sell", "Alerts" and "Information" is displayed in NBA

  @Smoke @Regression @logout
  Scenario: Verify NBA categories and data for Individual customer
    And I wait for 2 sec
    Then I verify recommendation is displayed with below details with icons
      | Kindly Update email id and mobile no By: 01-Dec-2019 Update Email |
