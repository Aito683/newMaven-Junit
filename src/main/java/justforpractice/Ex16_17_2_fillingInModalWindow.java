package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_17_2_fillingInModalWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/modals/");

        Thread.sleep(1000);

        WebElement formModalBtn = driver.findElement(By.className("popmake-674"));
        formModalBtn.click();
        Thread.sleep(1000);

        WebElement nameInputBtn = driver.findElement(By.name("g1051-name"));
        nameInputBtn.sendKeys("John Doe");
        Thread.sleep(1000);

        WebElement emailInputBtn = driver.findElement(By.id("g1051-email"));
        emailInputBtn.sendKeys("work@spacex.com");
        Thread.sleep(1000);

        WebElement msgInputBtn = driver.findElement(By.id("contact-form-comment-g1051-message"));
        msgInputBtn.sendKeys("Hello, World!!!");
        Thread.sleep(2000);

        WebElement submitBtn = driver.findElement(By.className("pushbutton-wide"));
        submitBtn.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
