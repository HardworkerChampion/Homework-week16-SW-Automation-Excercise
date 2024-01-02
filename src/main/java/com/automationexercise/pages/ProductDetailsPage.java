package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement category;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement availability;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement condition;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement brand;
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addCart;
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCart;
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")WebElement textPolo;
    @CacheLookup@FindBy(xpath = "//a[@href='/brand_products/Madame']")WebElement brandMadameLink;
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='Brand - Madame Products']")WebElement textMadameLink;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Write Your Review']")WebElement textRightYourView;
    @CacheLookup@FindBy(xpath = "//input[@id='name']")WebElement yourName;
    @CacheLookup@FindBy(xpath = "//textarea[@id='review']")WebElement yourReview;
    @CacheLookup@FindBy(id = "email")WebElement yourEmail;
    @CacheLookup@FindBy(xpath = "//textarea[@id='review']")WebElement submitButton;
    @CacheLookup@FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")WebElement textReviewSuccessMesage;



    public String getTitleOfPage() {
        String a = driver.getTitle();
        System.out.println(a);
        return a;
    }

    public String verifyProductName() {return getTextFromElement(productName);}

    public String verifyCategory() {return getTextFromElement(category);}
    public String verifyPrice() {return getTextFromElement(price);}
    public String verifyAvailability() {return getTextFromElement(availability);}
    public String verifyCondition() {return getTextFromElement(condition);}
    public String verifyBrand() {return getTextFromElement(brand);}
    public void increaseQuantity(String qty){
        clearTextFromField(quantity);
        sendTextToElement(quantity,qty);
    }
    public void clickOnAddCart(){
        clickOnElement(addCart);
    }
    public void clickOnViewCart(){
        clickOnElement(viewCart);
    }
    public String verifyTextPolo(){
        return getTextFromElement(textPolo);
    }
    public void clickOnMadameBrandLink(){
        clickOnElement(brandMadameLink);
    }
    public String verifyTextMadame(){
        return getTextFromElement(textMadameLink);
    }
    public String verifyTextWriteYourReview(){
       return getTextFromElement(textRightYourView);
    }
    public void enterNameEmailAndReview(String name,String email,String review){
        sendTextToElement(yourName,name);
        sendTextToElement(yourEmail,email);
        sendTextToElement(yourReview,review);
    }
    public void clickOnSubmitButtonOnProductsDetailPage(){
        clickOnElement(submitButton);

    }
    public String textSuccessMessage(){
        return getTextFromElement(textReviewSuccessMesage);
    }

}