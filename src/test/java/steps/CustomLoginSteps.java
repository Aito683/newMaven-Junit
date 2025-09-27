package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomLoginSteps {

        @Given("the user has a valid account with username {string} and password {string}")
        public void the_user_has_a_valid_account_with_username_and_password(String string, String string2) {

        }
        @When("the user enters their username and password and clicks the login button")
        public void the_user_enters_their_username_and_password_and_clicks_the_login_button() {

        }
        @Then("the welcome message {string} should be displayed")
        public void the_welcome_message_should_be_displayed(String string) {

        }

}
