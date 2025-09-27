package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageNavigation_17_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dbank-qa.wedevx.co/bank/login");
        Thread.sleep(2000);

        WebElement signUpHereLink = driver.findElement(By.xpath("//a[contains(text(),'Sign Up Here')]"));
        signUpHereLink.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        WebElement firstNameTxtBox =  driver.findElement(By.id("firstName"));
        firstNameTxtBox.sendKeys("Elon");
        Thread.sleep(2000);

        driver.navigate().refresh();//after refreshing everything should be gone
        Thread.sleep(2000);
        //navigating to login page from registration page
        driver.navigate().to("https://dbank-qa.wedevx.co/bank/login");
        Thread.sleep(2000);
        driver.quit();
    }
}
