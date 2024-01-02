package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {
    @CacheLookup@FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement textTestCases;
    public String verifyTextTestCases(){
        return getTextFromElement(textTestCases);
    }
}
