package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Ex17_12_2_Kits {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://practice-automation.com/gestures/");
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement dragAndDropBoxElement = chromeDriver.findElement(By.id("moveMeHeader"));
        Actions actions = new Actions(chromeDriver);
        actions.clickAndHold(dragAndDropBoxElement).moveByOffset(550, 0).perform();

        Thread.sleep(250);
        actions.clickAndHold(dragAndDropBoxElement).moveByOffset(0, 300).perform();
        actions.dragAndDropBy(dragAndDropBoxElement, -250, -150).perform();


    }
}
