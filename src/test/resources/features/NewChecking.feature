Feature: Creating a new checking account

  Scenario: Create a standard individual checking account
    Given the user logged in as "janedoegh@gmail.com" "JaneDoegh123!"
    When the user creates a new checking account with the following data
    |checkingAccountType|accountOwnership|accountName              |initialDeposit|
    |Standard Checking  |Individual      |Jane Doegh First Checking|20000.00      |
    Then the user should see the green "Successfully created new Standard Checking account named Jane Doegh First Checking" message
    And the user should see newly added account card
      | accountName               | accountType       | ownership  | accountNumber | interestRate | balance  |
      | Jane Doegh First Checking | Standard Checking | Individual | 486143806     | 0.0%         | 20000.00 |
    And the user should see the following transactions
      | date             | category | description               | amount     | balance  |
      | 2025-09-30 15:51 | Income   | 845342200 (DPT) - Deposit | 20000.00   | 20000.00 |
