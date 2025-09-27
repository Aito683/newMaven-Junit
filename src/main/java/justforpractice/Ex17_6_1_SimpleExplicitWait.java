package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Ex17_6_1_SimpleExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        chromeDriver.get("https://practice-automation.com/spinners/");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(3));
        WebElement spinner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='spinner spinner-hidden']")));
       // spinner.click();

        //chromeDriver.quit();

    }
}
