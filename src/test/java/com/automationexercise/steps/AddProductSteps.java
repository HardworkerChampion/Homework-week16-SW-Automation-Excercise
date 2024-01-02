package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductSteps {
    @When("I Add products to cart")
    public void iAddProductsToCart() {
        new HomePage().addProductInCart();
    }

    @And("I Click Cart button")
    public void iClickCartButton() {
        new HomePage().clickOnViewCart();
    }

    @And("I can see  that cart page is displayed")
    public void iCanSeeThatCartPageIsDisplayed() {
        Assert.assertEquals(new ViewCartPage().verifyCartPage(),"Shopping Cart");
    }

    @And("I  Click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new ViewCartPage().clickOnProceedToCheckOut();
    }

    @And("I Click RegisterLogin button")
    public void iClickRegisterLoginButton() {
        new ViewCartPage().clickOnRegisterLoginLink();
    }

    @And("I Enter description in comment text area{string} and click Place Order")
    public void iEnterDescriptionInCommentTextAreaAndClickPlaceOrder(String comment) {
        new CheckoutPage().enterCommentAndClickOnPlaceOrder(comment);
    }

    @And("I Enter payment details: Name on Card{string}, Card Number{string}, CVC{string}, Expiration date{string},{string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate(String name, String cardNumber, String cvv, String month, String year) {

        new PaymentPage().enterPaymentDetails(name, cardNumber, cvv, month, year);
    }

    @And("I Click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmButton();

    }

    @And("I  Click on X button corresponding to particular product")
    public void iClickOnXButtonCorrespondingToParticularProduct() {
        new ViewCartPage().clickOnX();
    }

    @Then("I can see  that product is removed from the cart")
    public void iCanSeeThatProductIsRemovedFromTheCart() {
        Assert.assertEquals(new ViewCartPage().verifyTextEmptyCart(),"Cart is empty!");
    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        new ProductsPage().clickOnMenOption();
    }

    @And("I Click on View Product of first product on Product Page")
    public void iClickOnViewProductOfFirstProductOnProductPage() {
        new ProductsPage().clickOnViewProductOnProductPage();
    }


    @And("I Click on Add To Cart on Recommended product{string}")
    public void iClickOnAddToCartOnRecommendedProduct(String product) {
        new HomePage().clickAddToCartOnRecommendedItems(product);
    }



    @And("I can see Verify success message {string}")
    public void iCanSeeVerifySuccessMessage(String msg) {
        Assert.assertEquals(new PaymentPage().verifySuccessMessageOrderPlaced(),msg);
    }

    @And("I Click Download Invoice button and verify invoice is downloaded successfully.")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        new PaymentPage().clickOnDownloadInvoice();
    }
}
