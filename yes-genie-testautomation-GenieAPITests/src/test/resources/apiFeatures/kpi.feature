@kpi
Feature: Validate kpi APIs




  @smoke @regression @k
  Scenario: User validates the response code of kpi api and mdmId as response where customer type is individual
      Given a genie user has a kpi api to test is "/api/genie/portfolio/kpi/"
      When a genie user passes the "996264849" as a mdmid to get the response from kpi api where customer type is individual
      And get the response from kpi api
      Then a user get the status code 200 as a response from the kpi api where customer type is individual



   @regression @k
    Scenario Outline: User search with valid mdmId and validate response of kpi api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a kpi api to test is "/api/genie/portfolio/kpi/"
      When a genie user passes the "996264849" as a mdmid to get the response from kpi api where customer type is individual
      And get the response from kpi api
      Then user get the response  "<key>" is "<value>" from the kpi api where customer type is individual
      Examples:
        | key                 | value         |
        | kpi                 | GROUP_NRV     |



   @regression @k
    Scenario Outline: User search with valid mdmId and validate response of kpi api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a kpi api to test is "/api/genie/portfolio/kpi/"
      When a genie user passes the "996264849" as a mdmid to get the response from kpi api where customer type is individual
      And get the response from kpi api
      Then user get the response  "<key>" is "<value>" for currencyflag from the kpi api where customer type is individual
      Examples:
       | key                 | value         |
       | currencyFlag        | true          |




   @regression @k
     Scenario: User search with valid mdmId and validate response of kpi api where customer type is Individual for all the mentioned keys in examples
       Given a genie user has a kpi api to test is "/api/genie/portfolio/kpi/"
       When a genie user passes the "24d" as a mdmid to get the response from kpi api where customer type is individual
       And get the response from kpi api
       Then a user get the status code 200 as a response from the kpi api where customer type is individual
       And a user get empty Object as response from the kpi api where customer type is individual


