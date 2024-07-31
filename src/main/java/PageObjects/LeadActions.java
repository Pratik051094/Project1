package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadActions extends DropDown{
    public WebDriver driver;

	public LeadActions(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

    @FindBy (xpath = "(//button[@class = 'slds-button slds-button_neutral slds-button_first'])[1]")
    public WebElement ChangeOwner;

    @FindBy(xpath = "(//button[@class = 'slds-button slds-button_neutral slds-button_middle'])[1]")
    public WebElement ConvertApp;

    @FindBy(xpath = "(//button[@class = 'slds-button slds-button_neutral slds-button_last'])[1]")
    public WebElement Edit;

    public void ConvApp(){
        ConvertApp.click();
    }
}
