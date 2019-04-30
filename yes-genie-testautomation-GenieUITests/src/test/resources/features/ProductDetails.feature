Feature: Product Details Page
  As a user I should be able to see my product details

  Background: User has logged in to Genie
    Given I navigate to url "https://cust360.yesgenie.com:31390"
    Then I wait for 2 sec
    And I enter "UIAutomationDND" into input field having id "username"
    And I enter "UIAutomation" into input field having id "password"
    Then I click on Login
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I click on individual record
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on Saving Account
    And I wait for 2 sec

  @End2End @logout
  Scenario: Verify data related to savings account is displayed in tabular view
    Then I verify the columns and data displayed in the tabular view
      | Product Holding Flag |  YES                     |
      | Current Balance      |  20243.77                |
      | CustId               |  996264849               |
      | AOD                  |  16-Sep-2018             |
      | accountNo            |  101400079900037         |
      | Product Name         |  SAVING ACCOUNT          |
      | COD Account No       |  21951099990519          |
      | Product Description  |  511-YES PROSPERITY P... |
      | Data Date            |  23-Jan-2019             |

  @End2End @logout
  Scenario: Verify alerts related to savings account is displayed in alert view
    Then I verify the alerts displayed in the alert view
      | You have need of locker, kindly request a locker(1) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(2) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(3) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(4) By: 01-Dec-2019 |

  @End2End @logout
  Scenario: Verify graph data related to savings account in graph view
    Then I wait for 2 sec
    And I verify the data displayed in the graph view
      | BANK_AMB:₹943,913.79      |
      | BANK_AQB:₹1,116,437.24    |

  @End2End @logout
  Scenario: Verify data in graph and alert view on single select
    Then I click on one account information row
    Then I verify the alerts displayed in the alert view
      | You have need of locker, kindly request a locker(1) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(2) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(3) By: 01-Dec-2019 |
    And I verify the data displayed in the graph view
      | BANK_AMB:₹943,913.79      |
      | BANK_AQB:₹872,218.62      |

  @End2End @Regression @logout
  Scenario: Verify data in graph and alert view on double select
    Then I click on one account information row
    And I also click on the second account information row
    Then I verify the alerts displayed in the alert view
      | You have need of locker, kindly request a locker(1) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(2) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(3) By: 01-Dec-2019 |
    And I verify the data displayed in the graph view
      | BANK_AMB:₹943,913.79      |
      | BANK_AQB:₹1,116,437.24    |

  @End2End @Regression @logout
  Scenario: Verify on clicking reset button the page restores to original values
    Then I click on one account information row
    And I verify "You are viewing details of A/C No. 101400079900037" displayed near the reset button
    Then I click on the reset button
    Then I verify the alerts displayed in the alert view
      | You have need of locker, kindly request a locker(1) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(2) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(3) By: 01-Dec-2019 |
      | You have need of locker, kindly request a locker(4) By: 01-Dec-2019 |
    And I verify the data displayed in the graph view
      | BANK_AMB:₹943,913.79      |
      | BANK_AQB:₹1,116,437.24    |



