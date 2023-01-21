package pageobject.signIn;

import utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInSignUpImplementation {

    private SignInSignUpPage signInSignUpPage;
    private WaitUtils waitUtils;

    public SignInSignUpImplementation(WebDriver driver) {
        signInSignUpPage = PageFactory.initElements(driver, SignInSignUpPage.class);
        waitUtils = new WaitUtils(driver);
    }

    public void fillLoginForm(String email, String password) {
        waitUtils.waitUntilClickable(10, signInSignUpPage.getEmailField());
        setEmail(email);
        setPassword(password);
        clickLoginBtn();
    }

    public void goToRegisterForm(String name, String email) {
        setRegisterName(name);
        setRegisterEmail(email);
        submitSignUpForm();
    }


    private void setEmail(String email) {
        signInSignUpPage.getEmailField().sendKeys(email);
    }

    private void setPassword(String password) {
        signInSignUpPage.getPasswordField().sendKeys(password);
    }

    private void clickLoginBtn() {
        signInSignUpPage.getLoginBtn().click();
    }

    public String getErrorMsg() {
        return signInSignUpPage.getErrorMessage().getText();
    }

    private void setRegisterName(String name) {
        signInSignUpPage.getNewNameField().sendKeys(name);
    }

    private void setRegisterEmail(String email) {
        signInSignUpPage.getNewEmailField().sendKeys(email);
    }

    private void submitSignUpForm() {
        signInSignUpPage.getSignUpBtn().click();
    }

}
