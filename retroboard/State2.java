package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class State2 {

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/BUTTON[1]")
    private WebElement button_Letsstart;

    @FindBy(xpath = "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1]")
    private WebElement a_Retrospectedagoodwayo;

    private WebDriver driver;

    /**
		Page Object for State2 (state2) 
	*/
    public State2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Index goToIndex() {
        a_Retrospectedagoodwayo.click();
        return new Index(driver);
    }
}
