package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Client_Project.Utiles;

public class CreateApplicationPage3 extends DropDown {

	public WebDriver driver;

	public CreateApplicationPage3(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[1]")
	public WebElement CustomerConsentViaVerificationLink;

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[2]")
	public WebElement CustomerConsentViaForm;

	@FindBy(xpath = "//lightning-icon[@icon-name='utility:photo']")
	public WebElement DeclarationForm;

	@FindBy(xpath = "//c-c-l-o-s-generic-file-uploader")
	public WebElement PhotoUpload;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;

	public void Creatapp3() throws IOException, InterruptedException {
		Thread.sleep(5000);
		CustomerConsentViaForm.click();
		PhotoUpload.click();
		Thread.sleep(5000);
		Utiles.AutoItFileUpload();
		Thread.sleep(5000);
		Saveandnextbutton.click();
	}
}
