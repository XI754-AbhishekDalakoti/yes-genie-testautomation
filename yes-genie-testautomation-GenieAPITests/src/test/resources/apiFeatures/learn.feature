@learn
Feature: Validate learn APIs

@learn
  Scenario: User validates the response code of learn api
    Given a genie user has a learn api to test is "/api/users/roles"
    When get the response from learn api
    Then a user get the status code 200 as a response from the learn api
    And a user validates a node from response json