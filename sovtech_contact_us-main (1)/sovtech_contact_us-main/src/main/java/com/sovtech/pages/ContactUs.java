package com.sovtech.pages;

import common.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocatorHelper;

public class ContactUs {

    private LocatorHelper locatorHelper;
    private WebDriver driver;
    private WebDriverWait wait;

    public ContactUs(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 60);
        locatorHelper = PageFactory.initElements(this.driver, LocatorHelper.class);
        Common.initializeWaitDriver(this.wait);
    }

    public void goTo() {
        Common.goToPage(this.driver, this.wait, Common.URL, locatorHelper.getImageLogo());
    }

    public void navigateToContactUs() {
        Common.buttonClick(locatorHelper.getContactUsLink());
    }

    public void captureForm(String name, String email, String phoneNumber, int index, String message) {
        driver.switchTo().frame(locatorHelper.getFormFrame());
        Common.enterText(locatorHelper.getName(), name);
        Common.enterText(locatorHelper.getEmail(), email);
        Common.enterText(locatorHelper.getPhoneNumber(), phoneNumber);
        Common.dropdownSelect(locatorHelper.getNumOfEmployee(), index >= 0 && index <= 6 ? index : 0);
        Common.enterText(locatorHelper.getMessage(), message);
    }

    // method overloading
    public void captureForm(String name, String email, String phoneNumber, String option, boolean byValue, String message) {
        Common.enterText(locatorHelper.getName(), name);
        Common.enterText(locatorHelper.getEmail(), email);
        Common.enterText(locatorHelper.getPhoneNumber(), phoneNumber);
        Common.dropdownSelect(locatorHelper.getNumOfEmployee(), option, byValue);
        Common.enterText(locatorHelper.getMessage(), message);
    }

    public void clickCheckBox() {
        Common.buttonClick(locatorHelper.getCheckbox());
    }

    public void submitForm() {
        Common.buttonClick(locatorHelper.getSubmitContactUsForm());
    }
}
