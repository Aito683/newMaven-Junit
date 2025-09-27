Feature: Check Email Analytics
  This feature allows a marketing analyst to review and interpret email campaign performance
  in order to make data-driven improvements for future campaigns.

  Scenario: Custom email analytics scenario
    Given the user has a valid login to the email marketing platform
    And the user has access to the "Campaign Reports" dashboard
    And at least one email campaign has been sent in the last 30 days

    When the user selects the most recent email campaign
    And the user views the analytics dashboard for that campaign
    And the user filters results to show only unique opens and clicks

    Then the open rate should be displayed as a percentage
    And the click-through rate should be displayed as a percentage
    And a list of top-performing links should be visible
    And the user should be able to export the analytics report as a CSV file