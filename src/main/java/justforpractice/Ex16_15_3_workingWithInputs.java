package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_15_3_workingWithInputs {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        Thread.sleep(1000);

        WebElement fullNameTxtBox = driver.findElement(By.id("fullName"));
        fullNameTxtBox.sendKeys("John Doe");
        Thread.sleep(1000);

        WebElement secondInput = driver.findElement(By.id("join"));
        secondInput.sendKeys(" Appended Text");

        // Wait for the input to be ready
        Thread.sleep(2000);


        driver.quit();

    }
}
