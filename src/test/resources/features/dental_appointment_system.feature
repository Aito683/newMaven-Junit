Feature: Dental System Patient Registration and Appointment Booking

  Background:
    Given the dental system is running
    And the receptionist is logged into the system

  Scenario: Successful patient registration
    When the receptionist registers a new patient with details:
      | name      | age | procedure     | timeNeeded | cost  |
      | John Doe  | 30  | Cleaning      | 30 mins    | 100   |
    Then the patient "John Doe" should be registered successfully
    And an appointment should be created

  Scenario: Patient registration fails due to missing age
    When the receptionist registers a new patient with details:
      | name      | age | procedure | timeNeeded | cost |
      | Jane Doe  |     | Filling   | 45 mins    | 200  |
    Then the system should display an error message "Age is required"
    And the patient record should not be created

  Scenario: Booking an appointment for an underage patient
    When the receptionist registers a new patient with details:
      | name       | age | procedure  | timeNeeded | cost |
      | Timmy Lee  | 12  | Extraction | 60 mins    | 300  |
    Then the system should flag "Requires parental consent"
    And the appointment should remain pending

  Scenario: Booking a complex procedure with cost estimation
    When the receptionist registers a new patient with details:
      | name        | age | procedure     | timeNeeded | cost  |
      | Sarah Khan  | 45  | Root Canal    | 120 mins   | 1200 |
    Then the patient "Sarah Khan" should be registered successfully
    And the appointment should be confirmed
    And the invoice should show the cost as "1200"