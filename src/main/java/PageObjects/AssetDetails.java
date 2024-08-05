package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetDetails extends DropDown {
	WebDriver driver;

	public AssetDetails(WebDriver driver) {

		super(driver);
		this.driver=driver;
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

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;
	
	public void Type(String typ){
		DrpDnAccess( "Two Wheeler Type", typ);
	}

	public void Model(String model){
		DrpDnAccess("Model",model);
	}

	public void Variant(String var){
		DrpDnAccess("Variant", var);
	}
	
	public void EngineCC(String var){
		DrpDnAccess("EngineCC", var);
	}
	
	public void Electric(String var){
		DrpDnAccess("Electric", var);
	}
	
	public void VehicleCategory(String var){
		DrpDnAccess("VehicleCategory", var);
	}
	public void ModelOne() {
		driver.findElement(By.xpath("//*[@name='Model']")).click();
		WebElement we = driver.findElement(By.xpath("//*[@name='Model']"));
		we.findElement(By.xpath("(//*[@data-value='Hunter 350'])[1]")).click();
	}
	
	public void AssetDetails() throws InterruptedException {
		Thread.sleep(5000);
		Type("Motorcycle");
		Thread.sleep(2000);
		ModelOne();
		Thread.sleep(2000);
		Variant("Retro Factory");
		Thread.sleep(2000);
		ExShowroomPriceField.sendKeys("120000");
		RTOChargesField.sendKeys("10000");
		InsuranceAmountField.sendKeys("1000");
		MandatoryAccessoriesAmountField.sendKeys("0");
		OtherRegistrationChargesField.sendKeys("0");
		Saveandnextbutton.click();
		//*[@data-value="Retro Factory"]
	}
	
}
