package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(1000);
        WebElement fullNameTxtBox = driver.findElement(By.id("name"));
        Thread.sleep(1000);

        //sendKeys method takes a String that will be populated
        //to the located txt box in html
        fullNameTxtBox.sendKeys("Elon Musk");
        Thread.sleep(1000);

        WebElement emailTxtBox = driver.findElement(By.id("email"));
        emailTxtBox.sendKeys("elon@spacex.com");
        Thread.sleep(1000);

        WebElement currentAddressTxtBox = driver.findElement(By.id("currentAddress"));
        currentAddressTxtBox.sendKeys("123 Main Street");
        Thread.sleep(1000);

        WebElement permanentAddressTxtBox = driver.findElement(By.id("permanentAddress"));
        permanentAddressTxtBox.sendKeys("123 SpaceX ave");
        Thread.sleep(1000);

        WebElement submitBtn = driver.findElement(By.className("MuiButton-containedPrimary"));
        submitBtn.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
