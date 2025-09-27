package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_15_2_bookStoreFiltering {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationbookstore.dev/");
        Thread.sleep(1000);

        WebElement filterBooksTxtBox = driver.findElement(By.id("searchBar"));
        filterBooksTxtBox.sendKeys("Test Automation");
        Thread.sleep(1000);

        WebElement clearBtn = driver.findElement(By.xpath("//a[@title='Clear text']"));
        clearBtn.click();
        Thread.sleep(1000);

        //WebElement filterBooksTxtBox = driver.findElement(By.id("searchBar"));
        filterBooksTxtBox.sendKeys("Cucumber");
        Thread.sleep(1000);

        clearBtn.click();
        Thread.sleep(1000);

        filterBooksTxtBox.sendKeys("Java");
        Thread.sleep(1000);

        clearBtn.click();
        Thread.sleep(1000);

        filterBooksTxtBox.sendKeys("Test");
        Thread.sleep(1000);

        driver.quit();


    }
}
