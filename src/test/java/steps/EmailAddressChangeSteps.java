package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class EmailAddressChangeSteps {

    private WebDriver driver;

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        driver.get("https://example.com/login");
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("loginButton")).click();
    }

    @Given("the user is on the account settings page")
    public void the_user_is_on_the_account_settings_page() {
        driver.get("https://example.com/account/settings");
    }

    @When("the user changes the email address to {string}")
    public void the_user_changes_the_email_address_to(String email) {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.clear();
        emailField.sendKeys(email);
        driver.findElement(By.id("saveButton")).click();
    }

    @Then("the email address should be updated to {string}")
    public void the_email_address_should_be_updated_to(String expectedEmail) {
        String actualEmail = driver.findElement(By.id("email")).getAttribute("value");
        Assert.assertEquals(expectedEmail, actualEmail);
    }
//    @And("the user is on the account settings page")
//    public void the_user_is_on_the_account_settings_page(DataTable table) {
//        driver.get("https://example.com/account/settings");
//
//        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
//
//        for (Map<String, String> row : rows) {
//            String newEmail = row.get("Updated Email Address");
//
//            WebElement emailField = driver.findElement(By.id("email"));
//            emailField.clear();
//            emailField.sendKeys(newEmail);
//            driver.findElement(By.id("saveButton")).click();
//
//            String actualEmail = driver.findElement(By.id("email")).getAttribute("value");
//            Assert.assertEquals(newEmail, actualEmail);
//        }
//    }
}