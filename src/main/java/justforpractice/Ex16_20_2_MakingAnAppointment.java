package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_20_2_MakingAnAppointment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(1000);

        WebElement makeAppointment = driver.findElement(By.id("btn-make-appointment"));
        makeAppointment.click();
        Thread.sleep(2000);

        WebElement usernameInput = driver.findElement(By.id("txt-username"));
//usernameInput.click();
        usernameInput.sendKeys("John Doe");
        Thread.sleep(2000);

       WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);

        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        loginBtn.click();
        Thread.sleep(2000);

        WebElement applyCheckBox = driver.findElement(By.id("chk_hospotal_readmission"));
        applyCheckBox.click();
        Thread.sleep(2000);

        WebElement medicaidCheckBox = driver.findElement(By.xpath("//input[@value='Medicaid']"));
        medicaidCheckBox.click();
        Thread.sleep(2000);

        WebElement date = driver.findElement(By.name("visit_date"));
        date.click();
        Thread.sleep(1000);

        WebElement todaysDate = driver.findElement(By.xpath("//td[text()='3']"));
        todaysDate.click();
        Thread.sleep(1000);

        WebElement comment = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        comment.sendKeys("Entered comments");
        Thread.sleep(1000);

        WebElement bookAppointment = driver.findElement(By.id("btn-book-appointment"));
        bookAppointment.click();
        Thread.sleep(4000);

        WebElement facility = driver.findElement(By.xpath("//label[@for='facility']"));
        System.out.println(facility.getText());

        WebElement facilityName = driver.findElement(By.xpath("//p[@id='facility']"));
        System.out.println(facilityName.getText());

        WebElement applyForHospitalReadmission = driver.findElement(By.xpath("//label[@for='hospital_readmission']"));
        System.out.println(applyForHospitalReadmission.getText());

        WebElement applyForHospitalReadmissionYes = driver.findElement(By.xpath("//p[@id='hospital_readmission']"));
        System.out.println(applyForHospitalReadmissionYes.getText());

        WebElement healthCareProgram = driver.findElement(By.xpath("//label[@for='program']"));
        System.out.println(healthCareProgram.getText());

        WebElement healthCareProgramAnswer = driver.findElement(By.xpath("//p[@id='program']"));
        System.out.println(healthCareProgramAnswer.getText());

        WebElement visitDate = driver.findElement(By.xpath("//label[@for='visit_date']"));
        System.out.println(visitDate.getText());

        WebElement dateToday = driver.findElement(By.id("visit_date"));
        System.out.println(dateToday.getText());

        driver.quit();

    }
}
