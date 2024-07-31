package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {

	private WebDriver driver;

	public DropDown(WebDriver driver) {
		this.driver = driver;
	}

	public void DrpDnAccess(String arialabel, String dataVal) {
		driver.findElement(By.xpath("//button[@aria-label='" + arialabel + "']")).click();
		WebElement we = driver.findElement(By.xpath("//div[@aria-label='" + arialabel + "']"));
		we.findElement(By.xpath("//*[@data-value='" + dataVal + "']")).click();
	}

	public void ScrollContainer(String xpath) {
		WebElement element = driver.findElement(By.xpath("(//section)[2]"));
		WebElement elm = element.findElement(By.xpath(xpath));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elm);
	}
}
