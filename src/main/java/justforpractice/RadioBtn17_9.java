package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioBtn17_9 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        WebElement radioButtonPage = driver.findElement(By.id("radioButton_page"));
        radioButtonPage.click();

        WebElement impressiveRadioButton = driver.findElement(By.xpath("//input[@value='Impressive']"));
        impressiveRadioButton.click();

        //AssertTrue(impressiveRadioButton.isSelected()  - in real framework

        System.out.println(impressiveRadioButton.isSelected());
        System.out.println(impressiveRadioButton.isEnabled());

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value='Yes']"));
        System.out.println(yesRadioButton.isSelected());

        WebElement noRadioButton = driver.findElement(By.xpath("//input[@value='No']"));
        System.out.println(noRadioButton.isEnabled());

        noRadioButton.click();

    }
}
