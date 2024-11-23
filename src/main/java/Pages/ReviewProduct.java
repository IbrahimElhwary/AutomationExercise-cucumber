package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewProduct {
    WebDriver driver;

    public ReviewProduct(WebDriver driver) {
        this.driver = driver;
    }


    By Product_Button_txt = By.cssSelector("a[href=\"/products\"]");
    By AddFirstProduct_txt = By.cssSelector("a[data-product-id=\"1\"]");
    By AddSecondProduct_txt = By.cssSelector("a[data-product-id=\"2\"]");
    By ClickCountinueShopping_txt = By.cssSelector("button[data-dismiss=\"modal\"]");
    By SearchPanal_txt = By.id("search_product");
    By SearchButton_txt = By.id("submit_search");

    public void Product_Button(){
        driver.findElement(Product_Button_txt).click();
    }

    public void SearchPanal(String productname){
        driver.findElement(SearchPanal_txt).sendKeys(productname);
    }
    public void SearchButton(){
        driver.findElement(SearchButton_txt).click();
    }
    public void AddFirstProduct(){
        driver.findElement(AddFirstProduct_txt).click();
    }
    public void AddSecondProduct(){
        driver.findElement(AddSecondProduct_txt).click();
    }
    public void ClickCountinueShopping(){
        driver.findElement(ClickCountinueShopping_txt).click();
    }
}
