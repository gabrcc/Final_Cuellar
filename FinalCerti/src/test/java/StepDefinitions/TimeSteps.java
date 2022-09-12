package StepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TimePage;
import utilities.DriverManager;

public class TimeSteps {
    TimePage directoryPage = new TimePage(DriverManager.getDriver().driver);
    @Then("I click on time option")
    public void ClickTime(){directoryPage.ClickOnTime();}
    @Then("Select view from employee")
    public void ClickView(){directoryPage.ClickOnView();}
    @And("The employee's time sheet should be displayed")
    public void VerifySheet(){directoryPage.sheetElementIsDisplayed();}
}
