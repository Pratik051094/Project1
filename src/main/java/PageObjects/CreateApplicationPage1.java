package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateApplicationPage1 extends DropDown {
	WebDriver driver;

	public CreateApplicationPage1(WebDriver driver) {
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

	public void Tenure(String months){
		DrpDnAccess("Tenure (Months)", months);
	}

	public void Createapp1(){
		DealerCodeField.sendKeys("DEASINGA");
		RequestedLoanAmountField.sendKeys("100000");
		Tenure("36");
		// ROI ??
		DeclaredEMIField.sendKeys("1000");
		Saveandnextbutton.click();
	}
}
