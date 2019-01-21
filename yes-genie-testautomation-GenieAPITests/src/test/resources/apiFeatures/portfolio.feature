@portfolio
Feature: Validate portfolio APIs

  @smoke @regression
  Scenario: User validates the response code of portfolio api and mdmId as response where customer type is individual
      Given a genie user has a portfolio api to test is "http://yesgenie.com:30978/api/portfolio/"
      When a genie user passes the "996264849" as a mdmid to get the response from portfolio api where customer type is individual
      And get the response from portfolio api
      Then a user get the status code 200 as a response from the portfolio api where customer type is individual


  @regression
  Scenario Outline: User search with valid mdmId and validate response of portfolio api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a portfolio api to test is "http://yesgenie.com:30978/api/portfolio/"
    When a genie user passes the "996264849" as a mdmid to get the response from portfolio api where customer type is individual
    Then user get the response for productCategory loans "<key>" is "<value>" from the portfolio api where customer type is individual
    Examples:
      | key                 | value         |
      | total               | 26100000      |
      | mdmId               | 996264849     |
      | custId              | 996264849     |
      | productType         | AL            |
      | productDescription  | Auto Loan     |
      | value               | 1100000       |
      | productCategory     | LOANS         |
      | productHoldingFlag  | YES           |
      | usageTrend          | Good          |


  @regression
  Scenario Outline: User search with valid mdmId and validate response of portfolio api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a portfolio api to test is "http://yesgenie.com:30978/api/portfolio/"
      When a genie user passes the "996264849" as a mdmid to get the response from portfolio api where customer type is individual
      Then user get the response for productCategory others "<key>" is "<value>" from the portfolio api where customer type is individual
      Examples:
        | key                 | value         |
        | productCategory     | OTHERS        |
        | total               | 0             |
        | mdmId               | 996264849     |
        | custId              | 996264849     |
        | productType         | CB            |
        | productDescription  | Cheque Book   |
        | value               | 0             |
        | productCategory     | OTHERS        |
        | productHoldingFlag  | 28-Feb-19     |
        | usageTrend          | null          |


  @regression
  Scenario: User search with valid mdmId and validate response of portfolio api where customer type is Individual for all the mentioned keys in examples
    Given a genie user has a portfolio api to test is "http://yesgenie.com:30978/api/portfolio"
    When a genie user passes the "24" as a mdmid to get the response from portfolio api where customer type is individual
    Then a user get the status code 200 as a response from the portfolio api where customer type is individual
    And a user get empty Object as response from the portfolio api where customer type is individual


