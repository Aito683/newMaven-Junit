package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Employee;

import java.util.List;

public class EmployeeListSteps {
    private List<Employee> employeeList;

    @Given("a list of employee details with the following information:")
    public void givenEmployeeList(List<Employee> employees) {
        this.employeeList = employees;
        System.out.println("Initial Employee List:");
        printEmployeeList();
    }

    @When("the user adds a new employee with the following details:")
    public void addEmployee(List<Employee> newEmployees) {
        employeeList.addAll(newEmployees);
        System.out.println("After Adding New Employees:");
        printEmployeeList();
    }

    @When("the user updates the salary of an existing employee with Employee ID {int} to ${double}.")
    public void the_user_updates_the_salary_of_an_existing_employee_with_employee_id_to_$(Integer employeeId, Double newSalary) {

        for (Employee e : employeeList) {
            if (e.getEmployeeID()==employeeId) {
                e.setSalary(String.valueOf(newSalary));
                System.out.println("Updated salary for " + e.getFirstName() + " " + e.getLastName() + " to $" + newSalary);
                break; // stop once found
            }
        }
    }
    @When("the user removes the employee with Employee ID {int} from the records.")
    public void the_user_removes_the_employee_with_employee_id_from_the_records(Integer employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            if (e.getEmployeeID() ==employeeId) {
                System.out.println("Removed employee: " + e.getFirstName() + " " + e.getLastName());
                employeeList.remove(i);
                break; // stop once removed
            }
        }
    }
    @Then("the user should be able to view and confirm the updated employee details:")
    public void viewUpdatedEmployeeDetails(List<Employee> expectedEmployees) {
        System.out.println("Final Employee List:");
        printEmployeeList();
        // Optional: Add verification logic comparing employeeList with expectedEmployees

        printEmployeesWithSInSurname();
        //printMaxMinSalaries();
    }

    private void printEmployeeList() {
        for (Employee e : employeeList) {
            System.out.println(e.getEmployeeID() + " | " + e.getFirstName() + " " + e.getLastName()
                    + " | " + e.getDepartment() + " | " + e.getPosition() + " | " + e.getSalary());
        }
    }
    public void printEmployeesWithSInSurname() {
        System.out.println("Employees with 's' in surname:");
        for (Employee e : employeeList) {
            if (e.getLastName().toLowerCase().contains("s")) {
                System.out.println(e.getEmployeeID() + " | " + e.getFirstName() + " " + e.getLastName()
                        + " | " + e.getDepartment() + " | " + e.getPosition() + " | " + e.getSalary());
            }
        }
    }
    public void printMaxMinSalaries() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        double maxSalary = Double.valueOf(employeeList.get(0).getSalary());
        double minSalary = Double.valueOf(employeeList.get(0).getSalary());

        for (Employee e : employeeList) {
            if (Double.valueOf(e.getSalary()) > maxSalary) {
                maxSalary = Double.valueOf(e.getSalary());
            }
            if (Double.valueOf(e.getSalary()) < minSalary) {
                minSalary = Double.valueOf(e.getSalary());
            }
        }

        System.out.println("Maximum Salary: $" + maxSalary);
        System.out.println("Minimum Salary: $" + minSalary);
    }

}
