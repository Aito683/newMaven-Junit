package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_23_1_UsingChild_ParentConnection {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
        Thread.sleep(3000);

        WebElement accountNumber = driver.findElement(By.xpath("//tbody//tr[4]//td[4]"));
        Thread.sleep(1500);
        System.out.println(accountNumber.getText());

        driver.quit();
    }
}
