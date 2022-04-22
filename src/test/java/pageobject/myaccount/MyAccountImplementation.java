package pageobject.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountImplementation {

    private WebDriver driver;
    private MyAccountPage myAccountPage;

    public MyAccountImplementation(WebDriver driver) {
        this.driver = driver;
        myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
    }

    public boolean isDiplayed() {
        return myAccountPage.getTitle().isDisplayed() &&
            myAccountPage.getTitle().getText().equals("MY ACCOUNT");
    }
}
