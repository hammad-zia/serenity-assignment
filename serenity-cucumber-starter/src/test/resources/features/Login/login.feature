@login
Feature: login into EFinancialCareers Website
  User shall be able to login into web app using valid email address and password
  Scenario Outline: login
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then user should be able to see profile icon along with the email address

    Examples:
      | username          | password        |
      | qaz12345@test.com | testtesttest123 |