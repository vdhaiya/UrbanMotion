package stepdefinitions;

import pageobjects.AutosPage;
import utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class AutosPageSteps {

    TestContext testContext;
    AutosPage AutosPage;

    public AutosPageSteps(TestContext context) {
        testContext = context;
        AutosPage = testContext.getPageObjectManager().getautosPage();
    }
    @Then("User clicks on New Auto creation")
    public void user_clicks_on_new_auto_creation() {
        // Write code here that turns the phrase above into concrete actions
    	AutosPage.addnewcase();
       // throw new io.cucumber.java.PendingException();
    }

}
