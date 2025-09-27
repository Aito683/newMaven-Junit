package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_20_1_GettingButtonsUsingAttributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        Thread.sleep(2000);

        WebElement addCustomerBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomerBtn.click();
        Thread.sleep(2000);

        WebElement openAccountBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openAccountBtn.click();
        Thread.sleep(3000);
        WebElement customersBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersBtn.click();
        Thread.sleep(3000);
        System.out.println(addCustomerBtn.getAttribute("ng-click"));
        Thread.sleep(1000);
        System.out.println(openAccountBtn.getAttribute("ng-click"));
        Thread.sleep(1000);

        System.out.println(customersBtn.getAttribute("ng-click"));
        Thread.sleep(1000);


        driver.quit();
    }
}
