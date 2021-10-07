package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LocatorHelper {

    @FindBy(how = How.CSS, using = "img[src='https://www.sovtech.co.za/wp-content/uploads/sites/29/2019/07/sovtech_logo-2.png']")
    private WebElement imageLogo;

    @FindBy(css = "a[href='https://www.sovtech.co.za/contact-us/']")
    private WebElement contactUsLink;

    @FindBy(name = "your_name")
    private WebElement name;

    @FindBy(id = "hs-form-iframe-0")
    private WebElement formFrame;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "mobilephone")
    private WebElement phoneNumber;

    @FindBy(name = "numemployees")
    private WebElement numOfEmployee;

    @FindBy(name = "message")
    private WebElement message;

    @FindBy(how = How.CSS, using = "input[id*='LEGAL_CONSENT.subscription_type_']")
    private WebElement checkbox;

    @FindBy(how = How.CSS, using = "input[type='submit']")
    private WebElement submitContactUsForm;
}
