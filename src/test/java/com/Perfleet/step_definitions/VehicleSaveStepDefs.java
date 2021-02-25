package com.Perfleet.step_definitions;

import com.Perfleet.pages.BasePage;
import com.Perfleet.pages.DashboardPage;
import com.Perfleet.utilities.BrowserUtils;
import com.Perfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        String locator = "//a[@title='"+locatorIdentifier+"']";
        WebElement button = Driver.get().findElement(By.xpath(locator));
        button.click();



    }


}
