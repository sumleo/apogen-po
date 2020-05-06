package main;

import org.openqa.selenium.WebDriver;
import po_utils.DriverProvider;
import custom_classes.*;

import po_utils.NotInTheRightPageObjectException;
import po_utils.NotTheRightInputValuesException;

public class ClassUnderTestApogen {

	private Object currentPage = null;

	// BOOTSTRAP POINT
	public ClassUnderTestApogen() {
		// start driver and browser
		WebDriver driver = new DriverProvider().getActiveDriver();

		this.currentPage = new po.Index(driver);
	}

	// PO Name: LoginPage
	public void goToState2LoginPage() {
		if (this.currentPage instanceof main.LoginPage) {
			main.LoginPage page = (main.LoginPage) this.currentPage;
			page.button_Letsstart.click();
			this.currentPage = new main.State2(page.driver);
		} else {
			throw new NotInTheRightPageObjectException(
					"goToState2LoginPage: expected main.LoginPage, found "
							+ this.currentPage.getClass().getSimpleName());
		}
	}

}
