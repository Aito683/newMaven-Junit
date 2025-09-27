package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_18_1_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(1000);

        WebElement signinBtn = driver.findElement(By.linkText("Sign In"));
        signinBtn.click();
        Thread.sleep(2000);

        WebElement createAccBtn = driver.findElement(By.linkText("Create an Account"));
        createAccBtn.click();
        Thread.sleep(5000);

        driver.quit();

    }
}
