package com.Perfleet.step_definitions;

import com.Perfleet.pages.CampaignPage;
import com.Perfleet.utilities.BrowserUtils;
import com.Perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class CampaignStepDefs {


    @When("click on {string} button")
    public void click_on_button(String identifier) {

        new CampaignPage().clickButton(identifier);

    }


    @Then("subtitle should changed to {string}")
    public void subtitleShouldChangedTo(String expectedSubtitle) {

        WebDriverWait webDriverWait = new WebDriverWait(Driver.get(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(new CampaignPage().pageSubTitle));

        BrowserUtils.waitFor(3);

        String actualSubTitle = new CampaignPage().pageSubTitle.getText();
        Assert.assertEquals(expectedSubtitle,actualSubTitle);
    }

    @When("the user fills {string} field with {string} value")
    public void theUserFillsFieldWithValue(String label, String value) {

        new CampaignPage().sentKeysToInputBox(label,value);

        //String actualText = new CampaignPage().getInputBoxByName(label).getText();

       // Assert.assertEquals(value,actualText);

    }


    @Then("there should be NO warning message under {string} input box")
    public void thereShouldBeNOWarningMessageUnderInputBox(String label) {

        boolean ifValidationMessageExist = new CampaignPage().findIfValidationMessageExist(label);

        Assert.assertFalse(ifValidationMessageExist);

    }

    @And("the user delete the keys in {string} input box")
    public void theUserDeleteTheKeysInInputBox(String label) {

        new CampaignPage().getInputBoxByLabelName(label).click();
        new CampaignPage().getInputBoxByLabelName(label).clear();

        BrowserUtils.waitFor(1);
    }

    @Then("there should be {string} under {string}")
    public void thereShouldBeUnder(String arg0, String arg1) {
    }
}
