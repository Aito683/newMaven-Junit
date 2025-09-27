package steps;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class HousingAgencySteps {
    @Given("a list of houses held by a rental agency with the following details:")
    public void a_list_of_houses_held_by_a_rental_agency_with_the_following_details(List<Map<String, String>> houses) {
//print out :
// Best places with wifi and parking
// The most expensive house
// The cheapest house
        for(Map<String,String> house:houses){
            if(house.get("Wi-Fi").equalsIgnoreCase("Yes") && house.get("Parking").equalsIgnoreCase("Yes")){
                System.out.println("Best places with wifi and parking "+ house.get("House Name"));
            }
            if(house.get("Price per Night").equalsIgnoreCase("$300.00")){
                System.out.println("The most expensive house "+house.get("House Name"));
            }
            if(house.get("Price per Night").equalsIgnoreCase(("$100.00"))){
                System.out.println("The cheapest house "+ house.get("House Name"));
            }
        }
    }

}
