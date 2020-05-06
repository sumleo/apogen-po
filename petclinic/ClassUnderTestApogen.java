package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ClassUnderTestApogen {

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Veterinarians;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_Home;

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
		Page Object for Index (index) 
	*/
    public ClassUnderTestApogen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Vets1 goToVets1() {
        a_Veterinarians.click();
        return new Vets1(driver);
    }

    public Owners2 goToOwners2() {
        a_All.click();
        return new Owners2(driver);
    }

    public New1 goToNew1() {
        a_Register.click();
        return new New1(driver);
    }
}
