Feature: Online Shopping

  Background:
    Given a registered user is logged in
    And a product is added to the cart
    And the user proceeds to checkout

  Scenario: Successful Payment
    Given the user selects the payment method
    When the user completes the payment process
    Then the payment is successful


  Scenario: Payment Failure (Insufficient Funds)
    Given the user selects the payment method
    When the user completes the payment process
    Then the payment fails due to insufficient funds


  Scenario: Payment Failure (Product Out of Stock)
    Given the user selects the payment method
    When the user completes the payment process
    Then the payment fails due to the product being out of stock