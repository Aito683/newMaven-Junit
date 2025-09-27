package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
//Working with table Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver. Task:
//
//Go to https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list
//
//Create a new class Customer with the fields from the table (except the delete button). Create four objects of the Customer class with the data from the table
//
//Create a new method that accepts the List of Customer, it should print the name of the customer whose account ends on an odd number

public class Ex16_21_2_WorkingWithTable2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
        Thread.sleep(2000);

        // Locate all rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

        // Create list of customers
        List<Customer> customers = new ArrayList<>();

        // Get first 4 customers from the table
        for (int i = 0; i < 4; i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            String firstName = cols.get(0).getText();
            String lastName = cols.get(1).getText();
            String postCode = cols.get(2).getText();
            String accountNumber = cols.get(3).getText();

            // create a Customer object first
            Customer customer = new Customer(firstName, lastName, postCode, accountNumber);

            // then add it to the list
            customers.add(customer);
        }

        // Call method to print customers with odd account number
        printCustomersWithOddAccounts(customers);

        driver.quit();
    }

    // Method to filter odd accounts
    public static void printCustomersWithOddAccounts(List<Customer> customers) {
        for (Customer customer : customers) {
            String account = customer.getAccountNum();
            if (!account.isEmpty()) {
                char lastChar = account.charAt(account.length() - 1);
                // Convert last character into an integer
                int lastDigit = Integer.parseInt(String.valueOf(lastChar));

                // Check odd/even
                if (lastDigit % 2 != 0) {
                    System.out.println(customer);
                    // System.out.println(customer.getFirstName() + " " + customer.getLastName());
                }


            }
        }
    }

}
class Customer{
    private String firstName;
    private String lastName;
    private String postCode;
    private String accountNum;

    public Customer(String firstName, String lastName, String postCode, String accountNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;
        this.accountNum = accountNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getAccountNum() {
        return accountNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", accountNum='" + accountNum + '\'' +
                '}';
    }
}
