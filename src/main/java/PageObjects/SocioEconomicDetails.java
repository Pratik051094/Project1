package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocioEconomicDetails extends DropDown {
	WebDriver driver;

	SocioEconomicDetails(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='slds-input'])[3]")
	private WebDriver enpName;

	@FindBy(xpath = "(//input[@class='slds-input'])[4]")
	private WebDriver typeBusiness;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	private WebDriver gst;

	@FindBy(xpath = "(//button[@class='slds-button slds-button_brand'])")
	private WebDriver snp;
}
