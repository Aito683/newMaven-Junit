package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaits_17_6 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");

        WebElement dynamicPropertiesBtn = driver.findElement(By.id("dynamicProperties_page"));
        dynamicPropertiesBtn.click();
//explicit wait = WebDriver Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement enableAfter5Button =
                wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        enableAfter5Button.click();

        WebElement visibleAfterBtn = driver.findElement(By.id("visibleAfter"));
        visibleAfterBtn.click();


    }
}
