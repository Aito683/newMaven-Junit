package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    public static void main(String[] args) {
        // Set up FirefoxDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Perform actions on Firefox
        driver.get("https://www.example.com");
        // ...

        // Close the browser
        driver.quit();
    }
}
