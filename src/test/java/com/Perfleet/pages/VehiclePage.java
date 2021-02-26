package com.Perfleet.pages;

import com.Perfleet.utilities.BrowserUtils;
import com.Perfleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterButton;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement manageFilter;

    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCarBtn;


    @FindBy(xpath = "//a[@title='Edit Car']")
    public WebElement editCarBtn;






    public void sentKeysToInputBox(String inputBoxName , String value) {



        String locatorOfInputBox = "//label[contains(.,'"+inputBoxName+"')]/../..//input";

        WebElement inputBox = Driver.get().findElement(By.xpath(locatorOfInputBox));
        inputBox.click();
        inputBox.sendKeys(Keys.CLEAR);
        inputBox.sendKeys(value);

        BrowserUtils.waitFor(1);

    }












}