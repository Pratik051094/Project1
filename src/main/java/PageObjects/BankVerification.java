package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankVerification extends DropDown {
	WebDriver driver;

	public BankVerification(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement Submitbtn;
	
	public void BankVerification() throws InterruptedException {
		Thread.sleep(5000);
		Submitbtn.click();
	}

}
