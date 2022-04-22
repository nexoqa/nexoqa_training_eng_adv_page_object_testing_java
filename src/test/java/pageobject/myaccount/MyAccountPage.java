package pageobject.myaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    @FindBy(className = "page-heading")
    private WebElement title;

    
    public WebElement getTitle() {
        return title;
    }

}
