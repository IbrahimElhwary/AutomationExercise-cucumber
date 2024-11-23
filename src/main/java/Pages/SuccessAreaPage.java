package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessAreaPage {
    WebDriver driver;

    public SuccessAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    By SuccessSignupMessage_Lable = By.cssSelector("h2[class=\"title text-center\"]");
    By SuccessLoginMessage_Lable = By.className("login-form");
    By SuccessProductMessage_Lable = By.cssSelector("h2[class=\"title text-center\"]");
    By SuccessAllProduct_Lable = By.cssSelector("h2[class=\"title text-center\"]");

    public void SuccessSignupMessage() {
         driver.findElement(SuccessSignupMessage_Lable).getText()
                 .contains("FEATURS ITEMS");
    }
    public void SuccessLoginMessage() {
         driver.findElement(SuccessLoginMessage_Lable).getText()
                .contains("Login to your account");
    }
    public void SuccessProductMessage() {
         driver.findElement(SuccessProductMessage_Lable).getText()
                 .contains("ALL PRODUCTS");;
    }
    public void SuccessAllProduct() {
        driver.findElement(SuccessAllProduct_Lable).getText()
                .contains("SEARCHED PRODUCTS");;
    }
}


