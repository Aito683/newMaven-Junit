package justforpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
    public static void main(String[] args) {
        // Set up SafariDriver
        WebDriver driver = new SafariDriver();

        // Perform actions on Safari
        driver.get("https://www.example.com");
        // ...

        // Close the browser
        driver.quit();
    }
}
