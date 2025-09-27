package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectGradingSteps {

    @Given("the student name is {string}")
    public void the_student_name_is(String studentName) {
        System.out.println("Student name: "+studentName);

    }
    @Given("the project mark for {string} is {int}")
    public void the_project_mark_for_is(String studentName, int projectMark) {
        System.out.printf("The project mark for %s is %d",studentName, projectMark);
    }
    @When("the system calculates the letter grade for {string} project mark")
    public void the_system_calculates_the_letter_grade_for_project_mark(String studentName) {

        System.out.println("\nStudent name: "+ studentName);

    }
    @Then("the system should display {string} grade as {string}")
    public void the_system_should_display_grade_as(String studentName, String grade) {

        System.out.println(studentName +"'s grade is "+grade);
    }

}
