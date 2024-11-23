package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Reg_User {
    public static void main(String[] args) {
        WebDriver driver;

        driver = new EdgeDriver();

        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.cssSelector("ul[class = \"nav navbar-nav\""));
        driver.findElement(By.cssSelector("i[ class = \"fa fa-lock\"]")).click();
        driver.findElement(By.cssSelector("div[class = \"login-form\""));
        driver.findElement(By.cssSelector("input[ name = \"name\"]")).sendKeys("Ibrahim");
        driver.findElement(By.cssSelector("input[ data-qa=\"signup-email\"]"))
                .sendKeys("eprahimfathy01127443958@gmail.com");
        driver.findElement(By.cssSelector("button[ data-qa=\"signup-button\"]")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("h2[class=\"title text-center\"")).getText()
                .contains("ENTER ACCOUNT INFORMATION"));

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("123456");

        driver.findElement(By.id("days")).sendKeys("4");
        //driver.findElement(By.id("months")).);
        //driver.findElement(By.id("years")).);
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("Ibrahim");
        driver.findElement(By.id("last_name")).sendKeys("Fathy");
        driver.findElement(By.id("company")).sendKeys("Amit");
        driver.findElement(By.id("address1")).sendKeys("5st gornesh_elnile cairo");
        driver.findElement(By.id("address2")).sendKeys("5st gornesh_elnile cairo");
        //driver.findElement(By.id("country"));
        driver.findElement(By.id("state")).sendKeys("Cario");
        driver.findElement(By.id("city")).sendKeys("Helwan");
        driver.findElement(By.id("zipcode")).sendKeys("56382");
        driver.findElement(By.id("mobile_number")).sendKeys("0122568796");
        driver.findElement(By.cssSelector("button[ class=\"btn btn-default\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h2[class=\"title text-center\"")).getText()
                .contains("ACCOUNT CREATED!"));

        driver.findElement(By.cssSelector("a[ class=\"btn btn-primary\"]")).click();

        //Assert.assertTrue(driver.findElement(By.cssSelector("button[ class=\"fa fa-user\"]")).getText()
          //      .contains("Logged in as Ibrahim"));
//        driver.findElement(By.cssSelector("a[ href=\"/delete_account\"]")).click();
//        driver.findElement(By.cssSelector("h2[ class=\"title text-center\"]")).getText()
//                .contains("ACCOUNT DELETED!");
    }
}
