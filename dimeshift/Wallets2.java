package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wallets2 {

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Goals;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")
    private WebElement a_Register;

    @FindBy(css = "#input_username")
    private WebElement input_input_username;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]")
    private WebElement button_Div_$dimeshift;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]")
    private WebElement input_Signin_Modal_Form_Submit;

    @FindBy(css = "#input_password")
    private WebElement input_input_password;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]")
    private WebElement input_Signin_Modal_Form_Submit_1;


    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1]")
    private WebElement a_Doit;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[9]/A[1]")
    private WebElement a_Logout;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[8]/A[1]")
    private WebElement a_Settings;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2]")
    private WebElement a_Restoreyourpassword;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Wallets;

    private WebDriver driver;

    /**
		Page Object for Wallets2 (state3) 
	*/
    public Wallets2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public State21 goToState21() {
        a_Register.click();
        return new State21(driver);
    }

    public Fillprofile goToFillprofile() {
        a_Doit.click();
        return new Fillprofile(driver);
    }

    public Logout goToLogout() {
        a_Logout.click();
        return new Logout(driver);
    }

    public void signin_modal_form(String args0, String args1) {
        input_input_username.sendKeys(args0);
        input_input_password.sendKeys(args1);
        input_Signin_Modal_Form_Submit.click();
    }
}
