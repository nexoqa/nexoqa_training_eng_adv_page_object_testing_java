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
        selectBirthMonth(01);
        selectBirthYear(2000);
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
        selectBirthDay.selectByValue(day.toString());
    }

    private void selectBirthMonth(Integer month) {
        Select selectBirthDay = new Select(registerPage.getBirthMonthSelect());
        selectBirthDay.selectByValue(month.toString());
    }

    private void selectBirthYear(Integer year) {
        Select selectBirthYear = new Select(registerPage.getBirthYearSelect());
        selectBirthYear.selectByValue(year.toString());
    }


}
