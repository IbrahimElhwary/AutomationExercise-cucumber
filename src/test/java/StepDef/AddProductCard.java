package StepDef;

import Pages.Logoutpage;
import Pages.ReviewProduct;
import Pages.SuccessAreaPage;
import io.cucumber.java.en.And;

public class AddProductCard {


    Pages.Logoutpage Logoutpage;
    Pages.SuccessAreaPage SuccessAreaPage;
    Pages.ReviewProduct ReviewProduct;

    public  AddProductCard(){
        Logoutpage = new Logoutpage(Hooks.driver);
        SuccessAreaPage = new SuccessAreaPage(Hooks.driver);
        ReviewProduct = new ReviewProduct(Hooks.driver);
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        ReviewProduct.AddFirstProduct();
    }

    @And("Hover over Second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        ReviewProduct.AddSecondProduct();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {

    }
}
