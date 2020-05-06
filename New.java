package po_apogen;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import po.Welcome1;

public class New {

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-FORM[1]/FORM[1]/DIV[6]/BUTTON[1]")
    private WebElement button_Submit;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Owners;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_All;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]")
    private WebElement a_Register;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-form.ng-scope.ng-isolate-scope > form.ng-pristine.ng-invalid.ng-invalid-required > div.form-group:nth-child(6) > button.btn.btn-default")
    private WebElement button_btnbtndefault;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-form.ng-scope.ng-isolate-scope > form.ng-pristine.ng-invalid.ng-invalid-required > div.form-group:nth-child(5) > input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")
    private WebElement input_telephone;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[3]/A[1]")
    private WebElement a_Veterinarians;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[2]/UL[1]/LI[1]/A[1]")
    private WebElement a_Home;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[1]/BUTTON[1]")
    private WebElement button_Togglenavigation;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/OWNER-FORM[1]/FORM[1]/DIV[6]/BUTTON[1]")
    private WebElement button_Submit_1;

    @FindBy(xpath = "/HTML[1]/BODY[1]/LAYOUT-NAV[1]/NAV[1]/DIV[1]/A[1]")
    private WebElement a_Div_Togglenavigation;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-form.ng-scope.ng-isolate-scope > form.ng-pristine.ng-invalid.ng-invalid-required > div.form-group:nth-child(2) > input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")
    private WebElement input_lastName;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-form.ng-scope.ng-isolate-scope > form.ng-pristine.ng-invalid.ng-invalid-required > div.form-group:nth-child(3) > input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")
    private WebElement input_address;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-form.ng-scope.ng-isolate-scope > form.ng-pristine.ng-invalid.ng-invalid-required > div.form-group:nth-child(1) > input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")
    private WebElement input_firstName;

    @FindBy(css = "html.ng-scope > body.container > div.container-fluid > div.container.xd-container > div.ng-scope > ui-view.ng-scope > owner-form.ng-scope.ng-isolate-scope > form.ng-pristine.ng-invalid.ng-invalid-required > div.form-group:nth-child(4) > input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")
    private WebElement input_city;

    private WebDriver driver;

    /**
		Page Object for New (state13) 
	*/
    public New(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Welcome1 goToWelcome1() {
        a_Div_Togglenavigation.click();
        return new Welcome1(driver);
    }

    public void ng-pristine ng-invalid ng-invalid-required(String args0, String args1, String args2, String args3, String args4) {
        input_firstName.sendKeys(args0);
        input_lastName.sendKeys(args1);
        input_address.sendKeys(args2);
        input_city.sendKeys(args3);
        input_telephone.sendKeys(args4);
        button_btnbtndefault.click();
    }
}
