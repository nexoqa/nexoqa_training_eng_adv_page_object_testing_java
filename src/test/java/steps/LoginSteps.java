package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.WebDriverWrapper;
import pageobject.home.HomeImplementation;
import pageobject.signIn.SignInImplementation;

public class LoginSteps {

    private HomeImplementation homeImplementation;
    private SignInImplementation signInImplementation;

    private WebDriver driver;

    public LoginSteps() {
        driver = WebDriverWrapper.getInstance().getDriver();
        homeImplementation = new HomeImplementation(driver);
        signInImplementation = new SignInImplementation(driver);
    }

    @When("^the user fill the login mandatory field: (.*) and (.*)$")
    public void theUserFillTheLoginForm(String email, String password) throws InterruptedException {
        homeImplementation.goToSignInForm();
        signInImplementation.fillLoginForm(email, password);
        Thread.sleep(2000);
    }

    @Then("^the ecommerce should be show a error feedback$")
    public void theAppShowAErrorMsg() {
        Assert.assertTrue(signInImplementation.getErrorMsg().contains("Authentication failed"));
    }

}
