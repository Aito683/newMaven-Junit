package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_24_1_LocateElementUsingSiblingRelation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        WebElement numberOfArticlesChinese = driver.findElement(By.xpath("//div[@lang='it']/preceding-sibling::div[1]//small"));
        numberOfArticlesChinese.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
