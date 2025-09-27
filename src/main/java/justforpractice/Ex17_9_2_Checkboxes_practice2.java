package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Ex17_9_2_Checkboxes_practice2 {

        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
            driver.manage().window().fullscreen();

            // List to store label elements associated with checkboxes
            List<WebElement> labelCheckBoxes = driver.findElements(By.xpath("(//div[@class='ui-controlgroup-controls '])[1]//label"));

            // List to store input elements of checkboxes
            List<WebElement> inputCheckBoxes = driver.findElements(By.xpath("(//div[@class='ui-controlgroup-controls '])[1]//input"));

            // Print visibility of all specific checkboxes (via labels)
            System.out.println("Visibility of specific checkboxes:");
            for (WebElement labelCheckBox : labelCheckBoxes) {
                System.out.println("Checkbox label " + labelCheckBox.getText() + " is displayed: " + labelCheckBox.isDisplayed());
                System.out.println("Checkbox label " + labelCheckBox.getText() + " is selected: " + labelCheckBox.isSelected());
            }

            // Select checkboxes with odd indexes
            System.out.println("\nSelecting checkboxes with odd indexes:");
            for (int i = 0; i < inputCheckBoxes.size(); i++) {
                if (i % 2 != 0) {
                    WebElement checkBoxInput = inputCheckBoxes.get(i);
                    WebElement checkBoxLabel = labelCheckBoxes.get(i);

                    if (!checkBoxInput.isSelected()) {

                        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBoxLabel);
                        checkBoxLabel.click();

                        System.out.println("Checkbox with label '" + checkBoxLabel.getText() + "' was selected.");
                    } else {
                        System.out.println("Checkbox with label '" + checkBoxLabel.getText() + "' was already selected.");
                    }
                }
            }

            // Print state of all checkboxes
            System.out.println("\nState of all checkboxes:");
            for (int i = 0; i < inputCheckBoxes.size(); i++) {
                WebElement checkbox = inputCheckBoxes.get(i);
                System.out.println("Checkbox " + labelCheckBoxes.get(i).getText() + " is selected: " + checkbox.isSelected());
            }

            driver.quit();
        }
    }