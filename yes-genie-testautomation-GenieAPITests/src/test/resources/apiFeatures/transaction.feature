@transaction
Feature: Check Post API for Transaction details


  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-23" and "2019-03-23" and send post request
    Then  I get success status code 200 as response
    And I verify the key "amount" as "400000" in the response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input is more than two digits
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-031-23" and "2019-03-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input is blank
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "" and "DateFilter" as "2019-03-23" and "2019-03-23" and send post request
    Then  I get success status code 200 as response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input is special character instead of date
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "*" and "&" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input is invalid order of date
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-23" and "03-23-2019" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input is invalid date
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-" and "2019-03-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input date is 32
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-32" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response


  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input date has alphabets
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-aa" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input month is greater than 12
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-15-20" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when input year has 3 or 2 digits
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "20-05-20" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when date has decimal point
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019.05.20" and "2019.05.23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions search api when date passed is 31 with month as february
    Given I want to execute the transaction API "/api/genie/transaction/search/"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-02-31" and "2019.05.23" and send post request
    Then  I get status code 400 as bad request in response


  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-23" and "2019-03-23" and send post request
    Then  I get success status code 200 as response
    And I verify key "count" as "1"

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input is more than two digits
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-031-23" and "2019-03-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input is blank
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "" and "DateFilter" as "2019-03-23" and "2019-03-23" and send post request
    Then  I get success status code 200 as response
    And I verify key "count" as "0"

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input is special character instead of date
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "*" and "&" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input is invalid order of date
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-23" and "03-23-2019" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input is invalid date
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-" and "2019-03-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input date is 32
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-32" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response


  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input date has alphabets
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-03-aa" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input month is greater than 12
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-15-20" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when input year has 3 or 2 digits
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "20-05-20" and "2019-05-23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when date has decimal point
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019.05.20" and "2019.05.23" and send post request
    Then  I get status code 400 as bad request in response

  @smoke @regression
  Scenario: Check if user is able to submit Post request for transactions count api when date passed is 31 with month as february
    Given I want to execute the transaction API "/api/genie/transaction/search/count"
    When  I pass attribute "MdmIdFilter" as "996264849" and "DateFilter" as "2019-02-31" and "2019.05.23" and send post request
    Then  I get status code 400 as bad request in response










