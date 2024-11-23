package StepDef;

import Pages.Logoutpage;
import Pages.ReviewProduct;
import Pages.SuccessAreaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDef {

    Pages.Logoutpage Logoutpage;
    Pages.SuccessAreaPage SuccessAreaPage;
    Pages.ReviewProduct ReviewProduct;

    public  SearchProductStepDef(){
        Logoutpage = new Logoutpage(Hooks.driver);
        SuccessAreaPage = new SuccessAreaPage(Hooks.driver);
        ReviewProduct = new ReviewProduct(Hooks.driver);
    }

    @When("User Click on Product button")
    public void UserClickonProductbutton(){
        ReviewProduct.Product_Button();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        SuccessAreaPage.SuccessProductMessage();
    }

    @When("Enter product name in search input")
    public void enterProductNameInSearchInput() {
        ReviewProduct.SearchPanal("Tshirt");
    }
    @When("Click search button")
    public void ClickSearchButton() {
        ReviewProduct.SearchButton();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        SuccessAreaPage.SuccessAllProduct();
    }


}
