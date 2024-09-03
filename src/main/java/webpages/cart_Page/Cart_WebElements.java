package webpages.cart_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webpages.Page_Base;

public class Cart_WebElements extends Page_Base {

    public Cart_WebElements(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement remove_Btn;
    @FindBy(xpath = "//*[@data-test='shopping-cart-link']")
    WebElement cart_Logo;
}
