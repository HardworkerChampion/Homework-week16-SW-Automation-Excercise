package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {
    @CacheLookup@FindBy(xpath = "//input[@name='name_on_card']")
    WebElement name;
    @CacheLookup@FindBy(xpath = "//input[@name='name_on_card']")
    WebElement cardNumber;
    @CacheLookup@FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvc;
    @CacheLookup@FindBy(xpath = "//input[@placeholder='MM']")
    WebElement month;
    @CacheLookup@FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement year;
    @CacheLookup@FindBy(id = "submit")
    WebElement payAndConfirmButton;
    @CacheLookup@FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement successMessage;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoice;


    public void enterPaymentDetails(String enterName, String cardNumber1, String CV, String mm, String yy){
        sendTextToElement(name,enterName);
        sendTextToElement(cardNumber,cardNumber1);
        sendTextToElement(cvc,CV);
        sendTextToElement(month,mm);
        sendTextToElement(year,yy);

    }
    public void clickOnPayAndConfirmButton(){
        clickOnElement(payAndConfirmButton);
    }
public String verifySuccessMessageOrderPlaced(){
        return getTextFromElement(successMessage);
}
public void clickOnDownloadInvoice(){
        clickOnElement(downloadInvoice);
}
}
