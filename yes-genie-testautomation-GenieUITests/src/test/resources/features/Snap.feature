Feature: Snap Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://cust360.yesgenie.com:30978"
    And I wait for 2 sec

  Scenario: I login with valid credential with welcome message
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    And I click on Login

  @Regression
  Scenario: Verify demographics attributes in SNAP page of customer type Corporate
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    Then I click on Login
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the attributes of demographics having customer type corporate
      | Customer Type                                                   | Corporate                       |              |
      | Customer Name                                                   | SURINDRA RADIOS PRIVATE LIMITED |              |
      | 27-May-2015                                                     | Date of Incorporation           |              |
      | Authorised Signatory Tooltip text                               | Authorised Signatory            |              |
      | Connections Tooltip text                                        | Connections                     |              |
      | Website Tooltip text                                            | Website: Not Available          |              |
      | MDM ID                                                          | 998003452 (2)                   |              |
      | Business                                                        | NA                              |              |
      | Industry                                                        | Agri Commodities                |              |
      | Vintage                                                         | 4.1 Years                       |              |
      | BS/PS                                                           | BRB/RS                          |              |
      | Customer Type                                                   | FEMALE RESIDENT INDIVIDUAL      |              |
      | Annual Turnover                                                 | 1 TO 5 CRORE                    |              |
      | Pan                                                             |                                 | Not Verified |
      | Mobile Number                                                   | 6080112225                      | Not Verified |
      | Alternate Mobile                                                | 919158706602                    |              |
      | Email                                                           | amarjeets555@gmail.com          | Verified     |
      | W/O RAHUL SADANA 25-A KULTAR SINGH NAGAR NEAR DAV PUBLIC SCHOOL | PATNA,BIHAR                     | Not Verified |

  @Regression
  Scenario: Verify demographics attributes in SNAP page of customer type Individual
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the attributes of demographics having customer type individual
      | CHARU SADANA                                                    | Individual                 |          |
      | Birthday                                                        | 27-Aug-1975                |          |
      | Home Branch                                                     | SAHARANPUR,UTTAR PRADESH   |          |
      | Contactibility                                                  | 33%                        |          |
      | Connections Tooltip text                                        | Connections                |          |
      | MDM ID                                                          | 996264849 (2)              |          |
      | Ckyc no.                                                        | NA                         |          |
      | Profession                                                      | BUSINESS                   |          |
      | Vintage                                                         | 3.3 Years                  |          |
      | BS/PS                                                           | BRB/RS                     |          |
      | Customer Type                                                   | FEMALE RESIDENT INDIVIDUAL |          |
      | Customer Segment                                                | YES FIRST PRIMARY OPDT     |          |
      | Aadhaar                                                         |                            | Verified |
      | Pan                                                             |                            | Verified |
      | Passport                                                        |                            | Verified |
      | Mobile Number                                                   | 917123456789               | Verified |
      | Email                                                           | csadana@yahoo.co.in        | Verified |
      | W/O RAHUL SADANA 25-A KULTAR SINGH NAGAR NEAR DAV PUBLIC SCHOOL | SAHARANPUR,UTTAR PRADESH   | Verified |


  @Regression
  Scenario: Verify detailed attributes and there values in demographics of individual customer for indexType 'M'
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all attributes and there values for detailed MDM ID with indexType 'M'
      |                   | 996264849                |
      | Name              | CHARU SADANA             |
      | DOB               | 27-Aug-1975              |
      | Profession        | BUSINESS                 |
      | DAT Cust Open     | 27-May-2015              |
      | Income            | 0 TO 50 LACS             |
      | Email Address     | csadana@yahoo.co.in      |
      | Mobile No         | 917123456789             |
      | Alternate No      | 919158706602             |
      | Current Address   | SAHARANPUR,UTTAR PRADESH |
      | Permanent Address | SAHARANPUR,UTTAR PRADESH |
      | Home Branch       | SAHARANPUR,UTTAR PRADESH |
      | Cluster           | Not Available            |
      | Region            | Not Available            |
      | Asset RM          | Not Available            |
      | Liability RM      | 4188029                  |
      | Service RM        | 2985009                  |
      | Group Code        | 1466889                  |
      | PSM               | Not Available            |
      | Nationality       | IN                       |
      | Fatca             | Not Available            |
      | Bagic             | 0                        |
      | KYC Status        | Not Available            |
      | Risk Category     | HIGH RISK                |

  @Regression
  Scenario: Verify demographics detailed attributes and there values in demographics of individual customer for indexType 'C'
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all attributes and there values for detailed MDM ID with indexType 'C'
      |                   | 996264849                |
      | Name              | CHARU SADANA             |
      | DOB               | 27-Aug-1975              |
      | Profession        | BUSINESS                 |
      | DAT Cust Open     | 27-May-2015              |
      | Income            | 0 TO 50 LACS             |
      | Email Address     | csadana@yahoo.co.in      |
      | Mobile No         | 917123456789             |
      | Alternate No      | 919158706602             |
      | Current Address   | UP                       |
      | Permanent Address | SAHARANPUR,UTTAR PRADESH |
      | Home Branch       | SAHARANPUR,UTTAR PRADESH |
      | Cluster           | Not Available            |
      | Region            | Not Available            |
      | Asset RM          | Not Available            |
      | Liability RM      | 4188029                  |
      | Service RM        | 2985009                  |
      | Group Code        | 1466889                  |
      | PSM               | Not Available            |
      | Nationality       | IN                       |
      | Fatca             | Not Available            |
      | Bagic             | 0                        |
      | KYC Status        | Not Available            |
      | Risk Category     | HIGH RISK                |

  @Regression
  Scenario: Verify demographics detailed attributes and there value in demographics of corporate customer for indexType 'M'
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all attributes and there values for detailed MDM ID for corporate customer with Type M
      |                    | 998003452                       |
      | Name               | SURINDRA RADIOS PRIVATE LIMITED |
      | DOI                | 27-May-2015                     |
      | Constitution       | Not Available                   |
      | DAT Cust Open      | 27-May-2015                     |
      | Turnover           | 1 TO 5 CRORE                    |
      | Email Address      | amarjeets555@gmail.com          |
      | Mobile No          | 6080112225                      |
      | Alternate No       | Not Available                   |
      | Home Branch        | SAHARANPUR,UTTAR PRADESH        |
      | Cluster            | Not Available                   |
      | Region             | Not Available                   |
      | IEC                | Not Available                   |
      | Asset RM           | Not Available                   |
      | Liability RM       | 4188029                         |
      | Service RM         | 2985009                         |
      | Group Code         | 1466889                         |
      | PSM                | Not Available                   |
      | Nature of Business | Not Available                   |
      | Nature of Industry | Agri Commodities                |
      | Risk Category      | HIGH RISK                       |
      | Website            | Not Available                   |
      | E-Comm Site        | Not Available                   |

  @Regression
  Scenario: Verify detailed demographics attributes and there value of corporate customer for indexType 'C'
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all attributes and there values of corporate customer for indexType C
      |                    | 998003451                       |
      | Name               | SURINDRA RADIOS PRIVATE LIMITED |
      | DOI                | 27-May-2015                     |
      | Constitution       | Not Available                   |
      | DAT Cust Open      | 27-May-2015                     |
      | Turnover           | 1 TO 5 CRORE                    |
      | Email Address      | amarjeets555@gmail.com          |
      | Mobile No          | 6080112225                      |
      | Alternate No       | Not Available                   |
      | Home Branch        | SAHARANPUR,UTTAR PRADESH        |
      | Cluster            | Not Available                   |
      | Region             | Not Available                   |
      | IEC                | Not Available                   |
      | Asset RM           | Not Available                   |
      | Liability RM       | 4188029                         |
      | Service RM         | 2985009                         |
      | Group Code         | 1466889                         |
      | PSM                | Not Available                   |
      | Nature of Business | Not Available                   |
      | Nature of Industry | Agri Commodities                |
      | Risk Category      | HIGH RISK                       |
      | Website            | Not Available                   |
      | E-Comm Site        | Not Available                   |

  @Smoke @Regression
  Scenario Outline: Verify NBA categories and data for Individual customer
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 5 sec
    Then I verify all the "<category>" with "<count>" and "<recommendation>" , "<recommendationEndDate>", "<actionLableIcon>" is available in NBA section
    Examples:
      | category    | count | recommendation                                | recommendationEndDate | actionLableIcon |
      | All         | 18    | Kindly Renew your existing FD 1               | By: 31-Mar-2019       | Book FD         |
      | Regulatory  | 8     | ECS updated with incorrect account number     | By: 31-Mar-2019       | Create SR       |
      | Service     | 4     | Kindly Update email id and mobile no          | By: 31-Mar-2019       | Update Email    |
      | Sell        | 4     | Kindly Renew your existing FD 1               | By: 31-Mar-2019       | Book FD         |
      | Alerts      | 2     | Your FD is maturing, kindly reniew your FD(1) | By: 31-Mar-2019       | Renew FD        |
      | Information | 0     |                                               |                       |                 |

  @Smoke @Regression
  Scenario Outline: Verify NBA categories and data for Corporate customer
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the "<category>" with "<count>" and "<recommendation>" , "<recommendationEndDate>", "<actionLableIcon>" is available in NBA section
    Examples:
      | category    | count | recommendation                             | recommendationEndDate | actionLableIcon |
      | All         | 12    | Kindly Renew your existing FD 3            | By: 31-Mar-2019       | Book FD         |
      | Regulatory  | 5     | ECS updated with incorrect account number  | By: 31-Mar-2019       | Create SR       |
      | Service     | 3     | Issue Cheque Book (P 2)                    | By: 24-Mar-2019       | Issue           |
      | X-Sell      | 2     | Kindly Renew your existing FD 3            | By: 31-Mar-20         | Book FD         |
      | Alerts      | 2     | Your FD is maturing, kindly reniew your FD | By: 31-Mar-2019       | Renew FD        |
      | Information | 0     |                                            |                       |                 |

  @End2End @Smoke @Regression
  Scenario: User is able to create lead with recommendation
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    When I click on Book FD on ALL category section
    Then I wait for 2 sec
