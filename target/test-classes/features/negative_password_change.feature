Feature: Negative password change
  This feature ensures that users cannot change their password if the current password entered is incorrect

  Scenario: User fails to change password with incorrect current password
    Given the user is logged into their account
    And the user navigates to the password change page
    When the user enters an incorrect current password
    And provides a new password and confirmation
    Then the system should reject the password change request
    And an error message should be displayes: "Current password is incorrect."