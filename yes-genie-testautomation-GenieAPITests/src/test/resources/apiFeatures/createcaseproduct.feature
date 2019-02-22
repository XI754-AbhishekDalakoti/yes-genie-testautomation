@case
Feature: Validate createcase Product APIs



  @smoke @regression @cp
  Scenario: User validates the response code of createcaseproduct api and mdmId as response where customer type is individual
    Given a genie user has a createcaseproduct api to test is "/api/genie/case/products"
    And get the response from createcaseproduct api
    Then a user get the status code 200 as a response from the createcaseproduct api where customer type is individual



  @regression @cp
  Scenario Outline: User validate response of createcaseproduct api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a createcaseproduct api to test is "/api/genie/case/products"
    And get the response from createcaseproduct api
    Then user get the response "<value>" from the createcaseproduct api where customer type is individual
    Examples:
      | key                 |
      | Deposits            |
      | Staff Related.      |
      | Yes MSME            |
      | Cheque CMS and ECS  |
      | BHIM Aadhaar Pay    |
      | Credit Card         |
      | Reliance General Insurance.|
      | Max Life Insurance. |
      | ATM.                |
      | Demat               |



