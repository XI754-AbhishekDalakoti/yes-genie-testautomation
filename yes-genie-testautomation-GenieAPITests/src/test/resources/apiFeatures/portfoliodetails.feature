@portfoliodetails
Feature: Validate portfoliodetails APIs


  @smoke @regression @pd1
  Scenario: User validates the response code of portfoliodetails api and mdmId as response where customer type is individual
    Given a genie user has a portfoliodetails api to test is "/api/genie/portfolio/"
    When a genie user passes the "996264849" as a mdmid and "SA" as product type to get the response from portfoliodetails api where customer type is individual
    And get the response from portfoliodetails api
    Then a user get the status code 200 as a response from the portfoliodetails api where customer type is individual


  @regression @pd1
  Scenario Outline: User search with valid mdmId and validate response of portfoliodetails api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a portfoliodetails api to test is "/api/genie/portfolio/"
    When a genie user passes the "996264849" as a mdmid and "SA" as product type to get the response from portfoliodetails api where customer type is individual
    And get the response from portfoliodetails api
    And user get the response for productCategory loans "<key>" is "<value>" from the portfoliodetails api where customer type is individual
    Examples:
      | key                     | value    sso.uat-genie.yesbank.com                                     |
      | CustId                  | 996264849                                     |
      | AOD                     | 16-Sep-2018                                   |
      | accountNo               | 101400079900037                               |




  @smoke @regression @pd1
  Scenario: User validates the response code of portfoliodetails api and mdmId as response where customer type is customer
    Given a genie user has a portfoliodetails api to test is "/api/genie/portfolio/"
    When a genie user passes the "998003452" as a mdmid and "SA" as product type to get the response from portfoliodetails api where customer type is customer
    And get the response from portfoliodetails api
    Then a user get the status code 200 as a response from the portfoliodetails api where customer type is individual


  @regression @pd1
  Scenario Outline: User search with valid mdmId and validate response of portfoliodetails api where customer type is customer for all the mentioned keys in examples
    Given a genie user has a portfoliodetails api to test is "/api/genie/portfolio/"
    When a genie user passes the "998003452" as a mdmid and "SA" as product type to get the response from portfoliodetails api where customer type is customer
    And get the response from portfoliodetails api
    And user get the response for productCategory loans "<key>" is "<value>" from the portfoliodetails api where customer type is individual
    Examples:
      | key                     | value                                         |
      | CustId                  | 998003452                                     |
      | AOD                     | 16-Sep-2018                                   |
      | accountNo               | 101400079900037                               |


  @regression @pd1
  Scenario: User search with invalid mdmId and validate response of portfoliodetails api where customer type is Individual for all the mentioned keys in examples
    Given a genie user has a portfoliodetails api to test is "/api/genie/portfolio/"
    When a genie user passes the "996264849" as a mdmid and "SAh" as product type to get the response from portfoliodetails api where customer type is individual
    And get the response from portfoliodetails api
    Then a user get the status code 204 as a response from the portfoliodetails api where customer type is individual

