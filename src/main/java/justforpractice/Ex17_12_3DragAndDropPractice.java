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

public class Ex17_12_3DragAndDropPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/gestures/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions actions = new Actions(driver);

//
//        WebElement dragMeImage = chromeDriver.findElement(By.id("dragMe"));
//        actions.clickAndHold(dragMeImage).moveByOffset(20,0).perform();
//        Thread.sleep(3000);
        WebElement image = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dragMe")));
        WebElement box1 = driver.findElement(By.id("div1"));
        WebElement box2 = driver.findElement(By.id("div2"));

        // Drag image to Box 2
        actions.dragAndDrop(image, box2).perform();
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(box2, By.id("dragMe")));
        System.out.println("✅ Image dropped in Box 2");

        // Validate (check parent id)
        String parentBoxId = driver.findElement(By.id("dragMe")).findElement(By.xpath("..")).getAttribute("id");
        if (parentBoxId.equals("div2")) {
            System.out.println("Validation passed: image is inside Box 2");
        } else {
            System.out.println("Validation failed: image not in Box 2");
        }

        // Drag image back to Box 1
        WebElement imageInBox2 = driver.findElement(By.id("dragMe")); // re-locate
        actions.dragAndDrop(imageInBox2, box1).perform();
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(box1, By.id("drag1")));
        System.out.println("✅ Image dragged back to Box 1");

        // Validate again
        parentBoxId = driver.findElement(By.id("dragMe")).findElement(By.xpath("..")).getAttribute("id");
        if (parentBoxId.equals("div1")) {
            System.out.println("Validation passed: image is inside Box 1");
        } else {
            System.out.println("Validation failed: image not in Box 1");
        }


        driver.quit();
    }
}
