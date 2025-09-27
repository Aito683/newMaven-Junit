package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_20_4_RemoveExistingCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        Thread.sleep(1000);

        WebElement customersBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersBtn.click();
        Thread.sleep(1000);

        WebElement searchCustomerInput = driver.findElement(By.xpath("//input[@placeholder='Search Customer']"));
        searchCustomerInput.sendKeys("Ron");
        Thread.sleep(2000);

        WebElement deleteBtn = driver.findElement(By.xpath("//button[@ng-click='deleteCust(cust)']"));

        deleteBtn.click();
        Thread.sleep(3000);

        driver.quit();



    }
}
