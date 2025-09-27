package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.EmailAutomationSetting;
import models.EmailType;

import java.util.ArrayList;
import java.util.List;

public class EmailAutomationSettingsSteps {
    private List<EmailType> emailTypes = new ArrayList<>();
    private List<EmailAutomationSetting> automationSettings = new ArrayList<>();

    @Given("a list of email types with the following details:")
    public void a_list_of_email_types_with_the_following_details(List<EmailType> emailTypes) {
        System.out.println("Here are the types of emails: ");
        for(EmailType type:emailTypes){

            System.out.println( type.getEmailType()+" - "+type.getDescription());
        }

    }
    @When("the user configures email automation settings by specifying the email type and associated automation settings:")
    public void the_user_configures_email_automation_settings_by_specifying_the_email_type_and_associated_automation_settings(List<EmailAutomationSetting> settings) {
        for(EmailAutomationSetting setting: settings){
            System.out.println(setting.getEmailType()+" - "+setting.getScheduleFrequency()+" - "+ setting.getSendTime());
        }

    }
    @When("the user sets up additional email automation settings for the same email types:")
    public void the_user_sets_up_additional_email_automation_settings_for_the_same_email_types(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("the user should be able to view and confirm the configured email automation settings:")
    public void the_user_should_be_able_to_view_and_confirm_the_configured_email_automation_settings(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("the user should verify that the latest settings have been applied successfully.")
    public void the_user_should_verify_that_the_latest_settings_have_been_applied_successfully() {

    }
}
