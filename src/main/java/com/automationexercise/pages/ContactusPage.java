package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends Utility {
@CacheLookup@FindBy(xpath = "//h2[normalize-space()='Get In Touch']") WebElement textGetInTouch;
@CacheLookup@FindBy(xpath = "//input[@placeholder='Name']") WebElement nameTextField;
@CacheLookup@FindBy(xpath = "//input[@placeholder='Email']") WebElement emailTextField;
@CacheLookup@FindBy(xpath = "//input[@placeholder='Subject']") WebElement subjectTextField;
@CacheLookup@FindBy(xpath = "//textarea[@id='message']") WebElement messageTextField;
@CacheLookup@FindBy(xpath = "//input[@name='upload_file']") WebElement uploadFileLink;
@CacheLookup@FindBy(xpath = "//input[@name='submit']") WebElement submitButton;
@CacheLookup@FindBy(xpath = "//div[@class='status alert alert-success']") WebElement textSuccessMessage;
@CacheLookup@FindBy(xpath = "//a[contains(text(),'Home')]") WebElement homeLink;
public String  verifyTextGetInTouch(){return getTextFromElement(textGetInTouch);}
    public void enterName(String name){sendTextToElement(nameTextField,name);}
    public void enterEmail(String email){sendTextToElement(emailTextField,email);}
    public void enterSubject(String subject){sendTextToElement(subjectTextField,subject);}
    public void enterMessage(String msg){sendTextToElement(messageTextField,msg);}
    public void uploadFile(String path){uploadTheFile(uploadFileLink,path);}
    public void clickOnSubmitButton(){clickOnElement(submitButton);}
    public void clickOnOkButton(){
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    public String verifySuccessMessage(){
    return getTextFromElement(textSuccessMessage);
    }
    public void clickOnHomeLink(){
    clickOnElement(homeLink);
    }
}
