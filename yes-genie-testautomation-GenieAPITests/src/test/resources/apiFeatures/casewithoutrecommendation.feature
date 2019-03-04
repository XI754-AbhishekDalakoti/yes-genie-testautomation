@case @casewithoutrecommendation
Feature: Validate createcase submit APIs


  @smoke @regression 
  Scenario: User validates the response code of createcasesubmit api and mdmId as response where customer type is individual
      Given a genie user has a createcasesubmit api to test uri is "/" and path is "api/genie/case"
      When a genie user edits the "source" field by "Adhoc" and "channel" field by "Genie" and "custId" field by "996264849" and "productName" field by "Deposits" and "caseType" field by "RD Booking" and "issueTypeName" field by "Account Not Opened"  and "caseCategory" field by "Complaint" and "issueTypeId" field by 271 and "remarks" field by "test"
      Then a user get the status code 200 as a response from the createcasesubmit api where customer type is individual



   @regression 
    Scenario Outline: User validates the response code of createcasesubmit api and mdmId as response where customer type is individual
     Given a genie user has a createcasesubmit api to test uri is "/" and path is "api/genie/case"
     When a genie user edits the "source" field by "Adhoc" and "channel" field by "Genie" and "custId" field by "996264849" and "productName" field by "Deposits" and "caseType" field by "RD Booking" and "issueTypeName" field by "Account Not Opened"  and "caseCategory" field by "Complaint" and "issueTypeId" field by 271 and "remarks" field by "test"
     Then a user get the status code 200 as a response from the createcasesubmit api where customer type is individual
     And user get the response  "<key>" from the createcasesubmit api where customer type is individual
      Examples:
        | key              |
        | channelRefNo     |
        | conversionRefNo  |






   @regression 
     Scenario: User validates the blank response of createcasesubmit api and mdmId as response where customer type is individual
     Given a genie user has a createcasesubmit api to test uri is "/" and path is "api/genie/case"
     When User sends the request
     Then a user get the status code 500 as a response from the createcasesubmit api where customer type is individual







