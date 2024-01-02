package com.automationexercise.steps;

import com.automationexercise.pages.ProductDetailsPage;
import io.cucumber.java.en.And;

public class AddReviewSteps {
    @And("I  Enter name{string}, email{string} and review{string}")
    public void iEnterNameEmailAndReview(String name, String email, String review) {
        new ProductDetailsPage().enterNameEmailAndReview(name,email,review);
    }

    @And("I Click On Submit button")
    public void iClickOnSubmitButton() {
        new ProductDetailsPage().clickOnSubmitButtonOnProductsDetailPage();
    }
}
