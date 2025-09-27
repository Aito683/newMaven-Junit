package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex16_25_2_findingValueOfPreviousElementsNotWorking {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://finance.yahoo.com/");
        Thread.sleep(2000);

        // Find the sign-in link by its text
        WebElement signInLink = driver.findElement(By.xpath("//a[text()= 'Sign in']"));

        String hrefValue = signInLink.getAttribute("href");
        System.out.println("href attribute value for the 'Sign in' link: " + hrefValue);

        //go back to div
        WebElement signInLinkDiv = signInLink.findElement(By.xpath(".."));

        String signInId = signInLinkDiv.getAttribute("id");
        System.out.println("The id attribute of the 'Sign in' link is: " + signInId);

        // Close the browser
        driver.quit();

    }
}
