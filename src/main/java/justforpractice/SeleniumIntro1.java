package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro1 {
    public static void main(String[] args) {
        //webdriver manager is a class that has
        //different browser drivers.
        //if I want to go execute a Chrome browser
        //for every Selenium project that executes tests
        // on Chrome browser
        //should setup ChromeDriver at least 1 time

        WebDriverManager.chromedriver().setup();

        //WebDriver is a Selenium interface
        // that represents all browser drivers.
        //implementations are
        //ChromeDriver();
        //SafariDriver();
        //InternetExplorerDriver();
        //FirefoxDriver();
// new ChromeDriver will open a browser
        WebDriver driver = new ChromeDriver();//opens a browser

        driver.get("https://www.wedevx.co/");//get method directs
        //your browser to a specific webpag
        driver.quit();


    }
}
