package com.automationexercise.steps;

import com.automationexercise.pages.AccountCreatedPage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignUpPage;
import io.cucumber.java.en.And;

public class NewRegistrationSteps {
    @And("I register with {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void iRegisterWith(String username, String emailAddress, String password, String day, String month, String year, String firstName, String lastName, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobile) {
     new LoginPage().enterNameAndEmail(username,emailAddress);
     new LoginPage().clickOnSignUpBtn();
     new SignUpPage().selectGender();
     new SignUpPage().enterPassword(password);
     new SignUpPage().selectDateOfBirth(day,month,year);
     new SignUpPage().selectCheckBoxUser();
     new SignUpPage().selectRecieveOffers();
     new SignUpPage().fillTheRequireDetailsNameToMobileNumber(firstName,lastName,company,address1,address2,country,state,city,zipcode,mobile);
     new SignUpPage().clickOnCreateAccountButton();
     new AccountCreatedPage().clickOnContinueButton();
     new AccountCreatedPage().clickOnLogoutButton();


    }

    @And("I Enter name{string} and email address{string}")
    public void iEnterNameAndEmailAddress(String name, String email) {
        new LoginPage().enterNameAndEmail(name,email);
    }
}
