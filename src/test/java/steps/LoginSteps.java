package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.home.HomeImplementation;
import pageobject.signIn.SignInSignUpImplementation;
import utils.WrapWebDriver;

public class LoginSteps {

    private HomeImplementation homeImplementation;
    private SignInSignUpImplementation signInImplementation;

    private WebDriver driver;

    public LoginSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = WrapWebDriver.getInstance("firefox",true);
        homeImplementation = new HomeImplementation(driver);
        signInImplementation = new SignInSignUpImplementation(driver);
    }

    @Given("^the user wants to access to the ecommerce$")
    public void theClientIsRegisteredAtThePlatform() throws InterruptedException {
        homeImplementation.loadHomePage();
        Thread.sleep(1000);
    }

    @When("^the user fill the login mandatory field: (.*) and (.*)$")
    public void theUserFillTheLoginForm(String email, String password) throws InterruptedException {
        homeImplementation.goToSignInForm();
        signInImplementation.fillLoginForm(email, password);
        Thread.sleep(2000);
    }

    @Then("^the ecommerce should be show a error feedback$")
    public void theAppShowAErrorMsg() {
        Assert.assertTrue(signInImplementation.getErrorMsg().contains("Your email or password is incorrect!"));
    }

}
