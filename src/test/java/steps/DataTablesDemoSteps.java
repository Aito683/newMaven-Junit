package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Order;

import java.util.List;
import java.util.Map;

public class DataTablesDemoSteps {

    @Given("a bank account with account number {string} and balance {string} in USD")
    public void a_bank_account_with_account_number_and_balance_in_usd(String string, String string2) {

    }

    @Given("a bank account with account number {string} and balance {string} in EUR")
    public void a_bank_account_with_account_number_and_balance_in_eur(String string, String string2) {

    }

    @When("I transfer ${int} from account {string} to account {string} in EUR")
    public void i_transfer_$_from_account_to_account_in_eur(Integer int1, String string, String string2) {
        ;
    }


    @Given("a bank account with account number {string} and balance {string} in GBP")
    public void a_bank_account_with_account_number_and_balance_in_gbp(String string, String string2) {

    }

    @When("I transfer €{int} from account {string} to account {string} in GBP")
    public void i_transfer_€_from_account_to_account_in_gbp(Integer int1, String string, String string2) {

    }

    @When("I transfer £{int} from account {string} to account {string} in USD")
    public void i_transfer_£_from_account_to_account_in_usd(Integer int1, String string, String string2) {

    }

    @Then("the account balance for account {string} should be {string}")
    public void the_account_balance_for_account_should_be(String string, String string2) {

    }


    @Given("the following bank accounts with their respective balances:")
    public void the_following_bank_accounts_with_their_respective_balances(DataTable dataTable) {

        System.out.println(dataTable.cell(2, 1));
    }

    @When("I transfer the following amounts between accounts:")
    public void i_transfer_the_following_amounts_between_accounts(DataTable dataTable) {
        System.out.println(dataTable.cell(2, 2));

    }

    @Then("the account balances should be updated as follows:")
    public void the_account_balances_should_be_updated_as_follows(DataTable dataTable) {
        System.out.println(dataTable.cell(1, 2));
    }


    //Data table to List<Map>
    @Given("the following orders exist:")
    public void the_following_orders_exist(List<Map<String, String>> orders) {
        System.out.println(orders.get(0).get("Product"));

        System.out.println(orders.get(2).get("Product"));
        System.out.println(orders.get(1).get("Quantity"));

        for(Map<String,String> mapVar:orders){
            System.out.println(mapVar.get("Order ID"));
            System.out.println(mapVar.get("Product"));
            System.out.println(mapVar.get("Quantity"));
        }

        }
    @Given("the following orders exist in the db:")
    public void the_following_orders_exist_in_the_db(List<Order> orders) {
        System.out.println(orders.get(0).getProduct());//Watermelon

        for(Order order:orders){
            System.out.println(order.getOrderID());
            System.out.println(order.getProduct());
            System.out.println(order.getQuantity());
        }
    }

    }



