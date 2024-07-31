package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD

public class LeadDetailsPage extends DropDown {

	WebDriver driver;
=======
public class LeadDetailsPage extends DropDown {
>>>>>>> dc39ef0f0565840e0e94a64ce2869deb693e4460

	public WebDriver driver;

	public LeadDetailsPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}
<<<<<<< HEAD
=======

>>>>>>> dc39ef0f0565840e0e94a64ce2869deb693e4460
	@FindBy(xpath = "(//input[@class='slds-input'])[2]")
	private WebElement fstName;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	private WebElement mobile;

	@FindBy(xpath = "(//input[@class='slds-input'])[12]")
	private WebElement pinCode;

	@FindBy(xpath = "//button[@aria-label='Lead Source']")
	private WebElement source;

	@FindBy(xpath = "//button[@aria-label='Lead Disposition']")
	private WebElement leadDisp;

	@FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
<<<<<<< HEAD
	private WebDriver snp;
=======
	private WebElement snp;

	public void ProductName(String name){
		DrpDnAccess("Product Name", name);
	}

	public void LeadSource(String lead){
		DrpDnAccess("Lead Source", lead);
	}

	public void LeadDisposition(String disp){
		DrpDnAccess("Lead Disposition", disp);
	}

	public void LeadDetails(){
		ProductName("Two Wheeler Loan");
		fstName.sendKeys("Test1");
		mobile.sendKeys("1234567899");
		pinCode.sendKeys("400064");
		LeadSource("Dealer");
		ScrollContainer("//button[@aria-label='Lead Disposition']");
		LeadDisposition("Interested");
		snp.click();
	}
>>>>>>> dc39ef0f0565840e0e94a64ce2869deb693e4460
}

