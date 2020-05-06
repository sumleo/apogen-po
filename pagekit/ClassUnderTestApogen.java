package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassUnderTestApogen {

    @FindBy(css = "html.tm-background.uk-height-viewport.uk-notouch > body > div.uk-height-viewport.uk-flex.uk-flex-center.uk-flex-middle.uk-text-center > div.tm-container.tm-container-small > form.js-login.js-toggle.uk-form.tm-form > ul.uk-list.uk-contrast > li.uk-margin-small-top > a.uk-link")
    private WebElement a_uklink;

    @FindBy(css = "html.tm-background.uk-height-viewport.uk-notouch > body > div.uk-height-viewport.uk-flex.uk-flex-center.uk-flex-middle.uk-text-center > div.tm-container.tm-container-small > form.js-login.js-toggle.uk-form.tm-form > ul.uk-list.uk-contrast > li:nth-child(1) > label.uk-form > input")
    private WebElement input_remember_me;

    @FindBy(css = "html.tm-background.uk-height-viewport.uk-notouch > body > div.uk-height-viewport.uk-flex.uk-flex-center.uk-flex-middle.uk-text-center > div.tm-container.tm-container-small > form.js-login.js-toggle.uk-form.tm-form > div.uk-panel.uk-panel-box > div.uk-form-row:nth-child(1) > input.uk-form-large.uk-width-1-1")
    private WebElement input_credentialsusername;

    @FindBy(css = "html.tm-background.uk-height-viewport.uk-notouch > body > div.uk-height-viewport.uk-flex.uk-flex-center.uk-flex-middle.uk-text-center > div.tm-container.tm-container-small > form.js-login.js-toggle.uk-form.tm-form > div.uk-panel.uk-panel-box > p.uk-form-row.tm-panel-marginless-bottom > button.uk-button.uk-button-primary.uk-button-large.uk-width-1-1")
    private WebElement button_ukbuttonukbuttonprimaryukbuttonlargeukwidth11;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/UL[1]/LI[2]/A[1]")
    private WebElement a_Requestpassword;

    @FindBy(css = "html.tm-background.uk-height-viewport.uk-notouch > body > div.uk-height-viewport.uk-flex.uk-flex-center.uk-flex-middle.uk-text-center > div.tm-container.tm-container-small > form.js-login.js-toggle.uk-form.tm-form > div.uk-panel.uk-panel-box > div.uk-form-row:nth-child(2) > input.uk-form-large.uk-width-1-1")
    private WebElement input_credentialspassword;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[2]/DIV[1]/P[1]/BUTTON[1]")
    private WebElement button_Resetpassword;

    @FindBy(css = "html.tm-background.uk-height-viewport.uk-notouch > body > div.uk-height-viewport.uk-flex.uk-flex-center.uk-flex-middle.uk-text-center > div.tm-container.tm-container-small > form.js-toggle.uk-form.tm-form.uk-hidden > div.uk-panel.uk-panel-box > div.uk-form-row > input.uk-form-large.uk-width-1-1")
    private WebElement input_email;

    private WebDriver driver;

    /**
		Page Object for Index (index) 
	*/
    public ClassUnderTestApogen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Request goToRequest() {
        button_Resetpassword.click();
        return new Request(driver);
    }

    public void a(String args0, String args1) {
        input_credentialsusername.sendKeys(args0);
        input_credentialspassword.sendKeys(args1);
        button_ukbuttonukbuttonprimaryukbuttonlargeukwidth11.click();
        input_remember_me.click();
        a_uklink.click();
    }

    public void b(String args0) {
        input_email.sendKeys(args0);
        button_ukbuttonukbuttonprimaryukbuttonlargeukwidth11.click();
    }
}
