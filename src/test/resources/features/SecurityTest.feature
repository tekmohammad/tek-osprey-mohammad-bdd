Feature: Retail app security test feature.


  Scenario Outline: Validate Valid user credential
    Given User click on Sign In Button
    When User enter "<username>" and "<password>" and click on Login
    Then User will see Account button on home page.

    Examples:
      | username                     | password    |
      | mohammad_osprey@tekschool.us | 12345678Ab@ |
      | mansoor@gmail.com            | Ruya@2014   |

  Scenario: Validate invalid username and valid password
    Given User click on Sign In Button
    When User enter "Wrong@gmail.com" and "12345678Ab@" and click on Login
    Then validate error message "wrong username or password"