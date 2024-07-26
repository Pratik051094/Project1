package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateApplicationPage2 extends DropDown {

	WebDriver driver;

	CreateApplicationPage2(WebDriver driver) {
		this.driver = driver;
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
}
