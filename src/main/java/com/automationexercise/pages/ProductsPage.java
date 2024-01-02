package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends Utility {
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement texAllProducts;
    @CacheLookup@FindBy(id = "cartModal")
    WebElement  listOfProducts;
    @CacheLookup@FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement  viewProduct;
    @CacheLookup@FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")WebElement viewProductOnProductPage;
    @CacheLookup@FindBy(id= "search_product") WebElement  searchProduct;
    @CacheLookup@FindBy(id= "submit_search") WebElement  searchButton;
    @CacheLookup@FindBy(xpath= "(//a[contains(text(),'Add to cart')])[1]") WebElement  addCart;
    @CacheLookup@FindBy(xpath= "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]") WebElement  addCartAgain;
    @CacheLookup@FindBy(xpath= "//button[normalize-space()='Continue Shopping']") WebElement  continueShoppingButton;
    @CacheLookup@FindBy(xpath= "(//h2[contains(text(),'Rs. 400')])[1]") WebElement  secondProduct;
    @CacheLookup@FindBy(xpath= "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]") WebElement  addCart2;
    @CacheLookup@FindBy(xpath= "//u[normalize-space()='View Cart']") WebElement  viewCart;
    @CacheLookup@FindBy(xpath= "//a[normalize-space()='Men']") WebElement  menCategory;
    @CacheLookup@FindBy(xpath= "//a[normalize-space()='Tshirts']") WebElement  tshirtsOption;
    @CacheLookup@FindBy(xpath= "//h2[normalize-space()='Men - Tshirts Products']") WebElement  textMenTshirtsOption;
    @CacheLookup@FindBy(xpath= "//h2[normalize-space()='Brands']") WebElement  textBrand;
    @CacheLookup@FindBy(xpath= "//a[@href='/brand_products/Polo']") WebElement  poloLink;
    public String verifyTextAllProducts(){
        return getTextFromElement(texAllProducts);
    }
    public void verifyTextInProductsList(){
        List<WebElement> productsList = driver.findElements(By.id("cartModal"));
        for (WebElement list :productsList   ) {
            String listA = list.getText();
            System.out.println(listA);
        }
    }
    public void clickOnViewProduct(){
        clickOnElement(viewProduct);
    }
    public void enterProductNameInInputsSearch(String name){
        sendTextToElement(searchProduct,name);
        clickOnElement(searchButton);
    }
    public void mouseHoverAndClickOnAddCart() {
        mouseHoverToElement(addCart);
        clickOnElement(addCartAgain);
    }
    public void clickOnContinueShoppingButton(){
       clickOnElement(continueShoppingButton);
    }
    public void mouseHoverOnSecondProductAndClickOnAddCart(){
       mouseHoverToElement(secondProduct);
       clickOnElement(addCart2);
    }
    public void clickOnViewCart(){
        clickOnElement(viewCart);
    }
    public void clickOnMenOption(){
        clickOnElement(menCategory);
        clickOnElement(tshirtsOption);

    }
    public String verifyTextMenProducts(){
        return getTextFromElement(textMenTshirtsOption);
    }
    public String verifyTextBrands(){
        return getTextFromElement(textBrand);
    }
    public void clickOnPolo( ){
        clickOnElement(poloLink);
    }
    public void avoidAdds( ){
        acceptAlert();
    }
    public void clickOnViewProductOnProductPage(){
        clickOnElement(viewProductOnProductPage);
    }

}
