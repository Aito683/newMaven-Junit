package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferSteps {
    @Given("User with account number {int} is registered")
    public void user_with_account_number_is_registered(Integer int1) {
        System.out.println("My first given step.What a ride with WEDEVX!");
        System.out.println("Printing out account number:"+int1);
    }
    @Given("User with account number {int} deposited ${double}")
    public void user_with_account_number_deposited_$(Integer accountNum, double depositAmount) {
        System.out.println("Printing out accountNum again: "+accountNum);
        System.out.println("Printing out deposit amount: "+depositAmount);
    }
    @When("User with account number {int} transfers ${double}")
    public void user_with_account_number_transfers_$(Integer accountNum, double transferAmount) {

        System.out.println("This is When");
        System.out.println("Printing out accountNum again: "+accountNum);

        System.out.println("Printing out transfer amount: "+transferAmount);
    }
    @Then("User with account number {int} should have ${double} in balance")
    public void user_with_account_number_should_have_$_in_balance(Integer accountnum, double  balance) {

        System.out.println("This is Then");
        System.out.println("Printing out accountNum again: "+accountnum);

        System.out.println("Printing out balance amount: "+balance);
    }
    @Then("User should see Insufficient Funds message")
    public void user_should_see_insufficient_funds_message() {
        System.out.println("This is error message");
    }

    @Given("User is on {string}")
    public void user_is_on(String envUrl) {
        System.out.println("going to "+envUrl);

    }


}

