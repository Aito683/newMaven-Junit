package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dentalAppointmentSystemSteps {
    @Given("the dental system is running")
    public void the_dental_system_is_running() {

    }
    @Given("the receptionist is logged into the system")
    public void the_receptionist_is_logged_into_the_system() {

    }
    @When("the receptionist registers a new patient with details:")
    public void the_receptionist_registers_a_new_patient_with_details(DataTable dataTable) {
        System.out.println(dataTable.cell(0,0));
    }
    @Then("the patient {string} should be registered successfully")
    public void the_patient_should_be_registered_successfully(String string) {

    }
    @Then("an appointment should be created")
    public void an_appointment_should_be_created() {

    }
    @Then("the system should display an error message {string}")
    public void the_system_should_display_an_error_message(String string) {

    }

    @Then("the patient record should not be created")
    public void the_patient_record_should_not_be_created() {

    }
    @Then("the system should flag {string}")
    public void the_system_should_flag(String string) {

    }

    @Then("the appointment should remain pending")
    public void the_appointment_should_remain_pending() {

    }
    @Then("the appointment should be confirmed")
    public void the_appointment_should_be_confirmed() {

    }

    @Then("the invoice should show the cost as {string}")
    public void the_invoice_should_show_the_cost_as(String string) {

    }


}
