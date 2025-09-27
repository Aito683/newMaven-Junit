package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("This is given step");
    }
    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        System.out.println("This is When step");
    }
    @When("clicks the login button")
    public void clicks_the_login_button() {
        System.out.println("This is 2nd When step");
    }
    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println("This is Then step");
    }

}
