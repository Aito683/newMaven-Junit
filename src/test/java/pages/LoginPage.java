package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    //1 - create constructor with PageFactory(mandatory)
    public LoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    //Use @FindBy annotation to locate and initialize web elements

    //2 - Locate all of the Webelements in the page
    @FindBy(id = "username")
    private WebElement usernameTxtbox;

    @FindBy(id = "password")
    private WebElement passwordTxtbox;

    @FindBy(id = "remember-me")
    private WebElement remember_meCheckBox;

    @FindBy(xpath = "//button")
    private WebElement submitBtn;

    @FindBy(xpath = "//a[contains(text(),'Sign Up Here')]")
    private WebElement signUpHereLink;

//3- create action methods
    public void login(String username, String password){
        usernameTxtbox.sendKeys(username);
        passwordTxtbox.sendKeys(password);

        submitBtn.click();

    }

}
