package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_17_1_checkingModalInfo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/modals/");

        Thread.sleep(1000);

        WebElement simpleModalBtn = driver.findElement(By.className("popmake-1318"));
        simpleModalBtn.click();
        Thread.sleep(2000);

        WebElement titleTxt = driver.findElement(By.id("pum_popup_title_1318"));

        Thread.sleep(2000);

        WebElement text = driver.findElement(By.xpath("//p[text()='Hi, I’m a simple modal.']-"));
        text.getText();
        Thread.sleep(2000);

        System.out.println(titleTxt.getText());
        System.out.println(text.getText());

        driver.quit();


    }
}
