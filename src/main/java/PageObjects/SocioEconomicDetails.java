package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Client_Project.Utiles;

public class SocioEconomicDetails extends DropDown {
	WebDriver driver;

	public SocioEconomicDetails(WebDriver driver) {

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//*[@name='Politically Exposed Person']
	//(//*[@data-value='No'])[2]
			
			
 ////lightning-base-combobox-item[@data-value="No"]
	@FindBy(xpath = "(//*[@data-value='No'])[2]")
	private WebElement NoBtn;
	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	private WebElement empName;
	@FindBy(xpath = "//div[@data-recid='Salaried']")
	private WebElement ele;
	// 31_311-Private Banks"
	@FindBy(xpath = "//div[@data-recid='31_311-Private Banks']")
	private WebElement ele1;
	// (//input[@class='slds-input'])[6]
	// (//input[@class='slds-input'])[2]
	// button[@name='Type Of Occupation']
	// (//input[@class='slds-input'])[3]
	//// button[@aria-label='Monthly Income']
	////button[@aria-label='Politically Exposed Person']
	@FindBy(xpath = "//button[@aria-label='Politically Exposed Person']")
	private WebElement Poli;
	@FindBy(xpath = "(//input[@class='slds-input'])[7]")
	private WebElement JoiningDate;

	@FindBy(xpath = "(//input[@class='slds-input'])[2]")
	private WebElement occ;

	@FindBy(xpath = "(//input[@class='slds-input'])[5]")
	private WebElement MonthlyIn;

	@FindBy(xpath = "(//input[@class='slds-input'])[4]")
	private WebElement typeBusiness;

	@FindBy(xpath = "(//input[@class='slds-input'])[3]")
	private WebElement TypeOfBRS;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	private WebElement gst;

	@FindBy(xpath = "(//button[@class='slds-button slds-button_brand'])")
	private WebElement snp;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;

	public void Religion(String religion) {
		DrpDnAccess("Religion", religion);
	}

	public void SocialStatus(String socstat) {
		DrpDnAccess("Social Status", socstat);
	}

	public void Disability(String disab) {
		DrpDnAccess("Applicant Disablility", disab);
	}

	public void Education(String edu) {
		DrpDnAccess("Applicant Education", edu);
	}

	public void CompanyType(String type) {
		DrpDnAccess("Type Of Company", type);
	}

	public void TypeOfOccupation(String type) {
		DrpDnAccess("Type Of Occupation", type);
	}

	public void House(String house) {
		DrpDnAccess("House", house);
	}

	public void Family(String fam) {
		DrpDnAccess("Staying With Family", fam);
	}

	public void ResidingSince(String residence) {
		DrpDnAccess("Residing Since", residence);
	}

	public void DurationBusiness(String duration) {
		DrpDnAccess("Duration Of Business In Present Address(Years)", duration);
	}

	public void IncomeSource(String incsrc) {
		DrpDnAccess("Income Source", incsrc);
	}

	public void Retirement(String retire) {
		DrpDnAccess("Retirement Age", retire);
	}

	public void GrossIncome(String grsinc) {
		DrpDnAccess("Gross Annual Income", grsinc);
	}

	public void ResidentStatus(String resstat) {
		DrpDnAccess("Resident Status", resstat);
	}

	public void RelBusiness(String relbus) {
		DrpDnAccess("Relationship with the Business", relbus);
	}

	public void Politics(String politic) {
		DrpDnAccess("Politically Exposed Person", politic);
	}

	public void Industry(String indcls) {
		DrpDnAccess("Industry Class", indcls);
	}

	public void UdyogAadhar(String aadhar) {
		DrpDnAccess("Udhyog Aadhar Number", aadhar);
	}

	public void TotalWorkExp(String aadhar) {
		DrpDnAccess("Total Work Experience(Years)", aadhar);
	}

	public void SalaryPerAnn(String aadhar) {
		DrpDnAccess("Salary Per Annum", aadhar);
	}
	// Total Work Experience(Years)
	public void PoliticallyExp() {
		driver.findElement(By.xpath("//*[@name='Politically Exposed Person']")).click();
		WebElement we = driver.findElement(By.xpath("//*[@name='Politically Exposed Person']"));
		we.findElement(By.xpath("(//*[@data-value='No'])[3]")).click();
	}
//	public void occ() {
//		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).click();
//		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Business");
//		driver.findElement(By.xpath("//span[@data-recid='Engineer'][1]"));
//		//List list =driver.findElements(By.xpath("//span[@class='slds-media__body']"));
//		//WebElement we = driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
//		//we.findElement(By.xpath("//div[@data-recid='"+commAdd+"']")).click();
//	}
//	
//	public void BRStype() {
//		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
//		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("31_311-Private Banks");
//		driver.findElement(By.xpath("//span[@data-recid='Engineer'][1]"));
//		//WebElement we = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
//		//we.findElement(By.xpath("//div[@data-recid='"+commAdd+"']")).click();
//	}
	//// div[@data-recid='"+commAdd+"']
	public void SocioEco() throws InterruptedException {
		Thread.sleep(7000);
		Religion("Hindu");
		SocialStatus("GEN");
		Education("Graduate");
		occ.sendKeys("Salaried");
		ele.click();
		Thread.sleep(2000);
		CompanyType("Private Ltd");
		TypeOfOccupation("Private");
		TypeOfBRS.sendKeys("31_311-Private Banks");
		ele1.click();
		House("Owned");
		Family("Yes");
		ResidingSince("Greater than 10 Years");
		TotalWorkExp("30");
		ScrollParent("//button[@aria-label='Total Work Experience(Years)']");
		Thread.sleep(2000);
		Retirement("60");
		MonthlyIn.sendKeys("100000");
		GrossIncome("10-50 lakh");
		Thread.sleep(5000);
		PoliticallyExp();
		//Thread.sleep(2000);
		//NoBtn.click();
		empName.sendKeys("TestOne");
		JoiningDate.sendKeys("01/01/2008");
		SalaryPerAnn("10-25 Lakh");
		ScrollContainer("(//span[@class='slds-radio_faux'])[6]");
		Thread.sleep(3000);
		Saveandnextbutton.click();
	}
}
