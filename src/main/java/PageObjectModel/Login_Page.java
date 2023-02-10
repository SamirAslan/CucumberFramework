package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_Page extends Base_Metods{
    WebDriver driver;

    public Login_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[class='link-text']")
    private WebElement signInButton;
    public void clickSignInBtn(){clickMetod(signInButton);}

    @FindBy(id = "login-email")
    private WebElement emailField;
    public void sendKeyEmailField(String email){sendKeyMetod(emailField,email);}

    @FindBy(id = "login-password-input")
    private WebElement passwordField;
    public void sendKeyPasswordField(String password){
        sendKeyMetod(passwordField,password);
    }

    @FindBy(css = "[type='submit']>span")
    private WebElement submit;
    public void clickSubmit(){
        clickMetod(submit);
    }

    @FindBy(className = "modal-close")
    private WebElement popup;
    public void clickPopup(){
        clickMetod(popup);
    }

}
