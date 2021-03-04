package com.Perfleet.pages;

import com.Perfleet.utilities.Driver;
import org.openqa.selenium.By;

public class OdometerPage extends BasePage{



    public void clickOnOptionWithIndex(int index){

        String locator = "//tbody//tr["+index+"]";

        Driver.get().findElement(By.xpath(locator)).click();


    }


}
