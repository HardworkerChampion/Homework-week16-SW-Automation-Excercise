package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ScrollDownSteps {
    @When("I Scroll down to footer")
    public void iScrollDownToFooter() {new HomePage().scrollDown();
    }

    @And("I Enter email address{string} in input")
    public void iEnterEmailAddressInInputAndClickArrowButton(String email) {
        new HomePage().enterEmailAddress(email);

    }

    @And("I click arrow button")
    public void iClickArrowButton() throws InterruptedException {
        new HomePage().clickOnRightArrowButton();
        Thread.sleep(3000);
    }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        new ViewCartPage().scrollDown();
    }

    @And("Enter email address{string} in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String email) {
        new ViewCartPage().enterEmailAndClickSubmit(email);
    }


    @When("I Click on cart button")
    public void  i_click_on_cart_button() {
        new HomePage().clickOnCartLink();

    }


    @Then("I Verify success message You have been successfully subscribed! is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new ViewCartPage().verifyTextSubscribeSuccess(),"You have been successfully subscribed!","Text  not verify");
    }

    @And("I ignore adds")
    public void iIgnoreAdds() {
        new ProductsPage().avoidAdds();
    }

    @When("I Scroll down to Recommended Items")
    public void iScrollDownToRecommendedItems() {
        new HomePage().scrollDownToRecommendedItems();
    }

    @And("I Click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() {
        new HomePage().clickOnRightArrow();
    }

    @And("I can Verify that page is scrolled up and {string} text is visible on screen")
    public void iCanVerifyThatPageIsScrolledUpAndTextIsVisibleOnScreen(String text) {
        Assert.assertEquals(new HomePage().verifyTextFullFledged(),text);
    }

    @And("I Scroll up page to top")
    public void iScrollUpPageToTop() {
        new HomePage().scrollUp();
    }
}
