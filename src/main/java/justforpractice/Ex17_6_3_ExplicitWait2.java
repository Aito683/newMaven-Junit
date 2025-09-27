package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex17_6_3_ExplicitWait2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");

        WebElement addTextBox1Btn = driver.findElement(By.id("btn1"));
        addTextBox1Btn.click();

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(15));

        WebElement textBox1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        textBox1.sendKeys("Hello TextBox 1");

        WebElement addTextBox2Btn = driver.findElement(By.id("btn2"));
        addTextBox2Btn.click();

       // WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(13));

        WebElement textBox2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        textBox2.sendKeys("Hello TextBox 2");

        driver.quit();


    }
}
