package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_23_3_GetTheNumberOfArticles {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        // //div[@class='central-featured-lang lang5']/a[@id='js-link-box-fr']/small
        WebElement numOfArticles = driver.findElement(By.xpath("//div[@class='central-featured-lang lang5']/a/small"));
        numOfArticles.click();
        Thread.sleep(2000);

    }
}
