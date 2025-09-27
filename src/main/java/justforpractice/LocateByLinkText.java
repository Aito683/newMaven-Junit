package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(2000);

        WebElement linkBtn = driver.findElement(By.id("links_page"));
        linkBtn.click();
        Thread.sleep(2000);

        WebElement createdLinkBtn = driver.findElement(By.linkText("Created"));
        createdLinkBtn.click();
        Thread.sleep(2000);

        WebElement movedLinkBtn = driver.findElement(By.linkText("Moved"));
        movedLinkBtn.click();
        Thread.sleep(2000);

        WebElement notFoundLink = driver.findElement(By.partialLinkText("Not"));
        notFoundLink.click();
        Thread.sleep(2000);

        WebElement badRequestLink = driver.findElement(By.partialLinkText("Request"));
        badRequestLink.click();
        Thread.sleep(2000);

        driver.quit();

    }
}
