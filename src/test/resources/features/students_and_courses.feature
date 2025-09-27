Feature: Student Management
@lessons @regression
  Scenario: Course Withdrawal
    Given the student decides to withdraw from a course with course code "course202"
    When the student confirms the withdrawal
    Then the course withdrawal is successful