package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerificationSteps {
    @And("I Can see user is navigated to ALL PRODUCTS page successfully")
    public void iCanSeeUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new ProductsPage().verifyTextAllProducts(),"ALL PRODUCTS","Text is not displayed");
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        new ProductsPage().verifyTextInProductsList();
    }

    @And("I is landed to product detail page")
    public void iIsLandedToProductDetailPage() {
        new ProductDetailsPage().getTitleOfPage();
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(new ProductDetailsPage().verifyProductName().contains("Blue Top"));
        Assert.assertTrue(new ProductDetailsPage().verifyCategory().contains("Women > Tops"));
        Assert.assertTrue(new ProductDetailsPage().verifyPrice().contains("Rs. 500"));
        Assert.assertTrue(new ProductDetailsPage().verifyAvailability().contains("Availability: In Stock"));
        Assert.assertTrue(new ProductDetailsPage().verifyCondition().contains("Condition: New"));
        Assert.assertTrue(new ProductDetailsPage().verifyBrand().contains("Brand: Polo"));

    }

    @And("I can see SEARCHED PRODUCTS is visible")
    public void iCanSeeSEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new SearchProductPage().verifySearchedProducts(),"SEARCHED PRODUCTS","Text not verify");
    }

    @Then("I Can  all the products related to search are visible")
    public void iCanAllTheProductsRelatedToSearchAreVisible() {
        new SearchProductPage().verifyAllProducts();
    }

    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertEquals(new HomePage().verifyTextSubscription(),"SUBSCRIPTION","Text not Verified");
    }

    @Then("I can see  success message You have been successfully subscribed! is visible")
    public void iCanSeeSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new HomePage().verifyTextSubscribeSuccess(),"You have been successfully subscribed!","Text not Verified");
    }

    @And("I Can see both products are added to Cart")
    public void iCanSeeBothProductsAreAddedToCart() {
        Assert.assertEquals(new ViewCartPage().verifyProduct1Text(),"Blue Top","Text not display");
        Assert.assertEquals(new ViewCartPage().verifyProduct2Text(),"Men Tshirt","Text not display");

    }

    @Then("I Can see  their prices, quantity and total price")
    public void iCanSeeTheirPricesQuantityAndTotalPrice() {
        Assert.assertEquals(new ViewCartPage().verifyPrice1Text(),"Rs. 500","Text not match");
        Assert.assertEquals(new ViewCartPage().verifyPrice2Text(),"Rs. 400","Text not displayed");
        Assert.assertEquals(new ViewCartPage().verifyQty1Text(),"1");
        Assert.assertEquals(new ViewCartPage().verifyQty2Text(),"1");
        Assert.assertEquals(new ViewCartPage().verifyTotalPrice1(),"Rs. 500");
        Assert.assertEquals(new ViewCartPage().verifyTotalPrice2(),"Rs. 400");


    }

    @And("I Can see product detail is opened")
    public void iCanSeeProductDetailIsOpened() {
        Assert.assertEquals(new ProductDetailsPage().verifyProductName(),"Blue Top");
    }

    @When("I Can see that categories are visible on left side bar")
    public void iCanSeeThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new HomePage().verifyTextCategory(),"CATEGORY");
    }

    @And("I Can see  that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void iCanSeeThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        Assert.assertEquals(new HomePage().verifyTextWomenDress(),"WOMEN - DRESS PRODUCTS");
    }

    @Then("I Can see  that user is navigated to that category page")
    public void iCanSeeThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(new ProductsPage().verifyTextMenProducts(),"MEN - TSHIRTS PRODUCTS");
    }

    @And("I Can see that Brands are visible on left side bar")
    public void iCanSeeThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ProductsPage().verifyTextBrands(),"BRANDS");
    }

    @And("I Can see  that user is navigated to brand page and brand products are displayed")
    public void iCanSeeThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ProductDetailsPage().verifyTextPolo(),"BRAND - POLO PRODUCTS");

    }

    @Then("I Can see that user is navigated to that brand page and can see products")
    public void iCanSeeThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertEquals(new ProductDetailsPage().verifyTextMadame(),"BRAND - MADAME PRODUCTS");
    }

    @And("I can verify that navigate to  url {string}")
    public void iCanVerifyThatNavigateToUrl(String url) {
        Assert.assertEquals(new HomePage().verifyNavigateToPage(),url);
    }

    @And("Verify {string} is visible")
    public void verifyIsVisible(String text) {
        Assert.assertEquals(new ProductDetailsPage().verifyTextWriteYourReview(),text);
    }

    @Then("I can see the success message{string}")
    public void iCanSeeTheSuccessMessage(String text) {
        Assert.assertEquals(new ProductDetailsPage().textSuccessMessage(),text);
    }

    @And("I can see {string} are visible")
    public void iCanSeeAreVisible(String text) {
        Assert.assertEquals(new HomePage().verifyTextRecommendedItems(),"RECOMMENDED ITEMS");
    }

    @Then("I can see {string} is displayed in cart page")
    public void iCanSeeIsDisplayedInCartPage(String product) {
        Assert.assertEquals(new ViewCartPage().verifyTextProductName(),product);
    }
}
