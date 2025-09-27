package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(2000);

        WebElement buttonsPage = driver.findElement(By.xpath("//button[@id='buttons_page']"));
        buttonsPage.click();
        Thread.sleep(1000);

        WebElement doubleClickMeBtn = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        doubleClickMeBtn.click();
        Thread.sleep(1000);
        doubleClickMeBtn.click();
        Thread.sleep(1000);

        WebElement rightClickMe = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        rightClickMe.click();
        Thread.sleep(1000);

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMe.click();
        Thread.sleep(4000);

        driver.quit();


    }
}
