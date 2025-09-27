package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ColorMixingSteps {
    private String firstColor;
    private String secondColor;
    private String result;

    @Given("the first color is {string}")
    public void the_first_color_is(String color) {
        firstColor = color;
    }
    @Given("the second color is {string}")
    public void the_second_color_is(String color) {
       secondColor = color;
    }
    @When("the system mixes the two colors")
    public void the_system_mixes_the_two_colors() {

    }
    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        System.out.println("The result is "+ expected);
    }

}
