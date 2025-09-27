package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_24_2_LocateElementUsingSiblingRelation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        WebElement deutschNumOfArticles = driver.findElement(By.xpath("//div[@lang='it']/preceding-sibling::div[4]//small"));
        deutschNumOfArticles.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
