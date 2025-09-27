package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle_17_16 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co/");
        driver.manage().window().fullscreen();

        WebElement windowOption = driver.findElement(By.id("panel3bh-header"));
        windowOption.click();


        WebElement browserWindowsPageBtn = driver.findElement(By.id("browserWindows_page"));
        browserWindowsPageBtn.click();

        String uniqueIdOfTheCurrentTab = driver.getWindowHandle();
        System.out.println(uniqueIdOfTheCurrentTab);

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        //it's important to save the id of your current tab
        uniqueIdOfTheCurrentTab =driver.getWindowHandle();
        System.out.println(uniqueIdOfTheCurrentTab);

        tabButton.click();


        //method to switch the window is

        //we created set of tabs
        Set<String> allOpenTabIds = driver.getWindowHandles();

        for(String tabId:allOpenTabIds){
            if(!tabId.equalsIgnoreCase(uniqueIdOfTheCurrentTab)){
                driver.switchTo().window(tabId);
                break;

            }

        }

        WebElement header1 = driver.findElement(By.xpath("//h1"));
        System.out.println(header1.getText());

    }
}
