package PageObjects;

import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Client_Project.Utiles;

public class CreateApplicationPage2 extends DropDown {

	WebDriver driver;

	public CreateApplicationPage2(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@name='Customer Category']")
	public WebElement CustomerCategoryDropdown;

	@FindBy(xpath = "//button[@name='Type of Profession']")
	public WebElement TypeOfProfessionDropdown;

	@FindBy(xpath = "//button[@aria-label='Title']")
	public WebElement TitleField;

	@FindBy(xpath = "//input[@name='Dob']")
	public WebElement DateofBirthField;

	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[2]")
	public WebElement NoRadioButton;

	@FindBy(xpath = "(//input[@name='PanAvailability'])[1]")
	public WebElement YesRadioButton;

	@FindBy(xpath = "//button[text()='Run POSIDEX']")
	public WebElement RunPOSIDEXButton;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;
	
	@FindBy(xpath = "//c-c-l-o-s-generic-file-uploader")
	public WebElement PhotoUpload;

	public void CustoType(String ctype){
		DrpDnAccess("Customer Category",ctype);
	}

	public void Profession(String prof){
		DrpDnAccess("Type of Profession", prof);
	}

	public void Title(String title){
		DrpDnAccess("Title", title);
	}

	public void CustoCategory(String cat){
		DrpDnAccess("Customer Category", cat);
	}

	public void Createapp2() throws IOException, InterruptedException {
		CustoType("Salaried");
		//CustoCategory("Salaried");
		Profession("Individual Cash salaried");
		Title("Mr.");
		DateofBirthField.sendKeys("22-Jul-1990");
		ScrollContainer("(//span[@class='slds-radio_faux'])[2]");
		Thread.sleep(2000);
		NoRadioButton.click();
		Thread.sleep(2000);
		
		//Utiles.waitForElementToAppear(driver, By.xpath("//c-c-l-o-s-generic-file-uploader"), Duration.ofSeconds(10));
		//Utiles.highlightElement(driver, "//c-c-l-o-s-generic-file-uploader");
		PhotoUpload.click();
		//ScrollContainer("//button[text()='Run POSIDEX']");
		//PhotoUpload.sendKeys("C:\\Users\\pmeher\\eclipse-workspace\\RBL_Bank\\src\\main\\java\\Resoureces\\Demo.png");
		Thread.sleep(2000);
		Utiles.AutoItFileUpload();
		ScrollContainer("//button[text()='Run POSIDEX']");
		Thread.sleep(10000);
		RunPOSIDEXButton.click();
		Thread.sleep(20000);
		Saveandnextbutton.click();
	}
}
