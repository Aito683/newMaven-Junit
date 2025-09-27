package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostManagementSteps {
    @Given("the user is logged in and has a post with tags")
    public void the_user_is_logged_in_and_has_a_post_with_tags() {
        System.out.println("This is Given step");
    }
    @Given("the user navigates to the post edit page")
    public void the_user_navigates_to_the_post_edit_page() {
        System.out.println("This is 2nd Given step");

    }
    @Given("the user selects the option to remove tags")
    public void the_user_selects_the_option_to_remove_tags() {
        System.out.println("This is 3rd Given step");

    }
    @When("the user confirms the removal")
    public void the_user_confirms_the_removal() {
        System.out.println("This is When step");

    }
    @When("the user saves the changes")
    public void the_user_saves_the_changes() {
        System.out.println("This is 2nd When  step");


    }
    @Then("the post should be updated successfully")
    public void the_post_should_be_updated_successfully() {
        System.out.println("This is Then step");

    }
    @Then("the post should no longer have tags")
    public void the_post_should_no_longer_have_tags() {
        System.out.println("This is 2nd Then step");

    }


}
