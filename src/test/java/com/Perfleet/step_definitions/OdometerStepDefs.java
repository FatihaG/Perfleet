package com.Perfleet.step_definitions;

import com.Perfleet.pages.OdometerPage;
import com.Perfleet.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class OdometerStepDefs {


    @When("the user selects {int} st option")
    //static 
    //public not main
    //public not main
    public void the_user_selects_st_option(int index) {
        BrowserUtils.waitFor(3);
        new OdometerPage().clickOnOptionWithIndex(index);


    }

}
