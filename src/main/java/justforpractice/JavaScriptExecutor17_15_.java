package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor17_15_ {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //we casted the driver to JavaScriptExecutor

        //in js window.location='url' -> driver.get('url')
        js.executeScript("window.location='https://www.etsy.com/'");

        //scrolling down by pixels

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1000)");

        Thread.sleep(3000);
        WebElement helpCenterLink = driver.findElement(By.xpath("//a[contains(text(),'Help Center')]"));

        js.executeScript("arguments[0].scrollIntoView()",helpCenterLink);

        Thread.sleep(3000);

        //we can change some stuff in the browser
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
        js.executeScript("arguments[0].scrollIntoView()",signInButton);


        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid green')",signInButton);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",signInButton);

        Thread.sleep(2000);

        driver.quit();
    }
}
