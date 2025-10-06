package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ex17_18_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://practice-automation.com/popups/");
        driver.manage().window().fullscreen();

        WebElement alertPopupBtn= driver.findElement(By.id("alert"));
        alertPopupBtn.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement confirmPopupBtn= driver.findElement(By.id("confirm"));
        confirmPopupBtn.click();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        confirmPopupBtn.click();

        alert.accept();
        Thread.sleep(2000);

        WebElement promptPopupBtn= driver.findElement(By.id("prompt"));
        promptPopupBtn.click();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();
        alert.sendKeys("My name is Aitolkun. ");
        alert.accept();
        Thread.sleep(2000);

        driver.quit();



    }
}
