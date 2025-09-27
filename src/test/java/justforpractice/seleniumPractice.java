package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;


public class seleniumPractice {

    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co/");
        Thread.sleep(2000);

        WebElement webTablesBtn = driver.findElement(By.id("webTables_page"));
        webTablesBtn.click();
        Thread.sleep(2000);
        WebElement firstColumnHeader = driver.findElement(By.xpath("//table/thead/tr/th[2]"));

        System.out.println(firstColumnHeader.getText());

       assertEquals("Dessert (100g serving)", firstColumnHeader.getText());


        WebElement secondColumnHeader = driver.findElement(By.xpath("//table/thead/tr/th[3]"));
        System.out.println(secondColumnHeader.getText());

        assertEquals("Calories\nsorted ascending",secondColumnHeader.getText());

        WebElement thirdColumnHeader = driver.findElement(By.xpath("//table/thead/tr/th[4]"));
        System.out.println(thirdColumnHeader.getText());
        assertEquals("Fat (g)", thirdColumnHeader.getText());

        WebElement fourthColumnHeader = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
        System.out.println(fourthColumnHeader.getText());
        assertEquals("Carbs (g)",fourthColumnHeader.getText());

        WebElement fifthColumnHeader = driver.findElement(By.xpath("//table/thead/tr/th[6]"));
        System.out.println(fifthColumnHeader.getText());
        assertEquals("Protein (g)",fifthColumnHeader.getText());


        WebElement firstRowDessertName = driver.findElement(By.xpath("//table/tbody/tr[1]/th"));
        assertEquals("Frozen yoghurt", firstRowDessertName.getText());

        WebElement firstRowDessertCalories = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
        assertEquals("159", firstRowDessertCalories.getText());
        //table/tbody/tr[1]/td[2]

        WebElement firstRowDessertFat = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
        assertEquals("6", firstRowDessertFat.getText());

        WebElement firstRowDessertCarbs = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]"));
        assertEquals("24", firstRowDessertCarbs.getText());

        WebElement secondRowDessertName = driver.findElement(By.xpath("//table/tbody/tr[2]/th"));
        assertEquals("Ice cream sandwich", secondRowDessertName.getText());
        System.out.println(secondRowDessertName.getText());

        WebElement secondRowDessertCalories = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        assertEquals("237", secondRowDessertCalories.getText());
        System.out.println(secondRowDessertCalories.getText());

        WebElement secondRowDessertFat = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
        assertEquals("9", secondRowDessertFat.getText());
        System.out.println(secondRowDessertFat.getText());

        WebElement secondRowDessertCarbs = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]"));
        assertEquals("37", secondRowDessertCarbs.getText());
        System.out.println(secondRowDessertCarbs.getText());

        WebElement thirdRowDessertName = driver.findElement(By.xpath("//table/tbody/tr[3]/th"));
        assertEquals("Eclair", thirdRowDessertName.getText());
        System.out.println(thirdRowDessertName.getText());

        WebElement thirdRowDessertCalories = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
        assertEquals("262", thirdRowDessertCalories.getText());
        System.out.println(thirdRowDessertCalories.getText());

        WebElement thirdRowDessertFat = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
        assertEquals("16", thirdRowDessertFat.getText());
        System.out.println(thirdRowDessertFat.getText());

        WebElement thirdRowDessertCarbs = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
        assertEquals("24", thirdRowDessertCarbs.getText());
        System.out.println(thirdRowDessertCarbs.getText());

        driver.quit();


    }
}