#   Then Book FD page should get open with attributes "CustID" "ProductName", "BU", "SourceRefID", "BranchCode" & "Remarks"
    And I wait for 2 sec
    And Data is prefilled with values "996264849", "1", "YES BANK", "FDYES BANK", "1" respectively
    And I click on remarks tab and write "customer wants to book fd" remarks into remarks field
    Then I click on submit button
    Then I wait for 2 sec
    And gets message "Transaction has been completed successfully"


  @Smoke @Regression
  Scenario: User is able to defer the recommendation
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Regulatory' section in NBA
    And I wait for 2 sec
    And I click on cross button in 'Regulatory' recommendation
    Then I wait for 2 sec
    And I click on 'Defer' option to defer the recommendation
    Then In calender I select a future defer date
    And I wait for 2 sec
    And I click on submit button in calender
    And I wait for 2 sec
    Then I get message "Deffered Successfully !"

  @Smoke @Regression
  Scenario: User is able to dismiss the recommendation
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'X-Sell' section in NBA
    And I click on cross button in 'X-Sell' recommendation
    And I click on 'Dimiss' option to dismiss the recommendation
    And I wait for 2 sec
    Then I select dimiss reason from dialogue box and i click on submit
    And I wait for 2 sec
    Then I get message "Dismissed Successfully !"

  @Smoke @Regression
  Scenario: User is able to view customer relation graph with all details
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 5 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Customer Relation' icon
    And I wait for 2 sec
    Then Customer relation graph gets open where i can see 'Customer Relations' under categories
      | category  | customerName | mdmId       |      | linkedCustomerName              | linkedMDMId       | relation  |
      | Investors | CHARU SADANA | MDM ID: 101 | Self | SURINDRA RADIOS PRIVATE LIMITED | MDM ID: 998003452 | Investors |
      | Friend    | CHARU SADANA | MDM ID: 101 | Self | Abhishek Jain                   | MDM ID: 12713     | Friend    |
      | Corporate | CHARU SADANA | MDM ID: 101 | Self | Turkey Crackers                 | MDM ID: 112345    | Payee     |
      | Family    | CHARU SADANA | MDM ID: 101 | Self | Pankaj Gupta                    | MDM ID: 601       | Family    |
      | Client    | CHARU SADANA | MDM ID: 101 | Self | Hindustan Pvt Limited           | MDM ID: 12713     | Client    |
    And I click on 'minimize icon' to close relation graph

  @Smoke @Regression
  Scenario: User is able to create Lead without recommendation
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Transactions' icon on top right
    Then I click on 'Create Lead'
    And I wait for 5 sec
