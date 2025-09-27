package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_15_1_PracticeForm1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(3000);

        WebElement formsDropdown = driver.findElement(By.id("panel2bh-header"));
        formsDropdown.click();
        Thread.sleep(2000);

        WebElement practiceFormBtn = driver.findElement(By.id("practiceForm_page"));
        practiceFormBtn.click();
        Thread.sleep(2000);

        WebElement firstNameTxtBox = driver.findElement(By.id("firstName"));
        firstNameTxtBox.sendKeys("Aitolkun");
        Thread.sleep(2000);

        WebElement lastNameTxtBox = driver.findElement(By.id("lastName"));
        lastNameTxtBox.sendKeys("Musaeva");
        Thread.sleep(2000);

        WebElement emailTxtBox = driver.findElement(By.id("userEmail"));
        emailTxtBox.sendKeys("purpose1324@gmail.com");
        Thread.sleep(2000);

        WebElement phoneNumberTxtBox = driver.findElement(By.id("userMobile"));
        phoneNumberTxtBox.sendKeys("4849826607");
        Thread.sleep(2000);

        WebElement subjectsTxtBox = driver.findElement(By.id("subjectsContainer"));
        subjectsTxtBox.sendKeys("Math, Literature, Music");
        Thread.sleep(2000);


        WebElement currentAddressTxtBox = driver.findElement(By.id("currentAddress"));
        currentAddressTxtBox.sendKeys("123 Main St");
        Thread.sleep(2000);

        driver.quit();
    }
}
