package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HoverOver17_13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement widgets = driver.findElement(By.id("panel4bh-header"));
        widgets.click();

        WebElement toolTip = driver.findElement(By.id("toolTips_page"));
        toolTip.click();

        WebElement textBox = driver.findElement(By.xpath("//label[contains(text(),'Hover')]/.."));
        String hoverOverMessage = textBox.getAttribute("aria-label");
        System.out.println(hoverOverMessage);         // You hovered over the text field

        Actions action = new Actions(driver);
        action.moveToElement(textBox).perform();

        Thread.sleep(3000);
        driver.quit();

    }
}
