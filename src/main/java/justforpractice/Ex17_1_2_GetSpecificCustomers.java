package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Print customer with specific post code Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver. Task:
//
//Go to https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list
//
//Locate all customers whose postcode has "8" in it and print their names
//
//Use findElements() method, no single element location is allowed
public class Ex17_1_2_GetSpecificCustomers {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
        Thread.sleep(1000);

        //locate the table first
        WebElement table = driver.findElement(By.xpath("//table/tbody"));
        List<WebElement> rowsWithCustomersData = table.findElements(By.tagName("tr"));

        //loop through the customers to find the one that has number 8 in his post code

        for(WebElement customer:rowsWithCustomersData){
           // For each row, there are multiple td(table data)s.
           List<WebElement> columns = customer.findElements(By.tagName("td"));
           if(columns.size()==5 && columns.get(2).getText().contains("8")){
              // System.out.println(columns.get(3).getText());
               System.out.println(customer.getText());
           }

        }
        driver.quit();

    }
}
