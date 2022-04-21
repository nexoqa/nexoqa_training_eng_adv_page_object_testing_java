package pageobject.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage {

    
    @FindBy(id = "id_gender1")
    private WebElement genderMrRadioBtn;
    
    @FindBy(id = "id_gender2")
    private WebElement genderMrsRadioBtn;

    @FindBy(id = "days")
    private WebElement birthDaySelect;

    public WebElement getGenderMrRadioBtn() {
        return genderMrRadioBtn;
    }

    public WebElement getGenderMrsRadioBtn() {
        return genderMrsRadioBtn;
    }

    public WebElement getBirthDaySelect() {
        return birthDaySelect;
    }
}
