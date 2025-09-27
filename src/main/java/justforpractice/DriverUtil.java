package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverUtil {
    public static void main(String[] args) {
        String url = "";
        WebDriver driver = multiBrowserSetup(url);

    }
    public static WebDriver multiBrowserSetup(String browserName){
        WebDriver driver = null;
        if(browserName.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://wedevx.co/");
            driver.quit();

        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver();
            driver.get("https://wedevx.co/");
            driver.quit();

        }else if(browserName.equalsIgnoreCase("safari")){
             driver = new SafariDriver();
            driver.get("https://wedevx.co/");
            driver.quit();

        }else if (browserName.equalsIgnoreCase("ie")){
            WebDriverManager.iedriver().setup();
             driver = new InternetExplorerDriver();
            driver.get("https://wedevx.co/");
            driver.quit();

        }else{
            System.out.println("Invalid browser was entered");
        }
        return driver;
    }
}
