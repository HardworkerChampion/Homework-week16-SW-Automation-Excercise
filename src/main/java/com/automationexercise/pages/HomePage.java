package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement loginLink;
    @CacheLookup@FindBy(xpath = "//a[normalize-space()='Contact us']") WebElement contactUsLink;
    @CacheLookup@FindBy(xpath = "//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']") WebElement testcasesbutton;
    @CacheLookup@FindBy(xpath = "//a[@href='/products']") WebElement productsLink;
    @CacheLookup@FindBy(id = "susbscribe_email") WebElement subscribe;
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='Subscription']") WebElement textSubscribe;
    @CacheLookup@FindBy(id = "subscribe") WebElement rightArrowButton;
        @CacheLookup@FindBy(xpath = "//a[normalize-space()='Cart']") WebElement cartLink;
        @CacheLookup@FindBy(xpath = "(//a[contains(text(),'View Product')])[1]") WebElement viewProduct;
        @CacheLookup@FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]") WebElement addCart;
        @CacheLookup@FindBy(xpath = "//u[normalize-space()='View Cart']")WebElement viewCart;
        @CacheLookup@FindBy(xpath = "//h2[normalize-space()='Category']")WebElement category;
        @CacheLookup@FindBy(xpath = "//a[normalize-space()='Women']")WebElement women;
        @CacheLookup@FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")WebElement dressOption;
        @CacheLookup@FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")WebElement textWomenCategory;
        @CacheLookup@FindBy(xpath = "//h2[normalize-space()='recommended items']")WebElement textRecommendedItems;
        @CacheLookup@FindBy(xpath = "//i[@class='fa fa-angle-up']")WebElement rightArrow;
        @CacheLookup@FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")WebElement textFullFledged;
    @CacheLookup
    @FindBy (xpath = "//div[@id = 'recommended-item-carousel']//div[@class = 'productinfo text-center']/p")
    List<WebElement> recommendedItemsProductsList;

        public void clickOnLoginLink(){
            clickOnElement(loginLink);
        }
    public void clickOnContactUs(){clickOnElement(contactUsLink);}
    public void clickOnTestCasesButton(){clickOnElement(testcasesbutton);}
    public void clickOnProductsLink(){clickOnElement(productsLink);}
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",subscribe);
    }
    public String verifyTextSubscription(){
        return getTextFromElement(textSubscribe);
    }
    public void enterEmailAddress(String email){
        sendTextToElement(subscribe,email);

    }
    public void clickOnRightArrowButton(){
        clickOnElement(rightArrowButton);
    }
    public String verifyTextSubscribeSuccess(){
    Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        return alert.getText();

        }
        public void clickOnCartLink(){
            clickOnElement(cartLink);
        }
        public void clickOnViewProduct(){
            clickOnElement(viewProduct);
        }
        public void addProductInCart(){
            clickOnElement(addCart);
        }
        public void clickOnViewCart(){
            clickOnElement(viewCart);
        }
        public String verifyTextCategory(){
            return getTextFromElement(category);
        }
        public void clickOnWomen(){
            clickOnElement(women);
        }
        public void clickOnDressOption(){
            clickOnElement(dressOption);
        }
        public String verifyTextWomenDress(){
            return getTextFromElement(textWomenCategory);
        }
       public String verifyNavigateToPage(){
            return driver.getCurrentUrl();

       }
       public String verifyTextRecommendedItems(){
            return getTextFromElement(textRecommendedItems);
       }
       public void clickAddToCartOnRecommendedItems(String pName){
           for (WebElement pr : recommendedItemsProductsList ) {
               if (pr.getText().equalsIgnoreCase(pName)){
                   pr.click();

                   break;
               }
               
           }
       }
    public void scrollDownToRecommendedItems(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",textRecommendedItems);
    }
    public void clickOnRightArrow(){
            clickOnElement(rightArrow);
    }
    public String verifyTextFullFledged(){
            return getTextFromElement(textFullFledged);
    }
    public void scrollUp(){

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,400)");
    }

}

