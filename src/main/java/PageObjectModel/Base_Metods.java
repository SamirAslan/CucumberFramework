package PageObjectModel;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base_Metods {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    public void clickMetod(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeyMetod(WebElement sendKeyElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeyElement));
        sendKeyElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown,String element ){
        Select pick = new Select(dropdown);
        pick.selectByVisibleText(element);
    }

    public void clearMetod(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
    }

    public void Assertion(String expected,WebElement actual){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertTrue((actual.getText()).contains(expected));

    }

}
