package Client_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import PageObjects.CreateApplicationPage1;
import PageObjects.CreateApplicationPage2;
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
		}

	@Test(priority = 2)
	public void LeadPageAccess() {
		CreateLeadPage clp = new CreateLeadPage(driver);
		clp.CreateLead();
	}

	@Test(priority = 3)
	public void LeadFillDetails(){
		LeadDetailsPage ldp = new LeadDetailsPage(driver);
		ldp.LeadDetails();
	}

	@Test(priority = 4)
	public void ConvertToApplication(){
		LeadActions la = new LeadActions(driver);
		la.ConvApp();
	}

	@Test(priority = 5)
	public void CreateApp1(){
		CreateApplicationPage1 cap1 = new CreateApplicationPage1(driver);
		cap1.Createapp1();
	}

	@Test(priority = 6)
	public void CreateApp2(){
		CreateApplicationPage2 cap2 = new CreateApplicationPage2(driver);
		cap2.Createapp2();
	}
}
