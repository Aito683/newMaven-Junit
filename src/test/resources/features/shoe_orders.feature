Feature: Shoe Orders
  Scenario Outline: Processing Shoe Orders
    Given a shoe order:
      | orderId   | customerName   | shippingAddress   | billingAddress   | shoeModel   | quantity   | unitPrice   | subtotal   | taxRate   | taxAmount   | totalPrice   | totalAmount   |
      | <orderId> | <customerName> | <shippingAddress> | <billingAddress> | <shoeModel> | <quantity> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> | <totalPrice> | <totalAmount> |
    When the user processes the shoe order
    Then the invoice should match the order details

    Examples:
      | orderId | customerName | shippingAddress            | billingAddress             | shoeModel     | quantity | unitPrice | subtotal | taxRate | taxAmount | totalPrice | totalAmount |
      | 54321   | Alice Smith  | 456 Oak Avenue, Townsville | 456 Oak Avenue, Townsville | Running Shoes | 3        | 60.00     | 180.00   | 5       | 9.00      | 180.00     | 189.00      |