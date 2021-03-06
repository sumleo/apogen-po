package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome2 {

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

    private WebDriver driver;

    /**
     * Page Object for Welcome2 (state14)
     */
    public Welcome2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Owners goToOwners() {
        a_All.click();
        return new Owners(driver);
    }
}
