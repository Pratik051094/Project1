package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanEligibilityAndOffer extends DropDown {
	WebDriver driver;

	public LoanEligibilityAndOffer(WebDriver driver) {

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[1]")
	private WebElement accept;

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[2]")
	private WebElement reject;
	
	//button[text()='Next']
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement NextBtn;
	
	public void LoanEligibilityAndOffer() throws InterruptedException {
		Thread.sleep(5000);
		accept.click();
		Thread.sleep(5000);
		NextBtn.click();
	}
	
	
}
