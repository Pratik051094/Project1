package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermanentAddress_KYCAddressPage extends DropDown {

	WebDriver driver;

	PermanentAddress_KYCAddressPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="(//button[@name=\"permanentAddress\"])")
//	private WebDriver permanentAdd;
//	
//	@FindBy(xpath="(//button[@name=\"Permanent\"])")
//	private WebDriver perma2;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[1]")
	private WebDriver add1;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[2]")
	private WebDriver add2;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[4]")
	private WebDriver pinCode;
//	
//	@FindBy(xpath="")
//	private WebDriver city;
//	
//	@FindBy(xpath="")
//	private WebDriver dist;
//	
//	@FindBy(xpath="")
//	private WebDriver state;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[15]")
	private WebDriver bAdd1;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[16]")
	private WebDriver bAdd2;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[17]")
	private WebDriver landmark;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[18]")
	private WebDriver bPin;

	@FindBy(xpath = "(//button[@class=\"slds-button slds-button_brand\"])")
	private WebDriver snp;

	public void KYCAddress(String add){
		DrpDnAccess("Type of Address Proof", add);
	}

	public void CurrentAdd(String cadd) {
		driver.findElement(By.xpath("(//button[@aria-label='Select Address'])[2]")).click();
		WebElement we = driver.findElement(By.xpath("(//div[@aria-label='Select Address'])[2]"));
		we.findElement(By.xpath("//*[@data-value='"+cadd+"']")).click();
	}

	public void CommunicationAdd(String commAdd) {
		driver.findElement(By.xpath("(//button[@aria-label='Select Address'])[3]")).click();
		WebElement we = driver.findElement(By.xpath("(//div[@aria-label='Select Address'])[3]"));
		we.findElement(By.xpath("//*[@data-value='"+commAdd+"']")).click();
	}
}
