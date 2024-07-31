package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateApplicationPage3 extends DropDown {

	public WebDriver driver;

	public CreateApplicationPage3(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name='consent'])[1]")
	public WebElement CustomerConsentViaVerificationLink;

	@FindBy(xpath = "(//input[@name='consent'])[2]")
	public WebElement CustomerConsentViaForm;

	@FindBy(xpath = "//lightning-icon[@icon-name='utility:photo']")
	public WebElement DeclarationForm;

	@FindBy(xpath = "//button[text()='Save & Next']")
	public WebElement Saveandnextbutton;

	public void Creatapp3(){
		CustomerConsentViaForm.click();
		DeclarationForm.click();
		// AutoIT // Pratik ??
		Saveandnextbutton.click();
	}
}
