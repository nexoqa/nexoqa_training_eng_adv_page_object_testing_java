package pageobject.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    
    @FindBy(id = "uniform-id_gender1")
    private WebElement genderMrRadioBtn;
    
    @FindBy(id = "uniform-id_gender2")
    private WebElement genderMrsRadioBtn;

    @FindBy(id = "days")
    private WebElement birthDaySelect;

    @FindBy(id = "months")
    private WebElement birthMonthSelect;

    @FindBy(id = "years")
    private WebElement birthYearSelect;

    public WebElement getGenderMrRadioBtn() {
        return genderMrRadioBtn;
    }

    public WebElement getGenderMrsRadioBtn() {
        return genderMrsRadioBtn;
    }

    public WebElement getBirthDaySelect() {
        return birthDaySelect;
    }

    public WebElement getBirthMonthSelect() {
        return birthMonthSelect;
    }

    public WebElement getBirthYearSelect() {
        return birthYearSelect;
    }
}
