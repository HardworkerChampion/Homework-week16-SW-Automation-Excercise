package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Utility {
    @CacheLookup@FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;
    @CacheLookup@FindBy(id = "id_gender1")
    WebElement radioButton;
    @CacheLookup@FindBy(id = "password")
    WebElement passwordTextField;
    @CacheLookup@FindBy(xpath = "//select[@id='days']")
    WebElement selectDay;
    @CacheLookup@FindBy(xpath = "//select[@id='months']")
    WebElement selectMonth;
    @CacheLookup@FindBy(xpath = "//select[@id='years']")
    WebElement selectYear;
    @CacheLookup@FindBy(id = "newsletter")
    WebElement checkBoxSignUp;
    @CacheLookup@FindBy(id = "optin")
    WebElement checkBoxRecieveOffer;
    @CacheLookup@FindBy(id = "first_name")
    WebElement firstNameFieldText;
    @CacheLookup@FindBy(id = "last_name")
    WebElement lastNameFieldText;
    @CacheLookup@FindBy(id = "company")
    WebElement companyNameFieldText;
    @CacheLookup@FindBy(id = "address1")
    WebElement address1NameFieldText;
    @CacheLookup@FindBy(id = "address2")
    WebElement address2NameFieldText;
    @CacheLookup@FindBy(id = "country")
    WebElement countryLink;
    @CacheLookup@FindBy(id = "state")
    WebElement stateTextField;
    @CacheLookup@FindBy(id = "city")
    WebElement cityTextField;
    @CacheLookup@FindBy(id = "zipcode")
    WebElement zipCodeTextField;
    @CacheLookup@FindBy(id = "mobile_number")
    WebElement mobileNumberTextField;
    @CacheLookup@FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButton;
    @CacheLookup@FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement textEmailAlreadyExist;
    public String verifyTextEnterAccountInformation(){
        return getTextFromElement(enterAccountInformationText);
    }
    public void selectGender(){
        clickOnElement(radioButton);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordTextField,password);

    }
    public void selectDateOfBirth(String day,String month,String year){
     selectByValueFromDropDown(selectDay,day);
     selectByValueFromDropDown(selectMonth,month);
     selectByValueFromDropDown(selectYear,year);

    }
    public void selectCheckBoxUser(){
        clickOnElement(checkBoxSignUp);
    }
    public void selectRecieveOffers(){
        clickOnElement(checkBoxRecieveOffer);
    }
    public void fillTheRequireDetailsNameToMobileNumber(String firstName,String lastName,String company,String address1,String address2,String country,String state,String city, String zipcode,String mobileNumber){
        sendTextToElement(firstNameFieldText,firstName);
        sendTextToElement(lastNameFieldText,lastName);
        sendTextToElement(companyNameFieldText,company);
        sendTextToElement(address1NameFieldText,address1);
        sendTextToElement(address2NameFieldText,address2);
        selectByValueFromDropDown(countryLink,country);
        sendTextToElement(stateTextField,state);
        sendTextToElement(cityTextField,city);
        sendTextToElement(zipCodeTextField,zipcode);
        sendTextToElement(mobileNumberTextField,mobileNumber);

    }
    public void clickOnCreateAccountButton(){
        clickOnElement(createAccountButton);
    }
public String verifyTextEmailAlreadyExist(){
        return getTextFromElement(textEmailAlreadyExist);
}

}
