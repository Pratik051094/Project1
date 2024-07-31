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

	@FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[2]")
	public WebElement BioMetricKYCNoButton;

	@FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[1]")
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

	@FindBy(xpath = "//c-c-l-o-s-generic-file-uploader[1]")
	public WebElement PhotoUpload1;

	@FindBy(xpath = "//c-c-l-o-s-generic-file-uploader[3]")
	public WebElement PhotoUpload3;

	@FindBy(xpath = "//button[text()='Run POSIDEX']")
	public WebElement RunPOSIDEXButton;

	public void Document(String doc) {
		DrpDnAccess("Document", doc);
	}

	public void Gender(String gender) {
		DrpDnAccess("Gender", gender);
	}

	public void Marital(String mar) {
		DrpDnAccess("Marital Status", mar);
	}

	public void Createapp4() throws IOException, InterruptedException {
		Thread.sleep(5000);
		BioMetricKYCNoButton.click();
		Thread.sleep(3000);
		// DocumentDropedown.click();
		// DocumentImageFront.click();
		Document("Aadhaar");
		PhotoUpload1.click();
		Thread.sleep(4000);
		Utiles.AutoItFileUpload();
		Thread.sleep(4000);
		EnterAadhaarNumberField.sendKeys("012987654355");
		VerifyButton.click();
		ScrollContainer("//button[@aria-label='Gender']");
		Thread.sleep(3000);
		Marital("Married");
		Gender("Male");
		Thread.sleep(2000);
		ScrollContainer("(//input[@class='slds-input'])[6]");
		mother.click();
		mother.sendKeys("testmother");
		Thread.sleep(2000);
		ScrollContainer("//button[text()='Run POSIDEX']");
		PhotoUpload3.click();
		Thread.sleep(5000);
		Utiles.AutoItFileUpload();
		Thread.sleep(5000);
		RunPOSIDEXButton.click();
		Thread.sleep(20000);
		Saveandnextbutton.click();
	}
}
