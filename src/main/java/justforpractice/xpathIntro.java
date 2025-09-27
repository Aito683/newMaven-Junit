package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathIntro {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(2000);

        WebElement formsBtn = driver.findElement(By.id("panel2bh-header"));
        formsBtn.click();
        Thread.sleep(1000);

        WebElement practiceFormsBtn = driver.findElement(By.id("practiceForm_page"));
        practiceFormsBtn.click();
        Thread.sleep(1000);

        WebElement studentRegistrationFormTitle = driver.findElement(By.xpath("//h3"));
        System.out.println(studentRegistrationFormTitle.getText());

    }
}
