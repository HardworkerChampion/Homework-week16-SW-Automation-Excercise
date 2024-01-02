package com.automationexercise.steps;

import com.automationexercise.pages.ContactusPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactusSteps {
    @When("I Click on Contact Us button")
    public void iClickOnContactUsButton() {
        new HomePage().clickOnContactUs();

    }

    @And("I can see GET IN TOUCH is visible")
    public void iCanSeeGETINTOUCHIsVisible() {
        Assert.assertEquals(new ContactusPage().verifyTextGetInTouch(),"GET IN TOUCH","message not verify");
    }

    @And("I Enter name{string}, email{string}, subject{string} and message{string}")
    public void iEnterNameEmailSubjectAndMessage(String name, String email, String subject, String message) {
        new ContactusPage().enterName(name);
        new ContactusPage().enterEmail(email);
        new ContactusPage().enterSubject(subject);
        new ContactusPage().enterMessage(message);
    }

    @And("I Upload file{string}")
    public void iUploadFile(String path) {
        new ContactusPage().uploadFile(path);
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        new ContactusPage().clickOnSubmitButton();
    }

    @And("I Click OK button")
    public void iClickOKButton() {
        new ContactusPage().clickOnOkButton();
    }

    @And("I can see  success message Success! Your details have been submitted successfully. is visible")
    public void iCanSeeSuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertEquals(new ContactusPage().verifySuccessMessage(),"Success! Your details have been submitted successfully.");
    }

    @Then("I Click Home button and verify that landed to home page successfully")
    public void iClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        new ContactusPage().clickOnHomeLink();
    }
}
