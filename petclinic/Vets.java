package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vets {

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Veterinarians;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_Home;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[1]/BUTTON[1]")
    private WebElement button_Togglenavigation;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Owners;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[1]/A[1]")
    private WebElement a_Div_Togglenavigation;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_All;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Register;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/VET-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[1]")
    private WebElement th_Name;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/VET-LIST[1]/TABLE[1]/THEAD[1]/TR[1]/TH[2]")
    private WebElement th_Specialties;

    private WebDriver driver;

    /**
		Page Object for Vets (state31) 
	*/
    public Vets(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ClassUnderTestApogen goToIndex() {
        a_Div_Togglenavigation.click();
        return new ClassUnderTestApogen(driver);
    }
}
