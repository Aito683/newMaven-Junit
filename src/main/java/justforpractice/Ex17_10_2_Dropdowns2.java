package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ex17_10_2_Dropdowns2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().fullscreen();

        WebElement createAccountLink = driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']"));
        createAccountLink.click();




    }
}
