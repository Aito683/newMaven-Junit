package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Invoice;

import java.util.List;

public class OnlineOrdersSteps {
    @Given("an online order with the following details:")
    public void an_online_order_with_the_following_details(List<Invoice> invoices) {
        for(Invoice i : invoices){
            System.out.println(i.getOrderId());
            System.out.println(i.getCustomerName());
            System.out.println(i.getShippingAddress());
            System.out.println(i.getProductName());
            System.out.println(i.getQuantity());
        }

    }
    @When("the order is processed and invoice is generated with the following details:")
    public void the_order_is_processed_and_invoice_is_generated_with_the_following_details(List<Invoice> invoiceList) {
for(Invoice i :invoiceList){
    System.out.println(i.getOrderId());
    System.out.println(i.getCustomerName());
    System.out.println(i.getBillingAddress());
    System.out.println(i.getProductName());
    System.out.println(i.getQuantity());
    System.out.println(i.getUnitPrice());
    System.out.println(i.getSubtotal());
    System.out.println(i.getTaxRate());
    System.out.println(i.getTaxAmount());
    System.out.println(i.getTotalAmount());

}
    }
    @Then("the user should see the invoice generated with following details:")
    public void the_user_should_see_the_invoice_generated_with_following_details(List<Invoice> invoiceList) {
        for(Invoice i:invoiceList){
            System.out.println(i.getOrderId());
            System.out.println(i.getCustomerName());
            System.out.println(i.getBillingAddress());
            System.out.println(i.getProductName());
            System.out.println(i.getQuantity());
            System.out.println(i.getUnitPrice());
            System.out.println(i.getSubtotal());
            System.out.println(i.getTaxRate());
            System.out.println(i.getTaxAmount());
            System.out.println(i.getTotalAmount());
        }

    }

}
