package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(1000);

        WebElement currentAddressTxtBox = driver.findElement(By.name("currentAddress"));
        currentAddressTxtBox.sendKeys("123 Main St");
        Thread.sleep(1000);

        WebElement permanentAddressTxtBtn = driver.findElement(By.name("permanentAddress"));
        permanentAddressTxtBtn.sendKeys("123 SpaceX ave");
        Thread.sleep(1000);
        driver.quit();
    }
}
