@Regression
Feature: Create New Account Page

  @CreateNewAccount
  Scenario: Create new Account with valid credential
    Given User click on Sign In Button
    Given User click on Create Account
    When User fill Form "Mohammad" and "instructor@tekschool.us" and "123456Ab@"
    When User Click on Sign up button
    Then User will navigate to Account Profile Page
    Then Validate "Mohammad" and email in account page