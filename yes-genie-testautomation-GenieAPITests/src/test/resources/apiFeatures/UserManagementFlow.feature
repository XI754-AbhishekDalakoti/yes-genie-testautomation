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
    And user passes role name as "Administrator" and username as "testa" and sends post request
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
      | userName     | testa   |
      | requestedBy  | priti   |

  @UserManagementApprove
  Scenario: User validates the response code of Approve UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings/approvals"
    And user passes actionType as "approve" and remarks as "" and username as "testa" and sends post request
    Then a user get the status code 200 as a response from the UserManagement api


  @UserManagementEdit
  Scenario: User validates the response code of Edit UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings"
    And user passes userName as "testa" and role as "RM" and sends put request
    Then a user get the status code 200 as a response from the UserManagement api


  @UserManagementEdit
  Scenario Outline: User validates the response code of user Edit UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings?raisedByMe=false&role=RM"
    When get the response from View UserManagement api
    Then a user get the status code 200 as a response from the UserManagement api
    And user get the response for user information "<key>" is "<value>" from the user edit UserManagement api
    Examples:
      | key           | value           |
      | userName      | testa           |
      | requestedBy   | priti           |
      | operation     | UPDATED         |
      | oldValue      | Administrator   |
      | newValue      | RM              |

  @UserManagementEdit
  Scenario: User validates the response code of Edit Approve UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings/approvals"
    And user passes actionType as "approve" and remarks as "" and username as "testa" and sends post request
    Then a user get the status code 200 as a response from the UserManagement api

  @UserManagementDelete
  Scenario: User validates the response code of delete UserManagement user api
    Given a genie user has a UserManagement api to test is "/api/users/mappings/"
    When username "testa" added with the api url
    Then a user get the status code 200 as a response from the UserManagement api

  @UserManagementDelete
  Scenario Outline: User validates the response code of user Delete UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings?raisedByMe=false&role=RM"
    When get the response from View UserManagement api
    Then a user get the status code 200 as a response from the UserManagement api
    And user get the response for user information "<key>" is "<value>" from the user Delete UserManagement api
    Examples:
      | key           | value           |
      | userName      | testa           |
      | requestedBy   | priti           |
      | operation     | DELETED         |
      | oldValue      | null            |
      | newValue      | null            |

  @UserManagementApproveDelete
  Scenario: User validates the response code of Edit Approve UserManagement api
    Given a genie user has a UserManagement api to test is "/api/users/mappings/approvals"
    And user passes actionType as "approve" and remarks as "" and username as "testa" and sends post request
    Then a user get the status code 200 as a response from the UserManagement api



    @UserManagementCreate
    Scenario: User validates the response code of UserManagement api
      Given Hello