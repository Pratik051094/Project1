package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateApplicationPage1 {
	WebDriver driver;

	CreateApplicationPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='slds-input'])[1]")
	public WebElement DealerCodeField;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	public WebElement RequestedLoanAmountField;

	@FindBy(xpath = "//button[@name='Tenure']")
	public WebElement TenureMonthsDropdown;

	@FindBy(xpath = "(//input[@class='slds-input'])[8]")
	public WebElement DeclaredEMIField;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;

	@FindBy(xpath = "//button[text()='Back']")
	public WebElement Backbutton;

}
