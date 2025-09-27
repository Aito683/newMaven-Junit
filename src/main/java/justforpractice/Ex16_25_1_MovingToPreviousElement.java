package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_25_1_MovingToPreviousElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        WebElement spanishArticlesTitle = driver.findElement(By.xpath("//small[text()='2.058.000+ ']/.."));
        spanishArticlesTitle.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
