package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ex17_10_1DropdownsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().fullscreen();

        WebElement customerLoginButton = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
        customerLoginButton.click();

        WebElement yourNameDropDown = driver.findElement(By.id("userSelect"));

        Select yourNameDropDownSelect = new Select(yourNameDropDown);
        yourNameDropDownSelect.selectByIndex(1);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement accountNumDropdown = driver.findElement(By.id("accountSelect"));
        Select accountNumDropdownSelect = new Select(accountNumDropdown);
        accountNumDropdownSelect.selectByValue("number:1003");

        WebElement depositButton = driver.findElement(By.xpath("//button[@ng-click='deposit()']"));
        depositButton.click();

        WebElement inputAmount = driver.findElement(By.xpath("//input[@type='number']"));
        inputAmount.sendKeys("1000");

        WebElement depositSubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        depositSubmitButton.click();
        Thread.sleep(4000);

        driver.quit();
    }
}
