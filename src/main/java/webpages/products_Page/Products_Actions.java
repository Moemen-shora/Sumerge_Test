package webpages.products_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Products_Actions extends Product_WebElements{
    public Products_Actions(WebDriver driver) {
        super(driver);
    }

    public void assert_Product_Header(String txt){
        assert_Actual_Text_Contains_Expected_Text(txt,product_Header,"Not found");
    }
    /*public void assert_Product_Numbers(int num){
        //Assert.assertEquals(number_Products,num);
        Assert.assertEquals(product_List.size(),num);
    }*/
    public void selectOption(String text){
        Select sort = new Select(products_Sort);
        sort.selectByVisibleText(text);
    }
    public void add_To_cart(){
        clickWebElement(add_To_Cart);
    }
    public void cart_Is_Updated(){
        Assert.assertTrue(cart_Logo.isDisplayed());
    }
    public void press_On_Cart(){
        clickWebElement(cart_Logo);
    }

}
