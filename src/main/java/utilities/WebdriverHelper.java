package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.function.Function;

public class WebdriverHelper {
	WebDriver driver;
	public WebdriverHelper(WebDriver driver) {
		this.driver = driver;
	}
	public void javascriptexecutorsendkey(WebElement element, String valuetofill) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].value=valuetofill", element);
	}
	
}
