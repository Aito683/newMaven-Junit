package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;



public class Ex16_26_1_PracticeOneSortAndValidate {
    @Test
    public void test1()throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#");
        Thread.sleep(2000);

        WebElement bankManagerLoginBtn = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
        bankManagerLoginBtn.click();
        Thread.sleep(2000);

        WebElement customersBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersBtn.click();
        Thread.sleep(2000);

        WebElement firstNameLinkBtn = driver.findElement(By.xpath("//table//td[1]/a"));
        firstNameLinkBtn.click();
        Thread.sleep(2000);

        WebElement firstRowName = driver.findElement(By.xpath("//table/tbody/tr/td[1]"));
        System.out.println(firstRowName.getText());
        assertEquals("Ron",firstRowName.getText());

        WebElement firstRowLastName = driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
        System.out.println(firstRowLastName.getText());
        assertEquals("Weasly",firstRowLastName.getText());

        WebElement firstRowPostCode = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
        System.out.println(firstRowPostCode.getText());
        assertEquals("E55555",firstRowPostCode.getText());

        WebElement secondRowFirstName = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
        System.out.println(secondRowFirstName.getText());
        assertEquals("Neville",secondRowFirstName.getText());


        WebElement secondRowLastName = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println(secondRowLastName.getText());
        assertEquals("Longbottom",secondRowLastName.getText());

        WebElement secondRowPostCode = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
        System.out.println(secondRowPostCode.getText());
        assertEquals("E89898",secondRowPostCode.getText());

        WebElement thirdRowFirstName  = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]"));
        System.out.println(thirdRowFirstName.getText());
        assertEquals("Hermoine",thirdRowFirstName.getText());

        WebElement thirdRowLastName  = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
        System.out.println(thirdRowLastName.getText());
        assertEquals("Granger",thirdRowLastName.getText());

        WebElement thirdRowPostCode  = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
        System.out.println(thirdRowPostCode.getText());
        assertEquals("E859AB",thirdRowPostCode.getText());

        WebElement lastNameLinkBtn = driver.findElement(By.xpath("//table/thead/tr/td[2]"));
        lastNameLinkBtn.click();
        Thread.sleep(2000);

        WebElement firstRowNameForLastNameSort  = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
        System.out.println(firstRowNameForLastNameSort.getText());
        assertEquals("Albus",firstRowNameForLastNameSort.getText());


        WebElement firstRowLastNameForLastNameSort = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
        System.out.println(firstRowLastNameForLastNameSort.getText());
        assertEquals("Dumbledore",firstRowLastNameForLastNameSort.getText());

        WebElement firstRowPostCodeForLastNameSort = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
        System.out.println(firstRowPostCodeForLastNameSort.getText());
        assertEquals("E55656",firstRowPostCodeForLastNameSort.getText());
//
        WebElement secondRowFirstNameForLastNameSort = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
        System.out.println(secondRowFirstNameForLastNameSort.getText());
        assertEquals("Hermoine",secondRowFirstNameForLastNameSort.getText());


        WebElement secondRowLastNameForLastNameSort = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println(secondRowLastNameForLastNameSort.getText());
        assertEquals("Granger",secondRowLastNameForLastNameSort.getText());

        WebElement secondRowPostCodeForLastNameSort = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
        System.out.println(secondRowPostCodeForLastNameSort.getText());
        assertEquals("E859AB",secondRowPostCodeForLastNameSort.getText());

        WebElement thirdRowFirstNameForLastNameSort  = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]"));
        System.out.println(thirdRowFirstNameForLastNameSort.getText());
        assertEquals("Neville",thirdRowFirstNameForLastNameSort.getText());

        WebElement thirdRowLastNameForLastNameSort  = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
        System.out.println(thirdRowLastNameForLastNameSort.getText());
        assertEquals("Longbottom",thirdRowLastNameForLastNameSort.getText());

        WebElement thirdRowPostCodeForLastNameSort  = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
        System.out.println(thirdRowPostCodeForLastNameSort.getText());
        assertEquals("E89898",thirdRowPostCodeForLastNameSort.getText());

        driver.quit();


    }
}
