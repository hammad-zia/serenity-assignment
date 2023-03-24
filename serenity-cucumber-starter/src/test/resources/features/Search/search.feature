@search
Feature: Search Job in App
  user is able to search a specific job
  Scenario: Search Job
    Given user is on main page
    When user search a specific job by keyword
    Then user should be able to see all jobs related to searched keyword