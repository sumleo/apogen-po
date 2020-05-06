package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index {

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/BUTTON[1]")
    private WebElement button_Letsstart;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1]")
    private WebElement a_Retrospectedagoodwayo;

    private WebDriver driver;

    /**
		Page Object for Index (index) 
	*/
    public Index(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public State2 goToState2() {
        button_Letsstart.click();
        return new State2(driver);
    }
}
