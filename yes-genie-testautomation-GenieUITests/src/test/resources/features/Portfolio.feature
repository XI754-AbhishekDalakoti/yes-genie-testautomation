Feature: Portfolio Page
    As a user I should be able to see my portfolio

    Background: User has logged in to Genie
        Given I navigate to url "https://cust360.yesgenie.com:31390"
        Then I wait for 2 sec
        And I enter "UIAutomationDND" into input field having id "username"
        And I enter "UIAutomation" into input field having id "password"
        Then I click on Login

    @Regression @logout
    Scenario: Verify deposit options of the Portfolio section of customer type Individual
        And I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify deposit options of portfolio section

    @Regression @logout
    Scenario: Verify investment options of the Portfolio section of customer type Individual
        And I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        And I verify investment options of portfolio section

    @Regression @logout
    Scenario: Verify loan options of the Portfolio section of customer type Individual
        And I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        And I verify loan options of portfolio section

    @Regression @logout
    Scenario: Verify cards and wallets options of the Portfolio section of customer type Individual
        And I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        And I verify cards and wallets options of portfolio section

    @Regression @logout
    Scenario: Verify other options of the Portfolio section of customer type Individual
        And I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        And I verify other options of portfolio section

    @Regression @logout
    Scenario: Verify KPI data of the Portfolio section of customer type Individual
        Then I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify KPI data of portfolio section for individual

    @Regression @logout
    Scenario: Verify deposit options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on non-individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify Deposit & Investments options of portfolio section

    @Regression @logout
    Scenario: Verify investment options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on non-individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify Trade options of portfolio section

    @Regression @logout
    Scenario: Verify loan options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on non-individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify Loan & Advances options of portfolio section

    @Regression @logout
    Scenario: Verify cards and wallets options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on non-individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify Collections & Payments and wallets options of portfolio section

    @Regression @logout
    Scenario: Verify other options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on non-individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify other options of portfolio section

    @Regression @logout
    Scenario: Verify KPI data of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I click on non-individual record
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify KPI data of portfolio section for corporate

    @Regression @logout
    Scenario: Verify Channels category for customer type Individual
        Then I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify Channels category for Individual
            | Netbanking Usage: High Trend: Increasing Mobile App Yes Mobile Usage: High Trend: Increasing Yes Pay POS 37 63 Debit/Credit Usage: High Trend: Increasing ATM 50 50 YBL/Non YBL Usage: Low Trend: Increasing Branch Banking Usage: High Trend: Increasing Yes Robot Usage: High Trend: Increasing |


