package steps;

import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import commons.WebDriverWrapper;
import pageobject.myaccount.MyAccountImplementation;

public class MyAccountSteps {

    private MyAccountImplementation myAccountImplementation;

    private WebDriver driver;

    public MyAccountSteps() {
        driver = WebDriverWrapper.getInstance().getDriver();
        myAccountImplementation = new MyAccountImplementation(driver);
    }

    @Given("^the use is on the my account page$")
    public void theClientIsRegisteredAtThePlatform() throws InterruptedException {
       assertEquals("My Account Page is not displayed", true, myAccountImplementation.isDiplayed()); ;
        
    }

}
