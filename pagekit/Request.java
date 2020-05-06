package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request {

    @FindBy(xpath = "/HTML[1]/BODY[1]/FORM[1]/P[2]/BUTTON[1]")
    private WebElement button_Requestpassword;

    @FindBy(xpath = "/HTML[1]/BODY[1]/FORM[1]/P[2]/BUTTON[1]")
    private WebElement button_Requestpassword_1;

    @FindBy(css = "html > body > form.pk-user.pk-user-reset.uk-form.uk-form-stacked.uk-width-medium-1-2.uk-width-large-1-3.uk-container-center > p.uk-form-row > button.uk-button.uk-button-primary.uk-button-large.uk-width-1-1")
    private WebElement button_ukbuttonukbuttonprimaryukbuttonlargeukwidth11;

    @FindBy(css = "html > body > form.pk-user.pk-user-reset.uk-form.uk-form-stacked.uk-width-medium-1-2.uk-width-large-1-3.uk-container-center > div.uk-form-row > input.uk-width-1-1")
    private WebElement input_email;

    private WebDriver driver;

    /**
		Page Object for Request (state2) 
	*/
    public Request(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void t(String args0) {
        input_email.sendKeys(args0);
        button_ukbuttonukbuttonprimaryukbuttonlargeukwidth11.click();
    }
}
