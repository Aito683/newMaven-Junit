package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_14_1_locateAndClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(5000);

        WebElement radioBtn = driver.findElement(By.id("radioButton_page"));
        radioBtn.click();
        Thread.sleep(5000);
        WebElement yesBtn = driver.findElement(By.id("yesRadio"));
        yesBtn.click();
        Thread.sleep(2000);

        WebElement impressiveBtn = driver.findElement(By.id("impressiveRadio"));
        impressiveBtn.click();
        Thread.sleep(2000);

        driver.quit();


    }
}
