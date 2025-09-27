package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait_17_5 {
    public static void main(String[] args) {


     WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");


    WebElement currentAddressTxtBox = driver.findElement(By.name("currentAddress"));
        currentAddressTxtBox.sendKeys("123 Main St");

    WebElement permanentAddressTxtBtn = driver.findElement(By.name("permanentAddress"));
        permanentAddressTxtBtn.sendKeys("123 SpaceX ave");
       // driver.quit();
}
}
