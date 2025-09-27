package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
//Go to https://magento.softwaretestingboard.com/
//
//Click on the "Create an Account" button
//
//Provide test details, do not provide actual data
//
//Once registered, you will be redirected to the My Account page
//
//Click on the "Edit" button
//
//Change the name and click save
//
//Validate that the name has been changed
//
//Use only explicit and fluent waits
//
//Print the name before and after the modification

public class Ex17_7_1_ComplexPractice {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://magento.softwaretestingboard.com/");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement createAccountBtnLink = driver.findElement(By.xpath("//a[text()='Create an Account']"));
//        createAccountBtnLink.click();
//
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
//
//        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
//        //firstNameInput.click();
//        firstNameInput.sendKeys("Johny");
//        System.out.println(firstNameInput.getText());
//
//        WebElement lastNameInput = driver.findElement(By.id("lastname"));
//        lastNameInput.sendKeys("Depp");
//
//        WebElement emailInput = driver.findElement(By.id("email_address"));
//        emailInput.sendKeys("jonydep@hotmail.com");
//
//        WebElement passwordInput = driver.findElement(By.id("password"));
//        passwordInput.sendKeys("jd001001!");
//
//        WebElement confirmPasswordInput = driver.findElement(By.id("password-confirmation"));
//        confirmPasswordInput.sendKeys("jd001001!");
//
//        WebElement createAnAccountBtn  = driver.findElement(By.xpath("//span[text()='Create an Account']"));
//        createAnAccountBtn.click();
////span[text()='Edit']
//        WebElement editBtn   = driver.findElement(By.xpath("//span[text()='Edit']"));
//        editBtn.click();
//
//        WebElement firstnameInput   = driver.findElement(By.id("firstname"));
//        firstnameInput.sendKeys("Johnnie");
//        System.out.println(firstnameInput.getText());
//
//        WebElement saveButton   = driver.findElement(By.xpath("//span[text()='Save']"));
//        saveButton.click();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Open site
        driver.get("https://magento.softwaretestingboard.com/");

        // Create Account
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create an Account"))).click();
        driver.findElement(By.id("firstname")).sendKeys("Test");
        driver.findElement(By.id("lastname")).sendKeys("User");
        driver.findElement(By.id("email_address")).sendKeys("test" + System.currentTimeMillis() + "@mail.com");
        driver.findElement(By.id("password")).sendKeys("Test@12345");
        driver.findElement(By.id("password-confirmation")).sendKeys("Test@12345");
        driver.findElement(By.cssSelector("button[title='Create an Account']")).click();

        // Print name before
        String beforeName = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".header .customer-name"))).getText();
        System.out.println("Before: " + beforeName);

        // Edit Account Info
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit"))).click();

        // FluentWait for Firstname
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2));
      //  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement firstName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("firstname"))
        );
        firstName.clear();
        firstName.sendKeys("Updated");

        // Print name after
        String afterName = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".header .customer-name"))).getText();
        System.out.println("After: " + afterName);

        driver.quit();


    }
}
