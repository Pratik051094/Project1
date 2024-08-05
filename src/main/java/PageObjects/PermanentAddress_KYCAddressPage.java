package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermanentAddress_KYCAddressPage extends DropDown {

	WebDriver driver;

	public PermanentAddress_KYCAddressPage(WebDriver driver) {

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="(//button[@name=\"permanentAddress\"])")
//	private WebDriver permanentAdd;
//	
//	@FindBy(xpath="(//button[@name=\"Permanent\"])")
//	private WebDriver perma2;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[1]")
	private WebElement add1;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[2]")
	private WebElement add2;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[4]")
	private WebElement pinCode;
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
	private WebElement bAdd1;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[16]")
	private WebElement bAdd2;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[17]")
	private WebElement landmark;

	@FindBy(xpath = "(//input[@class=\"slds-input\"])[18]")
	private WebElement bPin;

	@FindBy(xpath = "(//button[@class=\"slds-button slds-button_brand\"])")
	private WebElement snp;
   
	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;
	
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
	
	public void ParmanentAdd_Kycadd() throws InterruptedException {
		Thread.sleep(4000);
		KYCAddress("Voter");
		add1.sendKeys("addOne");
		add2.sendKeys("AddTwo");
		pinCode.sendKeys("400001");
		ScrollContainer("(//button[@aria-label='Select Address'])[2]");
		Thread.sleep(4000);
		CurrentAdd("Same as Permanent Address");
		ScrollContainer("(//button[@aria-label='Select Address'])[3]");
		Thread.sleep(4000);
		bAdd1.sendKeys("baddone");
		bAdd2.sendKeys("baddtwo");
		landmark.sendKeys("landmark");
		bPin.sendKeys("400002");
		ScrollContainer("(//button[@aria-label='Select Address'])[3]");
		Thread.sleep(2000);
		CommunicationAdd("Same as Current Address");
		Thread.sleep(2000);
		Saveandnextbutton.click();
		
	}
}
