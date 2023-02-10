package Steps;

import PageObjectModel.Login_Page;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Login_Steps  {

    private WebDriver driver;

    Login_Page login = new Login_Page();
    @Given("^Navigate to Website$")
    public void navigate_to_Website() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click Popup$")
    public void click_Popup() throws Throwable {
        login.clickPopup();
    }

    @Given("^click Sign in button$")
    public void click_Sign_in_button() throws Throwable {
        login.clickSignInBtn();

    }

    @Given("^enter Email \"(.*?)\"$")
    public void enter_Email(String email) throws Throwable {
        login.sendKeyEmailField(email);
    }

    @Given("^write Password \"(.*?)\"$")
    public void write_Password(String password) throws Throwable {
        login.sendKeyPasswordField(password);

    }

    @When("^click Submit button$")
    public void click_Submit_button() throws Throwable {
        login.clickSubmit();

    }
    @After
    public void closeDriver(){
        driver.quit();
    }


}
