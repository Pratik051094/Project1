package Client_Project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utiles {
	 WebDriver driver;

	public Utiles(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement waitForElementToAppear(WebDriver driver, By locator, Duration i) {
        WebDriverWait wait = new WebDriverWait(driver, i);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	
	public static void AutoItFileUpload() throws IOException {
		Runtime.getRuntime().exec(
				"C:\\Users\\pmeher\\OneDrive - Planit Test Management Solutions Pty Ltd\\Documents\\FileUpload.exe");
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}

	public void ScrollParent(String xpath){
		WebElement element = driver.findElement(By.xpath(xpath));
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void ScrollContainer(String xpath){
		WebElement element = driver.findElement(By.xpath("(//section)[2]"));
		WebElement elm = element.findElement(By.xpath(xpath));
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elm);
	}
public static void highlightElement(WebDriver driver,String ele) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement tickethi=driver.findElement(By.xpath(ele));
		 js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",ele );
	        try {
	            Thread.sleep(1000); // Highlight for 1 second
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", ele);
	        
	        tickethi.click();
	}
}
