@kpi
Feature: Validate createcase APIs

  @smoke @regression
  Scenario: User validates the response code of kpi api and mdmId as response where customer type is individual
      Given a genie user has a createcase api to test is "http://yesgenie.com:30978/api/case/module/"
      When a genie user passes the "139" as a mdmid to get the response from createcase api where customer type is individual
      And get the response from createcase api
      Then a user get the status code 200 as a response from the kpi api where customer type is individual



   @regression @ar
    Scenario Outline: User search with valid mdmId and validate response of createcase api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a createcase api to test is "http://yesgenie.com:30978/api/case/module/"
      When a genie user passes the "996264849" as a mdmid to get the response from kpi api where customer type is individual
      And get the response from createcase api
      Then user get the response  "<key>" is "<value>" from the createcase api where customer type is individual
      Examples:
        | key                 | value         |
        | kpi                 | GROUP_NRV     |
        | value               | 100000        |



   @regression @ar9
    Scenario Outline: User search with valid mdmId and validate response of createcase api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a createcase api to test is "http://yesgenie.com:30978/api/case/module/"
      When a genie user passes the "996264849" as a mdmid to get the response from createcase api where customer type is individual
      And get the response from createcase api
      Then user get the response  "<key>" is "<value>" for currencyflag from the createcase api where customer type is individual
      Examples:
       | key                 | value         |
       | currencyFlag        | true          |




   @regression @ar10
     Scenario: User search with valid mdmId and validate response of createcase api where customer type is Individual for all the mentioned keys in examples
       Given a genie user has a createcase api to test is "http://yesgenie.com:30978/api/case/module/"
       When a genie user passes the "24" as a mdmid to get the response from createcase api where customer type is individual
       And get the response from createcase api
       Then a user get the status code 200 as a response from the createcase api where customer type is individual
       And a user get empty Object as response from the createcase api where customer type is individual


