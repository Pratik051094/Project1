package Client_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import PageObjects.CreateLeadPage;
import PageObjects.LoginPage;
import TestComponent.BaseClass;

public class TestClass1 extends BaseClass {

	@Test(priority = 1)
	public void Test1() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginIntoApp();
		}

	@Test(priority = 2)
	public void LeadPageAccess(){
		CreateLeadPage clp = new CreateLeadPage(driver);
		clp.CreateLead();
	}

}
