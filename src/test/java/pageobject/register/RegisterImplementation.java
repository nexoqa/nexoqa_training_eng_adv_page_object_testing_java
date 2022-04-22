package pageobject.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WaitUtils;

public class RegisterImplementation {

    WebDriver driver;
    private RegisterPage registerPage;

    public RegisterImplementation(WebDriver driver) {
        this.driver = driver;
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
    }

    public void waitUntilRegisterFormIsPresent() {
        WaitUtils wait = new WaitUtils(this.driver);
        wait.waitUntilVisible(10, registerPage.getFisrtName());
    }

    public void fillRegisterForm(Integer genderId) {
        selectGender(genderId);
        registerPage.getFisrtName().sendKeys("NexoQA");
        registerPage.getLastName().sendKeys("NexoQA Last");
        registerPage.getPassword().sendKeys("12345678");
        registerPage.getAddress().sendKeys("Address");
        registerPage.getCity().sendKeys("Madrid");
        registerPage.getFisrtName().sendKeys("NexoQA");
        selectState(1);
        registerPage.getZipCode().sendKeys("00000");
        registerPage.getPhoneMobile().sendKeys("12131231231231");
    }

    public void clickRegisterButton() {
        registerPage.getRegisterBtn().click();
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

    private void selectState(Integer stateIndex) {
        Select state = new Select(registerPage.getState());
        state.selectByIndex(stateIndex);
    }

    


}
