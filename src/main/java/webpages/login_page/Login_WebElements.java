package webpages.login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webpages.Page_Base;

/**
 * @author MAmr
 * 1) This class is using PageFactory-class from Page_Base to locate web-elements for the "Add new KYC" webpage.
 * 2) This class extends Page_Base class where I declared the object WebDriver that I am using in all webpages classes.
 */
public class Login_WebElements extends Page_Base {


    public Login_WebElements(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "user-name")
    WebElement username_Txt;
    @FindBy(id = "password")
    WebElement password_Txt;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement login_Btn;
    @FindBy(xpath = "//*[contains(text(),'Epic')]")
    WebElement error_Msg;


    
}
