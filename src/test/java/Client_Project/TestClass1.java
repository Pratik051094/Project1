package Client_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import PageObjects.ChooseYourFlowPage;
import PageObjects.CreateApplicationPage1;
import PageObjects.CreateApplicationPage2;
import PageObjects.CreateApplicationPage3;
import PageObjects.CreateApplicationPage4;
import PageObjects.CreateLeadPage;
import PageObjects.LeadActions;
import PageObjects.LeadDetailsPage;
import PageObjects.LoginPage;
import TestComponent.BaseClass;

public class TestClass1 extends BaseClass {

	@Test(priority = 1)
	public void Test1() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginIntoApp();

		WebElement con = driver.findElement(By.xpath("//div[@data-aura-class=\"forceInlineEditGrid\"]"));

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

	@Test(priority = 9)
	public void Flowpage() throws Exception {
		ChooseYourFlowPage cyf = new ChooseYourFlowPage(driver);
		Thread.sleep(10000);
		cyf.FlowPage();
	}
}
