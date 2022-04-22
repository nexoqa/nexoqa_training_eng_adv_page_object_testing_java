package pageobject.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage {
    
    @FindBy(id = "id_gender1")
    private WebElement genderMrRadioBtn;
    
    @FindBy(id = "id_gender2")
    private WebElement genderMrsRadioBtn;

    @FindBy(id = "days")
    private WebElement birthDaySelect;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement id_state;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;
    
    @FindBy(id = "submitAccount")
    private WebElement registerBtn; 

    public WebElement getGenderMrRadioBtn() {
        return genderMrRadioBtn;
    }

    public WebElement getGenderMrsRadioBtn() {
        return genderMrsRadioBtn;
    }

    public WebElement getBirthDaySelect() {
        return birthDaySelect;
    }

    public WebElement getFisrtName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getState() {
        return id_state;
    }

    public WebElement getZipCode() {
        return postcode;
    }

    public WebElement getPhoneMobile() {
        return phone_mobile;
    }

    public WebElement getRegisterBtn() {
        return registerBtn;
    }

}
