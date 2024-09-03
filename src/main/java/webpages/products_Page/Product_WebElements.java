package webpages.products_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webpages.Page_Base;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Product_WebElements extends Page_Base {

    public Product_WebElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-test='title']")
    WebElement product_Header;

    @FindBy(xpath = "//*[@data-test='product-sort-container']")
    WebElement products_Sort;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement add_To_Cart;
    @FindBy(xpath = "//*[@data-test='shopping-cart-badge']")
    WebElement cart_Logo;



    private By productItems = By.className("inventory_item");

    public int get_Number_OfProducts() {
        List<WebElement> products = driver.findElements(productItems);
        return products.size();
    }




}
