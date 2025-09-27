package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSteps {


    List<Hotel> hotelList = new ArrayList<>();
    @Given("a list of hotels with the following details:")
    public void a_list_of_hotels_with_the_following_details(List<Hotel> hotels) {
        hotelList = hotels;
        //System.out.println(hotels.get(0).getHotelName());//Grand Plaza Hotel
        System.out.println("User accessing the list of hotels");
    }
    @When("the hotel management team needs to access and modify hotel details")
    public void the_hotel_management_team_needs_to_access_and_modify_hotel_details() {
        System.out.println("Management team enters the hotels details");
    }
    @Then("the team should be able to manage information about each hotel, including its name, location, star rating, available room types, and average guest rating.")
    public void the_team_should_be_able_to_manage_information_about_each_hotel_including_its_name_location_star_rating_available_room_types_and_average_guest_rating() {
        System.out.println("They can access all the information");
        for (Hotel h : hotelList) {
            System.out.println(h.getHotelName() + " | " + h.getLocation() + " | " + h.getStarRating()
                    + " stars | Rooms: " + h.getRoomTypes() + " | Rating: " + h.getAvgGuestRating());
        }
    }

}
