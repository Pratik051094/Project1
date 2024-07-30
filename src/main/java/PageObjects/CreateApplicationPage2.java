package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(xpath = "(//input[@name='PanAvailability'])[1]")
	public WebElement NoRadioButton;

	@FindBy(xpath = "(//input[@name='PanAvailability'])[2]")
	public WebElement YesRadioButton;

	@FindBy(xpath = "//button[text()='Run POSIDEX']")
	public WebElement RunPOSIDEXButton;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;

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

	public void Createapp2(){
		CustoType("Inividual");
		CustoCategory("Salaried");
		Profession("Indiviual Cash salaried");
		Title("Mr.");
		DateofBirthField.sendKeys("22-Jul-1990");
		NoRadioButton.click();
		// Imageupload ??
		RunPOSIDEXButton.click();
		Saveandnextbutton.click();
	}
}
