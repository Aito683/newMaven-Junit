package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class KeyboardActions17_14 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement formsPage = driver.findElement(By.id("panel2bh-header"));
        formsPage.click();

        WebElement practiceFormButton = driver.findElement(By.id("practiceForm_page"));
        practiceFormButton.click();

        WebElement firstNameButton = driver.findElement(By.id("firstName"));

        Actions action = new Actions(driver);
        action.sendKeys(firstNameButton,"Elon").keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND)
                .keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND)
                .sendKeys(Keys.TAB).keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();

        Thread.sleep(5000);

        driver.quit();

    }
}
