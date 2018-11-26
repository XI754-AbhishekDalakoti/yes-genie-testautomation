@search
Feature: Validate Create User API

  Background: User has api to test
    Given api to test create user is "http://yesgenie.com:30978/api/customer/search"

  @dev
  Scenario Outline: User validates the json schema of create user page
    When a genie user creates a user
    Then json schema response of "<filename>" is validated successfully
    Examples:
      | filename                             |
      | searchUserApiOnCreateUserSchema.json |
      | updatedRoleSchema.json               |
      | createUser.json                      |

    Scenario: user validates the response from the API
      When a genie user searches the role on user management tab
      Then a user get the status code 200 as a response from the api

