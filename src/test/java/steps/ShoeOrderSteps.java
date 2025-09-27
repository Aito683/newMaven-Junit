package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ShoeOrder;

import java.util.List;

public class ShoeOrderSteps {
    @Given("a shoe order:")
    public void a_shoe_order(List<ShoeOrder> shoeOrders) {
        for(ShoeOrder order:shoeOrders){
            System.out.println(order.getOrderId());
            System.out.println(order.getCustomerName());
            System.out.println(order.getShippingAddress());
            System.out.println(order.getBillingAddress());
            System.out.println(order.getShoeModel());
            System.out.println(order.getQuantity());
            System.out.println(order.getUnitPrice());
            System.out.println(order.getSubtotal());
            System.out.println(order.getTaxRate());
            System.out.println(order.getTaxAmount());
            System.out.println(order.getTotalPrice());
            System.out.println(order.getTotalAmount());
        }

    }

    @When("the user processes the shoe order")
    public void the_user_processes_the_shoe_order() {

    }
    @Then("the invoice should match the order details")
    public void the_invoice_should_match_the_order_details() {

    }
}
