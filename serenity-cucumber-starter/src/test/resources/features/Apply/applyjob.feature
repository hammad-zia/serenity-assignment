@applyjob
  Feature: Apply into first job
    Scenario Outline: Apply in Job
      Given user has open job
      When user enters "<firstname>" and "<surname>" in job form
      Then user upload cv and click on Apply button
      Examples:
        | firstname | surname |
        | job       | seeker  |
