package stepdefinitions;

import pageobjects.NewAutoCreationPage;
import pageobjects.LoginPage;
import utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class NewAutoCreationSteps {

    TestContext testContext;
    NewAutoCreationPage NewAutoCreationPage;

    public NewAutoCreationSteps(TestContext context) {
        testContext = context;
        NewAutoCreationPage = testContext.getPageObjectManager().getnewautocreationPage();
    }

    

    @Then("Fill the deatils in auto creation page")
    public void fill_the_deatils_in_auto_creation_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	
    	NewAutoCreationPage.createNewMinuta();
      // throw new io.cucumber.java.PendingException();
    }
}
