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

public class Ex17_6_2_ExplicitWait1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://uitestingplayground.com/ajax");

        WebElement ajaxButton = chromeDriver.findElement(By.id("ajaxButton"));
        ajaxButton.click();

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(20));
        WebElement loadedLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
        loadedLabel.click();



        chromeDriver.quit();


    }
}
