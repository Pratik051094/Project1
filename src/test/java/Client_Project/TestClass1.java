package Client_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import TestComponent.BaseClass;

public class TestClass1 extends BaseClass {

	@Test
	public void Test1() throws IOException, InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginIntoApp();
		WebElement con = driver.findElement(By.xpath("//div[@data-aura-class=\"forceInlineEditGrid\"]"));
		
	}

}
