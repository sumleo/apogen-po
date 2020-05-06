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

		this.currentPage = new Index(driver);
	}

	// PO Name: Index
	public void goToState2Index() {
		if (this.currentPage instanceof po.Index) {
			Index page = (Index) this.currentPage;
			page.button_Letsstart.click();
			this.currentPage = new State2(page.driver);
		} else {
			throw new NotInTheRightPageObjectException(
					"goToState2Index: expected po.Index, found "
							+ this.currentPage.getClass().getSimpleName());
		}
	}

	// PO Name: State2
	public void goToIndexState2() {
		if (this.currentPage instanceof po.State2) {
			State2 page = (State2) this.currentPage;
			page.a_Retrospectedagoodwayo.click();
			this.currentPage = new Index(page.driver);
		} else {
			throw new NotInTheRightPageObjectException(
					"goToIndexState2: expected po.State2, found "
							+ this.currentPage.getClass().getSimpleName());
		}
	}

}
