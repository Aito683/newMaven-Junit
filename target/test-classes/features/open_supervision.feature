Feature: Open supervision of agents
  This feature allows a supervisor to monitor and guide agents during their shifts in a call center.
  Scenario: Supervisor monitors agents during active calls
    Given a team of agents is working in a call center
    And each team of agents is working in a call center
    Given the supervisor is logged into the monitoring system
    When the supervisor opens the live supervision dashboard
    Then the supervisor should see real-time call details for each agent