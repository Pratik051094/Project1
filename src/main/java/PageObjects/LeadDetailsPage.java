package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadDetailsPage {

	@FindBy(xpath = "(//input[@class='slds-input'])[2]")
	private WebElement fstName;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	private WebElement mobile;

	@FindBy(xpath = "(//input[@class='slds-input'])[12]")
	private WebElement pinCode;

	@FindBy(xpath = "//button[@aria-label='Lead Source']")
	private WebElement source;

	@FindBy(xpath = "//button[@aria-label='Lead Disposition']")
	private WebDriver leadDisp;

	@FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
	private WebDriver snp;

}
