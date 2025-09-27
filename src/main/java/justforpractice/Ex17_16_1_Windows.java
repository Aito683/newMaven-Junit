package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ex17_16_1_Windows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://practice-automation.com/window-operations/");
        driver.manage().window().fullscreen();


        WebElement newTabButton = driver.findElement(By.xpath("//button[@onclick='newTab()']"));
        newTabButton.click();
        String uniqueIdOfTheCurrentTab = driver.getWindowHandle();
        System.out.println(uniqueIdOfTheCurrentTab);
        Thread.sleep(2000);

        WebElement replaceWindowButton= driver.findElement(By.xpath("//button[@onclick='newWindowSelf()']"));
        replaceWindowButton.click();
        Thread.sleep(2000);

        WebElement newWindowButton= driver.findElement(By.xpath("//button[@onclick='newWindow()']"));
        newWindowButton.click();
        Thread.sleep(2000);


        driver.switchTo().window(uniqueIdOfTheCurrentTab);

        WebElement header = driver.findElement(By.xpath("(//strong)[1]"));
        System.out.println(header.getText());
        Thread.sleep(2000);

        driver.quit();





    }
}
