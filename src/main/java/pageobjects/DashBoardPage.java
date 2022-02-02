package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    public DashBoardPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    
    // new code
 
	
	
	
    @FindBy(id = "dashboard-title")
   private WebElement dashBoardTitle;
	@FindBy(id = "menu-list")
	private WebElement menuList;
	@FindBy(id = "link-to-infraction")
	private WebElement optionAuto;
	
	public void clickonMenuList() {
		menuList.isDisplayed();
		menuList.click();
	}
	public void clickonMenuListAutoOption() {
		optionAuto.isDisplayed();
		optionAuto.click();
	}
	public void isdashboardvisible() {
		// Code to be implemented
		
    }
	public boolean DashboardIsDisplayed() {
		dashBoardTitle.isDisplayed();
		menuList.isDisplayed();
		optionAuto.isDisplayed();
        return true;
    }
	

}
