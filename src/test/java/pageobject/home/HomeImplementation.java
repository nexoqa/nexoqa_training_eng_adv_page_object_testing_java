package pageobject.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeImplementation {

    private WebDriver driver;
    private HomePage homePage;

    public HomeImplementation(WebDriver driver) {
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    public void goToSignInForm() {
        homePage.getSignInBtn().click();
    }

    public void goToSignUpForm() {
        homePage.getSignUpBtn().click();
    }

    public void loadHomePage() {
        driver.get("https://automationexercise.com/");
    }

    public void goToHomePage() {
        homePage.getHomeBtn().click();
    }

}
