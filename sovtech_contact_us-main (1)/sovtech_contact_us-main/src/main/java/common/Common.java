package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

    public final static String URL = "https://www.sovtech.co.za";
    private static WebDriverWait wait;

    public static void initializeWaitDriver(WebDriverWait wait) {
        Common.wait = wait;
    }

    public static void goToPage(WebDriver webDriver, WebDriverWait wait, String url, WebElement elementToWaitFor) {
        webDriver.get(url);
        wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
    }

    public static void enterText(WebElement webElement, String text) {
        Common.wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(text);
    }

    public static void buttonClick(WebElement webElement) {
        Common.wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public static void dropdownSelect(WebElement webElement, int index) {
        Common.wait.until(ExpectedConditions.elementToBeClickable(webElement));
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }

    public static void dropdownSelect(WebElement webElement, String option, boolean byValue) {
        Common.wait.until(ExpectedConditions.visibilityOf(webElement));
        Select select = new Select(webElement);
        if (byValue) {
            select.selectByValue(option);
        } else {
            select.selectByVisibleText(option);
        }
    }

}
