package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class SmartphoneComparisonSteps {
    private List<Map<String,String>> smartphoneList;
    @Given("a list of smartphones with their characteristics:")
    public void a_list_of_smartphones_with_their_characteristics(DataTable dataTable) {
        smartphoneList = dataTable.asMaps(String.class,String.class);

    }
    @When("the user compares the smartphones based on the following characteristics:")
    public void the_user_compares_the_smartphones_based_on_the_following_characteristics(DataTable dataTable) {

    }
    @Then("the user should be able to make comparisons between the smartphones and determine which smartphone has:")
    public void the_user_should_be_able_to_make_comparisons_between_the_smartphones_and_determine_which_smartphone_has(DataTable criteria) {
        for(Map<String ,String> phone:smartphoneList){
            if(phone.get("Operating System").equalsIgnoreCase("iOS")){
                System.out.println(criteria.cell(0,0)+": "+phone.get("Smartphone")+" ("+phone.get("Operating System")+")");
            }
            if(phone.get("Display Size (inches)").equalsIgnoreCase("6.7")){
                System.out.println(criteria.cell(1,0)+": "+ phone.get("Smartphone"));
            }
            if(phone.get("RAM (GB)").equalsIgnoreCase("12")){
                System.out.println("The most RAM: "+ phone.get("Smartphone")+" ("+phone.get("RAM (GB)")+")");
            }
            if(phone.get("Storage (GB)").equalsIgnoreCase("256")){
                System.out.println("The highest storage capacity: "+phone.get("Smartphone")+" ("+phone.get("Storage (GB)")+")");
            }
            if(phone.get("Price ($)").equalsIgnoreCase("699")){
                System.out.println("The lowest price: "+phone.get("Smartphone")+" ("+phone.get("Price ($)")+")");
            }
        }
        System.out.println(criteria.cell(0,0));

    }

}
