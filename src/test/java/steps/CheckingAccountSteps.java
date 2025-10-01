package steps;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CheckingAccountSteps {
    @BeforeAll
            public static void setup(){
        WebDriverManager.chromedriver().setup();

    }
    WebDriver driver = new ChromeDriver();

    @Given("the user is on dbank homepage")
    public void the_user_is_on_dbank_homepage() {

        driver.get("https://dbank-qa.wedevx.co/bank/login");

    }
    @Given("the user logged in as {string} {string}")
    public void the_user_logged_in_as(String username, String password) {

       WebElement usernameTxt = driver.findElement(By.id("username"));
       WebElement passwordTxt = driver.findElement(By.id("password"));

       usernameTxt.sendKeys(username);
       passwordTxt.sendKeys(password);

       WebElement submitBtn = driver.findElement(By.id("submit"));

       submitBtn.click();

    }
    @Given("the user clicks on the checking button")
    public void the_user_clicks_on_the_checking_button() {
       WebElement checkingMenu = driver.findElement(By.id("checking-menu"));
       checkingMenu.click();
    }
    @Given("the user clicks on new checking button")
    public void the_user_clicks_on_new_checking_button() {
       WebElement newCheckingBtn = driver.findElement(By.id("new-checking-menu-item"));
       newCheckingBtn.click();

       //assertEquals("https://dbank-qa.wedevx.co/bank/account/checking-add", driver.getCurrentUrl(),"New Checking button didn't take to the url");
    }
    @When("the user selects {string} Account type")
    public void the_user_selects_account_type(String idOfRadioButton) throws InterruptedException {
       WebElement accountTypeRadioButton = driver.findElement(By.id(idOfRadioButton));
       accountTypeRadioButton.click();
    }
    @When("the user selects {string} Account Ownership")
    public void the_user_selects_account_ownership(String ownershipTypeRadioBtnId) {
       WebElement ownershipTypeRadioBtn = driver.findElement(By.id(ownershipTypeRadioBtnId));
       ownershipTypeRadioBtn.click();
    }
    @When("the user names the account {string}")
    public void the_user_names_the_account(String accountName) {
        WebElement accountNameTxt = driver.findElement(By.id("name"));
       accountNameTxt.sendKeys(accountName);
    }
    @When("the user makes the initial deposit of ${double}")
    public void the_user_makes_the_initial_deposit_of_$(Double openingBalance) {
       WebElement openingBalanceTxtBox = driver.findElement(By.id("openingBalance"));
       openingBalanceTxtBox.sendKeys(String.valueOf(openingBalance));
    }
    @When("the user clicks on submit")
    public void the_user_clicks_on_submit() {
       WebElement submitBtn = driver.findElement(By.id("newCheckingSubmit"));
       submitBtn.click();
    }
    @Then("the user should see the green {string} message")
    public void the_user_should_see_the_green_message(String expectedConfMessage) {
       WebElement newAccountConfAlertDiv = driver.findElement(By.id("new-account-conf-alert"));

       expectedConfMessage = "Confirmation "+ expectedConfMessage +"\n";
       assertEquals(expectedConfMessage, newAccountConfAlertDiv.getText());
    }
    @Then("the user should see newly added account card")
    public void the_user_should_see_newly_added_account_card(io.cucumber.datatable.DataTable dataTable) {
       
    }
    @Then("the user should see the following transactions")
    public void the_user_should_see_the_following_transactions(io.cucumber.datatable.DataTable dataTable) {
       
    }
}
