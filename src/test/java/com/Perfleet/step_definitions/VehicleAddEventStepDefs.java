package com.Perfleet.step_definitions;

import com.Perfleet.pages.CreateCalendarEventsPage;
import com.Perfleet.pages.DashboardPage;
import com.Perfleet.pages.VehicleDetailPage;
import com.Perfleet.utilities.BrowserUtils;
import com.Perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VehicleAddEventStepDefs {

    @When("the user selects the vehicle with licence plate {string}")
    public void the_user_selects_the_vehicle_with_licence_plate(String licencePlate) throws Exception {
        String locator = "//td[.='" + licencePlate + "']";
        //BrowserUtils.waitFor(5);
        Thread.sleep(4000);


        try {
            Driver.get().findElement(By.xpath("//button[@title='close']")).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            // throw new Exception("sacmalama");
        }
        Driver.get().findElement(By.xpath(locator)).click();

        VehicleDetailPage vehicleDetailPage = new VehicleDetailPage();
        String actualSubtitle = vehicleDetailPage.subtitle.getText();

        Assert.assertTrue("expected that subtitle contains licence plate, but not found", actualSubtitle.contains(licencePlate));


    }

    @When("the user clicks on Add Event button")
    public void the_user_clicks_on_Add_Event_button() throws InterruptedException {

        VehicleDetailPage vehicleDetailPage = new VehicleDetailPage();
        //BrowserUtils.waitFor(4);
        Thread.sleep(4000);
        vehicleDetailPage.addEventButton.click();

    }

    @Then("the user verifies add event page")
    public void the_user_verifies_add_event_page() throws InterruptedException {
        //BrowserUtils.waitFor(6);
        Thread.sleep(4000);
        Assert.assertEquals("add event wimdow cannot found", "Add Event", new VehicleDetailPage().addEventWindowTitle.getText());
    }

    @When("the user fills title as {string} and description as {string}")
    public void the_user_fills_title_as_and_description_as(String title, String description) {

        VehicleDetailPage vehicleDetailPage = new VehicleDetailPage();

        vehicleDetailPage.titleInputBox.sendKeys(title);


        Driver.get().switchTo().frame(new VehicleDetailPage().descriptionIframe);
        BrowserUtils.waitFor(2);
        vehicleDetailPage.descriptionInputBox.sendKeys(description);
        Driver.get().switchTo().defaultContent();

    }

    @When("the user clicks on save button")
    public void the_user_clicks_on_save_button() {
        new VehicleDetailPage().addEventSaveButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should see {string} message")
    public void the_user_should_see_message(String message) {

        String actualSuccessMessage = new VehicleDetailPage().successMessage.getText();

        Assert.assertEquals("success message is not present or not matching", message, actualSuccessMessage);

    }


    @Given("open the url page")
    public void openTheUrlPage() {

    }

    @When("user write to user name and password")
    public void userWriteToUserNameAndPassword() {

    }

    @And("user should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() {

    }

    @Then("{string} select any car on grid button")
    public void selectAnyCarOnGridButton(String arg0) {

    }

    @And("{string} should be able to add event")
    public void shouldBeAbleToAddEvent(String arg0) {

    }

    @When("{string} updated general information page")
    public void updatedGeneralInformationPage(String arg0) {

    }

    @Then("{string} should see update in both general information page")
    public void shouldSeeUpdateInBothGeneralInformationPage(String arg0) {

    }

    @And("{string} should see update activity tab related add event")
    public void shouldSeeUpdateActivityTabRelatedAddEvent(String arg0) {
    }

    @And("the user should check the {string} checkbox")
    public void theUserShouldCheckTheCheckbox(String checkboxLabelName) {

        //new CreateCalendarEventsPage().checkTheCheckBox(checkboxLabelName);
    }
}
