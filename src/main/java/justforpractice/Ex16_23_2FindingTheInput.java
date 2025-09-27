package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_23_2FindingTheInput {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        ///html/body/main/div[@role='search']/form/fieldset/div[@class='search-input']
        ////div[@role='search']//div[1]
        WebElement searchInput = driver.findElement(By.xpath("//div[@role='search']//div[1]"));
        searchInput.click();
        Thread.sleep(2000);

        searchInput.sendKeys("Butterflies");
        Thread.sleep(2000);

        driver.quit();

    }
}
