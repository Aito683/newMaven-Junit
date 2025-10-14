package steps;


import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    @BeforeAll
    public static void globalSetup(){
        System.out.println("it should only run once before the entire suite ");
    }

    @Before(order = 3)
    public void setUp(){
        System.out.println("Setting up in Cucumber before hooks");
    }
    @Before(order = 1)
    public void setUpDatabase() {
        System.out.println("Code to set up database before hooks");
        // Code to set up database
    }

    @Before(order = 2, value = "@ui")
    public void setUpWebdriver() {
        System.out.println("Code to set up webdriver before hooks");
        // Code to set up webdriver
    }
    @Before(order = 1)
    public void setUp1() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

   @After
    public void cleanUp(){
        System.out.println("Cleanup in Cucumber");
    }
    public static WebDriver driver;

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }


