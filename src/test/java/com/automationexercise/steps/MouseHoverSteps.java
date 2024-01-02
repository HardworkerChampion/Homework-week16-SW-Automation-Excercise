package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;

public class MouseHoverSteps {
    @And("I Hover over first product and click Add to cart")
    public void iHoverOverFirstProductAndClickAddToCart() {
        new ProductsPage().mouseHoverAndClickOnAddCart();
    }
}
