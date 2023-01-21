package pageobject.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "div.shop-menu a[href='/login']")
    private WebElement signInBtn;

    @FindBy(css = "div.shop-menu a[href='/login']")
    private WebElement signUpBtn;

    @FindBy(css = "div.shop-menu a[href='/']")
    private WebElement homeBtn;

    public WebElement getSignInBtn() {
        return signInBtn;
    }

    public WebElement getSignUpBtn() {
        return signUpBtn;
    }

    public WebElement getHomeBtn() {
        return homeBtn;
    }



}
