package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundraisersPage extends CommonAPI {

@FindBy (xpath = "//a[normalize-space()='Raise Money']")
    WebElement raisemoney;

@FindBy (xpath = "//input[@id='email']")
    WebElement email;

@FindBy (xpath = "//input[@id='pass']")
    WebElement password;

@FindBy (xpath = "//button[@id='loginbutton']")
    WebElement signin;

//Donate to a Masjid

    @FindBy (xpath = "//span[normalize-space()='Faith']")
    WebElement Faith;

    @FindBy (xpath = "//div[normalize-space()='Fundraiser by EIC Evergreen Islamic Center - San Jose, CA']")
    WebElement pagelink;

    @FindBy (xpath = "//a[normalize-space()='Donate']")
    WebElement DonateButton;

    @FindBy (xpath = "//a[normalize-space()='Create new account']")
    WebElement CreateAccountButton;

    public WebElement getFaith() {
        return Faith;
    }

    public WebElement getPagelink() {
        return pagelink;
    }

    public WebElement getDonateButton() {
        return DonateButton;
    }

    public WebElement getCreateAccountButton() {
        return CreateAccountButton;
    }

    public WebElement getRaisemoney() {
        return raisemoney;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignin() {
        return signin;
    }

    public void raisemoney(){
        clickOn(getRaisemoney());
        waitFor(2);
        typeInto(getEmail(), "alichy123@gmail.com");
        waitFor(2);
        typeInto(getPassword(), "password");
        waitFor(2);
        clickOn(getSignin());
        waitFor(2);
    }

    public void donate(){
        clickOn(getFaith());
        waitFor(2);
        clickOn(getPagelink());
        waitFor(2);
        clickOn(getDonateButton());
        waitFor(2);
        clickOn(getCreateAccountButton());
        waitFor(2);
    }
}
