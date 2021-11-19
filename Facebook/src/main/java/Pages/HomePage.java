package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[@title='Sign Up for Facebook']")
    WebElement signup;

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstname;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastname;

    @FindBy(xpath = "//input[@name='reg_email__']")
    WebElement email;

    @FindBy(xpath = "//input[@name='reg_email_confirmation__']")
    WebElement confirmemail;

    @FindBy(xpath = "//input[@name='reg_passwd__']")
    WebElement password;

    @FindBy(xpath = "//select[@name='birthday_month']")
    WebElement birthdaymonth;

    @FindBy(xpath = "//select[@name='birthday_day']")
    WebElement birthdayday;

    @FindBy(xpath = "//select[@name='birthday_year']")
    WebElement birthdayyear;

    @FindBy(xpath = "//input[@value='2']")
    WebElement gender;

    @FindBy (xpath = "//a[@title='Browse our Watch videos.']")
    WebElement Watch;

    public WebElement getWatch() {
        return Watch;
    }

    public WebElement getSignup() {
        return signup;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getConfirmemail() {
        return confirmemail;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getBirthdaymonth() {
        return birthdaymonth;
    }

    public WebElement getBirthdayday() {
        return birthdayday;
    }

    public WebElement getBirthdayyear() {
        return birthdayyear;
    }

    public WebElement getGender() {
        return gender;
    }

    public void signup() {
        clickOn(getSignup());
        waitFor(2);
        typeInto(getFirstname(), "Ali");
        waitFor(2);
        typeInto(getLastname(), "Chowdhury");
        waitFor(2);
        typeInto(getEmail(), "alichy123@gmail.com");
        waitFor(2);
        typeInto(getConfirmemail(), "alichy123@gmail.com");
        waitFor(2);
        typeInto(getPassword(), "password");
        waitFor(2);
        selectDropdownElement(getBirthdaymonth(), "Jun");
        waitFor(2);
        selectDropdownElement(getBirthdayday(), "11");
        waitFor(2);
        selectDropdownElement(getBirthdayyear(), "1985");
        clickOn(getGender());
        waitFor(2);
    }

    public void watch(){
        clickOn(getWatch());
    }
}