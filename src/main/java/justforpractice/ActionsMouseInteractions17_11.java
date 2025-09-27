package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsMouseInteractions17_11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        WebElement buttonsPage = driver.findElement(By.id("buttons_page"));
        buttonsPage.click();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        //How do you perform advanced mouse interactions? like double click or right click?
        //I use Actions class from Selenium
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(2000);

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(rightClickBtn).perform();
        Thread.sleep(2000);

//dynamic click
        WebElement clickMeBtn = driver.findElement(By.id("TiIX0"));
        actions.click(clickMeBtn).perform();
        Thread.sleep(2000);


        driver.quit();



    }
}
