package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Navigate between pages Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver. Task:
//
//Go to https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
//
//Click on the Customer Login button
//
//Come back and click on the Bank Manager Login button
//
//Click on the Add Customer button
//
//Come back and click on Open Account button
//
//Click on Customers button
//
//Come back, then navigate to the Customers page back with no button interaction
//
//Go to the Home page
//
//Navigate to the Customers page using the link

public class Ex17_2_1_SimpleNavigationPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);

        WebElement customerLoginBtn = driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"));
        customerLoginBtn.click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        WebElement bankManagerLoginBtn = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
        bankManagerLoginBtn.click();
        Thread.sleep(1000);

        WebElement addCustButton = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustButton.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);

        WebElement openAccountBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openAccountBtn.click();
        Thread.sleep(1000);

        WebElement customersButton = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersButton.click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        WebElement homePageButton = driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        homePageButton.click();
        Thread.sleep(2000);

        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
        Thread.sleep(2000);

        driver.quit();

    }
}
