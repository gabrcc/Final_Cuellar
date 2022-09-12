package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.DriverManager;

import java.util.List;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);


    @And("I set the user name and the password field with")
    public void fillCheckoutInformation(DataTable loginCredentials) throws InterruptedException {
        List<String> data = loginCredentials.transpose().asList(String.class);
        loginPage.setUserNameTextBox(data.get(0));
        loginPage.setPasswordTextBox(data.get(1));
    }
    @When("I click on login button")
    public void clickOnLoginButton()  {
        loginPage.clickOnLoginButton();
    }
    @Then("An error message that says {string} is displayed")
    public void verifyLoginErrorMessage(String message){
        Assert.assertEquals(message, loginPage.getLoginErrorMessage());
    }


}
