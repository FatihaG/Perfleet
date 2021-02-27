package com.Perfleet.step_definitions;

import com.Perfleet.pages.OdometerPage;
import com.Perfleet.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class OdometerStepDefs {

//public 
    //void
    //void
    
    
    @When("the user selects {int} st option")
    public void the_user_selects_st_option(int index) {
        //public
        //public BrowserUtils.waitFor(3);
        new OdometerPage().clickOnOptionWithIndex(index);


    }

}
