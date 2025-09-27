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

public class Ex17_12_2_DragAndDropPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://practice-automation.com/gestures/");
        driver.manage().window().fullscreen();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        WebElement box = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("moveMeHeader")));
        // 1️⃣ Drag to the right (x = +100, y = 0)
        actions.dragAndDropBy(box, 100, 0).perform();
        System.out.println("✅ Box dragged right by 100px");

        // 2️⃣ Drag down (x = 0, y = +100)
        actions.dragAndDropBy(box, 0, 100).perform();
        System.out.println("✅ Box dragged down by 100px");

        // 3️⃣ Drag left and up in one chained action
        actions.clickAndHold(box)
                .moveByOffset(-50, -50)
                .moveByOffset(-50, -50)  // chain two moves
                .release()
                .perform();
        System.out.println("✅ Box dragged diagonally up-left twice");

        // 4️⃣ Drag diagonally bottom-right in one step
        actions.dragAndDropBy(box, 150, 150).perform();
        System.out.println("✅ Box dragged diagonally bottom-right");


        driver.quit();
    }
}
