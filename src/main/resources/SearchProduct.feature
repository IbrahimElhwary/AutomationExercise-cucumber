Feature: Search Product

  Scenario:
    Given User navigates to page
    Then  User Verify that home page is visible successfully
    When User Click on Product button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When  Enter product name in search input
    And  Click search button
    Then Verify SEARCHED PRODUCTS is visible

