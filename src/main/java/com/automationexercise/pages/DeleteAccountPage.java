package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends Utility {
    @CacheLookup@FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement textAccountDelete;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;
    public String verifyAccountDeleteText(){
        return getTextFromElement(textAccountDelete);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
