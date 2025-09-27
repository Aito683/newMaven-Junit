package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ex17_17_2_iframesPractice2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://practice-automation.com/iframes/");
        driver.manage().window().fullscreen();

        WebElement iframeOne = driver.findElement(By.id("iframe-1"));
        driver.switchTo().frame(iframeOne);
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement learn = driver.findElement(By.xpath("//div[contains(text(),'Learn')]"));
        js.executeScript("arguments[0].scrollIntoView()",learn);

        Thread.sleep(2000);

        WebElement ulPath = driver.findElement(By.xpath("(//ul[@class='footer__items clean-list'])[1]"));
        List<WebElement> learnList = ulPath.findElements(By.tagName("li"));

        for(WebElement item : learnList){
            // Locate by XPath using the <a> tag and class
           // WebElement  = driver.findElement(By.xpath("//a[@class='footer__link-item']"));

            String link = item.getAttribute("href");
            System.out.println("The link for : " + item.getText()+" : "+link);
        }
        Thread.sleep(3000);

        WebElement community = driver.findElement(By.xpath("(//ul[@class='footer__items clean-list'])[2]"));
        List<WebElement> communityList = community.findElements(By.tagName("li"));


    }
}
