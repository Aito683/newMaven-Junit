package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Ex17_5_UsingImplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1. Set implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // 2. Go to the page
        driver.get("https://www.x-rates.com/table/?from=USD&amount=1");

        // 3. Locate the table body
        WebElement table = driver.findElement(By.xpath("//table[1]//tbody[1]"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // 4. Prepare map
        Map<String, String> currencyMap = new LinkedHashMap<>(); // keep insertion order

        // 5. Iterate only the first 5 rows
        for (int i = 0; i < 5; i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            // first column = currency name, second column = exchange rate
            String currencyName = cols.get(0).getText();
            String exchangeRate = cols.get(1).getText();

            currencyMap.put(currencyName, exchangeRate);
        }

        // 6. Print the map content
        for (Map.Entry<String, String> entry : currencyMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 7. Close browser
        driver.quit();

    }
}
