package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetDetails extends DropDown {
	WebDriver driver;

	AssetDetails(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@name='Two Wheeler Manufacturer']")
	public WebElement TwoWheelerManufacturerDropdwon;

	@FindBy(xpath = "//button[@name='Two Wheeler Type']")
	public WebElement TwoWheelerTypeDropdwon;

	@FindBy(xpath = "//button[@name='Model']")
	public WebElement ModelDropdwon;

	@FindBy(xpath = "//button[@name='Variant']")
	public WebElement VariantDropdwon;

	@FindBy(xpath = "(//input[@class='slds-input'])[4]")
	public WebElement ExShowroomPriceField;

	@FindBy(xpath = "(//input[@class='slds-input'])[5]")
	public WebElement RTOChargesField;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	public WebElement InsuranceAmountField;

	@FindBy(xpath = "(//input[@class='slds-input'])[7]")
	public WebElement MandatoryAccessoriesAmountField;

	@FindBy(xpath = "(//input[@class='slds-input'])[8]")
	public WebElement OtherRegistrationChargesField;

	public void Manufacturer(String bike){
		DrpDnAccess("Two Wheeler Manufacturer", bike);
	}

	public void Type(String typ){
		DrpDnAccess( "Two Wheeler Type", typ);
	}

	public void Model(String model){
		DrpDnAccess("Model",model);
	}

	public void Variant(String var){
		DrpDnAccess("Variant", var);
	}
}
