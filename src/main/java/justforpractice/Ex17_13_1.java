package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Ex17_13_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://practice-automation.com/hover/");
        driver.manage().window().fullscreen();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement mouseOverMe = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mouse_over")));
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseOverMe).perform();

        Thread.sleep(3000);
        driver.quit();

    }
}
