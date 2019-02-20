@portfoliotrend
Feature: Validate portfoliotrend APIs


  @smoke @regression @pt
  Scenario: User validates the response code of portfoliotrend api and mdmId as response where customer type is individual
    Given a genie user has a portfoliotrend api to test is "http://cust360.yesgenie.com:30978/api/genie/portfolio/trend/"
    When a genie user passes the "996264849" as a mdmid and "SA" as product type to get the response from portfoliotrend api where customer type is individual
    And get the response from portfoliotrend api
    Then a user get the status code 200 as a response from the portfoliotrend api where customer type is individual


  @regression @pt
  Scenario Outline: User search with valid mdmId and validate response of portfoliotrend api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a portfoliotrend api to test is "http://cust360.yesgenie.com:30978/api/genie/portfolio/trend/"
    When a genie user passes the "996264849" as a mdmid and "SA" as product type to get the response from portfoliotrend api where customer type is individual
    And get the response from portfoliotrend api
    Then Verify data for account no "101400079900037"
    And user get the response for kpiTrendEntityMap BANK_AMB for account "<key>" is "<value>" from the portfoliotrend api where customer type is individual
    Examples:
      | key                     | value                                  |
      | month                   | 01                                     |
      | year                    | 2018                                   |
      | kpi                     | BANK_AMB                               |
      | kpi_value               | 278725.05                              |




  @regression @pt
  Scenario Outline: User search with valid mdmId and validate response of portfoliotrend api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a portfoliotrend api to test is "http://cust360.yesgenie.com:30978/api/genie/portfolio/trend/"
    When a genie user passes the "996264849" as a mdmid and "SA" as product type to get the response from portfoliotrend api where customer type is individual
    And get the response from portfoliotrend api
    And user get the response for kpiTrendEntityMap BANK_AQB "<key>" is "<value>" from the portfoliotrend api where customer type is individual
    Examples:
      | key                     | value                                  |
      | month                   | 02                                     |
      | year                    | 2018                                   |
      | kpi                     | BANK_AQB                               |
      | kpi_value               | 218.62                                 |



  @regression @pt
  Scenario Outline: User search with valid mdmId and validate response of portfoliotrend api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a portfoliotrend api to test is "http://cust360.yesgenie.com:30978/api/genie/portfolio/trend/"
    When a genie user passes the "996264849" as a mdmid and "SA" as product type to get the response from portfoliotrend api where customer type is individual
    And get the response from portfoliotrend api
    And user get the cumulative response for kpiTrendAggregatedData BANK_AMB "<key>" is "<value>" from the portfoliotrend api where customer type is individual
    Examples:
      | key                     | value                                  |
      | month                   | 01                                     |
      | year                    | 2018                                   |
      | kpi                     | BANK_AMB                               |
      | kpi_value               | 278794.35                              |




  @regression @pt
  Scenario: User search with invalid mdmId and validate response of portfoliotrend api where customer type is Individual for all the mentioned keys in examples
    Given a genie user has a portfoliotrend api to test is "http://cust360.yesgenie.com:30978/api/genie/portfolio/trend/"
    When a genie user passes the "996264849" as a mdmid and "SAh" as product type to get the response from portfoliotrend api where customer type is individual
    And get the response from portfoliotrend api
    Then a user get the status code 204 as a response from the portfoliotrend api where customer type is individual

