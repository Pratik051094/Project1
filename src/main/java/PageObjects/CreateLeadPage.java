package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Client_Project.Utiles;

public class CreateLeadPage extends DropDown {

	WebDriver driver;

	public CreateLeadPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='1']")
	private WebElement clickLead;

	@FindBy(xpath = "//a[@class='forceActionLink']")
	private WebElement newLead;

	public void CreateLead() {
			//Utiles.waitForElementToAppear(driver, By.xpath("//a[@id='1']"), Duration.ofSeconds(10));
			clickLead.click();
			newLead.click();
		}
}
