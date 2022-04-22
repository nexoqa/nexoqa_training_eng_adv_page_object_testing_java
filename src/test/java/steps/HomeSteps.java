package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import commons.WebDriverWrapper;
import pageobject.home.HomeImplementation;

public class HomeSteps {

    private HomeImplementation homeImplementation;

    private WebDriver driver;

    public HomeSteps() {
        driver = WebDriverWrapper.getInstance().getDriver();
        homeImplementation = new HomeImplementation(driver);
    }

    @Given("^the user wants to access to the ecommerce$")
    public void theClientIsRegisteredAtThePlatform() throws InterruptedException {
        homeImplementation.goToHomePage();
        Thread.sleep(1000);
    }

}
