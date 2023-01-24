package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.home.HomeImplementation;
import pageobject.register.RegisterImplementation;
import pageobject.signIn.SignInSignUpImplementation;
import utils.WrapWebDriver;

public class RegisterSteps {

    private WebDriver driver;
    private HomeImplementation homeImplementation;
    private SignInSignUpImplementation signInImplementation;
    private RegisterImplementation registerImplementation;

    public RegisterSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = WrapWebDriver.getInstance("firefox",true);
        homeImplementation = new HomeImplementation(driver);
        signInImplementation = new SignInSignUpImplementation(driver);
        registerImplementation = new RegisterImplementation(driver);
    }

    @Given("^the user wants to register in the ecommerce$")
    public void theUserWantsRegisterInEcommerce() {
        homeImplementation.goToHomePage();
        homeImplementation.goToSignUpForm();
    }

    @When("^the user fill the register form$")
    public void theUserFillTheRegisterForm() throws InterruptedException {
        Thread.sleep(2000);
        signInImplementation.goToRegisterForm("name", "nexoqa@gmail.com");
        Thread.sleep(2000);
        registerImplementation.fillRegisterForm(0);
    }

}
