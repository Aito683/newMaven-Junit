package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {
    public static void main(String[] args) {
        // Set up InternetExplorerDriver using WebDriverManager
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();

        // Perform actions on IE
        driver.get("https://www.example.com");
        // ...

        // Close the browser
        driver.quit();
    }
}
