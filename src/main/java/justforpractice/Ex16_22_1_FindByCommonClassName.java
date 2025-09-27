package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_22_1_FindByCommonClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(3000);

        WebElement widgets = driver.findElement(By.xpath("//p[contains(text(),'Widgets')]"));
        widgets.click();
        Thread.sleep(4000);

        WebElement tabs = driver.findElement(By.xpath("//span[contains(text(),'Tabs')]"));
        tabs.click();
        Thread.sleep(2000);

        WebElement whatTab = driver.findElement(By.xpath("//button[contains(text(),'What')]"));
        whatTab.click();
        Thread.sleep(2000);

        WebElement originTab = driver.findElement(By.xpath("//button[contains(text(),'Origin')]"));
        originTab.click();
        Thread.sleep(2000);

        WebElement useTab = driver.findElement(By.xpath("//button[starts-with(text(),'Use')]"));
        useTab.click();
        Thread.sleep(2000);

        driver.quit();


    }
}
