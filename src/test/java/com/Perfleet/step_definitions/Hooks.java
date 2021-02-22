package com.Perfleet.step_definitions;

import com.Perfleet.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
    public class LoginStepDefs{
        @Given("the user is on the login page")
        public void the_user_is_on_the_login_page() throws InterruptedException {
            Thread.sleep(5000);
            System.out.println("I open the browser and navigate to perfleet login page");
        }
        @When("the user enters the driver information")
        public void the_user_enters_the_driver_information() throws InterruptedException {
                Thread.sleep(3000);
                System.out.println("I write down driver information");
        }
        @Then("the user should be able to login")
        public void the_user_should_be_able_to_login() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("I should be able to login");
        }
    }
}
