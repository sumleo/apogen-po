package main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fillprofile {

    private WebDriver driver;

    /**
		Page Object for Fillprofile (state13) 
	*/
    public Fillprofile(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
