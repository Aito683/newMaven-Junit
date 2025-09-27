package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Ex17_10_3Dropdowns3 {
    private static final Logger log = LoggerFactory.getLogger(Ex17_10_3Dropdowns3.class);

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();

        //login using credentials provided on the login page
        WebElement usernameInputTxtBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        usernameInputTxtBox.sendKeys("standard_user");

        WebElement passwordInputTxtBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordInputTxtBox.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement sortingDropdown  = driver.findElement(By.xpath("//select[@class='product_sort_container']"));


        Thread.sleep(4000);
    }
}
