Feature: Online Learning Platform
@lessons @smoke
  Scenario: Lesson Deletion
    Given the teacher chooses to delete a lesson with lesson ID "lesson789"
    When the teacher confirms the deletion
    Then the lesson is successfully deleted