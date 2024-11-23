package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutpage {
    WebDriver driver;

    public Logoutpage(WebDriver driver) {
        this.driver = driver;
    }

    By EmailAddress_textBox = By.cssSelector("input[type=\"email\"]");
    By Password_textBox = By.cssSelector("input[type=\"password\"]");
    By Signup_Button_txt = By.cssSelector("a[href=\"/login\"]");
    By Login_Button_txt = By.cssSelector("button[class=\"btn btn-default\"]");


    public void Navigate(){
        driver.navigate().to("https://automationexercise.com");
    }

    public void EmailAddress(String emailaddress){
        driver.findElement(EmailAddress_textBox).sendKeys(emailaddress);
    }
    public void Password(String password){
        driver.findElement(Password_textBox).sendKeys(password);
    }
    public void SignupButton(){
        driver.findElement(Signup_Button_txt).click();
    }
    public void LoginButton(){
        driver.findElement(Login_Button_txt).click();
    }


}
