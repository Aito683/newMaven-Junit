package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Ex17_14_1_KeyboardInteractions {
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
        firstNameButton.click();

        Actions action = new Actions(driver);
        action.sendKeys(firstNameButton,"Aito").keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND)
                .keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND)
                .sendKeys(Keys.TAB)
                .keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND)
                .sendKeys("ll")
                .sendKeys(Keys.TAB)
                .keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND)
                .sendKeys(Keys.DELETE).sendKeys(Keys.DELETE)
                .sendKeys("@wedevx.co").perform();
Thread.sleep(5000);
        driver.quit();
    }
}
