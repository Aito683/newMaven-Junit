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

public class Ex17_12_1_MovingTheSlider {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://practice-automation.com/slider/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement slideMe = driver.findElement(By.id("slideMe"));
        WebElement valueLabel = driver.findElement(By.id("value"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slideMe,-50,0).perform();
        wait.until(ExpectedConditions.textToBePresentInElement(valueLabel, "0"));
        System.out.println("✅ Value: " + valueLabel.getText());
        Thread.sleep(2000);

        // Move to ~30
        actions.dragAndDropBy(slideMe, 30, 0).perform();
        wait.until(ExpectedConditions.textToBePresentInElement(valueLabel, "30"));
        //System.out.println("✅ Value: " + valueLabel.getText());

        // Move to ~60
        actions.dragAndDropBy(slideMe, 30, 0).perform();
        wait.until(ExpectedConditions.textToBePresentInElement(valueLabel, "60"));
        //System.out.println("✅ Value: " + valueLabel.getText());

        // Move back to ~50
        actions.dragAndDropBy(slideMe, -10, 0).perform();
        wait.until(ExpectedConditions.textToBePresentInElement(valueLabel, "50"));
       // System.out.println("✅ Value: " + valueLabel.getText());

        // Move to ~99
        actions.dragAndDropBy(slideMe, 50, 0).perform();
        wait.until(ExpectedConditions.textToBePresentInElement(valueLabel, "99"));
       // System.out.println("✅ Value: " + valueLabel.getText());



        driver.quit();

    }
}
