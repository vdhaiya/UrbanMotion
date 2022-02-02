package pageobjects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import utilities.WebdriverHelper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class NewAutoCreationPage {

    public NewAutoCreationPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }
  
	//private String titleAutos = "infraction-title";
    private String createNewProcessPageTitle = "//h2[@id='IF']";
	private String authorizationEntity = "//div[@id='infractor-0']//label[@id='label-0']/following-sibling:: div";

   // PROCESS OBJECTS
    @FindBy(xpath = "//div[@id='tree-select-infractor-0']//input[@type='text']")
    private WebElement authorizingentity;

    @FindBy(id ="infractor-1")
    private WebElement auto;

    @FindBy(id = "infractor-2")
    private WebElement andthe;

    @FindBy(xpath = "//div[@id='infractor-3']//div//input[@name='date']")
    private WebElement datetime;

    @FindBy(xpath ="//div[@id='tree-select-infractor-4']//input[@type='text']")
    private WebElement codeselector;

    @FindBy(id = "infractor-5")
    private WebElement infractioncode;
    
    @FindBy(id = "infractor-6")
    private WebElement rulesinfringed;

    @FindBy(id ="infractor-7")
    private WebElement minimumfine;

    @FindBy(id = "infractor-8")
    private WebElement maxfine;
    
    @FindBy(id = "infractor-9")
    private WebElement standardfine;
    
    @FindBy(id = "infractor-12")
    private WebElement place;

    @FindBy(id ="infractor-13")
    private WebElement summarydesc;

    @FindBy(id = "infractor-14")
    private WebElement witness;
    
    //VEHICLE OBJECTS
    
    @FindBy(id = "vehicle-0")
    private WebElement registration;
    
    @FindBy(xpath = "//div[@id='tree-select-vehicle-1']//input[@type='text']")
    private WebElement vehiclecategory;

    @FindBy(xpath ="//div[@id='tree-select-vehicle-2']//input[@type='text']")
    private WebElement vehicletype;

    @FindBy(xpath = "//div[@id='tree-select-vehicle-3']//input[@type='text']")
    private WebElement vehiclecountry;
  
    //Offender Objects
    
    @FindBy(id = "participants-0")
    private WebElement offName;
    
    @FindBy(xpath = "//div[@id='participants-1']//div//input[@name='date']")
    private WebElement offBDate;

    @FindBy(xpath ="//div[@id='tree-select-participants-2']//input[@type='text']")
    private WebElement offiddoc1;

    @FindBy(id = "participants-3")
    private WebElement offdocnum1;
    
    @FindBy(id = "participants-4")
    private WebElement offIssuedBy1;
    
    @FindBy(xpath = "//div[@id='participants-5']//div//input[@name='date']")
    private WebElement offIN1;

    @FindBy(xpath ="//div[@id='tree-select-participants-6']//input[@type='text']")
    private WebElement offiddoc2;

    @FindBy(id = "participants-7")
    private WebElement offdocnum2;
    
    @FindBy(id = "participants-8")
    private WebElement offIssuedBy2;
    //
    @FindBy(xpath = "//div[@id='tree-select-vehicle-1']//input[@type='text']")
    private WebElement offIN2;
    
    @FindBy(xpath ="//div[@id='tree-select-vehicle-2']//input[@type='text']")
    private WebElement offiddoc3;

    @FindBy(xpath = "//div[@id='tree-select-vehicle-3']//input[@type='text']")
    private WebElement offdocnum3;
    
    @FindBy(id = "vehicle-0")
    private WebElement offIssuedBy3;
    
    @FindBy(xpath = "//div[@id='tree-select-vehicle-1']//input[@type='text']")
    private WebElement offIN3;
    
    @FindBy(xpath ="//div[@id='tree-select-vehicle-2']//input[@type='text']")
    private WebElement offaddress;

    @FindBy(xpath = "//div[@id='tree-select-vehicle-3']//input[@type='text']")
    private WebElement offlocation;
    
    @FindBy(id = "vehicle-0")
    private WebElement pffpostcode;
    
    @FindBy(xpath = "//div[@id='tree-select-vehicle-1']//input[@type='text']")
    private WebElement offparents;
    
    @FindBy(xpath ="//div[@id='tree-select-vehicle-2']//input[@type='text']")
    private WebElement offevenowner;

    @FindBy(xpath = "//div[@id='tree-select-vehicle-3']//input[@type='text']")
    private WebElement offemail;
    
    @FindBy(id = "vehicle-0")
    private WebElement offtele;
    
    @FindBy(xpath = "//div[@id='tree-select-vehicle-1']//input[@type='text']")
    private WebElement offtype;
    
    //Submit 
    @FindBy(id = "submit")
    private WebElement submitminuta;
    
    @FindBy(id = "yes-button-undefined")
    private WebElement confirmYes;
    
    @FindBy(id = "no-button-undefined")
    private WebElement confirmNo;
    
    
    
    public void createNewMinuta() throws InterruptedException {
    	
    	
    	Thread.sleep(3000);
    	authorizingentity.sendKeys("Polícia Municipal");
    	authorizingentity.click();
    	Thread.sleep(3000);
    	auto.sendKeys("975236796");
    	Thread.sleep(3000);
    	andthe.sendKeys("907571236");
    	Thread.sleep(3000);
    //	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    //	   LocalDateTime now = LocalDateTime.now();  
    /*	datetime.sendKeys("2022-02-01 05:00");
    	codeselector.sendKeys("1890240151 > C15 - Estacionamento Proibido > Art.º24, n.º1 RST - DR22A/98 > Art.º26, n.º1 RST - DR22A/98 > 30 > 150");
    	//1890240151 > C15 - Estacionamento Proibido > Art.º24, n.º1 RST - DR22A/98 > Art.º26, n.º1 RST - DR22A/98 > 30 > 150
    	place.sendKeys("Rua");
    
    	registration.sendKeys("9Q-PJ-09");
    	vehiclecategory.sendKeys("Automóvel ligeiro");
    	vehicletype.sendKeys("Mercadorias");
    	offName.sendKeys("Steve");
    	offBDate.sendKeys("1988-08-24");
    	offiddoc1.sendKeys("Número de Identificação Fiscal");
    	offdocnum1.sendKeys("253465747");
    	offevenowner.sendKeys("Sim");
    	offtype.sendKeys("Condutor");
    	submitminuta.click();
    	confirmYes.click(); */
    }
   
    
    public static String getRandomNumberString() {
		// It will generate 6 digit random Number.
		// from 0 to 999999
		Random rnd = new Random();
		int number = rnd.nextInt(999999999);

		// this will convert any number sequence into 9 character.
		return String.format("%09d", number);
	}

    
   

   
}
