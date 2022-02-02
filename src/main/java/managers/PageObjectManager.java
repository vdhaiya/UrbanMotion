package managers;

import pageobjects.DashBoardPage;
import pageobjects.NewAutoCreationPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.AutosPage;
import org.openqa.selenium.WebDriver;
import pageobjects.ProductDetailPage;
import pageobjects.ProductListPage;

public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductListPage productListPage;
    private ProductDetailPage productDetailPage;
    private DashBoardPage DashBoardPage ;
    private AutosPage AutosPage ;
    private NewAutoCreationPage NewAutoCreationPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public DashBoardPage getdashboardPage() {

        if (DashBoardPage == null) {
        	DashBoardPage = new DashBoardPage(webDriver);
        }
        return DashBoardPage;
    }
    public AutosPage getautosPage() {

        if (AutosPage == null) {
        	AutosPage = new AutosPage(webDriver);
        }
        return AutosPage;
    }
    
    public NewAutoCreationPage getnewautocreationPage() {

        if (NewAutoCreationPage == null) {
        	NewAutoCreationPage = new NewAutoCreationPage(webDriver);
        }
        return NewAutoCreationPage;
    }
    // OLD CODE BELOW THIS
    //Short Hand If...Else
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    //General If...Else
    
    public LoginPage getdas() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }
    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage(webDriver) : productListPage;
    }

    public ProductDetailPage getProductDetailPage() {
        if (productDetailPage == null) productDetailPage = new ProductDetailPage(webDriver);
        return productDetailPage;
    }
}
