Feature: Amazon Login feature

  Scenario: Login with valid credential

    Given  User is navigated to "https://www.amazon.com/"page
    When user clicks on Sign in
    When User   enters username
    And User clicks on Continue
    And  User enter password
    And  User clicks on Sign in button
    Then I wait for 5 seconds
    #Then User should be on  homepage