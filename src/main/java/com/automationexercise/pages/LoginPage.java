package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameFieldText;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailFieldText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signUpBtnLink;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement textLoginToYourAccount;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailAddress;
    @CacheLookup@FindBy(xpath = "//input[@placeholder='Password']")WebElement logingPassword;
    @CacheLookup@FindBy(xpath = "//button[normalize-space()='Login']")WebElement loginButton;
    @CacheLookup@FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")WebElement errorMessage;
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='New User Signup!']")WebElement textNewUserSignUp;


    public String verifyTextNewUserSignup() {
        return getTextFromElement(newUserText);
    }

    public void enterNameAndEmail(String name, String email) {
        sendTextToElement(nameFieldText, name);
        sendTextToElement(emailFieldText, email);
    }

    public void clickOnSignUpBtn() {
        clickOnElement(signUpBtnLink);
    }

    public String verifyTextLoginToYourAccount() {
        return getTextFromElement(textLoginToYourAccount);
    }
    public void enterLoginDetails(String email,String password){
        sendTextToElement(loginEmailAddress,email);
        sendTextToElement(logingPassword,password);

    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String verifyErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public String verifyTextNewUserSignUp(){
        return getTextFromElement(textNewUserSignUp);
    }

}