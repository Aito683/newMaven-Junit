package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_19_1_pageTitleXpathPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
        Thread.sleep(1000);
        WebElement bankTitle = driver.findElement(By.xpath("//strong"));
        System.out.println(bankTitle.getText());
        Thread.sleep(2000);

        driver.quit();


    }
}
