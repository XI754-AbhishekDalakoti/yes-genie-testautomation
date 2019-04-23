Feature: Snap Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "https://cust360.yesgenie.com:31390"
    And I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    And I click on Login

  @Smoke @Regression
  Scenario Outline: Verify NBA categories and data for Individual customer
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 5 sec
    Then I verify all the "<category>" with "<count>" and "<recommendation>" , "<recommendationEndDate>", "<actionLableIcon>" is available in NBA section
    Examples:
      | category    | count | recommendation                                | recommendationEndDate | actionLableIcon |
      | All         | 18    | Kindly Renew your existing FD 1               | By: 31-Mar-2019       | Book FD         |
      | Regulatory  | 8     | ECS updated with incorrect account number     | By: 31-Mar-2019       | Create SR       |
      | Service     | 4     | Kindly Update email id and mobile no          | By: 31-Mar-2019       | Update Email    |
      | Sell        | 4     | Kindly Renew your existing FD 1               | By: 31-Mar-2019       | Book FD         |
      | Alerts      | 2     | Your FD is maturing, kindly reniew your FD(1) | By: 31-Mar-2019       | Renew FD        |
      | Information | 0     |                                               |                       |                 |

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
      | category    | count | recommendation                             | recommendationEndDate | actionLableIcon |
      | All         | 12    | Kindly Renew your existing FD 3            | By: 31-Mar-2019       | Book FD         |
      | Regulatory  | 5     | ECS updated with incorrect account number  | By: 31-Mar-2019       | Create SR       |
      | Service     | 3     | Issue Cheque Book (P 2)                    | By: 24-Mar-2019       | Issue           |
      | X-Sell      | 2     | Kindly Renew your existing FD 3            | By: 31-Mar-20         | Book FD         |
      | Alerts      | 2     | Your FD is maturing, kindly reniew your FD | By: 31-Mar-2019       | Renew FD        |
      | Information | 0     |                                            |                       |                 |

  @Smoke @Regression
  Scenario: User is able to dismiss the recommendation
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'X-Sell' section in NBA
    And I click on cross button in 'X-Sell' recommendation
    And I click on 'Dimiss' option to dismiss the recommendation
    And I wait for 2 sec
    Then I select dimiss reason from dialogue box and i click on submit
    And I wait for 2 sec
    Then I get message "Dismissed Successfully !"

  @Regression
  Scenario: Verify demographics detailed attributes value of detailed MDM id with demographics of customer type Individual
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all DemogsValue with DetailedValue
      | 996264849                | 996264849                |
      | CHARU SADANA             | CHARU SADANA             |
      | 27-Aug-1975              | 27-Aug-1975              |
      | BUSINESS                 | BUSINESS                 |
      | csadana@yahoo.co.in      | csadana@yahoo.co.in      |
      | 917123456789             | 917123456789             |
      | SAHARANPUR,UTTAR PRADESH | SAHARANPUR,UTTAR PRADESH |

