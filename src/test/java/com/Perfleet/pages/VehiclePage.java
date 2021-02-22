package com.Perfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterButton;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement manageFilter;





}