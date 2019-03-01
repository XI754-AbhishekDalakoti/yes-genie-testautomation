Feature: Product Details Page
  As a user I should be able to see my product details

  Background: User has logged in to Genie
    Given I navigate to "https://cust360.yesgenie.com:31390"
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on Saving Account
    And I wait for 2 sec

#  Scenario: Verify data related to savings account is displayed in tabular view
#    Then I verify the columns and data displayed in the tabular view
#        | Product Holding Flag |  YES                     |
#        | Current Balance      |  20243.77                |
#        | CustId               |  996264849               |
#        | AOD                  |  16-Sep-2018             |
#        | accountNo            |  101400079900037         |
#        | Product Name         |  SAVING ACCOUNT          |
#        | COD Account No       |  21951099990519          |
#        | Product Description  |  511-YES PROSPERITY P... |
#        | Data Date            |  23-Jan-2019             |

#  Scenario: Verify alerts related to savings account is displayed in alert view
#    Then I verify the alerts displayed in the alert view
#      | Your FD is maturing, kindly reniew your FD(1) By: 31-Mar-2019 |
#      | Your FD is maturing, kindly reniew your FD(2) By: 31-Mar-2019 |
#      | Your FD is maturing, kindly reniew your FD(3) By: 31-Mar-2019 |

  Scenario: Verify graph data related to savings account in graph view
    Then I verify the data displayed in the graph view
        |                           |
        |                           |

#  Scenario: Verify data in graph and alert view on single select
#    Then I click on one account
#    And I verify the data in alert view
#    And I verify data in the graph view