#    And Form gets open with attributes "Cust ID", "LOB", "Branch Code", "Product Name" , "Source Ref ID" and "Remarks"
    Then I select values "996264849", "BRB", "GURGAON- HARYANA (2)", "Savings Account", "Savings AccountBRB" and enter 'Remarks' "create lead"

  @Smoke @Regression
  Scenario: User is able to view authorized siganatory of corporate customer
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Authorised Signatory' icon in demographics
    And I wait for 2 sec
    Then Authorised Signatory page gets open with title "Authorised Signatory"
    And I verify all the attributes is displayed with authorised signatory data
      | MDM ID    | Cust Name    | Gender | Email                | Mobile Number | Secondary Mobile | Contactible | Current City/State |
      | 996264849 | Charu Sadana | F      | charusadan@gmail.com | 6543789000    | 8765432145       | 12%         | AHMEDABAD,GUJARAT  |

  @Regression
  Scenario: Verify demographics detailed attributes value of detailed MDM id with demographics of customer type Individual
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all DemogsValue with DetailedValue
      | 996264849                | 996264849                |
      | CHARU SADANA             | CHARU SADANA             |
      | 27-Aug-1975              | 27-Aug-1975              |
      | BUSINESS                 | BUSINESS                 |
      | csadana@yahoo.co.in      | csadana@yahoo.co.in      |
      | 917123456789             | 917123456789             |
      | SAHARANPUR,UTTAR PRADESH | SAHARANPUR,UTTAR PRADESH |

  @Regression @End2End
  Scenario: I should get logged out of application
    And I wait for 2 sec
    Then I should get logout
    And I close browser
