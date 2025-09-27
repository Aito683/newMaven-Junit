package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
//Print number of articles only for languages on the right Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver. Task:
//
//Go to https://www.wikipedia.org/
//
//Print a number of articles for all languages on the right side
//
//You can use all attributes (hint: class attribute)
//
//Use findElements() method, no single element location is allowed

public class Ex17_1_1_UseListToFilterElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(10000);



        List<WebElement> allLanguages = driver.findElements(By.xpath("//nav//div[contains(@class,'central-featured-lang')]"));

        for (WebElement language:allLanguages) {
            String className = language.getAttribute("class");//
            //Extract the number part from the class
            String numberPart = className.replaceAll("\\D+","");//removes non-digits
            if(!numberPart.isEmpty()){
                int number = Integer.parseInt(numberPart);
                if(number%2==0){// check even
                    System.out.println(language.getText());
            }

        }

    }
        Thread.sleep(1000);

        driver.quit();
}
}
