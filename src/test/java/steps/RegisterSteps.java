package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.home.HomeImplementation;
import pageobject.register.RegisterImplementation;
import pageobject.signIn.SignInImplementation;

public class RegisterSteps {

    private WebDriver driver;
    private HomeImplementation homeImplementation;
    private SignInImplementation signInImplementation;
    private RegisterImplementation registerImplementation;

    public RegisterSteps() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\personal\\nexoqa\\curso\\automation-practice-1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        homeImplementation = new HomeImplementation(driver);
        signInImplementation = new SignInImplementation(driver);
        registerImplementation = new RegisterImplementation(driver);
    }

    @Given("^the user wants to register in the ecommerce$")
    public void theUserWantsRegisterInEcommerce() {
        homeImplementation.goToHomePage();
        homeImplementation.goToSignInForm();
    }

    @When("^the user fill the register form$")
    public void theUserFillTheRegisterForm() throws InterruptedException {
        Thread.sleep(2000);
        signInImplementation.goToRegisterForm("nexoqa@gmail.com");
        Thread.sleep(2000);
        registerImplementation.fillRegisterForm(0);
    }

}
