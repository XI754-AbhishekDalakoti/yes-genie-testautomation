@search
Feature: Validate Create User API

  Background: User has api to test
    Given api to test create user is "http://yesgenie.com:30978/api/customer/search"

@dev
Scenario: User validates the json schema of search user API on create user page
When a genie user creates a user
Then json schema response of search user api is validated successfully