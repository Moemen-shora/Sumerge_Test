package webpages.cart_Page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Cart_Actions extends Cart_WebElements{
    public Cart_Actions(WebDriver driver) {
        super(driver);
    }
    public void removeItem(){
        clickWebElement(remove_Btn);
    }
    public void assert_Empty_CartLogo(){
        Assert.assertTrue(cart_Logo.isDisplayed());
    }
}
