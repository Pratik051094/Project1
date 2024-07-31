package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DropDown {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameInput;

	@FindBy(xpath="//input[@name='pw']")
	private WebElement passwordInput;

	@FindBy(xpath="//input[@name='Login']")
	private WebElement loginButton;
	
	
	public void LoginIntoApp() {
		usernameInput.sendKeys("unnati.mokal@rblbank.com.uat");	
		passwordInput.sendKeys("Unnati@1234");
		loginButton.click();
		}

}
