package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex17_9_1Checkboxes_practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the page
        driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
//Used to troubleshoot in Terminal -->
       // System.out.println(driver.getPageSource());
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate the real <input> checkbox x-path
        WebElement checkMeCheckBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='checkbox-0 ']")));

        // 🔎 Print initial state
        System.out.println("Initially:");
        System.out.println("Displayed: " + checkMeCheckBox.isDisplayed());
        System.out.println("Enabled: " + checkMeCheckBox.isEnabled());
        System.out.println("Selected: " + checkMeCheckBox.isSelected());

        // Locate the WebElement to toogle the checkbox
        // the previous Xpath locates the checkbox specifically, but it is not clickable
        // upon clicking the checkbox, the class attribute changes, so use that to identify the checkbox and selection
        WebElement label = driver.findElement(By.xpath("(//div[@class='ui-checkbox']/label[contains(@class, 'ui-checkbox')])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(label)).click();

        //After click
        System.out.println("After click -> selected: "+checkMeCheckBox.isSelected());
        System.out.println("After click -> displayed: "+checkMeCheckBox.isDisplayed());

        System.out.println("After click -> enabled: "+checkMeCheckBox.isEnabled());
        Thread.sleep(5000);

        driver.quit();


    }
}
