@unauthorized

Feature: validate unauthorized user is not able to access api

  @regression
  Scenario: User search with custId and validate response from tha api
    Given api to test is "http://cust360.yesgenie.com:30978/api/genie/customer/search" to test unauthorized functionality
    When a user search with value "<query>" and setting value for threshold "<threshold>" to test unauthorized functionality
    Then a user get the status code 401 as a response from the api

