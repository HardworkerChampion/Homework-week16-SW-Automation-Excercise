package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends Utility {
    @CacheLookup@FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement textAccountCreated;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    public String verifyTextAccountCreated(){
        return getTextFromElement(textAccountCreated);

    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
}
