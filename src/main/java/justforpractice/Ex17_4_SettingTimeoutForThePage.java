package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ex17_4_SettingTimeoutForThePage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);

        driver.get("https://www.nasdaq.com/market-activity/stocks/tsla/real-time");



    }
}
