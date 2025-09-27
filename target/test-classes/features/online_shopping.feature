Feature: Online Shopping
@payments @regression
  Scenario: Payment Failure (Product Out of Stock)
    Given the user selects the payment method
    When the user completes the payment process
    Then the payment fails due to the product being out of stock