package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_20_3_CreateNewCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        Thread.sleep(1000);

        WebElement addCustomer = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomer.click();
        Thread.sleep(1000);

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@ng-model='fName']"));
        firstNameInput.sendKeys("Aitolkun");
        Thread.sleep(1000);

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@ng-model='lName']"));
        lastNameInput.sendKeys("Musaeva");
        Thread.sleep(1000);

        WebElement postCodeInput = driver.findElement(By.xpath("//input[@placeholder='Post Code']"));
        postCodeInput.sendKeys("18976");
        Thread.sleep(1000);

        WebElement addCustomerBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        addCustomerBtn.click();
        Thread.sleep(5000);

        driver.quit();


    }
}
