@UserManagement
Feature: Validate UserManagement APIs

  @UserManagementCreate
  Scenario: User validates the response code of UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/roles"
    When get the response from UserManagement api
    Then a user get the status code 200 as a response from the UserManagement api
    And a user validates a node from response json


  @UserManagementCreate
  Scenario Outline: User validates the response code of UserManagement search user api
    Given a genie user has a UserManagement api to test is "/api/users/"
    And user passes username "manisha" with the api url
    When get the response from UserManagement api
    Then a user get the status code 200 as a response from the UserManagement api
    And user get the response for user information "<key>" is "<value>" from the usermanagement api
    Examples:
      | key          | value             |
      | userName     | manisha           |
      | name         | Manisha Chauhan   |
      | email        | manisha@gmail.com |
      | mobileNumber | null              |

  @UserManagementCreate
  Scenario: User validates the response code of UserManagement create api
    Given a genie user has a UserManagement api to test is "/api/users/mappings"
    And user passes role name as "Administrator" and username as "user1" and sends post request
    Then a user get the status code 200 as a response from the UserManagement api
    And a user validates response string


  @UserManagementView
  Scenario: User validates the response code of View UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/roles"
    When get the response from View UserManagement api
    Then a user get the status code 200 as a response from the UserManagement api
    And a user validates a node from view response json

  @UserManagementView
  Scenario Outline: User validates the response code of detail view UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings?raisedByMe=false&role=Administrator"
    When get the response from View UserManagement api
    Then a user get the status code 200 as a response from the UserManagement api
    And user get the response for user information "<key>" is "<value>" from the view UserManagement api
    Examples:
      | key          | value   |
      | userName     | user1   |
      | requestedBy  | priti   |

  @UserManagementApprove
  Scenario: User validates the response code of Approve UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings/approvals"
    And user passes actionType as "approve" and remarks as "" and username as "user1" and sends post request
    Then a user get the status code 200 as a response from the UserManagement api

