package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    WebElement user;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    WebElement loginButton;
    @FindBy(xpath = "//p[text()= 'Invalid credentials']")
    WebElement errorMsg;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserNameTextBox(String userName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(user));
        user.sendKeys(userName);
    }
    public void setPasswordTextBox(String Password){
        password.sendKeys(Password);
    }
    public void clickOnLoginButton(){ loginButton.click(); }
    public String getLoginErrorMessage(){
        String errorMessage = errorMsg.getText();
        return errorMessage;
    }
    public boolean loginElementIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        boolean element = loginButton.isDisplayed();
        return element;
    }

}
