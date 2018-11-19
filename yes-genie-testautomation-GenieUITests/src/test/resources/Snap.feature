Feature: Search or Landing Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://yesgenie.com:30978/"

    Scenario: In case of one result, SNAP page should be opened directly
      Given I'm on login page
      Then I wait for 2 sec
      And I enter "panna" into input field having id "username"
      And I enter "123" into input field having id "password"
      Then I click on Login
      And I wait for 2 sec
