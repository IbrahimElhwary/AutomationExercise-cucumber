Feature: Logout Functionality

  Scenario: Logout Success From The page
    Given User navigates to page
    Then  User Verify that home page is visible successfully
    When  User Click on Signup Login button
    Then  Verify Login to your account is visible
    When  User Enter correct email address
    And   User Enter correct password
    And   User Click on Login button