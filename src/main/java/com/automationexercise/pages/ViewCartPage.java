package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewCartPage extends Utility {
    @CacheLookup@FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscribeEmail;
    @CacheLookup@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")WebElement rightArrowButton;
    @CacheLookup@FindBy(xpath = "//*[@id='success-subscribe']")WebElement textSubscribe;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Blue Top']")WebElement textProduct1;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Men Tshirt']")WebElement textProduct2;
    @CacheLookup@FindBy(xpath = "(//p[contains(text(),'Rs. 500')])[1]")WebElement textPrice1;
    @CacheLookup@FindBy(xpath = "(//p[contains(text(),'Rs. 400')])[1]")WebElement textPrice2;
    @CacheLookup@FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[1]")WebElement qty1;
    @CacheLookup@FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[2]")WebElement qty2;
    @CacheLookup@FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")WebElement textTotalPrice1 ;
    @CacheLookup@FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")WebElement textTotalPrice2;
    @CacheLookup@FindBy(xpath = "//button[normalize-space()='4']")WebElement qty4;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Blue Top']")WebElement productName;
    @CacheLookup@FindBy(xpath = "//li[@class='active']")WebElement shoppingCart;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")WebElement proceedToCheckOut;
    @CacheLookup@FindBy(xpath = "//u[normalize-space()='Register / Login']")WebElement registerLoginLink;
    @CacheLookup@FindBy(xpath = "//i[@class='fa fa-times']")WebElement removeProduct;
    @CacheLookup@FindBy(xpath = "//b[normalize-space()='Cart is empty!']")WebElement textEmptyCart;

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",subscribeEmail);
    }
    public void enterEmailAndClickSubmit(String email){
        sendTextToElement(subscribeEmail,email);
        clickOnElement(rightArrowButton);

    }
    public String verifyTextSubscribeSuccess(){
        return getTextFromElement(textSubscribe);
    }
    public String verifyProduct1Text(){
        return getTextFromElement(textProduct1);
    }
    public String verifyProduct2Text(){
        return getTextFromElement(textProduct2);
    }
    public  String verifyPrice1Text(){
      return getTextFromElement(textPrice1);
    }
    public String verifyPrice2Text(){
        return getTextFromElement(textPrice2);
    }
    public String verifyQty1Text(){
        return getTextFromElement(qty1);
    }
    public String verifyQty2Text(){
        return getTextFromElement(qty2);
    }
    public String verifyTotalPrice1(){
        return getTextFromElement(textTotalPrice1);
    }
    public String verifyTotalPrice2(){
        return getTextFromElement(textTotalPrice2);
    }
    public String verifyQty4() {

        return getTextFromElement(qty4);
    }
    public String verifyProductName(){
        return getTextFromElement(productName);
    }
    public String verifyCartPage(){
        return getTextFromElement(shoppingCart);
    }
    public void clickOnProceedToCheckOut(){
        clickOnElement(proceedToCheckOut);
    }
    public void clickOnRegisterLoginLink(){
        clickOnElement(registerLoginLink);
    }
    public void clickOnX(){
        clickOnElement(removeProduct);
    }
    public String verifyTextEmptyCart(){
        return getTextFromElement(textEmptyCart);
    }
    public String verifyTextProductName(){
       return getTextFromElement(productName);
    }

}
