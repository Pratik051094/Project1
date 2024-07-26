package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanEligibilityAndOffer extends DropDown {
	WebDriver driver;

	LoanEligibilityAndOffer(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Accept']")
	private WebDriver accept;

	@FindBy(xpath = "//input[@value='Reject']")
	private WebDriver reject;
}
