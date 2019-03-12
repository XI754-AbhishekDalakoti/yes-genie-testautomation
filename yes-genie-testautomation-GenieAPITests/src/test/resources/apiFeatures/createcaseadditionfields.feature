@case
Feature: Validate createcase additionalfields APIs


  @smoke @regression @ca
  Scenario: User validates the response code of createcaseadditionfields api and mdmId as response where customer type is individual
    Given a genie user has a createcaseadditionfields api to test is "/api/genie/case/additionalfields/"
    When user pass mdmid "996264849" in createcaseadditionfields api
    And user pass reference_number "123" in createcaseadditionfields api
    And user pass crm_id "9" in createcaseadditionfields api
    And get the response from createcaseadditionfields api
    Then a user get the status code 200 as a response from the createcaseadditionfields api where customer type is individual



  @regression @ca
  Scenario Outline: User validate response of createcaseadditionfields api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a createcaseadditionfields api to test is "/api/genie/case/additionalfields/"
    When user pass mdmid "996264849" in createcaseadditionfields api
    And user pass reference_number "123" in createcaseadditionfields api
    And user pass crm_id "9" in createcaseadditionfields api
    And get the response from createcaseadditionfields api
    Then user get the response  with issueTypeId 9 in createcaseadditionfields api where customer type is individual
    Then user get the response  with fieldReq 0 in createcaseadditionfields api where customer type is individual
    Then user get the response  with maxLength 1 in createcaseadditionfields api where customer type is individual
    Then user get the response  with value "No" in createcaseadditionfields api where customer type is individual
    Then user get the response  "<key>" is "<value>" from the createcaseadditionfields api where customer type is individual
    Examples:
      | key                 |value                |
      | fieldName           |ccs_hasattachments   |
      | displayName         |ccs_hasattachments   |
      | type                |Boolean              |


  @smoke @regression @ca
  Scenario: User validates the response code of createcaseadditionfields api and mdmId as response where customer type is corporate
    Given a genie user has a createcaseadditionfields api to test is "/api/genie/case/additionalfields/"
    When user pass mdmid "998003452" in createcaseadditionfields api
    And user pass reference_number "123" in createcaseadditionfields api
    And user pass crm_id "9" in createcaseadditionfields api
    And get the response from createcaseadditionfields api for corporate
    Then a user get the status code 200 as a response from the createcaseadditionfields api where customer type is corporate



  @regression @ca
  Scenario Outline: User validate response of createcaseadditionfields api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a createcaseadditionfields api to test is "/api/genie/case/additionalfields/"
    When user pass mdmid "998003452" in createcaseadditionfields api
    And user pass reference_number "123" in createcaseadditionfields api
    And user pass crm_id "9" in createcaseadditionfields api
    And get the response from createcaseadditionfields api for corporate
    Then user get the response  with issueTypeId 9 in createcaseadditionfields api where customer type is corporate
    Then user get the response  with fieldReq 1 in createcaseadditionfields api where customer type is corporate
    Then user get the response  with maxLength 200 in createcaseadditionfields api where customer type is corporate
    Then user get the response  "<key>" is "<value>" from the createcaseadditionfields api where customer type is corporate
    Examples:
      | key                 |value             |
      | fieldName           |ccs_debitcardno   |
      | displayName         |ccs_debitcardno   |
      | type                |string            |




  @regression @ca
  Scenario: User validates the blank response of createcaseadditionfields api and mdmId as response where customer type is individual
    Given a genie user has a createcaseadditionfields api to test is "/api/genie/case/additionalfields/"
    When user pass mdmid "998003452" in createcaseadditionfields api
    And user pass reference_number "123" in createcaseadditionfields api
    And user pass crm_id "1" in createcaseadditionfields api
    And get the response from createcaseadditionfields api
    Then a user get the blank response from the createcaseadditionfields api where customer type is individual






