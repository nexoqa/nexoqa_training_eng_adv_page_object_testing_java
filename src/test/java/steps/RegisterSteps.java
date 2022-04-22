package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import commons.WebDriverWrapper;
import pageobject.home.HomeImplementation;
import pageobject.register.RegisterImplementation;
import pageobject.signIn.SignInImplementation;

public class RegisterSteps {

    private WebDriver driver;
    private HomeImplementation homeImplementation;
    private SignInImplementation signInImplementation;
    private RegisterImplementation registerImplementation;

    public RegisterSteps() {
        driver = WebDriverWrapper.getInstance().getDriver();
        homeImplementation = new HomeImplementation(driver);
        signInImplementation = new SignInImplementation(driver);
        registerImplementation = new RegisterImplementation(driver);
    }

    @And("^the user wants to register in the ecommerce$")
    public void theUserWantsRegisterInEcommerce() {
        homeImplementation.goToSignInForm();
    }

    @When("^the user fill the register form$")
    public void theUserFillTheRegisterForm() throws InterruptedException {
        Thread.sleep(2000);
        Random random = new Random(); 
        int number = random.nextInt(100); 
        signInImplementation.goToRegisterForm("nexoqa" + number + "@gmail.com");
        Thread.sleep(5000);
        registerImplementation.waitUntilRegisterFormIsPresent();
        registerImplementation.fillRegisterForm(0);
        Thread.sleep(2000);
        registerImplementation.clickRegisterButton();
    }

}
