package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UserPage extends Utility {
    @CacheLookup@FindBy(xpath = "//li[10]//a[1]")
    WebElement textUserName;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteButton;
    public String verifyUserName(){
        return getTextFromElement(textUserName);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
}
