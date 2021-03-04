package com.Perfleet.step_definitions;

import com.Perfleet.pages.BasePage;
import com.Perfleet.pages.DashboardPage;
import com.Perfleet.pages.VehiclePage;
import com.Perfleet.utilities.BrowserUtils;
import com.Perfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;
import java.util.Set;

public class VehicleSaveStepDefs {

    @Then("the user should be on Create Car page")
    public void the_user_should_be_on_Create_Car_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user fills {string} , {string}")
    public void the_user_fills(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    @Then("the user clicks on {string} element")
    public void the_user_clicks_on_element(String locatorIdentifier) {
        new DashboardPage().waitUntilLoaderScreenDisappear();
        WebElement button = null;

        try {
            String locator = "//a[@title='" + locatorIdentifier + "']";
            button = Driver.get().findElement(By.xpath(locator));
        } catch (NullPointerException e) {
            String locator = "//a[.='" + locatorIdentifier + "']";
            button = Driver.get().findElement(By.xpath(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (button != null) {
            button.click();
        }


    }


    @When("the user clicks on {string}")
    public void the_user_clicks_on(String buttonIdentifier) {

        //new VehiclePage().clickOnButton(buttonIdentifier);

    }


    @When("the user fills in the blanks with data below")
    public void the_user_fills_in_the_blanks_with_data_below(Map<String,String> formData) {
        BrowserUtils.waitFor(5);

        VehiclePage vehiclePage = new VehiclePage();

        Set<String> keySet = formData.keySet();

        for (String s : keySet) {

            vehiclePage.sentKeysToInputBox(s, formData.get(s));

        }



    }



}
