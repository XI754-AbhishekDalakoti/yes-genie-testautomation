Feature: Snap Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://yesgenie.com:30978/"

  @Regression
  Scenario: Verify demographics attributes in SNAP page of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "chandan" into input field having id "username"
    And I enter "chandan" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the attributes of demographics having customer type corporate

  @Regression
  Scenario: Verify demographics attributes in SNAP page of customer type Individual
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the attributes of demographics having customer type individual

  @Smoke @Regression
  Scenario Outline: Verify NBA categories and data for Individual customer
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the "<category>" with "<count>" and "<recommendation>" , "<recommendationEndDate>", "<actionLableIcon>" is available in NBA section
    Examples:
      | category    | count | recommendation                                  | recommendationEndDate | actionLableIcon |
      | All         | 15    | Kindly Renew your existing FD 3                 | By: 31-Dec-2019       | Book FD         |
      | Regulatory  | 4     | Non Individual Customer not registered on CNB 4 | By: 31-Dec-2019       | Create SR       |
      | Service     | 8     | Issue Cheque Book (P 4)                         | By: 31-Dec-2019       | Issue           |
      | Sell        | 0     |                                                 |                       |                 |
      | Alerts      | 3     | FD Maturing 2                                   | By: 31-Dec-2019       | Renew FD        |
      | Information | 0     |                                                 |                       |                 |

  @Smoke @Regression
  Scenario Outline: Verify NBA categories and data for Corporate customer
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the "<category>" with "<count>" and "<recommendation>" , "<recommendationEndDate>", "<actionLableIcon>" is available in NBA section
    Examples:
      | category    | count | recommendation                                  | recommendationEndDate | actionLableIcon |
      | All         | 13    | Kindly Renew your existing FD 3                 | By: 31-Dec-2019       | Book FD         |
      | Regulatory  | 4     | Non Individual Customer not registered on CNB 3 | By: 31-Dec-2019       | Create SR       |
      | Service     | 6     | Issue Cheque Book (P 4)                         | By: 31-Dec-2019       | Issue           |
      | Sell        | 0     |                                                 |                       |                 |
      | Alerts      | 3     | FD Maturing 2                                   | By: 31-Dec-2019       | Renew FD        |
      | Information | 0     |                                                 |                       |                 |

  @End2End @Smoke @Regression
  Scenario: User is able to book FD
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    When I click on Book FD on ALL category section
    Then I wait for 2 sec
#    Then Book FD page should get open with attributes "CustID" "ProductName", "BU", "SourceRefID", "BranchCode" & "Remarks"
    And I wait for 2 sec
    And Data is prefilled with values "996264849", "FD638", "YES BANK", "FDYES BANK", "416" respectively
    And I click on remarks tab and write "customer wants to book fd" remarks into remarks field
    Then I click on submit button
    And gets message "Transaction has been completed successfully"

  @Regression @End2End
  Scenario: I should get logged out of application
    And I wait for 2 sec
    Then I should get logout
    And I close browser
