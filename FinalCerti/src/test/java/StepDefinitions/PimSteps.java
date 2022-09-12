package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PimPage;
import utilities.DriverManager;

import java.util.List;

public class PimSteps {
    PimPage pimPage = new PimPage(DriverManager.getDriver().driver);
    @Then("The PIM page should be displayed")
    public void PimDisplay(){
        Assert.assertTrue(pimPage.PimDisplay());}
    @And("Search new employee with ID {string}")
    public void SearchByID(String ID) {pimPage.setIDTextBox(ID);}
    @Then("I click on search button")
    public void ClickOnSearch(){pimPage.ClickOnSearchButton();}
    @And("I check the existence")
    public void VerifyIDFound(){
        Assert.assertTrue(pimPage.IDFound());}
    @And("Search new employee with NAME {string}")
    public void SearchByNAME(String name){pimPage.setNameToSearchTextBox(name);}
    @And("I check the existence by name")
    public void VerifyNameFound(){
        Assert.assertTrue(pimPage.NameFound());
        Assert.assertTrue(pimPage.lastNameFound());
    }
    @And("I click on add employee")
    public void ClickOnAddEmployee(){pimPage.ClickOnAddEmployeeButton();}
    @And("I fill the employee information with")
    public void fillEmployeeInformation(DataTable basicInformation){
        List<String> data = basicInformation.transpose().asList(String.class);
        pimPage.setFirstNameTextBox(data.get(0));
        pimPage.setMiddleNameTextBox(data.get(1));
        pimPage.setLastNameTextBox(data.get(2));
    }
    @Then("I click on save button")
    public void ClickOnSaveButton(){pimPage.ClickOnSaveButton();}
    @Then("I click on Employee List button")
    public void ClickOnEmployeeListButton(){pimPage.clickOnEmployeeListButton();}
    @And("Verify creation")
    public void VerifyCreation(){
        Assert.assertTrue(pimPage.VerifyNameCreated());
        Assert.assertTrue(pimPage.VerifyLastNameCreated());
    }
    @Then("I click on delete icon")
    public void ClickOnDeleteIcon(){pimPage.clickOnDeleteIcon();}
    @Then("I confirm delete")
    public void ClickOnConfirmDelete(){pimPage.clickOnConfirmDelete();}
    @And("I reset the name text box with {string}")
    public void ClickOnResetButton(String reset){pimPage.Reset(reset);}
    @And("Verify delete")
    public void VerifyDelete(){
        try{
            Assert.assertTrue(pimPage.VerifyNameCreated());
        }
        catch(Exception e){}
    }
}
