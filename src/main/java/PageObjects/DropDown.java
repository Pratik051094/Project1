package PageObjects;

import org.openqa.selenium.WebDriver;

public class DropDown {

	WebDriver driver;

	public void DrpDnAccess(String arialabel, String dataVal) {
		driver.findElement(By.xpath("//button[@aria-label='"+arialabel+"']")).click();
		WebElement we = driver.findElement(By.xpath("//div[@aria-label='"+arialabel+"']"));
		we.findElement(By.xpath("//*[@data-value='"+dataVal+"']")).click();
	}
}


