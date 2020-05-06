package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassUnderTestApogen {

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Goals;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]")
    private WebElement a_$dimeshift;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[1]/INPUT[1]")
    private WebElement input_Demo_Signup_1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[2]/A[1]")
    private WebElement a_Imagelinkwallets;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]")
    private WebElement button_Div_$dimeshift;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[2]/INPUT[1]")
    private WebElement input_Demo_Without_Mouse_Signup;

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

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_Home;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[9]/A[1]")
    private WebElement a_Logout;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]")
    private WebElement a_Signin;

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
		Page Object for Index (index) 
	*/
    public ClassUnderTestApogen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Wallets2 goToWallets2() {
        a_Wallets.click();
        return new Wallets2(driver);
    }

    public State14 goToState14() {
        a_Register.click();
        return new State14(driver);
    }

    public Plans goToPlans() {
        a_Goals.click();
        return new Plans(driver);
    }
}
