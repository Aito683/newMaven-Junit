package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframes17_17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co/");
        driver.manage().window().fullscreen();

        WebElement iframesOption = driver.findElement(By.id("panel3bh-header"));
        iframesOption.click();
        Thread.sleep(2000);

        WebElement iframes_page = driver.findElement(By.id("iframes_page"));
        iframes_page.click();
        Thread.sleep(2000);

        WebElement iframe1 = driver.findElement(By.id("frame1"));

        //switches your driver to different iframe
        //after this point all driver.findElement calls
        //will be looking for the element in the iframe

        driver.switchTo().frame(iframe1);
        //        driver.switchTo().frame(0); switching by index
        //driver.switchTo().frame("frame1");  switching by id directly


        WebElement header1 = driver.findElement(By.xpath("//h1"));
        System.out.println(header1.getText());

        driver.switchTo().parentFrame();

        WebElement alerts_page = driver.findElement(By.id("alerts_page"));
        alerts_page.click();

        driver.quit();
    }
}
