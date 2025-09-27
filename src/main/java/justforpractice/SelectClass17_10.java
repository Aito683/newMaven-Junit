package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectClass17_10 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");
        driver.manage().window().fullscreen();


        WebElement panel2bh = driver.findElement(By.id("panel2bh-header"));
        panel2bh.click();

        WebElement practiceformPage = driver.findElement(By.id("practiceForm_page"));
        practiceformPage.click();

        WebElement stateDropDown = driver.findElement(By.id("react-select-6-input"));

        Select stateDropDownSelect = new Select(stateDropDown);
        List<WebElement> allStateOptions = stateDropDownSelect.getOptions();

        for(WebElement state: allStateOptions){
            System.out.println(state.getText());
        }
        stateDropDownSelect.selectByIndex(4);
        Thread.sleep(3000);

        stateDropDownSelect.selectByValue("New York");
        Thread.sleep(3000);

        stateDropDownSelect.selectByVisibleText("Texas");

    }
}
