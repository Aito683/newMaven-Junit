package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Working with table Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver. Task:
//
//Go to https://practice-automation.com/tables/
//
//Create a map of products and their prices from the Simple Table. Print the map using toString() method without iteration or extraction
//
//Print Chinas population and rank in the format: China; Rank - 1; Population (million) - 1,439.3;
//
//Sort the Table by country name
//
//Print the same info for first three countries from top after sorting

public class Ex16_21_1_WorkingWithTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/tables/");
        Thread.sleep(2000);

        //Create a map of products and their prices from the Simple Table.
        //Print the map using toString() method without iteration or extraction
        WebElement table =driver.findElement(By.xpath("//figure[@class='wp-block-table']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        //1st, identify the exact data table I'm working with
        //2nd, extract and save a List of rows. There are multiple "tr"s in a data table

        Map<String, String> productPriceMap = new HashMap<>();
        //For each row, there are multiple td(table data)s.
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            if (cols.size() == 2) {
                //each data from a column in each row can be extracted through.getText() and through index
                productPriceMap.put(cols.get(0).getText(), cols.get(1).getText());
            }
        }
        System.out.println(productPriceMap);


//Print China's population and rank in the format: China; Rank - 1; Population (million) - 1,439.3;
        WebElement worldTable = driver.findElement(By.id("tablepress-1"));
        List<WebElement> rows2 = worldTable.findElements(By.tagName("tr"));
        //1st, identify the exact data table I'm working with
        //2nd, extract and save a List of rows. There are multiple "tr"s in a data table

        for (WebElement row : rows2) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            if (cols.size() == 3 && cols.get(1).getText().equals("China")) {
                String rank = cols.get(0).getText();
                String country = cols.get(1).getText();
                String population = cols.get(2).getText();
                System.out.println(country + "; Rank - " + rank + "; Population (million) - " + population + ";");
                break;
            }
        }

//Sort the Table by country name
        WebElement sortCountryButton = driver.findElement(By.xpath("//span[text()='Country']"));
        sortCountryButton.click();
        Thread.sleep(1000);

//Print the same info for first three countries from top after sorting
        rows2 = worldTable.findElements(By.tagName("tr"));
        //2nd, extract and save a List of rows. There are multiple "tr"s in a data table

        //For each row, there are multiple td(table data)s each in columns.
        //This for loop is on a row, and moving from left column to the right column (column = index)

        for (int i = 1; i <= 3; i++) {
            //Goes through rows from the top 1 till top 3 (excluding the header hence starting from index 1)
            //And each row will have column. Extract and save them in a List, and access them individually.

            List<WebElement> cols = rows2.get(i).findElements(By.tagName("td"));
            String rank = cols.get(0).getText();
            String country = cols.get(1).getText();
            String population = cols.get(2).getText();
            System.out.println(country + "; Rank - " + rank + "; Population (million) - " + population + ";");
        }
    }
}
