package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculationsSteps {
    private double initialValue;
    private double anotherNumber;
    private double result;
    @Given("the initial value is {double}")
    public void the_initial_value_is(double value) {
        initialValue = value;

    }
    @Given("another number is {double}")
    public void another_number_is(double value) {
        anotherNumber = value;
    }
    @When("the system adds the two numbers")
    public void the_system_adds_the_two_numbers() {
        result = initialValue + anotherNumber;


    }

    @When("the system subtracts the second number from the initial value")
    public void the_system_subtracts_the_second_number_from_the_initial_value() {
        result = initialValue - anotherNumber;

    }

    @When("the system multiplies the two numbers")
    public void the_system_multiplies_the_two_numbers() {
        result = initialValue * anotherNumber;

    }
    @When("the system divides the initial value by the second number")
    public void the_system_divides_the_initial_value_by_the_second_number() {
        result = initialValue / anotherNumber;

    }
    @When("the system calculates the square root of the initial value")
    public void the_system_calculates_the_square_root_of_the_initial_value() {
        result = Math.sqrt(initialValue);

    }
    @When("the system calculates the square of the initial value")
    public void the_system_calculates_the_square_of_the_initial_value() {
        result = Math.pow(initialValue, 2 );

    }
    @When("the system calculates the cube of the initial value")
    public void the_system_calculates_the_cube_of_the_initial_value() {
        result = Math.pow(initialValue,3 );

    }
    @When("rounds it to the nearest integer")
    public void rounds_it_to_the_nearest_integer() {
        result = Math.round(result);

    }
    @When("the system calculates the initial value raised to the power of the second number")
    public void the_system_calculates_the_initial_value_raised_to_the_power_of_the_second_number() {
        result = Math.pow(initialValue,anotherNumber);


    }
    @When("the system calculates the initial value raised to the power of {int}")
    public void the_system_calculates_the_initial_value_raised_to_the_power_of(int power) {
        result = Math.pow(initialValue,power);

    }
    //

    @Then("the result should be {double}")
    public void the_result_should_be(double expected) {
        assertTrue(result==expected);

    }
}
