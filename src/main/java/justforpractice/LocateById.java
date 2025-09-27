package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(10000);

        //findElement - is a method that locates
        //ONE specific web element in an html
        //by one of the locators
        //returns a WebElement Object

        WebElement elementsBtn = driver.findElement(By.id("panel1bh-header"));
        elementsBtn.click();//clicks on an identified web element
Thread.sleep(5000);
        driver.quit();



    }
}
