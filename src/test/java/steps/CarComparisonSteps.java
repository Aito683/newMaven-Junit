package steps;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class CarComparisonSteps {
    @Given("a list of cars with their characteristics:")
    public void a_list_of_cars_with_their_characteristics(List<Map<String,String>> carsList) {

        for(Map<String,String> mapVar:carsList){
            System.out.println(mapVar.get("Car"));
            System.out.println(mapVar.get("Manufacturer"));
            System.out.println(mapVar.get("Type"));
            System.out.println(mapVar.get("Fuel Type"));
            System.out.println(mapVar.get("Engine Size (L)"));
            System.out.println(mapVar.get("Horsepower"));
            System.out.println(mapVar.get("Price ($)"));
        }
    }

}
