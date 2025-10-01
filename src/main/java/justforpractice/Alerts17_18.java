package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts17_18 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co/");
        driver.manage().window().fullscreen();

        WebElement windowOption = driver.findElement(By.id("panel3bh-header"));
        windowOption.click();

        WebElement alertsPageBtn = driver.findElement(By.id("alerts_page"));
        alertsPageBtn.click();

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Thread.sleep(3000);
        //switches to the currently active alert
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();


        WebElement alertButtonWithDismissOption = driver.findElement(By.id("confirmButton"));
        alertButtonWithDismissOption.click();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();
        alert.dismiss();

        alertButtonWithDismissOption.click();
        Thread.sleep(3000);

        alert.accept();


        WebElement promptButton = driver.findElement(By.id("promptButton"));
        promptButton.click();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();
        alert.sendKeys("I'm proud of myself for studying hard and consistently, and I know that "+
                "all of my efforts will pay off big time. When that happens I will thank myself for doing this");
   alert.accept();

    }
}
