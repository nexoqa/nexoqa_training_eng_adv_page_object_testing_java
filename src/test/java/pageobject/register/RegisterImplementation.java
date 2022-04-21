package pageobject.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterImplementation {

    private RegisterPage registerPage;

    public RegisterImplementation(WebDriver driver) {
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
    }

    public void fillRegisterForm(Integer genderId) {
        selectGender(genderId);
        selectBirthDay(10);
    }

    private void selectGender(Integer genderId) {
        if (genderId == 0) {
            registerPage.getGenderMrRadioBtn().click();
        }
        else if (genderId == 1) {
            registerPage.getGenderMrsRadioBtn().click();
        }
    }

    private void selectBirthDay(Integer day) {
        Select selectBirthDay = new Select(registerPage.getBirthDaySelect());
        selectBirthDay.selectByIndex(day);
    }


}
