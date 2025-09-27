Feature: Employees list

  Scenario: Manage Employee Information
    Given a list of employee details with the following information:
      | employeeID | firstName | lastName | department | position          | salary  |
      | 101        | John      | Smith    | Sales      | Sales Associate   | $60,000 |
      | 102        | Jane      | Doe      | HR         | HR Manager        | $80,000 |
      | 103        | David     | Johnson  | IT         | Software Engineer | $90,000 |
    When the user adds a new employee with the following details:
      | employeeID | firstName | lastName | department | position          | salary  |
      | 104        | Emily     | Davis    | Marketing  | Marketing Analyst | $55,000 |
    And the user updates the salary of an existing employee with Employee ID 101 to $65,000.
    And the user removes the employee with Employee ID 102 from the records.
    Then the user should be able to view and confirm the updated employee details:
      | employeeID | firstName | lastName | department | position          | salary  |
      | 101        | John      | Smith    | Sales      | Sales Associate   | $65,000 |
      | 103        | David     | Johnson  | IT         | Software Engineer | $90,000 |
      | 104        | Emily     | Davis    | Marketing  | Marketing Analyst | $55,000 |
