package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AutosPage {

    public AutosPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }
 
	//private String titleAutos = "infraction-title";
	

    @FindBy(id = "add-case-button")
    private WebElement createNewProcess;

    @FindBy(id ="to be fillled")
    private WebElement lastestAutoNumber;

    @FindBy(id = "vgt-table")
    private WebElement autoTable;

    public void addnewcase() {
    	createNewProcess.isDisplayed();
    	createNewProcess.click();
    }

   
}
