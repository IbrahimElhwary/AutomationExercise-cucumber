package StepDef;

import Pages.Logoutpage;
import Pages.ReviewProduct;
import Pages.SuccessAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDef {

    Pages.Logoutpage Logoutpage;
    SuccessAreaPage SuccessAreaPage;
    ReviewProduct  ReviewProduct;

    public LogoutStepDef() {
        Logoutpage = new Logoutpage(Hooks.driver);
        SuccessAreaPage = new SuccessAreaPage(Hooks.driver);
        ReviewProduct = new ReviewProduct(Hooks.driver);
    }


    @Given("User navigates to page")
    public void Usernavigatestopage(){
        Logoutpage.Navigate();
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        SuccessAreaPage.SuccessSignupMessage();
    }


    @When("User Click on Signup Login button")
    public void UserClickOnSignupLoginButton() {
        Logoutpage.SignupButton();
    }


    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        SuccessAreaPage.SuccessLoginMessage();
    }

    @When("User Enter correct email address")
    public void userEnterCorrectEmailAddress() {
        Logoutpage.EmailAddress("eprahimfathy01127443958@gmail.com");
    }

    @And("User Enter correct password")
    public void userEnterCorrectPassword() {
        Logoutpage.Password("123456");
    }

    @And("User Click on Login button")
    public void userClickOnLoginButton() {
        Logoutpage.LoginButton();
    }


}
