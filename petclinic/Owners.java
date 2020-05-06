package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Owners {

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Owners;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_All;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[1]")
    private WebElement th_Name;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Register;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[4]")
    private WebElement th_Telephone;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Veterinarians;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[2]")
    private WebElement th_Address;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_Home;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[1]/BUTTON[1]")
    private WebElement button_Togglenavigation;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[5]")
    private WebElement th_Pets;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[1]/A[1]")
    private WebElement a_Div_Togglenavigation;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-list.ng-scope.ng-isolate-scope > form.ng-pristine.ng-valid > div.form-group > input.form-control.ng-pristine.ng-untouched.ng-valid.ng-empty")
    private WebElement input_formcontrolngpristinenguntouchedngvalidngempty;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[3]")
    private WebElement th_City;

    private WebDriver driver;

    /**
		Page Object for Owners (state18) 
	*/
    public Owners(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ClassUnderTestApogen goToIndex() {
        a_Div_Togglenavigation.click();
        return new ClassUnderTestApogen(driver);
    }

    public void setA_Register(String args0) {
        input_formcontrolngpristinenguntouchedngvalidngempty.sendKeys(args0);
    }
}
