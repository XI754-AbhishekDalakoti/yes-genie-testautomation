@case
Feature: Validate createcase module APIs


  @smoke @regression @cm
  Scenario: User validates the response code of createcasemodule api and mdmId as response where customer type is individual
      Given a genie user has a createcasemodule api to test is "/api/genie/case/module/"
      When user pass crm_id "139"
      And get the response from createcasemodule api
      Then a user get the status code 200 as a response from the createcasemodule api where customer type is individual



   @regression @cm
    Scenario Outline: User validate response of createcasemodule api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a createcasemodule api to test is "/api/genie/case/module/"
      When user pass crm_id "139"
      And get the response from createcasemodule api
      Then user get the response  with issueTypeId 139 in createcasemodule api where customer type is individual
      Then user get the response  "<key>" is "<value>" from the createcasemodule api where customer type is individual
      Examples:
        | key                 |value             |
        | productName         |Cheque CMS and ECS|
        | caseType            |ECS               |
        | issueTypeName       |ECS updated with incorrect account number|
        | caseCategory        |Complaint         |


  @smoke @regression @cm
  Scenario: User validates the response code of createcasemodule api and mdmId as response where customer type is corporate
      Given a genie user has a createcasemodule api to test is "/api/genie/case/module/"
      When user pass crm_id "123"
      And get the response from createcasemodule api for corporate
      Then a user get the status code 200 as a response from the createcasemodule api where customer type is corporate



   @regression @cm
    Scenario Outline: User validate response of createcasemodule api where customer type is corporate for all the mentioned keys in examples
      Given a genie user has a createcasemodule api to test is "/api/genie/case/module/"
      When user pass crm_id "123"
      And get the response from createcasemodule api for corporate
      Then user get the response  with issueTypeId 123 in createcasemodule api where customer type is corporate
      Then user get the response  "<key>" is "<value>" from the createcasemodule api where customer type is corporate
      Examples:
        | key                 |value             |
        | productName         |Cheque Clearing   |
        | caseType            |Outward           |
        | issueTypeName       |Cheque Status     |
        | caseCategory        |Query             |



   @regression @cm
     Scenario: User validates the blank response of createcasemodule api and mdmId as response where customer type is individual
         Given a genie user has a createcasemodule api to test is "/api/genie/case/module/"
         When user pass crm_id "1"
         And get the response from createcasemodule api
         Then a user get the blank response from the createcasemodule api where customer type is individual

