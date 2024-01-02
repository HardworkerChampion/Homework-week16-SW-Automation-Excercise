package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisrationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        
    }

    @When("Click on SignupLogin button")
    public void clickOnSignupLoginButton() {
        new HomePage().clickOnLoginLink();
    }

    @And("I Verify New User Signup! is visible")
    public void iVerifyNewUserSignupIsVisible() {
        Assert.assertEquals(new LoginPage().verifyTextNewUserSignup(),"New User Signup!","Text not verify");
    }

    @And("I Enter name and email address")
    public void iEnterNameAndEmailAddress() {
     new LoginPage().enterNameAndEmail("John","john456@gmail.com");
    }

    @And("I Click Signup button")
    public void iClickSignupButton() {
        new LoginPage().clickOnSignUpBtn();
    }

    @And("I Can see ENTER ACCOUNT INFORMATION is visible")
    public void iCanSeeENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertEquals(new SignUpPage().verifyTextEnterAccountInformation(),"ENTER ACCOUNT INFORMATION","Text not visible");

    }
    @And("I Fill details: Title, {string}, {string},{string},{string}")
    public void iFillDetailsTitle(String password, String date, String month, String year) {
        new SignUpPage().selectGender();
        new SignUpPage().enterPassword(password);
        new SignUpPage().selectDateOfBirth(date,month,year);
    }

//    @And("I Fill details: Title, Name, Email, Password, Date of birth")
//    public void iFillDetailsTitleNameEmailPasswordDateOfBirth(String Name) {
//     new SignUpPage().selectGender();
//     new SignUpPage().enterPassword("John12345");
//     new SignUpPage().selectDateOfBirth("8","4","1991");
//    }


    @And("I Select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new SignUpPage().selectCheckBoxUser();
    }

    @And("I Select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new SignUpPage().selectRecieveOffers();
    }


    @And("I Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void iFillDetails(String firstName, String lastName, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobile) {
        new SignUpPage().fillTheRequireDetailsNameToMobileNumber(firstName,lastName,company,address1,address2,country,state,city,zipcode,mobile);
    }

    @And("I Click Create Account button")
    public void iClickCreateAccountButton() {
        new SignUpPage().clickOnCreateAccountButton();
    }

    @And("I can see that ACCOUNT CREATED! is visible")
    public void iCanSeeThatACCOUNTCREATEDIsVisible() {
        Assert.assertEquals(new AccountCreatedPage().verifyTextAccountCreated(),"ACCOUNT CREATED!","Text not visible");
    }

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new AccountCreatedPage().clickOnContinueButton();
    }

    @And("I can see  that Logged in as {string} is visible")
    public void iCanSeeThatLoggedInAsUsernameIsVisible(String username) {
        Assert.assertTrue(new UserPage().verifyUserName().contains(username),"Name is not verify");
    }

    @And("I Click Delete Account button")
    public void iClickDeleteAccountButton() {
        new UserPage().clickOnDeleteButton();
    }

    @Then("I can see that ACCOUNT DELETED! is visible")
    public void iCanSeeThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        Assert.assertEquals(new DeleteAccountPage().verifyAccountDeleteText(),"ACCOUNT DELETED!","text not verify");
    }

    @And("click Continue button")
    public void clickContinueButton() {
        new DeleteAccountPage().clickOnContinueButton();
    }

    @And("I can see Login to your account is visible")
    public void iCanSeeLoginToYourAccountIsVisible() {
        Assert.assertEquals(new LoginPage().verifyTextLoginToYourAccount(),"Login to your account");
    }


    @And("I Enter correct {string} and {string}")
    public void iEnterCorrectAnd(String email, String password) {
        new LoginPage().enterLoginDetails(email,password);
    }

    @And("I Click login button")
    public void iClickLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I Enter incorrect email address{string}  and password{string}")
    public void iEnterIncorrectEmailAddressAndPassword(String emailAddress, String password) {
        new LoginPage().enterLoginDetails(emailAddress,password);
    }

    @Then("I can see the errorMessage")
    public void iCanSeeTheErrorMessage() {
        Assert.assertEquals(new LoginPage().verifyErrorMessage(),"Your email or password is incorrect!","Text not verify");
    }

    @And("I Click Logout button")
    public void iClickLogoutButton() {
        new AccountCreatedPage().clickOnLogoutButton();
    }

    @And("I can see the New User Signup! is visible")
    public void iCanSeeTheNewUserSignupIsVisible() {
        Assert.assertEquals(new LoginPage().verifyTextNewUserSignUp(),"New User Signup!","No such Text");
    }

    @And("I Enter name{string} and already registered email address{string}")
    public void iEnterNameAndAlreadyRegisteredEmailAddress(String name, String email) {
        new LoginPage().enterNameAndEmail(name,email);
    }

    @Then("I ca see error Email Address already exist! is visible")
    public void iCaSeeErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertEquals(new SignUpPage().verifyTextEmailAlreadyExist(),"Email Address already exist!","text not display");
    }

    @When("I Click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new HomePage().clickOnTestCasesButton();
    }

    @And("I can see the test cases page successfully")
    public void iCanSeeTheTestCasesPageSuccessfully() {
        Assert.assertEquals(new TestCasesPage().verifyTextTestCases(),"TEST CASES","message not verify");
    }

    @When("Click on Products button")
    public void clickOnProductsButton()  {
        new HomePage().clickOnProductsLink();

    }

    @And("I Click on View Product of first product")
    public void iClickOnViewProductOfFirstProduct() {
        new ProductsPage().clickOnViewProduct();
    }





    @And("I Create account with username{string},emailAddress{string},password{string},day{string},month{string},year{string},firstName{string},lastName{string},company{string},addressone {string},addresstwo {string},country{string},state{string},city{string},zipcode{string},mobile{string}")
    public void iCreateAccountWithUsernameEmailAddressPasswordDayMonthYearFirstNameLastNameCompanyAddressoneAddresstwoCountryStateCityZipcodeMobile(String username, String emailAddress, String password, String day, String month, String year, String firstName, String lastName, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobile) {
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
    }
}
