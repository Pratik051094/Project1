package Client_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjects.AssetDetails;
import PageObjects.BankVerification;
import PageObjects.ChooseYourFlowPage;
import PageObjects.CreateApplicationPage1;
import PageObjects.CreateApplicationPage2;
import PageObjects.CreateApplicationPage3;
import PageObjects.CreateApplicationPage4;
import PageObjects.CreateLeadPage;
import PageObjects.LeadActions;
import PageObjects.LeadDetailsPage;
import PageObjects.LoanEligibilityAndOffer;
import PageObjects.LoginPage;
import PageObjects.PermanentAddress_KYCAddressPage;
import PageObjects.SocioEconomicDetails;
import TestComponent.BaseClass;

public class TestClass1 extends BaseClass {

	@Test(priority = 1)
	public void Test1() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginIntoApp();

		//WebElement con = driver.findElement(By.xpath("//div[@data-aura-class=\"forceInlineEditGrid\"]"));

	}

	@Test(priority = 2)
	public void LeadPageAccess() {
		WaitFramework pageLoadWait = new WaitFramework(driver, Duration.ofSeconds(20));
        pageLoadWait.waitForPageToLoad();
        
		CreateLeadPage clp = new CreateLeadPage(driver);
		clp.CreateLead();

	}

	@Test(priority = 3)
	public void LeadFillDetails() {
		WaitFramework pageLoadWait = new WaitFramework(driver, Duration.ofSeconds(20));
        pageLoadWait.waitForPageToLoad();
		LeadDetailsPage ldp = new LeadDetailsPage(driver);
		ldp.LeadDetails();
	}

	@Test(priority = 4)
	public void ConvertToApplication() {
		WaitFramework pageLoadWait = new WaitFramework(driver, Duration.ofSeconds(20));
        pageLoadWait.waitForPageToLoad();
		LeadActions la = new LeadActions(driver);
		la.ConvApp();
	}

	@Test(priority = 5)
	public void CreateApp1() throws Exception {
		CreateApplicationPage1 cap1 = new CreateApplicationPage1(driver);
		Thread.sleep(10000);
		cap1.Createapp1();
	}

	@Test(priority = 6)
	public void CreateApp2() throws Exception {
		CreateApplicationPage2 cap2 = new CreateApplicationPage2(driver);
		Thread.sleep(10000);
		cap2.Createapp2();
	}

	@Test(priority = 7)
	public void CreateApp3() throws Exception {
		CreateApplicationPage3 cap3 = new CreateApplicationPage3(driver);
		Thread.sleep(10000);
		cap3.Creatapp3();
	}

	@Test(priority = 8)
	public void CreateApp4() throws Exception {
		CreateApplicationPage4 cap4 = new CreateApplicationPage4(driver);
		Thread.sleep(10000);
		cap4.Createapp4();
	}
	
	@Test(priority =9)
	public void ParmanentAdd() throws InterruptedException {
		PermanentAddress_KYCAddressPage PA = new PermanentAddress_KYCAddressPage(driver);
		Thread.sleep(10000);
		PA.ParmanentAdd_Kycadd();
	}
	
	@Test(priority =10)
	public void SocioEconomicDetails() throws InterruptedException {
		SocioEconomicDetails SE = new SocioEconomicDetails(driver);
		Thread.sleep(10000);
		SE.SocioEco();
	}
	
	@Test(priority =11)
	public void AssetDetails() throws InterruptedException {
		AssetDetails AD = new AssetDetails(driver);
		Thread.sleep(10000);
		AD.AssetDetails();
	}
	

	@Test(priority = 12)
	public void Flowpage() throws Exception {
		ChooseYourFlowPage cyf = new ChooseYourFlowPage(driver);
		Thread.sleep(10000);
		cyf.FlowPage();
	}
	
	@Test(priority = 13)
	public void LoanEligibility() throws Exception {
		LoanEligibilityAndOffer LA = new LoanEligibilityAndOffer(driver);
		Thread.sleep(10000);
		LA.LoanEligibilityAndOffer();
	}
	
	@Test(priority = 14)
	public void BankVerification() throws Exception {
		BankVerification BV = new BankVerification(driver);
		Thread.sleep(10000);
		BV.BankVerification();
	}
	
	
}
