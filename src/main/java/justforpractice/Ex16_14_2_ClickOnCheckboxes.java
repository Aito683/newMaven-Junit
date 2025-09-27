package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_14_2_ClickOnCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(2000);

        WebElement checkbox = driver.findElement(By.id("checkBox_page"));
        checkbox.click();
        Thread.sleep(2000);

        WebElement child1 = driver.findElement(By.id("child1"));
        child1.click();
        Thread.sleep(2000);

        WebElement child2 = driver.findElement(By.id("child2"));
        child2.click();
        Thread.sleep(2000);

        WebElement child1again = driver.findElement(By.id("child1"));
        child1again.click();
        Thread.sleep(2000);

        driver.quit();


    }
}
