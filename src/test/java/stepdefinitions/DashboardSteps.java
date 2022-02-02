package stepdefinitions;

import pageobjects.DashBoardPage;
import pageobjects.LoginPage;
import utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class DashboardSteps {

    TestContext testContext;
    DashBoardPage DashBoardPage;

    public DashboardSteps(TestContext context) {
        testContext = context;
        DashBoardPage = testContext.getPageObjectManager().getdashboardPage();
    }

@Then("Click on Dashborad Menu list")
public void click_on_dashborad_menu_list() {
	DashBoardPage.clickonMenuList();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("Click on Auto")
public void click_on_auto() {
	DashBoardPage.clickonMenuListAutoOption();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
}
