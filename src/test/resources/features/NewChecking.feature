Feature: Creating a new checking account

  Scenario: Create a standard individual checking account
    Given the user is on dbank homepage
    And the user logged in as "janedoe@gmail.com" "JaneDoe123!"
    And the user clicks on the checking button
    And the user clicks on new checking button
    When the user selects "Standard Checking" Account type
    And the user selects "Individual" Account Ownership
    And the user names the account "Jane Doe First Checking"
    And the user makes the initial deposit of $100000.00
    And the user clicks on submit
    Then the user should see the green "Successfully created new Standard Checking account named Jane Doe First Checking" message
    And the user should see newly added account card
      | accountName             | accountType       | ownership  | accountNumber | interestRate | balance   |
      | Jane Doe First Checking | Standard Checking | Individual | 486143806     | 0.0%         | 100000.00 |
    And the user should see the following transactions
      | date             | category | description               | amount     | balance    |
      | 2025-09-30 15:51 | Income   | 845342200 (DPT) - Deposit | $100000.00 | $100000.00 |
