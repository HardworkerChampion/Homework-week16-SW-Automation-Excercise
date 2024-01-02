package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchProductPage extends Utility {
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement textSearchedProducts;
    @CacheLookup@FindBy(xpath = "//div[@id='cartModal']")List<WebElement> allProducts;

    public String verifySearchedProducts(){
       return getTextFromElement(textSearchedProducts);
    }
    public void verifyAllProducts(){
        List<WebElement> list = driver.findElements(By.xpath("//div[@id='cartModal']"));
        for (WebElement productList:list  ) {
          String text = productList.getText();
            System.out.println(text);
            
        }
    }
}
