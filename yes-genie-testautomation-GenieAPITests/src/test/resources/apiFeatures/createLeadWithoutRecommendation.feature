@adhoclead
Feature: Validate nba APIs

  @smoke @regression
  Scenario: User validates the response code of create lead lineofbusinesses api and lineofbusinesses as response
    Given a genie user has a create lead lineofbusinesses api to test is "http://yesgenie.com:30978/api/lead/lineofbusinesses"
    Then a user get the status code 200 as a response from the create lead lineofbusinesses api
    And user get "BRB" as a response from create lead lineofbusinesses api

  @smoke @regression
  Scenario: User validates the response code of create lead product name api and product name as response
    Given a genie user has a create lead product name api to test is "http://yesgenie.com:30978/api/lead/productnames"
    When a genie user passes the "BRB" as a product name to get the response from create lead product name api
    Then a user get the status code 200 as a response from the create lead product name api where customer type is individual
    And user get "Savings Account" as a response from create lead product name api


  @smoke @regression
  Scenario: User validates the response code of create lead branchcodes api and branchCode, branchDisplayName as response
    Given a genie user has a create lead branchcodes api to test is "http://yesgenie.com:30978/api/lead/branchcodes"
    Then a user get the status code 200 as a response from the create lead branchcodes api
    And user get "1" as "branchCode" from create lead branchcodes api as a first value
    And user get "NEHRU CENTRE - MUMBAI (1)" as "branchDisplayName" from create lead branchcodes api as a first value

  @regression
  Scenario: User validates the response code of nba create lead without recommendation put api
    Given a genie user has a nba create lead without recommendation api to test is "http://yesgenie.com:30978/api/lead"
    When a genie user edits the "custId" field by "1234567" and "lineOfBusiness" field by "BRB" and "productName" field by "Savings Account" and "sourceReferenceId" field by "Savings AccountBRB" and "remark" field by "test" and "branchCode" field by "1"
    Then user validates all fields in nba create lead without recommendation api modify successfully