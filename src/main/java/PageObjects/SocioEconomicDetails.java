package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocioEconomicDetails extends DropDown {
	WebDriver driver;

	SocioEconomicDetails(WebDriver driver) {

		super(driver);
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

	public void Religion(String religion){
		DrpDnAccess("Religion", religion);
	}

	public void SocialStatus(String socstat){
		DrpDnAccess("Social Status", socstat);
	}

	public void Disability(String disab){
		DrpDnAccess("Applicant Disablility", disab);
	}

	public void Education(String edu){
		DrpDnAccess("Applicant Education", edu);
	}

	public void CompanyType(String type){
		DrpDnAccess("Type Of Company", type);
	}

	public void House(String house){
		DrpDnAccess("House", house);
	}

	public void Family(String fam){
		DrpDnAccess("Staying With Family", fam);
	}

	public void ResidingSince(String residence){
		DrpDnAccess("Residing Since", residence);
	}

	public void DurationBusiness(String duration){
		DrpDnAccess("Duration Of Business In Present Address(Years)", duration);
	}

	public void IncomeSource(String incsrc){
		DrpDnAccess("Income Source", incsrc);
	}

	public void Retirement(String retire){
		DrpDnAccess("Retirement Age", retire);
	}

	public void GrossIncome(String grsinc){
		DrpDnAccess("Gross Annual Income", grsinc);
	}

	public void ResidentStatus(String resstat){
		DrpDnAccess("Resident Status", resstat);
	}

	public void RelBusiness(String relbus){
		DrpDnAccess("Relationship with the Business", relbus);
	}

	public void Politics(String politic){
		DrpDnAccess("Politically Exposed Person", politic);
	}

	public void Industry(String indcls){
		DrpDnAccess("Industry Class", indcls);
	}

	public void UdyogAadhar(String aadhar){
		DrpDnAccess("Udhyog Aadhar Number", aadhar);
	}
}
