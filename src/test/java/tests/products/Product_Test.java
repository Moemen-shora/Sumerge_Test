package tests.products;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBases.Product_TestBase;
import testBases.TestBase;
import tests.login_tests.Login_Test;
import webpages.login_page.Login_Actions;
import webpages.products_Page.Products_Actions;

import java.util.List;


public class Product_Test extends Product_TestBase {

    private Login_Actions lp;
    private Products_Actions pa;
    private String header = "Products";
    private int products_Num = 6;
    String[] expectedNames = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt"};
    String[] expectedPrices = {"$29.99", "$9.99", "$15.99"};

    @Test
    public void assert_Products_Size(){
        lp = new Login_Actions(driver);
        pa = new Products_Actions(driver);
        lp.login("standard_user","secret_sauce");
        pa.assert_Product_Header(header);
        Assert.assertEquals(pa.get_Number_OfProducts(),products_Num);
    }
    @Test
    public void assert_Product_Details(){
        lp = new Login_Actions(driver);
        pa = new Products_Actions(driver);
        lp.login("standard_user","secret_sauce");
        List<WebElement> productList = driver.findElements(By.className("inventory_item"));

        Assert.assertTrue(productList.size()> 0, "No products found on the inventory page.");

        for (int i = 0; i < expectedNames.length; i++) {
            String actualName = productList.get(i).findElement(By.className("inventory_item_name")).getText();
            String actualPrice = productList.get(i).findElement(By.className("inventory_item_price")).getText();

            Assert.assertEquals(actualName, expectedNames[i], "Product name does not match!");

            Assert.assertEquals(actualPrice, expectedPrices[i], "Product price does not match!");
        }
    }
    @Test
    public void assert_Cart_Added() {
        lp = new Login_Actions(driver);
        pa = new Products_Actions(driver);
        lp.login("standard_user", "secret_sauce");
        pa.add_To_cart();
        pa.cart_Is_Updated();
    }




}
