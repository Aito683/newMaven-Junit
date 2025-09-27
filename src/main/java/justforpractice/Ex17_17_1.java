package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ex17_17_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://practice-automation.com/iframes/");
        driver.manage().window().fullscreen();

        WebElement iframe2 = driver.findElement(By.id("iframe-2"));
        driver.switchTo().frame(iframe2);
        Thread.sleep(5000);

        WebElement aboutDropdownBar = driver.findElement(By.id("navbarDropdown"));
        aboutDropdownBar.click();
        Thread.sleep(3000);

        List<WebElement> dropdownTopics = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));

        for(WebElement item:dropdownTopics){
            System.out.println(item.getText());
        }

        Thread.sleep(5000);
        WebElement languagesDropdown = driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[7]/div/a"));
        languagesDropdown.click();
        Thread.sleep(3000);

        List<WebElement> languagesDropdownList = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']/li/a"));

        for(WebElement language: languagesDropdownList){
            System.out.println("\n"+language.getText());
        }
        Thread.sleep(2000);



    }
}
