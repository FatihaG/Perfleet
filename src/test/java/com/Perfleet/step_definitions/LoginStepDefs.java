package com.Perfleet.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
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

        @Then("the driver should be able to login")
        public void the_driver_should_be_able_to_login() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("I should be able to login");
        }

        @When("the user enters the sales manager information")
        public void the_user_enters_the_sales_manager_information() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("I write down sales manager information");

        }

        @Then("the sales manager should be able to login")
        public void the_sales_manager_should_be_able_to_login() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("I should be able to login");
        }

        @When("the user enters the store manager information")
        public void the_user_enters_the_store_manager_information() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("I write down store manager information");

        }
        @Then("the store manager should be able to login")
        public void the_store_manager_should_be_able_to_login() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("I should be able to login");
        }
}
