package tests.cart_Tests;

import org.testng.annotations.Test;
import testBases.Cart_TestBase;
import webpages.cart_Page.Cart_Actions;
import webpages.login_page.Login_Actions;
import webpages.products_Page.Products_Actions;

public class Cart_Test extends Cart_TestBase {

    private Login_Actions lp;
    private Products_Actions pa;
    private Cart_Actions ca;




    @Test
    public void removeItem(){
        lp = new Login_Actions(driver);
        pa = new Products_Actions(driver);
        ca = new Cart_Actions(driver);
        lp = new Login_Actions(driver);
        pa = new Products_Actions(driver);
        lp.login("standard_user", "secret_sauce");
        pa.add_To_cart();
        pa.cart_Is_Updated();
        pa.press_On_Cart();
        ca.removeItem();
        ca.assert_Empty_CartLogo();

    }
}
