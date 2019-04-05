Feature: Portfolio Page
    As a user I should be able to see my portfolio

    Background: User has logged in to Genie
        Given I navigate to url "https://cust360.yesgenie.com:31390"
        Then I wait for 2 sec
        And I enter "MCC0008398" into input field having id "username"
        And I enter "yesbank@321" into input field having id "password"
        Then I click on Login

    @Regression @logout
    Scenario: Verify deposit options of the Portfolio section of customer type Individual
        And I wait for 2 sec
        Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
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
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify deposit options of portfolio section

    @Regression @logout
    Scenario: Verify investment options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify investment options of portfolio section

    @Regression @logout
    Scenario: Verify loan options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify loan options of portfolio section

    @Regression @logout
    Scenario: Verify cards and wallets options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
        And I wait for 2 sec
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify cards and wallets options of portfolio section

    @Regression @logout
    Scenario: Verify other options of the Portfolio section of customer type Corporate
        Then I wait for 2 sec
        Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
        And I wait for 2 sec
        When I click on search button having xpath "//div[contains(text(),'Search')]"
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
        Then I lands to SNAP page directly
        And I wait for 2 sec
        Then I verify KPI data of portfolio section for corporate


