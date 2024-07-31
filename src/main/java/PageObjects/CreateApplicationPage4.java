package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Client_Project.Utiles;

public class CreateApplicationPage4 extends DropDown {

	WebDriver driver;

	public CreateApplicationPage4(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@part='checkbox'])[2]")
	public WebElement BioMetricKYCNoButton;

	@FindBy(xpath = "(//input[@part='checkbox'])[1]")
	public WebElement BioMetricKYCYesButton;

	@FindBy(xpath = "//button[@name='Document']")
	public WebElement DocumentDropedown;

	@FindBy(xpath = "(//div[@class='file-uploader'])[1]")
	public WebElement DocumentImageFront;

	@FindBy(xpath = "(//div[@class='file-uploader'])[2]")
	public WebElement DocumentImageBack;

	@FindBy(xpath = "(//input[@class='slds-input'])[1]")
	public WebElement EnterAadhaarNumberField;

	@FindBy(xpath = "//button[text()='Verify']")
	public WebElement VerifyButton;

	@FindBy(xpath = "//button[@name='MaritalStatus']")
	public WebElement MaritalStatusDropdown;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	public WebElement capturedImage;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	public WebElement CapturedImage1;

	@FindBy(xpath = "(//div[@class='file-uploader'])[3]")
	public WebElement CapturedImage2;

	@FindBy(xpath = "//button[text()='Run POSIDEX']")
	public WebElement RunPOSIDEXbutton;

	@FindBy(xpath = "(//input[@class='slds-input'])[6]")
	public WebElement mother;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;

	public void Document(String doc){
		DrpDnAccess("Document",doc);
	}

	public void Gender(String gender){
		DrpDnAccess("Gender",gender);
	}

	public void Marital(String mar){
		DrpDnAccess("Marital Status",mar);
	}

	public void Createapp4() throws IOException{
		BioMetricKYCYesButton.click();
		DocumentDropedown.click();
		DocumentImageFront.click();
		Utiles.AutoItFileUpload();
		EnterAadhaarNumberField.sendKeys("0129876543");
		VerifyButton.click();
		Marital("Married");
		Gender("Male");
		mother.sendKeys("testmother");
		Saveandnextbutton.click();
	}
}
