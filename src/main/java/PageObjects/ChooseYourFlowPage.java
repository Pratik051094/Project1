package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseYourFlowPage extends DropDown {

	WebDriver driver;

	ChooseYourFlowPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name='default'])[2]")
	public WebElement NoButton;

	@FindBy(xpath = "(//input[@name='default'])[1]")
	public WebElement YesButton;

	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement ProceedButton;

}
