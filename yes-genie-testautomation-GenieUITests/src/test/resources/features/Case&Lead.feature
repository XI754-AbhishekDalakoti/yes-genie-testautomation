Feature: Case and Lead on Snap Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "https://cust360.yesgenie.com:31390"
    And I wait for 2 sec
    And I enter "manisha " into input field having id "username"
    And I enter "manisha" into input field having id "password"
    And I click on Login

  @Regression
  Scenario: Create Lead without recommendation
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Transactions' icon on top right
    And I click on 'Create Lead'
    And I wait for 2 sec
    Then Create Lead form gets open with title "Create Lead"
    And I wait for 2 sec
    And I fill all the fields of create lead form with remarks "user wants to create lead" and click on submit
    Then I wait for 2 sec
    And I verify "Successfully Submitted" message is displayed

  @Regression
  Scenario: Create Service Request without recommendation
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on 'Transactions' icon on top right
    And I click on 'Create Lead'
    And I wait for 2 sec
    Then Create Lead form gets open with title "Create Lead"
    And I fill all the fields of create lead form with remarks "user wants to create lead" and click on submit
    Then I wait for 2 sec
    And I verify "Successfully Submitted" message is displayed

    @End2End @Smoke @Regression
  Scenario: User is able to create lead with recommendation
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on any recommendation's lable in ALL category section to Create Lead
    Then I wait for 2 sec
    Then Create Lead form gets open with lable name as title
    And Data is prefilled with values "998003452", "Branch Banking", "GURGAON- HARYANA (2)", "13" respectively
    And I click on remarks tab and write "customer wants to create lead" remarks into remarks field
    Then I click on submit button
    Then I wait for 2 sec
    And gets message "Successfully Submitted"

  @End2End @Smoke @Regression
  Scenario: User is able to create service request with recommendation
    Then I wait for 2 sec
    Then I enter "998003452" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    Then I click on any recommendation's lable in ALL category section to Create Service Request
    Then I wait for 2 sec
    Then Create Lead form gets open with lable name as title
    And Data is prefilled with values "998003452", "Branch Banking", "GURGAON- HARYANA (2)", "13" respectively
    And I click on remarks tab and write "customer wants to create lead" remarks into remarks field
    Then I click on submit button
    Then I wait for 2 sec
    And gets message "Successfully Submitted"

  @Smoke @Regression
  Scenario: User is able to defer the recommendation
    Then I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec
    And I click on cross button in 'Regulatory' recommendation
    Then I wait for 2 sec
    And I click on 'Defer' option to defer the recommendation
    And I wait for 2 sec
    And I select future date and click on submit button in calender
    And I wait for 2 sec
    Then I get message "Transaction deferred successfully"