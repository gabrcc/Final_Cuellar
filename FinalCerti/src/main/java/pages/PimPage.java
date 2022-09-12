package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PimPage {
    WebDriver driver;

    @FindBy(css = "h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement pimLogo;
    @FindBy(linkText = "Logout")
    WebElement logout;
    @FindBy(css = "span.oxd-userdropdown-tab")
    WebElement userDropDown;
    @FindBy(xpath = "//input[not(@placeholder) and not(@type)]")
    WebElement IDTextBox;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")//className = "oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"
    WebElement SearchButton;
    @FindBy(xpath = "//div[text()='0011']")
    WebElement ID;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement NAMETextBox;
    @FindBy(xpath = "//div[text()='John ']")
    WebElement Name;
    @FindBy(xpath = "//div[text()='Smith']")
    WebElement lastName;
    @FindBy(xpath = "//a[text()='Add Employee']")
    WebElement AddEmployeeButton;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement FirstNameToAdd;
    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement MiddleNameTextBox;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement LastNameTextBox;
    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement SaveButton;
    @FindBy(xpath = "//a[text()='Employee List']")
    WebElement employeeListButton;
    @FindBy(xpath = "//div[text()='Nicolas Andres']")
    WebElement NameCreated;
    @FindBy(xpath = "//div[text()='Arnez']")
    WebElement lastNameCreated;
    @FindBy(css = "i.oxd-icon.bi-trash")
    WebElement deleteIcon;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin")
    WebElement confirmDelete;

    public PimPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean PimDisplay(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(pimLogo));
        boolean PimDisplay = pimLogo.isDisplayed();
        return PimDisplay;
    }
    public void clickOnUserDrop(){
        userDropDown.click();
    }
    public void clickOnLogout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
    }
    public void setIDTextBox(String IDToSearch){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(IDTextBox));
        IDTextBox.sendKeys(IDToSearch);
    }
    public void ClickOnSearchButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
        SearchButton.click();}
    public boolean IDFound(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(ID));
        boolean IDFound = ID.isDisplayed();
        return IDFound;
    }
    public void setNameToSearchTextBox(String NameToSearch){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(NAMETextBox));
        NAMETextBox.sendKeys(NameToSearch);
    }
    public boolean NameFound(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(ID));
        boolean NameSaved = Name.isDisplayed();
        return NameSaved;
    }
    public boolean lastNameFound(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(ID));
        boolean LastNameSaved = lastName.isDisplayed();
        return LastNameSaved;
    }
    public void ClickOnAddEmployeeButton(){AddEmployeeButton.click();}
    public void setFirstNameTextBox(String firstName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(FirstNameToAdd));
        FirstNameToAdd.sendKeys(firstName);
    }
    public void setMiddleNameTextBox(String middleName){
        MiddleNameTextBox.sendKeys(middleName);
    }
    public void setLastNameTextBox(String lastName){ LastNameTextBox.sendKeys(lastName); }
    public void ClickOnSaveButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
        SaveButton.click();
    }
    public void clickOnEmployeeListButton(){employeeListButton.click();}
    public boolean VerifyNameCreated(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(NameCreated));
        boolean NameFound = NameCreated.isDisplayed();
        return NameFound;
    }
    public boolean VerifyLastNameCreated(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(lastNameCreated));
        boolean LastName = lastNameCreated.isDisplayed();
        return LastName;
    }
    public void clickOnDeleteIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(deleteIcon));
        deleteIcon.click();
    }
    public void clickOnConfirmDelete(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(confirmDelete));
        confirmDelete.click();
    }
    public void Reset(String reset){
        NAMETextBox.sendKeys(reset);
    }
}
