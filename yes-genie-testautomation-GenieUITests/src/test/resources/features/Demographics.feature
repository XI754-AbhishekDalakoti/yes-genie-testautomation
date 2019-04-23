Feature: Demographics
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "https://cust360.yesgenie.com:31390"
    And I wait for 2 sec
    And I enter "manisha" into input field having id "username"
    And I enter "manisha" into input field having id "password"
    And I click on Login

  @Regression
  Scenario: Verify demographics attributes in SNAP page of customer type Corporate
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the attributes of demographics having customer type corporate
      | Corporate                                                       | SURINDRA RADIOS PRIVATE LIMITED |                 |
      | Date of Incorporation                                           | 27-May-2015                     |                 |
      | Authorised Signatory Tooltip text                               | Authorised Signatory            |                 |
      | Connections Tooltip text                                        | No relationships available      |                 |
      | Website Tooltip text                                            | Website: Not Available          |                 |
      | MDM ID                                                          | 998003452                       |                 |
      | Business                                                        | NA                              |                 |
      | Industry                                                        | Agri Commodities                |                 |
      | Vintage                                                         | 4.1 Years                       |                 |
      | BS/PS                                                           | BRB/RS                          |                 |
      | Customer Type                                                   | FEMALE RESIDENT INDI...         |                 |
      | Annual Turnover                                                 | 1 TO 5 CRORE                    |                 |
      | Pan                                                             | Not Available                   |                 |
      | Mobile Number                                                   | 6080112225                      | Not Verified    |
      | Alternate Mobile                                                | NA                              | Indeterministic |
      | Email                                                           | amarjeets555@gmail.com          | Verified        |
      | W/O RAHUL SADANA 25-B KULTAR SINGH NAGAR NEAR DAV PUBLIC SCHOOL | PATNA,BIHAR                     | Indeterministic |

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
      | Name               | SURINDRA RADIOS PRIVATE LIMITED |
      | DOI                | 27-May-2015                     |
      | Constitution       | Not Available                   |
      | DAT Cust Open      | 27-May-2015                     |
      | Turnover           | 1 TO 5 CRORE                    |
      | Email Address      | amarjeets555@gmail.com          |
      | Mobile No          | 6080112225                      |
      | Alternate No       | 919158706602                    |
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
      | Name               | SURINDRA RADIOS PRIVATE LIMITED |
      | DOI                | 27-May-2015                     |
      | Constitution       | Not Available                   |
      | DAT Cust Open      | 27-May-2015                     |
      | Turnover           | 1 TO 5 CRORE                    |
      | Email Address      | amarjeets555@gmail.com          |
      | Mobile No          | 6080112225                      |
      | Alternate No       | 919158706602                    |
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
  Scenario: Verify demographics attributes in SNAP page of customer type Individual
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I verify all the attributes of demographics having customer type individual
      | CHARU SADANA 27-Aug-1975 SAHARANPUR,UTTAR ...                   | Individual      |             |
      | Gender:  female                                                 | Birthday        | Home Branch |
      | Contactibility                                                  | 33%             | Connections |
      | MDM ID 996264849 CKYC No. NA                                    |                 |             |
      | Profession BUSINESS Vintage 3.3 Years                           |                 |             |
      | BS/PS BRB/RS Customer Segment YES FIRST PRIMA...                |                 |             |
      | Customer Type FEMALE RESIDENT INDIVIDUAL                        |                 |             |
      | Aadhaar                                                         | Verified        |             |
      | Pan                                                             | Verified        |             |
      | Passport                                                        | Verified        |             |
      | Mobile Number                                                   | Verified        |             |
      | Email                                                           | Verified        |             |
      | W/O RAHUL SADANA 25-B KULTAR SINGH NAGAR NEAR DAV PUBLIC SCHOOL | Indeterministic |             |
      | 917123456789 csadana@yahoo.co.in SAHARANPUR,UTTAR PR...         |                 |             |

  @Regression
  Scenario: Verify detailed attributes and there values in demographics of individual customer for indexType 'M'
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all attributes and there values for detailed MDM ID with indexType 'M'
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
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on MDM ID on demographics
    Then I wait for 2 sec
    And I verify all attributes and there values for detailed MDM ID with indexType 'C'
      | Name              | CHARU SADANA             |
      | DOB               | 27-Aug-1975              |
      | Profession        | BUSINESS                 |
      | DAT Cust Open     | 27-May-2015              |
      | Income            | 0 TO 50 LACS             |
      | Email Address     | csadana@yahoo.co.in      |
      | Mobile No         | 917123456789             |
      | Alternate No      | 919158706602             |
      | Current Address   | SAHARANPUR,UTTAR PRADESH                       |
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

  @Smoke @Regression
  Scenario: User is able to view customer relation graph with all details
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 5 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Customer Relation' icon
    And I wait for 2 sec
    Then Customer relation graph gets open where i can see 'Customer Relations' under categories
      | category      | customerName | mdmId       |      | linkedCustomerName              | linkedMDMId       | relation  |
      | Investors (2) | CHARU SADANA | MDM ID: 101 | Self | SURINDRA RADIOS PRIVATE LIMITED | MDM ID: 998003452 | Investors |
      | Friend (40)   | CHARU SADANA | MDM ID: 101 | Self | Pankaj Gupta                    | MDM ID: 601       | Friend    |
      | Corporate (2) | CHARU SADANA | MDM ID: 101 | Self | Turkey Crackers                 | MDM ID: 112345    | Payee     |
      | Family (8)    | CHARU SADANA | MDM ID: 101 | Self | Pankaj Gupta                    | MDM ID: 601       | Family    |
      | Client (2)    | CHARU SADANA | MDM ID: 101 | Self | Hindustan Pvt Limited           | MDM ID: null      | Client    |
    And I click on 'minimize icon' to close relation graph

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
      | MDM ID    | Cust Name    | Gender | Email                | Email Status | Mobile Number | Mobile Status | Secondary Mobile | Contactible | Current City/State |
      | 996264849 | Charu Sadana | F      | charusadan@gmail.com | Not Verified | 919825900111  | Not Verified  | 919825900111     | 0.4         | AHMEDABAD,GUJARAT  |
