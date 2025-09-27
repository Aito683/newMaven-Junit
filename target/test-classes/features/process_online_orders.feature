Feature: Online Orders

  Scenario Outline: Processing online orders
    ##unitPrice, subtotal, taxRate, taxAmount,
    Given an online order with the following details:
      | orderId   | customerName   | shippingAddress   | productName   | quantity   | totalPrice   | unitPrice   | subtotal   | taxRate   | taxAmount   |
      | <orderId> | <customerName> | <shippingAddress> | <productName> | <quantity> | <totalPrice> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> |
    When the order is processed and invoice is generated with the following details:
      | orderId   | customerName   | billingAddress   | productName   | quantity   | unitPrice   | subtotal   | taxRate   | taxAmount   | totalAmount   |
      | <orderId> | <customerName> | <billingAddress> | <productName> | <quantity> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> | <totalAmount> |
    Then  the user should see the invoice generated with following details:
      | orderId   | customerName   | billingAddress   | productName   | quantity   | unitPrice   | subtotal   | taxRate   | taxAmount   | totalAmount   |
      | <orderId> | <customerName> | <billingAddress> | <productName> | <quantity> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> | <totalAmount> |

    Examples:
      | orderId | customerName | shippingAddress            | billingAddress             | productName | quantity | unitPrice | subtotal | taxRate | taxAmount | totalAmount |
      | 12345   | John Doe     | 123 Main Street, Cityville | 123 Main Street, Cityville | Product A   | 2        | 25.00     | 50       | 5       | 2.50      | 52.50       |
