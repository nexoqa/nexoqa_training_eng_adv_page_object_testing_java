package pageobject.signIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInSignUpPage {

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginBtn;

    @FindBy(css = "div.login-form p")
    private WebElement errorMessage;

    @FindBy(css = "input[data-qa='signup-name']")
    private WebElement newNameField;
    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement newEmailField;

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signUpBtn;

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getNewEmailField() {
        return newEmailField;
    }

    public WebElement getNewNameField() {
        return newNameField;
    }

    public WebElement getSignUpBtn() {
        return signUpBtn;
    }


}
