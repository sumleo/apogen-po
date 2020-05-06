package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class State14 {

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Goals;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]")
    private WebElement input_Registration_Modal_Form_Submit_1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]")
    private WebElement a_Signin_1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]")
    private WebElement input_Registration_Modal_Form_Submit;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[1]/INPUT[1]")
    private WebElement input_Demo_Signup_1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[2]/A[1]")
    private WebElement a_Imagelinkwallets;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]")
    private WebElement button_Div_$dimeshift;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[2]/INPUT[1]")
    private WebElement input_Demo_Without_Mouse_Signup;

    @FindBy(css = "#input_login")
    private WebElement input_input_login;

    @FindBy(css = "#input_password")
    private WebElement input_input_password;


    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[2]/INPUT[1]")
    private WebElement input_Demo_Without_Mouse_Signup_1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]")
    private WebElement a_Register;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[1]/INPUT[1]")
    private WebElement input_Demo_Signup;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1]")
    private WebElement a_Doit;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[3]/A[1]")
    private WebElement a_Imagelinkagpl;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[9]/A[1]")
    private WebElement a_Logout;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]")
    private WebElement a_Signin;

    @FindBy(css = "#input_email")
    private WebElement input_input_email;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[8]/A[1]")
    private WebElement a_Settings;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]")
    private WebElement a_Li_Li_Li_Li_Li_Li_Li_Li_Li_Li_Ul_Homewa;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/A[1]")
    private WebElement a_Imagelink1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[4]/A[1]")
    private WebElement a_Imagelink2;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Wallets;

    private WebDriver driver;

    /**
		Page Object for State14 (state14) 
	*/
    public State14(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Wallets1 goToWallets1() {
        a_Wallets.click();
        return new Wallets1(driver);
    }

    public void registration_modal_form(String args0, String args1, String args2) {
        input_input_login.sendKeys(args0);
        input_input_email.sendKeys(args1);
        input_input_password.sendKeys(args2);
        input_Registration_Modal_Form_Submit.click();
    }
}
