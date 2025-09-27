package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskStatusAndTimelineSteps {
    private String taskTitle;
    private String taskStatus;
    private String startDate;
    private int dueDateYear;
    private int dueMonth;
    @Given("the task with the title {string} exists")
    public void the_task_with_the_title_exists(String title) {
        taskTitle = title;

    }
    @Given("the task's current status is {string}")
    public void the_task_s_current_status_is(String status) {
       taskStatus = status;
    }
    @Given("the task's start date is {string}")
    public void the_task_s_start_date_is(String date) {
        startDate = date;
    }
    @Given("the task's due date year is {int}")
    public void the_task_s_due_date_year_is(Integer year) {
       dueDateYear = year;
    }
    @Given("the task's due date month is {int}")
    public void the_task_s_due_date_month_is(Integer month) {
        dueMonth = month;
    }
    @When("the user changes the task status to {string}")
    public void the_user_changes_the_task_status_to(String newStatus) {
        taskStatus = newStatus;
    }
    @Then("the task's status should be {string}")
    public void the_task_s_status_should_be(String newStatus) {
        System.out.println("The task's new status: "+ newStatus);
    }
    @Then("the task's timeline should be updated with {string}")
    public void the_task_s_timeline_should_be_updated_with(String timeline) {
        System.out.println("Task's timeline is: "+ timeline );
    }

}
