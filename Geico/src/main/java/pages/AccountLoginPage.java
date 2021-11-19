package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends CommonAPI {

    @FindBy (css = "span[aria-label='account menu']")
    WebElement clickonAccount;

    @FindBy (xpath = "/html/body/nav/div[3]/div/div[2]/div[1]/div[3]/div[1]/form/div/button")
    WebElement clickonLogin;

    @FindBy (xpath = "//input[@id='TextInputComponent-1']")
    WebElement enterUsername;

    @FindBy (xpath = "//input[@id='TextInputComponent-2']")
    WebElement enterPassword;

    @FindBy (xpath = "//*[@id=\"wrapper\"]/ng-component/div[1]/div/div[1]/div[1]/form/div[3]/div[2]/asd-submit-button/button")
    WebElement enterLogin;

    public WebElement getClickonAccount() {
        return clickonAccount;
    }

    public WebElement getClickonLogin() {
        return clickonLogin;
    }

    public WebElement getEnterUsername() {
        return enterUsername;
    }

    public WebElement getEnterPassword() {
        return enterPassword;
    }

    public WebElement getEnterLogin() {
        return enterLogin;
    }

    public void testingAccountLogin() {
        clickOn(getClickonAccount());
        waitFor(2);
        clickOn(getClickonLogin());
        waitFor(2);
        typeEnter(getEnterUsername(),"ciahmed");
        typeEnter(getEnterPassword(),"Password0990!");
        clickOn(getEnterLogin());
        waitFor(2);

    }
}
