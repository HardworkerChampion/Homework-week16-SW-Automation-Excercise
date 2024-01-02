package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    @CacheLookup@FindBy(xpath = "//textarea[@name='message']")
    WebElement commentBox;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Place Order']")WebElement placeOrder;
    public void enterCommentAndClickOnPlaceOrder(String comment){
        sendTextToElement(commentBox,comment);
        clickOnElement(placeOrder);
    }

}
