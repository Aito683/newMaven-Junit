package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop17_12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();

       WebElement widgets =  driver.findElement(By.id("panel4bh-header"));
       widgets.click();

       WebElement sliderPage = driver.findElement(By.id("slider_page"));
       sliderPage.click();

       WebElement slider = driver.findElement(By.xpath("//input"));

       Actions actions = new Actions(driver);
       actions.clickAndHold(slider).moveByOffset(100,30).perform();
       Thread.sleep(3000);

       actions.dragAndDropBy(slider, -50,30).perform();
       Thread.sleep(3000);
       driver.quit();

    }
}
