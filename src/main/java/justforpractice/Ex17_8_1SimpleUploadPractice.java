package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Ex17_8_1SimpleUploadPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().fullscreen();

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        chromeDriver.get("https://formstone.it/components/upload/demo/");

        WebElement uploadFileBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='fs-upload-input']")));
       //uploadFileBtn.click();
        uploadFileBtn.sendKeys("/Users/aitolkunmusaeva/Downloads/dead code (1).pdf");


        WebElement uploadedFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='dead code (1).pdf']")));
        System.out.println("Uploaded file: "+uploadedFile.getText());
        Thread.sleep(3000);
        chromeDriver.quit();

    }
}
// Upload files using Selenium Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver and applying Explicit wait features. Task:
//
//Go to https://formstone.it/components/upload/demo/
//
//Upload the file to the first input element and wait for the result
//
//Validate that the file has been uploaded
//
//Don't use hard sleep, only explicit sleep with condition (you can choose either element to become visible or element to become invisible for text or spinner)
