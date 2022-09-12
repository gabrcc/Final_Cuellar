package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimePage {
    WebDriver driver;
    @FindBy(xpath = "//span[text()='Time']")
    WebElement TimeOption;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--text.oxd-table-cell-action-space")
    WebElement viewButton;
    @FindBy(css = "p.oxd-text.oxd-text--p.orangehrm-timeperiod-title")
    WebElement TimeSheetElement;
    public TimePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickOnTime(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(TimeOption));
        TimeOption.click();
    }
    public void ClickOnView(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(viewButton));
        viewButton.click();
    }
    public boolean sheetElementIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(TimeSheetElement));
        boolean element = TimeSheetElement.isDisplayed();
        return element;
    }
}
