package steps;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.AccountCard;
import models.BankTransaction1;
import models.NewCheckingAccountInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class CheckingAccountSteps {

    WebDriver driver;
    LoginPage loginPage ;


    @BeforeAll
            public static void setup(){
        WebDriverManager.chromedriver().setup();
    }


   @Before
    public void the_user_is_on_dbank_homepage() {
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://dbank-qa.wedevx.co/bank/login");
       loginPage = new LoginPage(driver);

    }
    @Given("the user logged in as {string} {string}")
    public void the_user_logged_in_as(String username, String password) {
         loginPage.login(username,password);
//       WebElement usernameTxt = driver.findElement(By.id("username"));
//       WebElement passwordTxt = driver.findElement(By.id("password"));
//       WebElement submitBtn = driver.findElement(By.id("submit"));
//
//       usernameTxt.sendKeys(username);
//       passwordTxt.sendKeys(password);
//       submitBtn.click();

    }

    @When("the user creates a new checking account with the following data")
    public void the_user_creates_a_new_checking_account_with_the_following_data(List<NewCheckingAccountInfo> checkingAccountInfoList) {
      NewCheckingAccountInfo testDataForOneCheckingAccount = checkingAccountInfoList.get(0);

       //user clicks on checking button
        WebElement checkingMenu = driver.findElement(By.id("checking-menu"));
        checkingMenu.click();
        //user clicks on new checking
        WebElement newCheckingBtn = driver.findElement(By.id("new-checking-menu-item"));
        newCheckingBtn.click();

        String expectedUrl = "https://dbank-qa.wedevx.co/bank/account/checking-add";

       // assertEquals("New Checking button didn't take to the url", expectedUrl, driver.getCurrentUrl());

        //the user selects the account type
        WebElement accountTypeRadioButton = driver.findElement(By.id(testDataForOneCheckingAccount.getCheckingAccountType()));
        accountTypeRadioButton.click();

        //the user selects account ownership
        WebElement ownershipTypeRadioBtn = driver.findElement(By.id(testDataForOneCheckingAccount.getAccountOwnership()));
        ownershipTypeRadioBtn.click();

        //the user names the Account
        WebElement accountNameTxt = driver.findElement(By.id("name"));
        accountNameTxt.sendKeys(testDataForOneCheckingAccount.getAccountName());

        //the user makes the initial deposit
        WebElement openingBalanceTxtBox = driver.findElement(By.id("openingBalance"));
        openingBalanceTxtBox.sendKeys(String.valueOf(testDataForOneCheckingAccount.getInitialDeposit()));

        //the user clicks on submit button
        WebElement submitBtn = driver.findElement(By.id("newCheckingSubmit"));
        submitBtn.click();
    }

    @Then("the user should see the green {string} message")
    public void the_user_should_see_the_green_message(String expectedConfMessage) {
       WebElement newAccountConfAlertDiv = driver.findElement(By.id("new-account-conf-alert"));
        System.out.println(newAccountConfAlertDiv.getText());
      expectedConfMessage = "Confirmation " + expectedConfMessage + "\n×";
      assertEquals(expectedConfMessage, newAccountConfAlertDiv.getText());

    }
    @Then("the user should see newly added account card")
    public void the_user_should_see_newly_added_account_card(List<AccountCard> accountCardList) {

        List<WebElement> allFirstRowDivs = driver.findElements(By.xpath("//div[@id='firstRow']/div"));

        WebElement lastAccountCard = allFirstRowDivs.get(allFirstRowDivs.size()-1);
        String actualResult = lastAccountCard.getText();
        String actualAccountName = actualResult.substring(0, actualResult.indexOf("\n")).trim();


        String actualAccountType = actualResult.substring(actualResult.indexOf("Account"), actualResult.indexOf("Ownership")).trim();
        String actualOwnership = actualResult.substring(actualResult.indexOf("Ownership"), actualResult.indexOf("Account Number:")).trim();
        String actualAccountNumber = actualResult.substring(actualResult.indexOf("Account Number:"), actualResult.indexOf("Interest Rate")).trim();
        String actualInterestRate = actualResult.substring(actualResult.indexOf("Interest Rate:"), actualResult.indexOf("Balance:")).trim();
        String actualBalance = actualResult.substring(actualResult.indexOf("Balance:")).trim();

        AccountCard expectedResult = accountCardList.get(0);

        assertEquals(expectedResult.getAccountName(), actualAccountName);
        assertEquals("Account: "+expectedResult.getAccountType(),actualAccountType);
        assertEquals("Ownership: "+expectedResult.getOwnership(), actualOwnership);
        assertEquals("Interest Rate: "+expectedResult.getInterestRate(),actualInterestRate);

        String expectedBalance = String.format("%.2f", expectedResult.getBalance());
        assertEquals("Balance: $"+expectedBalance,actualBalance);
       
    }
    @Then("the user should see the following transactions")
    public void the_user_should_see_the_following_transactions(List<BankTransaction1> expectedTransactions) {
       WebElement firstRowOfTransactions = driver.findElement(By.xpath("//table[@id='transactionTable']/tbody/tr"));
//table[@id='transactionTable']/tbody/tr
      List <WebElement> firstRowColumns =  firstRowOfTransactions.findElements(By.xpath("td"));
      String actualCategory = firstRowColumns.get(1).getText();
      String actualDescription = firstRowColumns.get(2).getText();
      double actualAmount = Double.parseDouble(firstRowColumns.get(3).getText().substring(1));
      double actualBalance= Double.parseDouble(firstRowColumns.get(4).getText().substring(1));

      BankTransaction1 expectedTransaction = expectedTransactions.get(0);
      assertEquals(expectedTransaction.getCategory(), actualCategory);
      //assertEquals(expectedTransaction.getDescription(), actualDescription);
      assertEquals(expectedTransaction.getAmount(), actualAmount, 0.01);
      assertEquals(expectedTransaction.getBalance(),actualBalance,0.01);



    }
}
