Feature: Retail app security test feature.


  Scenario: Validate Valid user credential
    Given User click on Sign In Button
    When User enter username and password and click on Login
    Then User will see Account button on home page.