package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_14_3_clickOnComplexCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(1000);

        WebElement webTables = driver.findElement(By.id("webTables_page"));
                webTables.click();
                Thread.sleep(2000);
                WebElement cupcakeCheck = driver.findElement(By.id("enhanced-table-checkbox-3"));
                cupcakeCheck.click();
                Thread.sleep(1000);
        WebElement eclairCheck = driver.findElement(By.id("enhanced-table-checkbox-2"));
        eclairCheck.click();
        Thread.sleep(1000);

        WebElement marshmallowCheck = driver.findElement(By.id("enhanced-table-checkbox-4"));
        marshmallowCheck.click();
        Thread.sleep(1000);

        WebElement nextPageBtn = driver.findElement(By.cssSelector("button[title='Go to next page']"));
        nextPageBtn.click();
        Thread.sleep(2000);

        WebElement lollipopBtn = driver.findElement(By.id("enhanced-table-checkbox-3"));
        lollipopBtn.click();
        Thread.sleep(1000);

        WebElement nougatBtn = driver.findElement(By.id("enhanced-table-checkbox-1"));
        nougatBtn.click();
        Thread.sleep(1000);
        driver.quit();






    }
}
