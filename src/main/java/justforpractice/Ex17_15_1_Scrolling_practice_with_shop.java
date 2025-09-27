package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ex17_15_1_Scrolling_practice_with_shop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        //we casted the driver to JavaScriptExecutor
//
//        //in js window.location='url' -> driver.get('url')
//        js.executeScript("window.location='https://magento.softwaretestingboard.com/'");
//
//       //register a new user
//        WebElement createAnAccountLinkBtn = driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]"));
//        createAnAccountLinkBtn.click();
//
//        Thread.sleep(2000);
//
//        WebElement firstNameInput = driver.findElement(By.id("firstname"));
//        Actions actions = new Actions(driver);
//        actions.sendKeys(firstNameInput,"Ttest").perform();
//Thread.sleep(2000);
//        WebElement lastNameInput = driver.findElement(By.id("lastname"));
//        actions.sendKeys(lastNameInput,"TTTestLastName").perform();
//        Thread.sleep(2000);
//
//        WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
//        actions.sendKeys(emailInput,"ttttest@gmail.com").perform();
//        Thread.sleep(2000);
//
//
//        WebElement passwordInput = driver.findElement(By.id("password"));
//        actions.sendKeys(passwordInput,"TttEster!10").perform();
//        Thread.sleep(2000);
//
//        WebElement passwordConfirmationInput = driver.findElement(By.id("password-confirmation"));
//        actions.sendKeys(passwordConfirmationInput,"TttEster!10").perform();
//        Thread.sleep(2000);
//
//        WebElement createAccountButtonSubmit = driver.findElement(By.id("//button[@title='Create an Account']"));
//        //button[@type='submit']
//        actions.click(createAccountButtonSubmit).perform();
//        Thread.sleep(2000);
//
//        WebElement menPage = driver.findElement(By.id("ui-id-5"));
//        js.executeScript("argument[0].scrollIntoView()",menPage);
//       Thread.sleep(2000);
//
//        WebElement menTopsPage = driver.findElement(By.id("ui-id-17"));
//        menTopsPage.click();
//
//
//
//    }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");

        // Store all unique product names
        Set<String> allProducts = new HashSet<>();

        boolean hasNext = true;
        while (hasNext) {
            // Wait for product titles to load
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                    By.cssSelector("a.product-item-link")));

            // Collect all product titles on current page
            List<WebElement> productTitles = driver.findElements(By.cssSelector("a.product-item-link"));

            for (WebElement title : productTitles) {
                String productName = title.getText().trim();

                // Check if product already exists
                if (allProducts.contains(productName)) {
                    System.out.println("❌ Duplicate found: " + productName);
                } else {
                    System.out.println("✅ Unique product: " + productName);
                }

                // Add to set
                allProducts.add(productName);
            }

            // Check if "Next" button exists
            List<WebElement> nextButton = driver.findElements(By.cssSelector("a.action.next"));

            if (nextButton.size() > 0 && nextButton.get(0).isDisplayed()) {
                nextButton.get(0).click();
                // wait for page to load new products
                wait.until(ExpectedConditions.stalenessOf(productTitles.get(0)));
            } else {
                hasNext = false; // no more pages
            }
        }

        System.out.println("\nTotal unique products collected: " + allProducts.size());

        driver.quit();
    }
}
//Test pagination Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver and applying Explicit wait features. Task:
//
//Go to https://magento.softwaretestingboard.com/
//
//Register a new user (check out previous exercises for this demo site)
//
//Navigate to https://magento.softwaretestingboard.com/men/tops-men.html (or you can click on Men > Tops)
//
//There are 4 pages of products, your goal is to test the pagination by checking all items are unique on each page:
//
//Locate all product titles
//
//Move to the next page and locate all product titles and validate none of them are present in previous list
//
//Add all new item titles to first list, move to the next page and repeat