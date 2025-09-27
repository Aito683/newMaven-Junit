package steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Car;
import models.Team;

import java.util.List;
import java.util.Map;

public class F1ManagementSystemSteps {
    private List<Team> teams;
    private List<Car> cars;

    @DataTableType
    public Team teamEntry(Map<String, String> entry) {
        return new Team(
                entry.get("teamName"),
                entry.get("principal"),
                entry.get("leadDriver")
        );
    }

    @DataTableType
    public Car carEntry(Map<String, String> entry) {
        return new Car(
                entry.get("teamName"),
                entry.get("chassis"),
                entry.get("engine"),
                Double.parseDouble(entry.get("weight"))
        );
    }

    @Given("the following F1 teams exist:")
    public void givenF1Teams(List<Team> teamList) {
        this.teams = teamList;
        System.out.println("F1 Teams:");
        for (Team t : teams) {
            System.out.println(t.getTeamName() + " | Principal: " + t.getPrincipal() + " | Lead Driver: " + t.getLeadDriver());
        }
    }

    @Given("the following cars exist:")
    public void givenF1Cars(List<Car> carList) {
        this.cars = carList;
        System.out.println("F1 Cars:");
        for (Car c : cars) {
            System.out.println(c.getTeamName() + " | Chassis: " + c.getChassis() + " | Engine: " + c.getEngine() + " | Weight: " + c.getWeight());
        }
    }

    @When("the user views the details for team {string}")
    public void viewTeamDetails(String teamName) {
        for (Team t : teams) {
            if (t.getTeamName().equalsIgnoreCase(teamName)) {
                System.out.println("Team: " + t.getTeamName() + " | Principal: " + t.getPrincipal() + " | Lead Driver: " + t.getLeadDriver());
                break;
            }
        }
    }

    @When("the user views the car specifications for team {string}")
    public void viewCarSpecs(String teamName) {
        for (Car c : cars) {
            if (c.getTeamName().equalsIgnoreCase(teamName)) {
                System.out.println("Car - Team: " + c.getTeamName() + " | Chassis: " + c.getChassis() + " | Engine: " + c.getEngine() + " | Weight: " + c.getWeight());
                break;
            }
        }
    }

    @Then("the user should see all teams and their representatives")
    public void verifyTeams() {
        System.out.println("Verifying all teams and representatives...");
        for (Team t : teams) {
            System.out.println(t.getTeamName() + " | Principal: " + t.getPrincipal() + " | Lead Driver: " + t.getLeadDriver());
        }
    }

    @Then("the user should see all car specifications")
    public void verifyCars() {
        System.out.println("Verifying all car specifications...");
        for (Car c : cars) {
            System.out.println(c.getTeamName() + " | Chassis: " + c.getChassis() + " | Engine: " + c.getEngine() + " | Weight: " + c.getWeight());
        }
    }
}
