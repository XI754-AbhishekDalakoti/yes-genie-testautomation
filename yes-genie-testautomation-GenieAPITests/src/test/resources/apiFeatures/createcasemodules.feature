@case
Feature: Validate createcase modules APIs

  @smoke @regression @cm1
  Scenario: User validates the response code of createcasemodules api and mdmId as response where customer type is individual
      Given a genie user has a createcasemodules api to test is "http://cust360.yesgenie.com:30978/api/case/modules/"
      When user pass productname "Deposits"
      And get the response from createcasemodules api
      Then a user get the status code 200 as a response from the createcasemodules api where customer type is individual



   @regression @cm1
    Scenario Outline: User validate response for caseModuleAttributes of createcasemodules api where customer type is individual for all the mentioned keys in examples
      Given a genie user has a createcasemodules api to test is "http://cust360.yesgenie.com:30978/api/case/modules/"
      When user pass productname "Deposits"
      And get the response from createcasemodules api
      Then user get the response  with productname "Deposits" in createcasemodules api where customer type is individual
      And user get the response for caseModuleAttributes  "<key>" is "<value>" from the createcasemodules api where customer type is individual
      Examples:
        | key                 |value         |
        | caseType            |RD Advice	 |



    @regression @cm1
    Scenario Outline: User validate response for caseTypeAttribute of createcasemodules api where customer type is individual for all the mentioned keys in examples
       Given a genie user has a createcasemodules api to test is "http://cust360.yesgenie.com:30978/api/case/modules/"
       When user pass productname "Deposits"
       And get the response from createcasemodules api
       Then user get the response  with productname "Deposits" in createcasemodules api where customer type is individual
       And user get the response with issueTypeId 268 from the createcasemodules api where customer type is individual
       And user get the response for caseTypeAttribute  "<key>" is "<value>" from the createcasemodules api where customer type is individual
       Examples:
	        | key                 |value                                  |
            | issueTypeName       |Advice generated with incorrect details |
            | caseCategory        |Complaint                               |


    @regression @cm1
          Scenario: User validates the blank response of createcasemodules api and mdmId as response where customer type is individual
              Given a genie user has a createcasemodules api to test is "http://cust360.yesgenie.com:30978/api/case/modules/"
              When user pass productname "1"
              And get the response from createcasemodules api
              Then a user get the blank response from the createcasemodules api where customer type is individualzzz