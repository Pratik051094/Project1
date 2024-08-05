package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseYourFlowPage extends DropDown {

	WebDriver driver;

	public ChooseYourFlowPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[2]")
	public WebElement NoButton;

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[1]")
	public WebElement YesButton;

	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement ProceedButton;

	public void FlowPage() throws InterruptedException{
		Thread.sleep(5000);
		NoButton.click();
		Thread.sleep(2000);
		ProceedButton.click();
	}
}
