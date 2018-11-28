@usermanagement
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

  @smoke @regression
  Scenario: user validates the response code from the API
    When a genie user searches the role on user management tab
    Then a genie user get the status code 200 as a response from the user management api

  @regression
  Scenario Outline: user validates the response from the API
    When a genie user searches the role on user management tab
    Then a genie user get the "<role>" as a response from the user management api for the initial record
    Examples:
      | role  |
      | sales |


  @smoke @regression
  Scenario Outline: user validates the response code from the search user API
    When a genie user searches the user with the "<userId>"
    Then a genie user get the status code 200 as a response from the search user api
    Examples:
      | userId |
      | userId |

  @regression
  Scenario Outline: user validates the response body from the search user API
    When a genie user searches the user with the "userId"
    Then a genie user get the response from the search user api for the initial record for "<key>" is "<value>"
    Examples:
      | key    | value    |
      | userId | Foo6 foo |
      | name   | Foo6 foo |
      | email  | Foo6 foo |
      | mobile | Foo6 foo |

  @regression
  Scenario: user validates the response from the search user API for the case where user does not exist
    When a genie user searches the user with the "userId"
    Then a genie user get the status code 103 as a response from the search user api as user does not exist


  @regression
  Scenario: user validates the response from the search user API for the case where user already exist
    When a genie user searches the user with the "userId"
    Then a genie user get the status code 104 as a response from the search user api as user already exist

  @smoke @regression
  Scenario Outline: user validates the response code from the create user API
    When a genie user creates the user with the "<userId>"
    Then a genie user get the status code 200 as a response from the create user api
    Examples:
      | userId |
      | userId |

  @smoke @regression
  Scenario Outline: user validates the response code from the get created user API
    When a genie user gets the user on view users page with the "<userId>"
    Then a genie user get the status code 200 as a response from the view users api
    Examples:
      | userId |
      | userId |

  @regression
  Scenario Outline: user validates the response code from the edit role API
    When a genie user modify the "<role>" on view users page for the "<userId>"
    Then a genie user get the status code 200 as a response from the modify role api
    Examples:
      | role | userId |
      | role | userId |

  @regression
  Scenario Outline: user validates the response code from the edit role API
    When a genie user delete the user on view users page for the "<userId>"
    Then a genie user get the status code 200 as a response from the delete role api
    Examples:
      | userId |
      | userId |