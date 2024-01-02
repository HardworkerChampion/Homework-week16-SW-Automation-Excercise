package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductDetailsPage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSearchSteps {
    @And("I Enter product name{string} in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton(String product) {
        new ProductsPage().enterProductNameInInputsSearch(product);
    }

    @And("I Click Continue Shopping button")
    public void iClickContinueShoppingButton() {
        new ProductsPage().clickOnContinueShoppingButton();
    }

    @And("I  Hover over second product and click Add to cart")
    public void iHoverOverSecondProductAndClickAddToCart() {
        new ProductsPage().mouseHoverOnSecondProductAndClickOnAddCart();
    }

    @And("I Click View Cart button")
    public void iClickViewCartButton() {
        new ProductsPage().clickOnViewProduct();
    }

    @When("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        new HomePage().clickOnViewProduct();

    }


    @And("I Increase quantity to {string}")
    public void iIncreaseQuantityTo(String qty) {
        new ProductDetailsPage().increaseQuantity(qty);
    }

    @And("I  Click on Add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddCart();
    }

    @And("I  Click on View Cart button")
    public void iClickOnViewCartButton() {
        new ProductDetailsPage().clickOnViewCart();
    }

    @Then("I Can see  that product is displayed in cart page with exact quantity")
    public void iCanSeeThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new ViewCartPage().verifyProductName(),"Blue Top");
        Assert.assertEquals(new ViewCartPage().verifyQty4(),"4");
    }

    @And("I Click on Women category")
    public void iClickOnWomenCategory() {
        new HomePage().clickOnWomen();
    }

    @And("I Click on any category link under Women category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new HomePage().clickOnDressOption();
    }

    @And("I Click on any brand name")
    public void iClickOnAnyBrandName() {
        new ProductsPage().clickOnPolo();
    }

    @And("I Click On left side bar, click on any other brand link")
    public void iClickOnLeftSideBarClickOnAnyOtherBrandLink() {
        new ProductDetailsPage().clickOnMadameBrandLink();
    }
}
