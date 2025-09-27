package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxes17_9 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        WebElement checkBoxPage = driver.findElement(By.id("checkBox_page"));
        checkBoxPage.click();

        WebElement child1CheckBox = driver.findElement(By.xpath("//label[@id='child1']//input"));
        System.out.println(child1CheckBox.isSelected());

        child1CheckBox.click();
        System.out.println(child1CheckBox.isSelected());


    }
}
