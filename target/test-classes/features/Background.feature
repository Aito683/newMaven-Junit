Feature: background demo
##Background very similar to @BeforeEach in J-Unit
  #it runs before every single scenario
  #it created to eliminate the repetition of steps in scenarios

  Background:
    Given user is on "qa-chase.com"
    And user is logged in as "test@gmail.com" "test1Pass"

@smoke
  Scenario: Demo1

    When user clicks on the transaction
    Then user should see all transactions
@IGNORE
  Scenario: Demo2

    And user balance is 1000
    When user deposits 200
    Then user balance should be 1200
@smoke
  Scenario: Demo3

    And user balance is 1000
    When user withdraws 200
    Then user balance should be 800
