Feature: Transfer
#one of the main principles of writing cucumber feature files
  #steps have to be as dynamic as possible to promote the step revisibility
  #within other scenarios as well
  Scenario: Money transfer with insufficient funds
    Given User with account number 4210 is registered
    And User with account number 4210 deposited $1000
    When User with account number 4210 transfers $1100
    Then User with account number 4210 should have $1000 in balance
    And User should see Insufficient Funds message

    #when the step is not highlighted it means it already has an implementation(step def)
  
  Scenario: Money transfer with sufficient funds 
    Given User with account number 999923 is registered

    Scenario: Demo String params
      Given User is on "qa-chase.com"